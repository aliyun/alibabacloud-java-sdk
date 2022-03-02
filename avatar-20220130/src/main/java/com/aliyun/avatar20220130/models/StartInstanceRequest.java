// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    @NameInMap("App")
    public StartInstanceRequestApp app;

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
