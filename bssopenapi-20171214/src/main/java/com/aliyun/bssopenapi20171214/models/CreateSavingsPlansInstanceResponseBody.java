// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateSavingsPlansInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSavingsPlansInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
