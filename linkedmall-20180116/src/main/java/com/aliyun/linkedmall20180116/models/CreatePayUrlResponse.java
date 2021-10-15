// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreatePayUrlResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Model")
    @Validation(required = true)
    public CreatePayUrlResponseModel model;

    public static CreatePayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePayUrlResponse self = new CreatePayUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreatePayUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePayUrlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePayUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePayUrlResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreatePayUrlResponse setModel(CreatePayUrlResponseModel model) {
        this.model = model;
        return this;
    }
    public CreatePayUrlResponseModel getModel() {
        return this.model;
    }

    public static class CreatePayUrlResponseModel extends TeaModel {
        @NameInMap("RedirectUrl")
        @Validation(required = true)
        public String redirectUrl;

        @NameInMap("OrderIds")
        @Validation(required = true)
        public java.util.List<String> orderIds;

        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public java.util.List<String> payTradeIds;

        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<String> lmOrderList;

        public static CreatePayUrlResponseModel build(java.util.Map<String, ?> map) throws Exception {
            CreatePayUrlResponseModel self = new CreatePayUrlResponseModel();
            return TeaModel.build(map, self);
        }

        public CreatePayUrlResponseModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public CreatePayUrlResponseModel setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        public CreatePayUrlResponseModel setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreatePayUrlResponseModel setLmOrderList(java.util.List<String> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<String> getLmOrderList() {
            return this.lmOrderList;
        }

    }

}
