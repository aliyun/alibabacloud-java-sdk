// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ValidateTaobaoAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ValidateTaobaoAccountResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ValidateTaobaoAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateTaobaoAccountResponseBody self = new ValidateTaobaoAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateTaobaoAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateTaobaoAccountResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ValidateTaobaoAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateTaobaoAccountResponseBody setModel(ValidateTaobaoAccountResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ValidateTaobaoAccountResponseBodyModel getModel() {
        return this.model;
    }

    public ValidateTaobaoAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateTaobaoAccountResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ValidateTaobaoAccountResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ValidateTaobaoAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ValidateTaobaoAccountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ValidateTaobaoAccountResponseBodyModel extends TeaModel {
        @NameInMap("Match")
        public Boolean match;

        public static ValidateTaobaoAccountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ValidateTaobaoAccountResponseBodyModel self = new ValidateTaobaoAccountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ValidateTaobaoAccountResponseBodyModel setMatch(Boolean match) {
            this.match = match;
            return this;
        }
        public Boolean getMatch() {
            return this.match;
        }

    }

}
