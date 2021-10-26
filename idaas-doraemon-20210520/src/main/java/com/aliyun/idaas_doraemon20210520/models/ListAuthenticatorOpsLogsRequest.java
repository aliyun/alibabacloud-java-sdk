// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticatorOpsLogsRequest extends TeaModel {
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("AuthenticatorUuid")
    public String authenticatorUuid;

    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    @NameInMap("FromTime")
    public Long fromTime;

    @NameInMap("ToTime")
    public Long toTime;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListAuthenticatorOpsLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatorOpsLogsRequest self = new ListAuthenticatorOpsLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatorOpsLogsRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public ListAuthenticatorOpsLogsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListAuthenticatorOpsLogsRequest setAuthenticatorUuid(String authenticatorUuid) {
        this.authenticatorUuid = authenticatorUuid;
        return this;
    }
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    public ListAuthenticatorOpsLogsRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public ListAuthenticatorOpsLogsRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public ListAuthenticatorOpsLogsRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public ListAuthenticatorOpsLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthenticatorOpsLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
