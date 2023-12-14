// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDataSourceResponseBodyData data;

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
        @NameInMap("Count")
        public Integer count;

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
