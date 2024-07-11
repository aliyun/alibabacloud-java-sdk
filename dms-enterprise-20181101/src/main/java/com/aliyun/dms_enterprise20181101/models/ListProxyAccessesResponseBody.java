// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxyAccessesResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingProxyId</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ProxyId is mandatory for this action.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about the users that are authorized to access the database instance by using the secure access proxy feature.</p>
     */
    @NameInMap("ProxyAccessList")
    public java.util.List<ListProxyAccessesResponseBodyProxyAccessList> proxyAccessList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E53D178A-85E9-5E1F-88B6-3CB1FCF2****</p>
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
        /**
         * <p>The username of the database account that is authorized to access the database instance by using the secure access proxy feature.</p>
         * 
         * <strong>example:</strong>
         * <p>MXPL8HalI22m****</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>The time when the user is authorized to access the database instance by using the secure access proxy feature.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-31 10:34:18</p>
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
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>164****</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The method that is used to authorize the user to access the database instance by using the secure access proxy feature. Valid values: </p>
         * <ul>
         * <li><strong>Authorization by the Alibaba Cloud Account ()</strong>: The information in the parentheses () indicates the user ID (UID) of the Alibaba Cloud account.</li>
         * <li><strong>Authorization by submitting the ticket ()</strong>:The information in the parentheses () indicates the number of the ticket that the user submits to apply for permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Authorization by the Alibaba Cloud Account(29490401597700****)</p>
         */
        @NameInMap("OriginInfo")
        public String originInfo;

        /**
         * <p>The ID that DMS generates after the user is authorized to access the database instance by using the secure access proxy feature. The ID is unique in DMS.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ProxyAccessId")
        public Long proxyAccessId;

        /**
         * <p>The ID of the secure access proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("ProxyId")
        public Long proxyId;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>26****</p>
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
         * <p>The UID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>25936669186260****</p>
         */
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
