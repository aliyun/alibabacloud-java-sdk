// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxyAccessesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProxyAccessList")
    public java.util.List<ListProxyAccessesResponseBodyProxyAccessList> proxyAccessList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IndepAccount")
        public String indepAccount;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("OriginInfo")
        public String originInfo;

        @NameInMap("ProxyAccessId")
        public Long proxyAccessId;

        @NameInMap("ProxyId")
        public Long proxyId;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

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
