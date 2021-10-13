// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticatorOpsLogsResponseBody extends TeaModel {
    @NameInMap("AuthenticationLogContent")
    public java.util.List<ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent> authenticationLogContent;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    // 返回列表长度
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthenticatorOpsLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatorOpsLogsResponseBody self = new ListAuthenticatorOpsLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatorOpsLogsResponseBody setAuthenticationLogContent(java.util.List<ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent> authenticationLogContent) {
        this.authenticationLogContent = authenticationLogContent;
        return this;
    }
    public java.util.List<ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent> getAuthenticationLogContent() {
        return this.authenticationLogContent;
    }

    public ListAuthenticatorOpsLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthenticatorOpsLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthenticatorOpsLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthenticatorOpsLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent extends TeaModel {
        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("ApplicationUuid")
        public String applicationUuid;

        @NameInMap("ApplicationExternalId")
        public String applicationExternalId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("AuthenticatorUuid")
        public String authenticatorUuid;

        @NameInMap("AuthenticatorName")
        public String authenticatorName;

        @NameInMap("CredentialId")
        public String credentialId;

        @NameInMap("AuthenticatorType")
        public String authenticatorType;

        @NameInMap("OperationAction")
        public String operationAction;

        @NameInMap("ChallengeBase64")
        public String challengeBase64;

        @NameInMap("OperationTime")
        public Long operationTime;

        @NameInMap("UserAgent")
        public String userAgent;

        @NameInMap("UserSourceIp")
        public String userSourceIp;

        @NameInMap("RawContext")
        public String rawContext;

        @NameInMap("OperationResult")
        public Boolean operationResult;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("LogParams")
        public String logParams;

        public static ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent build(java.util.Map<String, ?> map) throws Exception {
            ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent self = new ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent();
            return TeaModel.build(map, self);
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setApplicationUuid(String applicationUuid) {
            this.applicationUuid = applicationUuid;
            return this;
        }
        public String getApplicationUuid() {
            return this.applicationUuid;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setApplicationExternalId(String applicationExternalId) {
            this.applicationExternalId = applicationExternalId;
            return this;
        }
        public String getApplicationExternalId() {
            return this.applicationExternalId;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setAuthenticatorUuid(String authenticatorUuid) {
            this.authenticatorUuid = authenticatorUuid;
            return this;
        }
        public String getAuthenticatorUuid() {
            return this.authenticatorUuid;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setAuthenticatorName(String authenticatorName) {
            this.authenticatorName = authenticatorName;
            return this;
        }
        public String getAuthenticatorName() {
            return this.authenticatorName;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setAuthenticatorType(String authenticatorType) {
            this.authenticatorType = authenticatorType;
            return this;
        }
        public String getAuthenticatorType() {
            return this.authenticatorType;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setOperationAction(String operationAction) {
            this.operationAction = operationAction;
            return this;
        }
        public String getOperationAction() {
            return this.operationAction;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setChallengeBase64(String challengeBase64) {
            this.challengeBase64 = challengeBase64;
            return this;
        }
        public String getChallengeBase64() {
            return this.challengeBase64;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setOperationTime(Long operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public Long getOperationTime() {
            return this.operationTime;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }
        public String getUserAgent() {
            return this.userAgent;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setUserSourceIp(String userSourceIp) {
            this.userSourceIp = userSourceIp;
            return this;
        }
        public String getUserSourceIp() {
            return this.userSourceIp;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setRawContext(String rawContext) {
            this.rawContext = rawContext;
            return this;
        }
        public String getRawContext() {
            return this.rawContext;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setOperationResult(Boolean operationResult) {
            this.operationResult = operationResult;
            return this;
        }
        public Boolean getOperationResult() {
            return this.operationResult;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListAuthenticatorOpsLogsResponseBodyAuthenticationLogContent setLogParams(String logParams) {
            this.logParams = logParams;
            return this;
        }
        public String getLogParams() {
            return this.logParams;
        }

    }

}
