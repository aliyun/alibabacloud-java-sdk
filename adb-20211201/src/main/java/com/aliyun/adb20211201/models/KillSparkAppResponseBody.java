// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkAppResponseBody extends TeaModel {
    @NameInMap("Data")
    public KillSparkAppResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static KillSparkAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillSparkAppResponseBody self = new KillSparkAppResponseBody();
        return TeaModel.build(map, self);
    }

    public KillSparkAppResponseBody setData(KillSparkAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KillSparkAppResponseBodyData getData() {
        return this.data;
    }

    public KillSparkAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class KillSparkAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Message")
        public String message;

        @NameInMap("State")
        public String state;

        public static KillSparkAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KillSparkAppResponseBodyData self = new KillSparkAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KillSparkAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public KillSparkAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public KillSparkAppResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public KillSparkAppResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
