// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifySettleAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ModifySettleAccountResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ModifySettleAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySettleAccountResponseBody self = new ModifySettleAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySettleAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySettleAccountResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ModifySettleAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySettleAccountResponseBody setModel(ModifySettleAccountResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ModifySettleAccountResponseBodyModel getModel() {
        return this.model;
    }

    public ModifySettleAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySettleAccountResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ModifySettleAccountResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ModifySettleAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifySettleAccountResponseBodyModel extends TeaModel {
        // 结算账号ID
        @NameInMap("AccountId")
        public String accountId;

        // 入参账号no
        @NameInMap("AccountNo")
        public String accountNo;

        // 主键ID
        @NameInMap("Id")
        public String id;

        public static ModifySettleAccountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ModifySettleAccountResponseBodyModel self = new ModifySettleAccountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ModifySettleAccountResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ModifySettleAccountResponseBodyModel setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public ModifySettleAccountResponseBodyModel setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
