// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddDataSourceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceResponseBody self = new AddDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataSourceResponseBody setData(AddDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDataSourceResponseBodyData getData() {
        return this.data;
    }

    public AddDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddDataSourceResponseBodyData extends TeaModel {
        /**
         * <p>The number of data sources that are added. The value 1 indicates that data source is added, and a value less than or equal to 0 indicates that the data source failed to be added.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.</p>
         */
        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

        public static AddDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDataSourceResponseBodyData self = new AddDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDataSourceResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public AddDataSourceResponseBodyData setDataSourceInstanceId(String dataSourceInstanceId) {
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

    }

}
