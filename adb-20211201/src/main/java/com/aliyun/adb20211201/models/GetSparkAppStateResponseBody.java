// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppStateResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkAppStateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkAppStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppStateResponseBody self = new GetSparkAppStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkAppStateResponseBody setData(GetSparkAppStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkAppStateResponseBodyData getData() {
        return this.data;
    }

    public GetSparkAppStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkAppStateResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Message")
        public String message;

        @NameInMap("State")
        public String state;

        public static GetSparkAppStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkAppStateResponseBodyData self = new GetSparkAppStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkAppStateResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetSparkAppStateResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetSparkAppStateResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetSparkAppStateResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
