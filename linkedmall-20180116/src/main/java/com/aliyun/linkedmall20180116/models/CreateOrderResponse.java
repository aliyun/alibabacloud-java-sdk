// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderResponse extends TeaModel {
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
    public CreateOrderResponseModel model;

    public static CreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponse self = new CreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrderResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateOrderResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateOrderResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOrderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public CreateOrderResponse setModel(CreateOrderResponseModel model) {
        this.model = model;
        return this;
    }
    public CreateOrderResponseModel getModel() {
        return this.model;
    }

    public static class CreateOrderResponseModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public String lmOrderId;

        public static CreateOrderResponseModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseModelLmOrderListLmOrderList self = new CreateOrderResponseModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class CreateOrderResponseModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<CreateOrderResponseModelLmOrderListLmOrderList> lmOrderList;

        public static CreateOrderResponseModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseModelLmOrderList self = new CreateOrderResponseModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseModelLmOrderList setLmOrderList(java.util.List<CreateOrderResponseModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<CreateOrderResponseModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class CreateOrderResponseModelOrderIds extends TeaModel {
        // OrderIds
        @NameInMap("OrderIds")
        @Validation(required = true)
        public java.util.List<String> orderIds;

        public static CreateOrderResponseModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseModelOrderIds self = new CreateOrderResponseModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateOrderResponseModelPayTradeIds extends TeaModel {
        // PayTradeIds
        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public java.util.List<String> payTradeIds;

        public static CreateOrderResponseModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseModelPayTradeIds self = new CreateOrderResponseModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateOrderResponseModel extends TeaModel {
        @NameInMap("RedirectUrl")
        @Validation(required = true)
        public String redirectUrl;

        @NameInMap("LmOrderList")
        @Validation(required = true)
        public CreateOrderResponseModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        @Validation(required = true)
        public CreateOrderResponseModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public CreateOrderResponseModelPayTradeIds payTradeIds;

        public static CreateOrderResponseModel build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseModel self = new CreateOrderResponseModel();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public CreateOrderResponseModel setLmOrderList(CreateOrderResponseModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public CreateOrderResponseModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public CreateOrderResponseModel setOrderIds(CreateOrderResponseModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateOrderResponseModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public CreateOrderResponseModel setPayTradeIds(CreateOrderResponseModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateOrderResponseModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

    }

}
