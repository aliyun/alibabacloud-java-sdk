// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxyAccessesResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The information about the users that are authorized to access the database instance by using the secure access proxy feature.
    @NameInMap("ProxyAccessList")
    public java.util.List<ListProxyAccessesResponseBodyProxyAccessList> proxyAccessList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static ListProxyAccessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProxyAccessesResponseBody self = new ListProxyAccessesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProxyAccessesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProxyAccessesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProxyAccessesResponseBody setProxyAccessList(java.util.List<ListProxyAccessesResponseBodyProxyAccessList> proxyAccessList) {
        this.proxyAccessList = proxyAccessList;
        return this;
    }
    public java.util.List<ListProxyAccessesResponseBodyProxyAccessList> getProxyAccessList() {
        return this.proxyAccessList;
    }

    public ListProxyAccessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProxyAccessesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProxyAccessesResponseBodyProxyAccessList extends TeaModel {
        // The username of the database account that is authorized to access the database instance by using the secure access proxy feature.
        @NameInMap("AccessId")
        public String accessId;

        // The time when the user is authorized to access the database instance by using the secure access proxy feature.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The username of the independent database account.
        @NameInMap("IndepAccount")
        public String indepAccount;

        // The ID of the database instance.
        @NameInMap("InstanceId")
        public Long instanceId;

        // The method that is used to authorize the user to access the database instance by using the secure access proxy feature. Valid values: 
        // 
        // - **Authorization by the Alibaba Cloud Account ()**: The information in the parentheses () indicates the user ID (UID) of the Alibaba Cloud account.
        // - **Authorization by submitting the ticket ()**:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.
        @NameInMap("OriginInfo")
        public String originInfo;

        // The ID that DMS generates after the user is authorized to access the database instance by using the secure access proxy feature. The ID is unique in DMS.
        @NameInMap("ProxyAccessId")
        public Long proxyAccessId;

        // The ID of the secure access proxy.
        @NameInMap("ProxyId")
        public Long proxyId;

        // The ID of the user.
        @NameInMap("UserId")
        public Long userId;

        // The nickname of the user.
        @NameInMap("UserName")
        public String userName;

        // The UID of the Alibaba Cloud account.
        @NameInMap("UserUid")
        public String userUid;

        public static ListProxyAccessesResponseBodyProxyAccessList build(java.util.Map<String, ?> map) throws Exception {
            ListProxyAccessesResponseBodyProxyAccessList self = new ListProxyAccessesResponseBodyProxyAccessList();
            return TeaModel.build(map, self);
        }

        public ListProxyAccessesResponseBodyProxyAccessList setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setIndepAccount(String indepAccount) {
            this.indepAccount = indepAccount;
            return this;
        }
        public String getIndepAccount() {
            return this.indepAccount;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setOriginInfo(String originInfo) {
            this.originInfo = originInfo;
            return this;
        }
        public String getOriginInfo() {
            return this.originInfo;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setProxyAccessId(Long proxyAccessId) {
            this.proxyAccessId = proxyAccessId;
            return this;
        }
        public Long getProxyAccessId() {
            return this.proxyAccessId;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setProxyId(Long proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public Long getProxyId() {
            return this.proxyId;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListProxyAccessesResponseBodyProxyAccessList setUserUid(String userUid) {
            this.userUid = userUid;
            return this;
        }
        public String getUserUid() {
            return this.userUid;
        }

    }

}
