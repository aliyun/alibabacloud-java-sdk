// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTransferOutInfoResponseBody extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("PendingRequestDate")
    public String pendingRequestDate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Status")
    public Integer status;

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
