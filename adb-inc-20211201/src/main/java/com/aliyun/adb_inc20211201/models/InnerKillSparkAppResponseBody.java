// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerKillSparkAppResponseBody extends TeaModel {
    @NameInMap("Data")
    public InnerKillSparkAppResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static InnerKillSparkAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerKillSparkAppResponseBody self = new InnerKillSparkAppResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerKillSparkAppResponseBody setData(InnerKillSparkAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InnerKillSparkAppResponseBodyData getData() {
        return this.data;
    }

    public InnerKillSparkAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InnerKillSparkAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Message")
        public String message;

        @NameInMap("State")
        public String state;

        public static InnerKillSparkAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InnerKillSparkAppResponseBodyData self = new InnerKillSparkAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InnerKillSparkAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InnerKillSparkAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InnerKillSparkAppResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InnerKillSparkAppResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
