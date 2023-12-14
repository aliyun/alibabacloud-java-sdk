// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteDataSourceLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDataSourceLogResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataSourceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceLogResponseBody self = new DeleteDataSourceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceLogResponseBody setData(DeleteDataSourceLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDataSourceLogResponseBodyData getData() {
        return this.data;
    }

    public DeleteDataSourceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDataSourceLogResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("LogInstanceId")
        public String logInstanceId;

        public static DeleteDataSourceLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataSourceLogResponseBodyData self = new DeleteDataSourceLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDataSourceLogResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DeleteDataSourceLogResponseBodyData setLogInstanceId(String logInstanceId) {
            this.logInstanceId = logInstanceId;
            return this;
        }
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

    }

}
