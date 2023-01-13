// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyAccessResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProxyAccess")
    public GetProxyAccessResponseBodyProxyAccess proxyAccess;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProxyAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProxyAccessResponseBody self = new GetProxyAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProxyAccessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProxyAccessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetProxyAccessResponseBody setProxyAccess(GetProxyAccessResponseBodyProxyAccess proxyAccess) {
        this.proxyAccess = proxyAccess;
        return this;
    }
    public GetProxyAccessResponseBodyProxyAccess getProxyAccess() {
        return this.proxyAccess;
    }

    public GetProxyAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProxyAccessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProxyAccessResponseBodyProxyAccess extends TeaModel {
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

        public static GetProxyAccessResponseBodyProxyAccess build(java.util.Map<String, ?> map) throws Exception {
            GetProxyAccessResponseBodyProxyAccess self = new GetProxyAccessResponseBodyProxyAccess();
            return TeaModel.build(map, self);
        }

        public GetProxyAccessResponseBodyProxyAccess setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetProxyAccessResponseBodyProxyAccess setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProxyAccessResponseBodyProxyAccess setIndepAccount(String indepAccount) {
            this.indepAccount = indepAccount;
            return this;
        }
        public String getIndepAccount() {
            return this.indepAccount;
        }

        public GetProxyAccessResponseBodyProxyAccess setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetProxyAccessResponseBodyProxyAccess setOriginInfo(String originInfo) {
            this.originInfo = originInfo;
            return this;
        }
        public String getOriginInfo() {
            return this.originInfo;
        }

        public GetProxyAccessResponseBodyProxyAccess setProxyAccessId(Long proxyAccessId) {
            this.proxyAccessId = proxyAccessId;
            return this;
        }
        public Long getProxyAccessId() {
            return this.proxyAccessId;
        }

        public GetProxyAccessResponseBodyProxyAccess setProxyId(Long proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public Long getProxyId() {
            return this.proxyId;
        }

        public GetProxyAccessResponseBodyProxyAccess setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetProxyAccessResponseBodyProxyAccess setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetProxyAccessResponseBodyProxyAccess setUserUid(String userUid) {
            this.userUid = userUid;
            return this;
        }
        public String getUserUid() {
            return this.userUid;
        }

    }

}
