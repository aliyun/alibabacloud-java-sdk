// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class EnableBillGenerationResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public EnableBillGenerationResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnableBillGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableBillGenerationResponseBody self = new EnableBillGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableBillGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableBillGenerationResponseBody setData(EnableBillGenerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableBillGenerationResponseBodyData getData() {
        return this.data;
    }

    public EnableBillGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class EnableBillGenerationResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the feature is enabled.</p>
         */
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
