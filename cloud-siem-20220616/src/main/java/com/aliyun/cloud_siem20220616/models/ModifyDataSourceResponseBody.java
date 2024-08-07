// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ModifyDataSourceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceResponseBody self = new ModifyDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceResponseBody setData(ModifyDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDataSourceResponseBodyData getData() {
        return this.data;
    }

    public ModifyDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDataSourceResponseBodyData extends TeaModel {
        /**
         * <p>The number of data sources that are modified. The value 1 indicates that the modification is successful, and a value less than or equal to 0 indicates that the modification failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
         */
        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

        public static ModifyDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceResponseBodyData self = new ModifyDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ModifyDataSourceResponseBodyData setDataSourceInstanceId(String dataSourceInstanceId) {
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

    }

}
