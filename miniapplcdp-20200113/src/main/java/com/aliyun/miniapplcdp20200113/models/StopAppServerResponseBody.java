// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class StopAppServerResponseBody extends TeaModel {
    @NameInMap("Data")
    public StopAppServerResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static StopAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAppServerResponseBody self = new StopAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAppServerResponseBody setData(StopAppServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopAppServerResponseBodyData getData() {
        return this.data;
    }

    public StopAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopAppServerResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppServerStatus")
        public String appServerStatus;

        @NameInMap("EnvId")
        public String envId;

        public static StopAppServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopAppServerResponseBodyData self = new StopAppServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopAppServerResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public StopAppServerResponseBodyData setAppServerStatus(String appServerStatus) {
            this.appServerStatus = appServerStatus;
            return this;
        }
        public String getAppServerStatus() {
            return this.appServerStatus;
        }

        public StopAppServerResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
