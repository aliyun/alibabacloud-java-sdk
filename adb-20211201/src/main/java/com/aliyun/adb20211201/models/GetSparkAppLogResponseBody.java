// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkAppLogResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppLogResponseBody self = new GetSparkAppLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppLogResponseBody setData(GetSparkAppLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppLogResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppLogResponseBodyData extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("LogContent")
        public String logContent;

        @NameInMap("Message")
        public String message;

        public static GetSparkAppLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppLogResponseBodyData self = new GetSparkAppLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppLogResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public GetSparkAppLogResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetSparkAppLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
