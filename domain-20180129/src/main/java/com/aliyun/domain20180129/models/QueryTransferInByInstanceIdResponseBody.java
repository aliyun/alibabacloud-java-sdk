// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInByInstanceIdResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("TransferAuthorizationCodeSubmissionDate")
    public String transferAuthorizationCodeSubmissionDate;

    @NameInMap("Email")
    public String email;

    @NameInMap("ProgressBarType")
    public Integer progressBarType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("SubmissionDateLong")
    public Long submissionDateLong;

    @NameInMap("SubmissionDate")
    public String submissionDate;

    @NameInMap("SimpleTransferInStatus")
    public String simpleTransferInStatus;

    @NameInMap("TransferAuthorizationCodeSubmissionDateLong")
    public Long transferAuthorizationCodeSubmissionDateLong;

    @NameInMap("ExpirationDateLong")
    public Long expirationDateLong;

    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("NeedMailCheck")
    public Boolean needMailCheck;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("ModificationDate")
    public String modificationDate;

    @NameInMap("ResultDateLong")
    public Long resultDateLong;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("WhoisMailStatus")
    public Boolean whoisMailStatus;

    @NameInMap("ModificationDateLong")
    public Long modificationDateLong;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultDate")
    public String resultDate;

    public static QueryTransferInByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInByInstanceIdResponseBody self = new QueryTransferInByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTransferInByInstanceIdResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryTransferInByInstanceIdResponseBody setTransferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
        this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
        return this;
    }
    public String getTransferAuthorizationCodeSubmissionDate() {
        return this.transferAuthorizationCodeSubmissionDate;
    }

    public QueryTransferInByInstanceIdResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryTransferInByInstanceIdResponseBody setProgressBarType(Integer progressBarType) {
        this.progressBarType = progressBarType;
        return this;
    }
    public Integer getProgressBarType() {
        return this.progressBarType;
    }

    public QueryTransferInByInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTransferInByInstanceIdResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTransferInByInstanceIdResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryTransferInByInstanceIdResponseBody setSubmissionDateLong(Long submissionDateLong) {
        this.submissionDateLong = submissionDateLong;
        return this;
    }
    public Long getSubmissionDateLong() {
        return this.submissionDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }
    public String getSubmissionDate() {
        return this.submissionDate;
    }

    public QueryTransferInByInstanceIdResponseBody setSimpleTransferInStatus(String simpleTransferInStatus) {
        this.simpleTransferInStatus = simpleTransferInStatus;
        return this;
    }
    public String getSimpleTransferInStatus() {
        return this.simpleTransferInStatus;
    }

    public QueryTransferInByInstanceIdResponseBody setTransferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
        this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
        return this;
    }
    public Long getTransferAuthorizationCodeSubmissionDateLong() {
        return this.transferAuthorizationCodeSubmissionDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setExpirationDateLong(Long expirationDateLong) {
        this.expirationDateLong = expirationDateLong;
        return this;
    }
    public Long getExpirationDateLong() {
        return this.expirationDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public QueryTransferInByInstanceIdResponseBody setNeedMailCheck(Boolean needMailCheck) {
        this.needMailCheck = needMailCheck;
        return this;
    }
    public Boolean getNeedMailCheck() {
        return this.needMailCheck;
    }

    public QueryTransferInByInstanceIdResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryTransferInByInstanceIdResponseBody setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    public String getModificationDate() {
        return this.modificationDate;
    }

    public QueryTransferInByInstanceIdResponseBody setResultDateLong(Long resultDateLong) {
        this.resultDateLong = resultDateLong;
        return this;
    }
    public Long getResultDateLong() {
        return this.resultDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTransferInByInstanceIdResponseBody setWhoisMailStatus(Boolean whoisMailStatus) {
        this.whoisMailStatus = whoisMailStatus;
        return this;
    }
    public Boolean getWhoisMailStatus() {
        return this.whoisMailStatus;
    }

    public QueryTransferInByInstanceIdResponseBody setModificationDateLong(Long modificationDateLong) {
        this.modificationDateLong = modificationDateLong;
        return this;
    }
    public Long getModificationDateLong() {
        return this.modificationDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTransferInByInstanceIdResponseBody setResultDate(String resultDate) {
        this.resultDate = resultDate;
        return this;
    }
    public String getResultDate() {
        return this.resultDate;
    }

}
