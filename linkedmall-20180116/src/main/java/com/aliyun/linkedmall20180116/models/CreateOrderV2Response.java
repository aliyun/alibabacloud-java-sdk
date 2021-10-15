// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderV2Response extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public CreateOrderV2ResponseModel model;

    public static CreateOrderV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderV2Response self = new CreateOrderV2Response();
        return TeaModel.build(map, self);
    }

    public CreateOrderV2Response setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderV2Response setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateOrderV2Response setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrderV2Response setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderV2Response setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateOrderV2Response setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateOrderV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOrderV2Response setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public CreateOrderV2Response setModel(CreateOrderV2ResponseModel model) {
        this.model = model;
        return this;
    }
    public CreateOrderV2ResponseModel getModel() {
        return this.model;
    }

    public static class CreateOrderV2ResponseModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public String lmOrderId;

        public static CreateOrderV2ResponseModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseModelLmOrderListLmOrderList self = new CreateOrderV2ResponseModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class CreateOrderV2ResponseModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<CreateOrderV2ResponseModelLmOrderListLmOrderList> lmOrderList;

        public static CreateOrderV2ResponseModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseModelLmOrderList self = new CreateOrderV2ResponseModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseModelLmOrderList setLmOrderList(java.util.List<CreateOrderV2ResponseModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<CreateOrderV2ResponseModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class CreateOrderV2ResponseModelOrderIds extends TeaModel {
        // OrderIds
        @NameInMap("OrderIds")
        @Validation(required = true)
        public java.util.List<String> orderIds;

        public static CreateOrderV2ResponseModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseModelOrderIds self = new CreateOrderV2ResponseModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateOrderV2ResponseModelPayTradeIds extends TeaModel {
        // PayTradeIds
        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public java.util.List<String> payTradeIds;

        public static CreateOrderV2ResponseModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseModelPayTradeIds self = new CreateOrderV2ResponseModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateOrderV2ResponseModel extends TeaModel {
        @NameInMap("RedirectUrl")
        @Validation(required = true)
        public String redirectUrl;

        @NameInMap("LmOrderList")
        @Validation(required = true)
        public CreateOrderV2ResponseModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        @Validation(required = true)
        public CreateOrderV2ResponseModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public CreateOrderV2ResponseModelPayTradeIds payTradeIds;

        public static CreateOrderV2ResponseModel build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseModel self = new CreateOrderV2ResponseModel();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public CreateOrderV2ResponseModel setLmOrderList(CreateOrderV2ResponseModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public CreateOrderV2ResponseModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public CreateOrderV2ResponseModel setOrderIds(CreateOrderV2ResponseModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateOrderV2ResponseModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public CreateOrderV2ResponseModel setPayTradeIds(CreateOrderV2ResponseModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateOrderV2ResponseModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

    }

}
