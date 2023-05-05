// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDistributeAppsShrinkRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIdsShrink;

    @NameInMap("AutoInstallApps")
    public java.util.List<BatchDistributeAppsShrinkRequestAutoInstallApps> autoInstallApps;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("Language")
    public String language;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestType")
    public String requestType;

    @NameInMap("SubscribeId")
    public Long subscribeId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UserList")
    public java.util.List<BatchDistributeAppsShrinkRequestUserList> userList;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static BatchDistributeAppsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDistributeAppsShrinkRequest self = new BatchDistributeAppsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDistributeAppsShrinkRequest setAppIdsShrink(String appIdsShrink) {
        this.appIdsShrink = appIdsShrink;
        return this;
    }
    public String getAppIdsShrink() {
        return this.appIdsShrink;
    }

    public BatchDistributeAppsShrinkRequest setAutoInstallApps(java.util.List<BatchDistributeAppsShrinkRequestAutoInstallApps> autoInstallApps) {
        this.autoInstallApps = autoInstallApps;
        return this;
    }
    public java.util.List<BatchDistributeAppsShrinkRequestAutoInstallApps> getAutoInstallApps() {
        return this.autoInstallApps;
    }

    public BatchDistributeAppsShrinkRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public BatchDistributeAppsShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public BatchDistributeAppsShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public BatchDistributeAppsShrinkRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public BatchDistributeAppsShrinkRequest setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

    public BatchDistributeAppsShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public BatchDistributeAppsShrinkRequest setUserList(java.util.List<BatchDistributeAppsShrinkRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<BatchDistributeAppsShrinkRequestUserList> getUserList() {
        return this.userList;
    }

    public BatchDistributeAppsShrinkRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public BatchDistributeAppsShrinkRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class BatchDistributeAppsShrinkRequestAutoInstallApps extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        @NameInMap("SilenceInstallParam")
        public String silenceInstallParam;

        public static BatchDistributeAppsShrinkRequestAutoInstallApps build(java.util.Map<String, ?> map) throws Exception {
            BatchDistributeAppsShrinkRequestAutoInstallApps self = new BatchDistributeAppsShrinkRequestAutoInstallApps();
            return TeaModel.build(map, self);
        }

        public BatchDistributeAppsShrinkRequestAutoInstallApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public BatchDistributeAppsShrinkRequestAutoInstallApps setSilenceDeleteParam(String silenceDeleteParam) {
            this.silenceDeleteParam = silenceDeleteParam;
            return this;
        }
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        public BatchDistributeAppsShrinkRequestAutoInstallApps setSilenceInstallParam(String silenceInstallParam) {
            this.silenceInstallParam = silenceInstallParam;
            return this;
        }
        public String getSilenceInstallParam() {
            return this.silenceInstallParam;
        }

    }

    public static class BatchDistributeAppsShrinkRequestUserList extends TeaModel {
        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static BatchDistributeAppsShrinkRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            BatchDistributeAppsShrinkRequestUserList self = new BatchDistributeAppsShrinkRequestUserList();
            return TeaModel.build(map, self);
        }

        public BatchDistributeAppsShrinkRequestUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public BatchDistributeAppsShrinkRequestUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public BatchDistributeAppsShrinkRequestUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
