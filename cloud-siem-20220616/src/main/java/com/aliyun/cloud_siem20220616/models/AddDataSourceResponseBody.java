// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddDataSourceResponseBodyData data;

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
        @NameInMap("Count")
        public Integer count;

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
