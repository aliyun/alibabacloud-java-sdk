// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferOutInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>2018-04-13 19:57:56</p>
     */
    @NameInMap("ExpirationDate")
    public String expirationDate;

    /**
     * <strong>example:</strong>
     * <p>2018-04-13 19:57:56</p>
     */
    @NameInMap("PendingRequestDate")
    public String pendingRequestDate;

    /**
     * <strong>example:</strong>
     * <p>BBEC5A50-DFDF-482E-8343-B4EB0105E055</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>clientRejected</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>Transfer out rejected</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
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
