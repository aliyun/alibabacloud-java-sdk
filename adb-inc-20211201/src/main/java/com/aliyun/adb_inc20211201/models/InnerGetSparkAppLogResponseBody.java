// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public InnerGetSparkAppLogResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static InnerGetSparkAppLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppLogResponseBody self = new InnerGetSparkAppLogResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppLogResponseBody setData(InnerGetSparkAppLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InnerGetSparkAppLogResponseBodyData getData() {
        return this.data;
    }

    public InnerGetSparkAppLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InnerGetSparkAppLogResponseBodyData extends TeaModel {
        @NameInMap("LogContent")
        public String logContent;

        @NameInMap("Message")
        public String message;

        public static InnerGetSparkAppLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InnerGetSparkAppLogResponseBodyData self = new InnerGetSparkAppLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InnerGetSparkAppLogResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public InnerGetSparkAppLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
