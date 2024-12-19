// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefreshSettlementOrderAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<RefreshSettlementOrderAccountResponseBodyModel> model;

    /**
     * <strong>example:</strong>
     * <p>719E8348-72BD-581E-971F-467***6C908</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>15******65</p>
         */
        @NameInMap("AccountNo")
        public String accountNo;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>TEST000000</p>
         */
        @NameInMap("SettleNo")
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
