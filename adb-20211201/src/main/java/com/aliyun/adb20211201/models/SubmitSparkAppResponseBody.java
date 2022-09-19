// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitSparkAppResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitSparkAppResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSparkAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkAppResponseBody self = new SubmitSparkAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSparkAppResponseBody setData(SubmitSparkAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitSparkAppResponseBodyData getData() {
        return this.data;
    }

    public SubmitSparkAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitSparkAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Message")
        public String message;

        @NameInMap("State")
        public String state;

        public static SubmitSparkAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitSparkAppResponseBodyData self = new SubmitSparkAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitSparkAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SubmitSparkAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SubmitSparkAppResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitSparkAppResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
