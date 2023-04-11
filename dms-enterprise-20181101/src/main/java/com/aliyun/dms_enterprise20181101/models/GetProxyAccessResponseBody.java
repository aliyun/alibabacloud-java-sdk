// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyAccessResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The authorization information about the secure access proxy feature.</p>
     */
    @NameInMap("ProxyAccess")
    public GetProxyAccessResponseBodyProxyAccess proxyAccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The username of the database account that is authorized to enable the secure access proxy feature for an instance.</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>The time when the user is authorized to enable the secure access proxy feature for an instance.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The username of the independent database account.</p>
         */
        @NameInMap("IndepAccount")
        public String indepAccount;

        /**
         * <p>The ID of the instance for which the secure access proxy feature is enabled.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The method that is used to authorize the user to enable the secure access proxy feature for an instance. Valid values:</p>
         * <br>
         * <p>*   **Authorization by the Alibaba Cloud Account ()**: The information in the parentheses () indicates the ID of the Alibaba Cloud account.</p>
         * <p>*   **Authorization by submitting the ticket ()**:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.</p>
         */
        @NameInMap("OriginInfo")
        public String originInfo;

        /**
         * <p>The ID that DMS generates after the user is authorized to enable the secure access proxy feature for an instance. The ID is unique in DMS. You can call the [ListProxyAccesses](~~295386~~) operation to query the ID.</p>
         */
        @NameInMap("ProxyAccessId")
        public Long proxyAccessId;

        /**
         * <p>The ID of the secure access proxy.</p>
         * <br>
         * <p>>  You can call the [ListProxies](~~295371~~) operation to query the ID of the secure access proxy.</p>
         */
        @NameInMap("ProxyId")
        public Long proxyId;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
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
