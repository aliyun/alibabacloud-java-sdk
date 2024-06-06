// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticationLogsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    @NameInMap("AuthenticatorUuid")
    public String authenticatorUuid;

    @NameInMap("CredentialId")
    public String credentialId;

    @NameInMap("FromTime")
    public Long fromTime;

    @NameInMap("LogTag")
    public String logTag;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ToTime")
    public Long toTime;

    @NameInMap("UserId")
    public String userId;

    public static ListAuthenticationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticationLogsRequest self = new ListAuthenticationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthenticationLogsRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public ListAuthenticationLogsRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public ListAuthenticationLogsRequest setAuthenticatorUuid(String authenticatorUuid) {
        this.authenticatorUuid = authenticatorUuid;
        return this;
    }
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    public ListAuthenticationLogsRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public ListAuthenticationLogsRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public ListAuthenticationLogsRequest setLogTag(String logTag) {
        this.logTag = logTag;
        return this;
    }
    public String getLogTag() {
        return this.logTag;
    }

    public ListAuthenticationLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthenticationLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthenticationLogsRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public ListAuthenticationLogsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
