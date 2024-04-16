// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class StartAppServerResponseBody extends TeaModel {
    @NameInMap("Data")
    public StartAppServerResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static StartAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAppServerResponseBody self = new StartAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAppServerResponseBody setData(StartAppServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartAppServerResponseBodyData getData() {
        return this.data;
    }

    public StartAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartAppServerResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppServerStatus")
        public String appServerStatus;

        @NameInMap("EnvId")
        public String envId;

        public static StartAppServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartAppServerResponseBodyData self = new StartAppServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartAppServerResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public StartAppServerResponseBodyData setAppServerStatus(String appServerStatus) {
            this.appServerStatus = appServerStatus;
            return this;
        }
        public String getAppServerStatus() {
            return this.appServerStatus;
        }

        public StartAppServerResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
