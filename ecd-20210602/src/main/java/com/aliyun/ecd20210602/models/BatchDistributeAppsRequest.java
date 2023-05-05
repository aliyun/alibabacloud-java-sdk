// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDistributeAppsRequest extends TeaModel {
    @NameInMap("AppIds")
    public java.util.Map<String, ?> appIds;

    @NameInMap("AutoInstallApps")
    public java.util.List<BatchDistributeAppsRequestAutoInstallApps> autoInstallApps;

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
    public java.util.List<BatchDistributeAppsRequestUserList> userList;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static BatchDistributeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDistributeAppsRequest self = new BatchDistributeAppsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDistributeAppsRequest setAppIds(java.util.Map<String, ?> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.Map<String, ?> getAppIds() {
        return this.appIds;
    }

    public BatchDistributeAppsRequest setAutoInstallApps(java.util.List<BatchDistributeAppsRequestAutoInstallApps> autoInstallApps) {
        this.autoInstallApps = autoInstallApps;
        return this;
    }
    public java.util.List<BatchDistributeAppsRequestAutoInstallApps> getAutoInstallApps() {
        return this.autoInstallApps;
    }

    public BatchDistributeAppsRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public BatchDistributeAppsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public BatchDistributeAppsRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public BatchDistributeAppsRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public BatchDistributeAppsRequest setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

    public BatchDistributeAppsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public BatchDistributeAppsRequest setUserList(java.util.List<BatchDistributeAppsRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<BatchDistributeAppsRequestUserList> getUserList() {
        return this.userList;
    }

    public BatchDistributeAppsRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public BatchDistributeAppsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class BatchDistributeAppsRequestAutoInstallApps extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        @NameInMap("SilenceInstallParam")
        public String silenceInstallParam;

        public static BatchDistributeAppsRequestAutoInstallApps build(java.util.Map<String, ?> map) throws Exception {
            BatchDistributeAppsRequestAutoInstallApps self = new BatchDistributeAppsRequestAutoInstallApps();
            return TeaModel.build(map, self);
        }

        public BatchDistributeAppsRequestAutoInstallApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public BatchDistributeAppsRequestAutoInstallApps setSilenceDeleteParam(String silenceDeleteParam) {
            this.silenceDeleteParam = silenceDeleteParam;
            return this;
        }
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        public BatchDistributeAppsRequestAutoInstallApps setSilenceInstallParam(String silenceInstallParam) {
            this.silenceInstallParam = silenceInstallParam;
            return this;
        }
        public String getSilenceInstallParam() {
            return this.silenceInstallParam;
        }

    }

    public static class BatchDistributeAppsRequestUserList extends TeaModel {
        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static BatchDistributeAppsRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            BatchDistributeAppsRequestUserList self = new BatchDistributeAppsRequestUserList();
            return TeaModel.build(map, self);
        }

        public BatchDistributeAppsRequestUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public BatchDistributeAppsRequestUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public BatchDistributeAppsRequestUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
