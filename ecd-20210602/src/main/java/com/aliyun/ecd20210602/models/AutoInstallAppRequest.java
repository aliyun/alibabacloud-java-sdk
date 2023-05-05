// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AutoInstallAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("Language")
    public String language;

    @NameInMap("SilenceInfo")
    public AutoInstallAppRequestSilenceInfo silenceInfo;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UserList")
    public java.util.List<AutoInstallAppRequestUserList> userList;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static AutoInstallAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AutoInstallAppRequest self = new AutoInstallAppRequest();
        return TeaModel.build(map, self);
    }

    public AutoInstallAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public AutoInstallAppRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public AutoInstallAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AutoInstallAppRequest setSilenceInfo(AutoInstallAppRequestSilenceInfo silenceInfo) {
        this.silenceInfo = silenceInfo;
        return this;
    }
    public AutoInstallAppRequestSilenceInfo getSilenceInfo() {
        return this.silenceInfo;
    }

    public AutoInstallAppRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public AutoInstallAppRequest setUserList(java.util.List<AutoInstallAppRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<AutoInstallAppRequestUserList> getUserList() {
        return this.userList;
    }

    public AutoInstallAppRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public AutoInstallAppRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class AutoInstallAppRequestSilenceInfo extends TeaModel {
        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        @NameInMap("SilenceInstallParam")
        public String silenceInstallParam;

        public static AutoInstallAppRequestSilenceInfo build(java.util.Map<String, ?> map) throws Exception {
            AutoInstallAppRequestSilenceInfo self = new AutoInstallAppRequestSilenceInfo();
            return TeaModel.build(map, self);
        }

        public AutoInstallAppRequestSilenceInfo setSilenceDeleteParam(String silenceDeleteParam) {
            this.silenceDeleteParam = silenceDeleteParam;
            return this;
        }
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        public AutoInstallAppRequestSilenceInfo setSilenceInstallParam(String silenceInstallParam) {
            this.silenceInstallParam = silenceInstallParam;
            return this;
        }
        public String getSilenceInstallParam() {
            return this.silenceInstallParam;
        }

    }

    public static class AutoInstallAppRequestUserList extends TeaModel {
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("SubscribeId")
        public Long subscribeId;

        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserType")
        public String userType;

        public static AutoInstallAppRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            AutoInstallAppRequestUserList self = new AutoInstallAppRequestUserList();
            return TeaModel.build(map, self);
        }

        public AutoInstallAppRequestUserList setIsDistribute(Boolean isDistribute) {
            this.isDistribute = isDistribute;
            return this;
        }
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        public AutoInstallAppRequestUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AutoInstallAppRequestUserList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public AutoInstallAppRequestUserList setSubscribeId(Long subscribeId) {
            this.subscribeId = subscribeId;
            return this;
        }
        public Long getSubscribeId() {
            return this.subscribeId;
        }

        public AutoInstallAppRequestUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public AutoInstallAppRequestUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public AutoInstallAppRequestUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
