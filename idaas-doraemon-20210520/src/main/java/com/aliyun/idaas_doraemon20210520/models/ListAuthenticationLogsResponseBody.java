// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticationLogsResponseBody extends TeaModel {
    @NameInMap("AuthenticationLogContent")
    public java.util.List<ListAuthenticationLogsResponseBodyAuthenticationLogContent> authenticationLogContent;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    // 返回列表长度
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthenticationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticationLogsResponseBody self = new ListAuthenticationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthenticationLogsResponseBody setAuthenticationLogContent(java.util.List<ListAuthenticationLogsResponseBodyAuthenticationLogContent> authenticationLogContent) {
        this.authenticationLogContent = authenticationLogContent;
        return this;
    }
    public java.util.List<ListAuthenticationLogsResponseBodyAuthenticationLogContent> getAuthenticationLogContent() {
        return this.authenticationLogContent;
    }

    public ListAuthenticationLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthenticationLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthenticationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthenticationLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthenticationLogsResponseBodyAuthenticationLogContent extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("ApplicationExternalId")
        public String applicationExternalId;

        @NameInMap("ApplicationUuid")
        public String applicationUuid;

        @NameInMap("AuthenticationAction")
        public String authenticationAction;

        @NameInMap("AuthenticationTime")
        public Long authenticationTime;

        @NameInMap("AuthenticatorName")
        public String authenticatorName;

        @NameInMap("AuthenticatorType")
        public String authenticatorType;

        @NameInMap("AuthenticatorUuid")
        public String authenticatorUuid;

        @NameInMap("ChallengeBase64")
        public String challengeBase64;

        @NameInMap("CredentialId")
        public String credentialId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("LogParams")
        public String logParams;

        @NameInMap("LogTag")
        public String logTag;

        @NameInMap("RawAuthenticationContext")
        public String rawAuthenticationContext;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UserAgent")
        public String userAgent;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserSourceIp")
        public String userSourceIp;

        @NameInMap("VerifyResult")
        public Boolean verifyResult;

        public static ListAuthenticationLogsResponseBodyAuthenticationLogContent build(java.util.Map<String, ?> map) throws Exception {
            ListAuthenticationLogsResponseBodyAuthenticationLogContent self = new ListAuthenticationLogsResponseBodyAuthenticationLogContent();
            return TeaModel.build(map, self);
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setApplicationExternalId(String applicationExternalId) {
            this.applicationExternalId = applicationExternalId;
            return this;
        }
        public String getApplicationExternalId() {
            return this.applicationExternalId;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setApplicationUuid(String applicationUuid) {
            this.applicationUuid = applicationUuid;
            return this;
        }
        public String getApplicationUuid() {
            return this.applicationUuid;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setAuthenticationAction(String authenticationAction) {
            this.authenticationAction = authenticationAction;
            return this;
        }
        public String getAuthenticationAction() {
            return this.authenticationAction;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setAuthenticationTime(Long authenticationTime) {
            this.authenticationTime = authenticationTime;
            return this;
        }
        public Long getAuthenticationTime() {
            return this.authenticationTime;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setAuthenticatorName(String authenticatorName) {
            this.authenticatorName = authenticatorName;
            return this;
        }
        public String getAuthenticatorName() {
            return this.authenticatorName;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setAuthenticatorType(String authenticatorType) {
            this.authenticatorType = authenticatorType;
            return this;
        }
        public String getAuthenticatorType() {
            return this.authenticatorType;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setAuthenticatorUuid(String authenticatorUuid) {
            this.authenticatorUuid = authenticatorUuid;
            return this;
        }
        public String getAuthenticatorUuid() {
            return this.authenticatorUuid;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setChallengeBase64(String challengeBase64) {
            this.challengeBase64 = challengeBase64;
            return this;
        }
        public String getChallengeBase64() {
            return this.challengeBase64;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setLogParams(String logParams) {
            this.logParams = logParams;
            return this;
        }
        public String getLogParams() {
            return this.logParams;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setLogTag(String logTag) {
            this.logTag = logTag;
            return this;
        }
        public String getLogTag() {
            return this.logTag;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setRawAuthenticationContext(String rawAuthenticationContext) {
            this.rawAuthenticationContext = rawAuthenticationContext;
            return this;
        }
        public String getRawAuthenticationContext() {
            return this.rawAuthenticationContext;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }
        public String getUserAgent() {
            return this.userAgent;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setUserSourceIp(String userSourceIp) {
            this.userSourceIp = userSourceIp;
            return this;
        }
        public String getUserSourceIp() {
            return this.userSourceIp;
        }

        public ListAuthenticationLogsResponseBodyAuthenticationLogContent setVerifyResult(Boolean verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

    }

}
