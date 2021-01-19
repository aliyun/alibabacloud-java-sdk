// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class EnableOrderResponse extends TeaModel {
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
    public EnableOrderResponseModel model;

    public static EnableOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableOrderResponse self = new EnableOrderResponse();
        return TeaModel.build(map, self);
    }

    public EnableOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableOrderResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public EnableOrderResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public EnableOrderResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public EnableOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableOrderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public EnableOrderResponse setModel(EnableOrderResponseModel model) {
        this.model = model;
        return this;
    }
    public EnableOrderResponseModel getModel() {
        return this.model;
    }

    public static class EnableOrderResponseModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public String lmOrderId;

        public static EnableOrderResponseModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseModelLmOrderListLmOrderList self = new EnableOrderResponseModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class EnableOrderResponseModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<EnableOrderResponseModelLmOrderListLmOrderList> lmOrderList;

        public static EnableOrderResponseModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseModelLmOrderList self = new EnableOrderResponseModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseModelLmOrderList setLmOrderList(java.util.List<EnableOrderResponseModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<EnableOrderResponseModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class EnableOrderResponseModelOrderIds extends TeaModel {
        // OrderIds
        @NameInMap("OrderIds")
        @Validation(required = true)
        public java.util.List<String> orderIds;

        public static EnableOrderResponseModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseModelOrderIds self = new EnableOrderResponseModelOrderIds();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class EnableOrderResponseModelPayTradeIds extends TeaModel {
        // PayTradeIds
        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public java.util.List<String> payTradeIds;

        public static EnableOrderResponseModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseModelPayTradeIds self = new EnableOrderResponseModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class EnableOrderResponseModel extends TeaModel {
        @NameInMap("RedirectUrl")
        @Validation(required = true)
        public String redirectUrl;

        @NameInMap("LmOrderList")
        @Validation(required = true)
        public EnableOrderResponseModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        @Validation(required = true)
        public EnableOrderResponseModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public EnableOrderResponseModelPayTradeIds payTradeIds;

        public static EnableOrderResponseModel build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseModel self = new EnableOrderResponseModel();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public EnableOrderResponseModel setLmOrderList(EnableOrderResponseModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public EnableOrderResponseModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public EnableOrderResponseModel setOrderIds(EnableOrderResponseModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public EnableOrderResponseModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public EnableOrderResponseModel setPayTradeIds(EnableOrderResponseModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public EnableOrderResponseModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

    }

}
