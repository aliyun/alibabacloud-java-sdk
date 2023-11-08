// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    @NameInMap("App")
    public StartInstanceRequestApp app;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Channel")
    public StartInstanceRequestChannel channel;

    @NameInMap("CommandRequest")
    public StartInstanceRequestCommandRequest commandRequest;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("User")
    public StartInstanceRequestUser user;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setApp(StartInstanceRequestApp app) {
        this.app = app;
        return this;
    }
    public StartInstanceRequestApp getApp() {
        return this.app;
    }

    public StartInstanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartInstanceRequest setChannel(StartInstanceRequestChannel channel) {
        this.channel = channel;
        return this;
    }
    public StartInstanceRequestChannel getChannel() {
        return this.channel;
    }

    public StartInstanceRequest setCommandRequest(StartInstanceRequestCommandRequest commandRequest) {
        this.commandRequest = commandRequest;
        return this;
    }
    public StartInstanceRequestCommandRequest getCommandRequest() {
        return this.commandRequest;
    }

    public StartInstanceRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public StartInstanceRequest setUser(StartInstanceRequestUser user) {
        this.user = user;
        return this;
    }
    public StartInstanceRequestUser getUser() {
        return this.user;
    }

    public static class StartInstanceRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static StartInstanceRequestApp build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRequestApp self = new StartInstanceRequestApp();
            return TeaModel.build(map, self);
        }

        public StartInstanceRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class StartInstanceRequestChannel extends TeaModel {
        @NameInMap("ReqConfig")
        public java.util.Map<String, ?> reqConfig;

        @NameInMap("Type")
        public String type;

        public static StartInstanceRequestChannel build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRequestChannel self = new StartInstanceRequestChannel();
            return TeaModel.build(map, self);
        }

        public StartInstanceRequestChannel setReqConfig(java.util.Map<String, ?> reqConfig) {
            this.reqConfig = reqConfig;
            return this;
        }
        public java.util.Map<String, ?> getReqConfig() {
            return this.reqConfig;
        }

        public StartInstanceRequestChannel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartInstanceRequestCommandRequest extends TeaModel {
        @NameInMap("AlphaSwitch")
        public Boolean alphaSwitch;

        public static StartInstanceRequestCommandRequest build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRequestCommandRequest self = new StartInstanceRequestCommandRequest();
            return TeaModel.build(map, self);
        }

        public StartInstanceRequestCommandRequest setAlphaSwitch(Boolean alphaSwitch) {
            this.alphaSwitch = alphaSwitch;
            return this;
        }
        public Boolean getAlphaSwitch() {
            return this.alphaSwitch;
        }

    }

    public static class StartInstanceRequestUser extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static StartInstanceRequestUser build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRequestUser self = new StartInstanceRequestUser();
            return TeaModel.build(map, self);
        }

        public StartInstanceRequestUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartInstanceRequestUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
