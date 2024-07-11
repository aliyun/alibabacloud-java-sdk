// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyAccessResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UserNotExist</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified user not exists.</p>
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
     * 
     * <strong>example:</strong>
     * <p>3CDB8601-AD74-4A47-8114-08E08CD6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>hObpgEXoca42q***</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>The time when the user is authorized to enable the secure access proxy feature for an instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1643034647</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The username of the independent database account.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("IndepAccount")
        public String indepAccount;

        /**
         * <p>The ID of the instance for which the secure access proxy feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1922545</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The method that is used to authorize the user to enable the secure access proxy feature for an instance. Valid values:</p>
         * <ul>
         * <li><strong>Authorization by the Alibaba Cloud Account ()</strong>: The information in the parentheses () indicates the ID of the Alibaba Cloud account.</li>
         * <li><strong>Authorization by submitting the ticket ()</strong>:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Authorization by the Alibaba Cloud account (29490401597700\<em>\</em>\<em>\</em>)</p>
         */
        @NameInMap("OriginInfo")
        public String originInfo;

        /**
         * <p>The ID that DMS generates after the user is authorized to enable the secure access proxy feature for an instance. The ID is unique in DMS. You can call the <a href="https://help.aliyun.com/document_detail/295386.html">ListProxyAccesses</a> operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2002</p>
         */
        @NameInMap("ProxyAccessId")
        public Long proxyAccessId;

        /**
         * <p>The ID of the secure access proxy.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/295371.html">ListProxies</a> operation to query the ID of the secure access proxy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1905</p>
         */
        @NameInMap("ProxyId")
        public Long proxyId;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>25936669186260****</p>
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
