// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreatePayUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreatePayUrlResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreatePayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePayUrlResponseBody self = new CreatePayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePayUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePayUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePayUrlResponseBody setModel(CreatePayUrlResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreatePayUrlResponseBodyModel getModel() {
        return this.model;
    }

    public CreatePayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePayUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePayUrlResponseBodyModel extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<String> lmOrderList;

        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static CreatePayUrlResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreatePayUrlResponseBodyModel self = new CreatePayUrlResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreatePayUrlResponseBodyModel setLmOrderList(java.util.List<String> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<String> getLmOrderList() {
            return this.lmOrderList;
        }

        public CreatePayUrlResponseBodyModel setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        public CreatePayUrlResponseBodyModel setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreatePayUrlResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
