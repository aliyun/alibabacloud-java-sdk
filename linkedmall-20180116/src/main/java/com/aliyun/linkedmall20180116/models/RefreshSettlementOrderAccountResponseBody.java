// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefreshSettlementOrderAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<RefreshSettlementOrderAccountResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static RefreshSettlementOrderAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshSettlementOrderAccountResponseBody self = new RefreshSettlementOrderAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshSettlementOrderAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshSettlementOrderAccountResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RefreshSettlementOrderAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshSettlementOrderAccountResponseBody setModel(java.util.List<RefreshSettlementOrderAccountResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<RefreshSettlementOrderAccountResponseBodyModel> getModel() {
        return this.model;
    }

    public RefreshSettlementOrderAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshSettlementOrderAccountResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RefreshSettlementOrderAccountResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RefreshSettlementOrderAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefreshSettlementOrderAccountResponseBodyModel extends TeaModel {
        @NameInMap("accountNo")
        public String accountNo;

        @NameInMap("message")
        public String message;

        @NameInMap("result")
        public String result;

        @NameInMap("settleNo")
        public String settleNo;

        public static RefreshSettlementOrderAccountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RefreshSettlementOrderAccountResponseBodyModel self = new RefreshSettlementOrderAccountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RefreshSettlementOrderAccountResponseBodyModel setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public RefreshSettlementOrderAccountResponseBodyModel setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RefreshSettlementOrderAccountResponseBodyModel setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public RefreshSettlementOrderAccountResponseBodyModel setSettleNo(String settleNo) {
            this.settleNo = settleNo;
            return this;
        }
        public String getSettleNo() {
            return this.settleNo;
        }

    }

}
