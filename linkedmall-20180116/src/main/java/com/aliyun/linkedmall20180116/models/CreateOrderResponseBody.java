// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateOrderResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrderResponseBody setModel(CreateOrderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateOrderResponseBodyModel getModel() {
        return this.model;
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateOrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateOrderResponseBodyModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        public String lmOrderId;

        public static CreateOrderResponseBodyModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyModelLmOrderListLmOrderList self = new CreateOrderResponseBodyModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class CreateOrderResponseBodyModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<CreateOrderResponseBodyModelLmOrderListLmOrderList> lmOrderList;

        public static CreateOrderResponseBodyModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyModelLmOrderList self = new CreateOrderResponseBodyModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyModelLmOrderList setLmOrderList(java.util.List<CreateOrderResponseBodyModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<CreateOrderResponseBodyModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class CreateOrderResponseBodyModelOrderIds extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        public static CreateOrderResponseBodyModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyModelOrderIds self = new CreateOrderResponseBodyModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateOrderResponseBodyModelPayTradeIds extends TeaModel {
        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        public static CreateOrderResponseBodyModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyModelPayTradeIds self = new CreateOrderResponseBodyModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateOrderResponseBodyModel extends TeaModel {
        @NameInMap("LmOrderList")
        public CreateOrderResponseBodyModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        public CreateOrderResponseBodyModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        public CreateOrderResponseBodyModelPayTradeIds payTradeIds;

        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static CreateOrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyModel self = new CreateOrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyModel setLmOrderList(CreateOrderResponseBodyModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public CreateOrderResponseBodyModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public CreateOrderResponseBodyModel setOrderIds(CreateOrderResponseBodyModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateOrderResponseBodyModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public CreateOrderResponseBodyModel setPayTradeIds(CreateOrderResponseBodyModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateOrderResponseBodyModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreateOrderResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
