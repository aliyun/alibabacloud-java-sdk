// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegisterSettleAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
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
    public RegisterSettleAccountResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>26F4B2C7-931F-5AC5-8FCC-AE76C9B00D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>207</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RegisterSettleAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterSettleAccountResponseBody self = new RegisterSettleAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterSettleAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterSettleAccountResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RegisterSettleAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterSettleAccountResponseBody setModel(RegisterSettleAccountResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RegisterSettleAccountResponseBodyModel getModel() {
        return this.model;
    }

    public RegisterSettleAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterSettleAccountResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RegisterSettleAccountResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RegisterSettleAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RegisterSettleAccountResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>180173763600****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>15******65</p>
         */
        @NameInMap("AccountNo")
        public String accountNo;

        /**
         * <strong>example:</strong>
         * <p>252</p>
         */
        @NameInMap("Id")
        public String id;

        public static RegisterSettleAccountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RegisterSettleAccountResponseBodyModel self = new RegisterSettleAccountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RegisterSettleAccountResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public RegisterSettleAccountResponseBodyModel setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public RegisterSettleAccountResponseBodyModel setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
