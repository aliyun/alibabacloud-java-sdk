// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateSavingsPlansInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateSavingsPlansInstanceResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSavingsPlansInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlansInstanceResponseBody self = new CreateSavingsPlansInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlansInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSavingsPlansInstanceResponseBody setData(CreateSavingsPlansInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSavingsPlansInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateSavingsPlansInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSavingsPlansInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSavingsPlansInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSavingsPlansInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the order.</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static CreateSavingsPlansInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSavingsPlansInstanceResponseBodyData self = new CreateSavingsPlansInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSavingsPlansInstanceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
