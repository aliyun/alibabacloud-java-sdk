// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateVirtualProductOrderResponse extends TeaModel {
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
    public CreateVirtualProductOrderResponseModel model;

    public static CreateVirtualProductOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualProductOrderResponse self = new CreateVirtualProductOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualProductOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualProductOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVirtualProductOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVirtualProductOrderResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateVirtualProductOrderResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateVirtualProductOrderResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateVirtualProductOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateVirtualProductOrderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public CreateVirtualProductOrderResponse setModel(CreateVirtualProductOrderResponseModel model) {
        this.model = model;
        return this;
    }
    public CreateVirtualProductOrderResponseModel getModel() {
        return this.model;
    }

    public static class CreateVirtualProductOrderResponseModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public String lmOrderId;

        public static CreateVirtualProductOrderResponseModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseModelLmOrderListLmOrderList self = new CreateVirtualProductOrderResponseModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class CreateVirtualProductOrderResponseModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<CreateVirtualProductOrderResponseModelLmOrderListLmOrderList> lmOrderList;

        public static CreateVirtualProductOrderResponseModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseModelLmOrderList self = new CreateVirtualProductOrderResponseModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseModelLmOrderList setLmOrderList(java.util.List<CreateVirtualProductOrderResponseModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<CreateVirtualProductOrderResponseModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class CreateVirtualProductOrderResponseModelOrderIds extends TeaModel {
        // OrderIds
        @NameInMap("OrderIds")
        @Validation(required = true)
        public java.util.List<String> orderIds;

        public static CreateVirtualProductOrderResponseModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseModelOrderIds self = new CreateVirtualProductOrderResponseModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateVirtualProductOrderResponseModelPayTradeIds extends TeaModel {
        // PayTradeIds
        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public java.util.List<String> payTradeIds;

        public static CreateVirtualProductOrderResponseModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseModelPayTradeIds self = new CreateVirtualProductOrderResponseModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateVirtualProductOrderResponseModel extends TeaModel {
        @NameInMap("RedirectUrl")
        @Validation(required = true)
        public String redirectUrl;

        @NameInMap("LmOrderList")
        @Validation(required = true)
        public CreateVirtualProductOrderResponseModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        @Validation(required = true)
        public CreateVirtualProductOrderResponseModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public CreateVirtualProductOrderResponseModelPayTradeIds payTradeIds;

        public static CreateVirtualProductOrderResponseModel build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseModel self = new CreateVirtualProductOrderResponseModel();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public CreateVirtualProductOrderResponseModel setLmOrderList(CreateVirtualProductOrderResponseModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public CreateVirtualProductOrderResponseModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public CreateVirtualProductOrderResponseModel setOrderIds(CreateVirtualProductOrderResponseModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateVirtualProductOrderResponseModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public CreateVirtualProductOrderResponseModel setPayTradeIds(CreateVirtualProductOrderResponseModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateVirtualProductOrderResponseModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

    }

}
