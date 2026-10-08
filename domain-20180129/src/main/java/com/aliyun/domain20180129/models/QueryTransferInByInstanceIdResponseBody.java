// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInByInstanceIdResponseBody extends TeaModel {
    /**
     * <p>Domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Mailbox to which the domain name transfer-in confirmation email was sent.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The expiration time of the domain name transfer-in.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("ExpirationDate")
    public String expirationDate;

    /**
     * <p>The UNIX timestamp indicating when the transfer-in expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("ExpirationDateLong")
    public Long expirationDateLong;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>S20181T0WLI85212</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The update time of the transfer-in information.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("ModificationDate")
    public String modificationDate;

    /**
     * <p>The UNIX timestamp indicating when the transfer-in information was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("ModificationDateLong")
    public Long modificationDateLong;

    /**
     * <p>Indicates whether email verification is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedMailCheck")
    public Boolean needMailCheck;

    /**
     * <p>Progress bar chart type for the transfer procedure. Valid values:  </p>
     * <ul>
     * <li><strong>0</strong>: Both email verification and naming review are required;  </li>
     * <li><strong>1</strong>: Email verification is required, but naming review is not;  </li>
     * <li><strong>2</strong>: Naming review is required, but email verification is not;  </li>
     * <li><strong>3</strong>: Neither email verification nor naming review is required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProgressBarType")
    public Integer progressBarType;

    /**
     * <p>Unique request access token.</p>
     * 
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code indicating the reason for transfer failure. Valid values:</p>
     * <ul>
     * <li><strong>clientCancelled</strong>: You canceled the domain transfer-in.</li>
     * <li><strong>clientRejected</strong>: The original registrar rejected the domain transfer-in (or you performed a rejection operation through the original registrar).</li>
     * <li><strong>serverCancelled</strong>: The domain name registry canceled the transfer.</li>
     * <li><strong>transferProhibited</strong>: The domain is in a transfer-prohibited status.</li>
     * <li><strong>transferExpired</strong>: You did not complete the required transfer confirmation within the validity period.</li>
     * <li><strong>nameVerificationFailed</strong>: The domain naming review did not pass.</li>
     * <li><strong>transferSubmitted</strong>: Another user has already submitted a transfer request for this domain.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clientCancelled</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <p>The time when the transfer succeeded or failed.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("ResultDate")
    public String resultDate;

    /**
     * <p>The UNIX timestamp indicating when the transfer succeeded or failed.</p>
     * 
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("ResultDateLong")
    public Long resultDateLong;

    /**
     * <p>Description of the failure reason when the transfer failed.</p>
     * 
     * <strong>example:</strong>
     * <p>您取消了此次域名转入</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <p>Transfer status. Valid values:  </p>
     * <ul>
     * <li><strong>INIT</strong>: Transfer-in submitted;  </li>
     * <li><strong>AUTHORIZATION</strong>: Authorization for transfer-in (email verification);  </li>
     * <li><strong>NAME_VERIFICATION</strong>: Naming review;  </li>
     * <li><strong>PASSWORD_VERIFICATION</strong>: Transfer password verification;  </li>
     * <li><strong>PENDING</strong>: Transfer-in in progress;  </li>
     * <li><strong>SUCCESS</strong>: Transfer-in succeeded;  </li>
     * <li><strong>FAIL</strong>: Transfer-in failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SimpleTransferInStatus")
    public String simpleTransferInStatus;

    /**
     * <p>Detailed domain name transfer-in status. Valid values:  </p>
     * <ul>
     * <li><strong>10</strong>: Initial status;  </li>
     * <li><strong>11</strong>: Email verification token link has been sent;  </li>
     * <li><strong>19</strong>: Token link has been successfully verified;  </li>
     * <li><strong>20</strong>: Naming review has been submitted;  </li>
     * <li><strong>21</strong>: Naming review failed;  </li>
     * <li><strong>29</strong>: Naming review succeeded;  </li>
     * <li><strong>31</strong>: Transfer password is incorrect;  </li>
     * <li><strong>39</strong>: Transfer-in submission succeeded;  </li>
     * <li><strong>50</strong>: Customer canceled the transfer-in;  </li>
     * <li><strong>51</strong>: Transfer-in failed;  </li>
     * <li><strong>52</strong>: Transfer-in expired;  </li>
     * <li><strong>59</strong>: Transfer-in succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Transfer request submission time.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("SubmissionDate")
    public String submissionDate;

    /**
     * <p>UNIX timestamp of the transfer request submission time.</p>
     * 
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("SubmissionDateLong")
    public Long submissionDateLong;

    /**
     * <p>Time when the transfer password was successfully submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("TransferAuthorizationCodeSubmissionDate")
    public String transferAuthorizationCodeSubmissionDate;

    /**
     * <p>UNIX timestamp of the time when the transfer password was successfully submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("TransferAuthorizationCodeSubmissionDateLong")
    public Long transferAuthorizationCodeSubmissionDateLong;

    /**
     * <p>User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Indicates whether the registrant\&quot;s mailbox was scraped from WHOIS. When the domain transfer-in is in the authorization (email verification) phase and this field is <strong>false</strong>, it means the registrant\&quot;s mailbox was not obtained via WHOIS scraping, and manual processing is required.</p>
     * 
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
