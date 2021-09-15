// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class StartAppServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public StartAppServerResponseBodyData data;

    public static StartAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAppServerResponseBody self = new StartAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartAppServerResponseBody setData(StartAppServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartAppServerResponseBodyData getData() {
        return this.data;
    }

    public static class StartAppServerResponseBodyData extends TeaModel {
        @NameInMap("EnvId")
        public String envId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppServerStatus")
        public String appServerStatus;

        public static StartAppServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartAppServerResponseBodyData self = new StartAppServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartAppServerResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
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

    }

}
