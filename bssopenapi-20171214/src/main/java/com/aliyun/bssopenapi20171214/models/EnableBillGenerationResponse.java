// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class EnableBillGenerationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public EnableBillGenerationResponseData data;

    public static EnableBillGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBillGenerationResponse self = new EnableBillGenerationResponse();
        return TeaModel.build(map, self);
    }

    public EnableBillGenerationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableBillGenerationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableBillGenerationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableBillGenerationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableBillGenerationResponse setData(EnableBillGenerationResponseData data) {
        this.data = data;
        return this;
    }
    public EnableBillGenerationResponseData getData() {
        return this.data;
    }

    public static class EnableBillGenerationResponseData extends TeaModel {
        @NameInMap("Boolean")
        @Validation(required = true)
        public Boolean _boolean;

        public static EnableBillGenerationResponseData build(java.util.Map<String, ?> map) throws Exception {
            EnableBillGenerationResponseData self = new EnableBillGenerationResponseData();
            return TeaModel.build(map, self);
        }

        public EnableBillGenerationResponseData set_boolean(Boolean _boolean) {
            this._boolean = _boolean;
            return this;
        }
        public Boolean get_boolean() {
            return this._boolean;
        }

    }

}
