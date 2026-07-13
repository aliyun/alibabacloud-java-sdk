// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiChangeLogsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ListAtiChangeLogsResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Logs")
    public ListAtiChangeLogsResponseBodyLogs logs;

    /**
     * <p>The current page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the address list.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListAtiChangeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAtiChangeLogsResponseBody self = new ListAtiChangeLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAtiChangeLogsResponseBody setAccessDeniedDetail(ListAtiChangeLogsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ListAtiChangeLogsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAtiChangeLogsResponseBody setLogs(ListAtiChangeLogsResponseBodyLogs logs) {
        this.logs = logs;
        return this;
    }
    public ListAtiChangeLogsResponseBodyLogs getLogs() {
        return this.logs;
    }

    public ListAtiChangeLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAtiChangeLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAtiChangeLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAtiChangeLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListAtiChangeLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListAtiChangeLogsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>RemoveRspDomainServerHoldStatusForGateway</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encrypted diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQFohtp4aIbaeEXXXXQxNjFDLUIzMzgtNTXXXX05NkFCLUI2RkY5XXXXzAzQQ==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The reason for the authentication failure. Valid values:</p>
         * <ul>
         * <li>ExplicitDeny: explicit deny.</li>
         * <li>ImplicitDeny: implicit deny.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ListAtiChangeLogsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ListAtiChangeLogsResponseBodyAccessDeniedDetail self = new ListAtiChangeLogsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ListAtiChangeLogsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ListAtiChangeLogsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ListAtiChangeLogsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ListAtiChangeLogsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ListAtiChangeLogsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ListAtiChangeLogsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ListAtiChangeLogsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListAtiChangeLogsResponseBodyLogsLog extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentStatus")
        public String agentStatus;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("CreatorSubType")
        public String creatorSubType;

        @NameInMap("CreatorType")
        public String creatorType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("LogId")
        public String logId;

        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("OperatorAccount")
        public String operatorAccount;

        @NameInMap("Result")
        public String result;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("Version")
        public String version;

        public static ListAtiChangeLogsResponseBodyLogsLog build(java.util.Map<String, ?> map) throws Exception {
            ListAtiChangeLogsResponseBodyLogsLog self = new ListAtiChangeLogsResponseBodyLogsLog();
            return TeaModel.build(map, self);
        }

        public ListAtiChangeLogsResponseBodyLogsLog setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setLogId(String logId) {
            this.logId = logId;
            return this;
        }
        public String getLogId() {
            return this.logId;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setOperatorAccount(String operatorAccount) {
            this.operatorAccount = operatorAccount;
            return this;
        }
        public String getOperatorAccount() {
            return this.operatorAccount;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListAtiChangeLogsResponseBodyLogsLog setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAtiChangeLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Log")
        public java.util.List<ListAtiChangeLogsResponseBodyLogsLog> log;

        public static ListAtiChangeLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListAtiChangeLogsResponseBodyLogs self = new ListAtiChangeLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListAtiChangeLogsResponseBodyLogs setLog(java.util.List<ListAtiChangeLogsResponseBodyLogsLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<ListAtiChangeLogsResponseBodyLogsLog> getLog() {
            return this.log;
        }

    }

}
