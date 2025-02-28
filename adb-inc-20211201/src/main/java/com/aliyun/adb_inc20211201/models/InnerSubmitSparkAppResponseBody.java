// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerSubmitSparkAppResponseBody extends TeaModel {
    @NameInMap("Data")
    public InnerSubmitSparkAppResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static InnerSubmitSparkAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerSubmitSparkAppResponseBody self = new InnerSubmitSparkAppResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerSubmitSparkAppResponseBody setData(InnerSubmitSparkAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InnerSubmitSparkAppResponseBodyData getData() {
        return this.data;
    }

    public InnerSubmitSparkAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InnerSubmitSparkAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Message")
        public String message;

        @NameInMap("State")
        public String state;

        public static InnerSubmitSparkAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InnerSubmitSparkAppResponseBodyData self = new InnerSubmitSparkAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InnerSubmitSparkAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InnerSubmitSparkAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InnerSubmitSparkAppResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InnerSubmitSparkAppResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
