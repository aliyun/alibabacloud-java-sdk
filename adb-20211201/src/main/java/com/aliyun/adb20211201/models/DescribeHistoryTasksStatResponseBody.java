// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatResponseBody extends TeaModel {
    /**
     * <p>The queried information about the request denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>API status or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> items;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, an success message is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeHistoryTasksStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksStatResponseBody self = new DescribeHistoryTasksStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksStatResponseBody setAccessDeniedDetail(DescribeHistoryTasksStatResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeHistoryTasksStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHistoryTasksStatResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeHistoryTasksStatResponseBody setItems(java.util.List<DescribeHistoryTasksStatResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryTasksStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHistoryTasksStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryTasksStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeHistoryTasksStatResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>Authorized action</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the authentication principal belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The requester type.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the policy denial. Valid values:</p>
         * <ul>
         * <li><strong>ImplicitDeny</strong>: The resource holder has not configured a policy for the current user. By default, unauthorized operations are denied.</li>
         * <li><strong>ExplicitDeny</strong>: The RAM policy configured by the resource holder explicitly denies the current user access to the corresponding resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The type of the policy that causes the access denied error.</p>
         * <ul>
         * <li><strong>ControlPolicy</strong>: control policy</li>
         * <li><strong>SessionPolicy</strong>: an additional policy that is added to the temporary token.</li>
         * <li><strong>AssumeRolePolicy</strong>: the authorization policy of the RAM role.</li>
         * <li><strong>AccountLevelIdentityBasedPolicy</strong>: the principal policies of the account authorization scope, including custom policies and system policies.</li>
         * <li><strong>ResourceGroupLevelIdentityBasedPolicy</strong>: the principal policy of the resource group authorization scope, including custom policies and system policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ControlPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeHistoryTasksStatResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksStatResponseBodyAccessDeniedDetail self = new DescribeHistoryTasksStatResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeHistoryTasksStatResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeHistoryTasksStatResponseBodyItems extends TeaModel {
        /**
         * <p>The status of the APS job.</p>
         * <ul>
         * <li><strong>Scheduled</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Succeed</strong></li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>Cancelling</strong></li>
         * <li><strong>Canceled</strong></li>
         * <li><strong>Waiting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHistoryTasksStatResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksStatResponseBodyItems self = new DescribeHistoryTasksStatResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksStatResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHistoryTasksStatResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
