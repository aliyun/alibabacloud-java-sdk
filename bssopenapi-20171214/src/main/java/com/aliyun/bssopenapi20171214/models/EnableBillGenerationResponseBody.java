// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class EnableBillGenerationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public EnableBillGenerationResponseBodyData data;

    public static EnableBillGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableBillGenerationResponseBody self = new EnableBillGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableBillGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableBillGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableBillGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableBillGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableBillGenerationResponseBody setData(EnableBillGenerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableBillGenerationResponseBodyData getData() {
        return this.data;
    }

    public static class EnableBillGenerationResponseBodyData extends TeaModel {
        @NameInMap("Boolean")
        public Boolean _boolean;

        public static EnableBillGenerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableBillGenerationResponseBodyData self = new EnableBillGenerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableBillGenerationResponseBodyData set_boolean(Boolean _boolean) {
            this._boolean = _boolean;
            return this;
        }
        public Boolean get_boolean() {
            return this._boolean;
        }

    }

}
