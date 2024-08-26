// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInByInstanceIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("ExpirationDate")
    public String expirationDate;

    /**
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("ExpirationDateLong")
    public Long expirationDateLong;

    /**
     * <strong>example:</strong>
     * <p>S20181T0WLI85212</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("ModificationDate")
    public String modificationDate;

    /**
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("ModificationDateLong")
    public Long modificationDateLong;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedMailCheck")
    public Boolean needMailCheck;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProgressBarType")
    public Integer progressBarType;

    /**
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>clientCancelled</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("ResultDate")
    public String resultDate;

    /**
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("ResultDateLong")
    public Long resultDateLong;

    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SimpleTransferInStatus")
    public String simpleTransferInStatus;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("SubmissionDate")
    public String submissionDate;

    /**
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("SubmissionDateLong")
    public Long submissionDateLong;

    /**
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("TransferAuthorizationCodeSubmissionDate")
    public String transferAuthorizationCodeSubmissionDate;

    /**
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("TransferAuthorizationCodeSubmissionDateLong")
    public Long transferAuthorizationCodeSubmissionDateLong;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WhoisMailStatus")
    public Boolean whoisMailStatus;

    public static QueryTransferInByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInByInstanceIdResponseBody self = new QueryTransferInByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTransferInByInstanceIdResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryTransferInByInstanceIdResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryTransferInByInstanceIdResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public QueryTransferInByInstanceIdResponseBody setExpirationDateLong(Long expirationDateLong) {
        this.expirationDateLong = expirationDateLong;
        return this;
    }
    public Long getExpirationDateLong() {
        return this.expirationDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTransferInByInstanceIdResponseBody setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    public String getModificationDate() {
        return this.modificationDate;
    }

    public QueryTransferInByInstanceIdResponseBody setModificationDateLong(Long modificationDateLong) {
        this.modificationDateLong = modificationDateLong;
        return this;
    }
    public Long getModificationDateLong() {
        return this.modificationDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setNeedMailCheck(Boolean needMailCheck) {
        this.needMailCheck = needMailCheck;
        return this;
    }
    public Boolean getNeedMailCheck() {
        return this.needMailCheck;
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

    public QueryTransferInByInstanceIdResponseBody setSimpleTransferInStatus(String simpleTransferInStatus) {
        this.simpleTransferInStatus = simpleTransferInStatus;
        return this;
    }
    public String getSimpleTransferInStatus() {
        return this.simpleTransferInStatus;
    }

    public QueryTransferInByInstanceIdResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryTransferInByInstanceIdResponseBody setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }
    public String getSubmissionDate() {
        return this.submissionDate;
    }

    public QueryTransferInByInstanceIdResponseBody setSubmissionDateLong(Long submissionDateLong) {
        this.submissionDateLong = submissionDateLong;
        return this;
    }
    public Long getSubmissionDateLong() {
        return this.submissionDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setTransferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
        this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
        return this;
    }
    public String getTransferAuthorizationCodeSubmissionDate() {
        return this.transferAuthorizationCodeSubmissionDate;
    }

    public QueryTransferInByInstanceIdResponseBody setTransferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
        this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
        return this;
    }
    public Long getTransferAuthorizationCodeSubmissionDateLong() {
        return this.transferAuthorizationCodeSubmissionDateLong;
    }

    public QueryTransferInByInstanceIdResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryTransferInByInstanceIdResponseBody setWhoisMailStatus(Boolean whoisMailStatus) {
        this.whoisMailStatus = whoisMailStatus;
        return this;
    }
    public Boolean getWhoisMailStatus() {
        return this.whoisMailStatus;
    }

}
