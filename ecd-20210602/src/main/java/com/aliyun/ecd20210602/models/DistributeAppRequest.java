// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DistributeAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AutoInstallFlag")
    public Boolean autoInstallFlag;

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
    public java.util.List<DistributeAppRequestUserList> userList;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static DistributeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DistributeAppRequest self = new DistributeAppRequest();
        return TeaModel.build(map, self);
    }

    public DistributeAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public DistributeAppRequest setAutoInstallFlag(Boolean autoInstallFlag) {
        this.autoInstallFlag = autoInstallFlag;
        return this;
    }
    public Boolean getAutoInstallFlag() {
        return this.autoInstallFlag;
    }

    public DistributeAppRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public DistributeAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DistributeAppRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DistributeAppRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public DistributeAppRequest setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

    public DistributeAppRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public DistributeAppRequest setUserList(java.util.List<DistributeAppRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<DistributeAppRequestUserList> getUserList() {
        return this.userList;
    }

    public DistributeAppRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public DistributeAppRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class DistributeAppRequestUserList extends TeaModel {
        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static DistributeAppRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            DistributeAppRequestUserList self = new DistributeAppRequestUserList();
            return TeaModel.build(map, self);
        }

        public DistributeAppRequestUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public DistributeAppRequestUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DistributeAppRequestUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
