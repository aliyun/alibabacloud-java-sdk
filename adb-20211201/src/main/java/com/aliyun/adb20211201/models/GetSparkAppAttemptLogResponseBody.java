// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppAttemptLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkAppAttemptLogResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppAttemptLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppAttemptLogResponseBody self = new GetSparkAppAttemptLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppAttemptLogResponseBody setData(GetSparkAppAttemptLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppAttemptLogResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppAttemptLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppAttemptLogResponseBodyData extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("LogContent")
        public String logContent;

        @NameInMap("Message")
        public String message;

        public static GetSparkAppAttemptLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppAttemptLogResponseBodyData self = new GetSparkAppAttemptLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppAttemptLogResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public GetSparkAppAttemptLogResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetSparkAppAttemptLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
