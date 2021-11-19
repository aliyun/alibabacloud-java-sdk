// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegisterSettleAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RegisterSettleAccountResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

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
        // 结算账号ID
        @NameInMap("AccountId")
        public String accountId;

        // 入参账号no
        @NameInMap("AccountNo")
        public String accountNo;

        // 主键ID
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
