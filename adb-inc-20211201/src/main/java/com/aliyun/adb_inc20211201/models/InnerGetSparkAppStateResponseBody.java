// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppStateResponseBody extends TeaModel {
    @NameInMap("Data")
    public InnerGetSparkAppStateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static InnerGetSparkAppStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppStateResponseBody self = new InnerGetSparkAppStateResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppStateResponseBody setData(InnerGetSparkAppStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InnerGetSparkAppStateResponseBodyData getData() {
        return this.data;
    }

    public InnerGetSparkAppStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InnerGetSparkAppStateResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Message")
        public String message;

        @NameInMap("State")
        public String state;

        public static InnerGetSparkAppStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InnerGetSparkAppStateResponseBodyData self = new InnerGetSparkAppStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InnerGetSparkAppStateResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InnerGetSparkAppStateResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InnerGetSparkAppStateResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InnerGetSparkAppStateResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
