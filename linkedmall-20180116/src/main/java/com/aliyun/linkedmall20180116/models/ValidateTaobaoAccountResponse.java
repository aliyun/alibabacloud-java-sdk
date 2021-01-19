// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ValidateTaobaoAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public ValidateTaobaoAccountResponseModel model;

    public static ValidateTaobaoAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTaobaoAccountResponse self = new ValidateTaobaoAccountResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTaobaoAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateTaobaoAccountResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateTaobaoAccountResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateTaobaoAccountResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ValidateTaobaoAccountResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ValidateTaobaoAccountResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ValidateTaobaoAccountResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ValidateTaobaoAccountResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ValidateTaobaoAccountResponse setModel(ValidateTaobaoAccountResponseModel model) {
        this.model = model;
        return this;
    }
    public ValidateTaobaoAccountResponseModel getModel() {
        return this.model;
    }

    public static class ValidateTaobaoAccountResponseModel extends TeaModel {
        @NameInMap("Match")
        @Validation(required = true)
        public Boolean match;

        public static ValidateTaobaoAccountResponseModel build(java.util.Map<String, ?> map) throws Exception {
            ValidateTaobaoAccountResponseModel self = new ValidateTaobaoAccountResponseModel();
            return TeaModel.build(map, self);
        }

        public ValidateTaobaoAccountResponseModel setMatch(Boolean match) {
            this.match = match;
            return this;
        }
        public Boolean getMatch() {
            return this.match;
        }

    }

}
