// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetEngineDefaultAuthResponseBody extends TeaModel {
    @NameInMap("AuthInfos")
    public java.util.List<GetEngineDefaultAuthResponseBodyAuthInfos> authInfos;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static GetEngineDefaultAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEngineDefaultAuthResponseBody self = new GetEngineDefaultAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEngineDefaultAuthResponseBody setAuthInfos(java.util.List<GetEngineDefaultAuthResponseBodyAuthInfos> authInfos) {
        this.authInfos = authInfos;
        return this;
    }
    public java.util.List<GetEngineDefaultAuthResponseBodyAuthInfos> getAuthInfos() {
        return this.authInfos;
    }

    public GetEngineDefaultAuthResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEngineDefaultAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEngineDefaultAuthResponseBodyAuthInfos extends TeaModel {
        @NameInMap("Engine")
        public String engine;

        @NameInMap("Password")
        public String password;

        @NameInMap("Username")
        public String username;

        public static GetEngineDefaultAuthResponseBodyAuthInfos build(java.util.Map<String, ?> map) throws Exception {
            GetEngineDefaultAuthResponseBodyAuthInfos self = new GetEngineDefaultAuthResponseBodyAuthInfos();
            return TeaModel.build(map, self);
        }

        public GetEngineDefaultAuthResponseBodyAuthInfos setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetEngineDefaultAuthResponseBodyAuthInfos setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetEngineDefaultAuthResponseBodyAuthInfos setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
