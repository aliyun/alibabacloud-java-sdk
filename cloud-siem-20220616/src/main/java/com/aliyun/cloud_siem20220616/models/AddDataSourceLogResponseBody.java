// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddDataSourceLogResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddDataSourceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceLogResponseBody self = new AddDataSourceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataSourceLogResponseBody setData(AddDataSourceLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDataSourceLogResponseBodyData getData() {
        return this.data;
    }

    public AddDataSourceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddDataSourceLogResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("LogInstanceId")
        public String logInstanceId;

        public static AddDataSourceLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDataSourceLogResponseBodyData self = new AddDataSourceLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDataSourceLogResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public AddDataSourceLogResponseBodyData setLogInstanceId(String logInstanceId) {
            this.logInstanceId = logInstanceId;
            return this;
        }
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

    }

}
