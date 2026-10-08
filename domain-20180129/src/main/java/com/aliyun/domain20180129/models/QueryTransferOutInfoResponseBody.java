// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferOutInfoResponseBody extends TeaModel {
    /**
     * <p>Mailbox to which the transfer password was sent.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Expiration time of the obtained transfer password.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-04-13 19:57:56</p>
     */
    @NameInMap("ExpirationDate")
    public String expirationDate;

    /**
     * <p>Time when the transfer-out request was received from the domain name registry.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-04-13 19:57:56</p>
     */
    @NameInMap("PendingRequestDate")
    public String pendingRequestDate;

    /**
     * <p>Unique request access token.</p>
     * 
     * <strong>example:</strong>
     * <p>BBEC5A50-DFDF-482E-8343-B4EB0105E055</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Encoding of the transfer-out failure reason.</p>
     * 
     * <strong>example:</strong>
     * <p>clientRejected</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <p>Description of the transfer-out failure reason.</p>
     * 
     * <strong>example:</strong>
     * <p>Transfer out rejected</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <p>Transfer-out status. Valid values:  </p>
     * <ul>
     * <li><strong>1</strong>: Phone authentication required;  </li>
     * <li><strong>2</strong>: Mailbox authentication required;  </li>
     * <li><strong>3</strong>: Transfer password already obtained;  </li>
     * <li><strong>4</strong>: Transfer-out in progress (transfer request received from the domain name registry);  </li>
     * <li><strong>5</strong>: Transfer-out succeeded;  </li>
     * <li><strong>8</strong>: Transfer-out failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Time when the transfer password was obtained.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-04-13 19:57:56</p>
     */
    @NameInMap("TransferAuthorizationCodeSendDate")
    public String transferAuthorizationCodeSendDate;

    public static QueryTransferOutInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferOutInfoResponseBody self = new QueryTransferOutInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTransferOutInfoResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryTransferOutInfoResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public QueryTransferOutInfoResponseBody setPendingRequestDate(String pendingRequestDate) {
        this.pendingRequestDate = pendingRequestDate;
        return this;
    }
    public String getPendingRequestDate() {
        return this.pendingRequestDate;
    }

    public QueryTransferOutInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTransferOutInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTransferOutInfoResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTransferOutInfoResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryTransferOutInfoResponseBody setTransferAuthorizationCodeSendDate(String transferAuthorizationCodeSendDate) {
        this.transferAuthorizationCodeSendDate = transferAuthorizationCodeSendDate;
        return this;
    }
    public String getTransferAuthorizationCodeSendDate() {
        return this.transferAuthorizationCodeSendDate;
    }

}
