// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateOrderV2ResponseBodyModel model;

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

    public static CreateOrderV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderV2ResponseBody self = new CreateOrderV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderV2ResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateOrderV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrderV2ResponseBody setModel(CreateOrderV2ResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateOrderV2ResponseBodyModel getModel() {
        return this.model;
    }

    public CreateOrderV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderV2ResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateOrderV2ResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateOrderV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOrderV2ResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateOrderV2ResponseBodyModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        public String lmOrderId;

        public static CreateOrderV2ResponseBodyModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseBodyModelLmOrderListLmOrderList self = new CreateOrderV2ResponseBodyModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseBodyModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class CreateOrderV2ResponseBodyModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<CreateOrderV2ResponseBodyModelLmOrderListLmOrderList> lmOrderList;

        public static CreateOrderV2ResponseBodyModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseBodyModelLmOrderList self = new CreateOrderV2ResponseBodyModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseBodyModelLmOrderList setLmOrderList(java.util.List<CreateOrderV2ResponseBodyModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<CreateOrderV2ResponseBodyModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class CreateOrderV2ResponseBodyModelOrderIds extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        public static CreateOrderV2ResponseBodyModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseBodyModelOrderIds self = new CreateOrderV2ResponseBodyModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseBodyModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateOrderV2ResponseBodyModelPayTradeIds extends TeaModel {
        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        public static CreateOrderV2ResponseBodyModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseBodyModelPayTradeIds self = new CreateOrderV2ResponseBodyModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseBodyModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateOrderV2ResponseBodyModel extends TeaModel {
        @NameInMap("LmOrderList")
        public CreateOrderV2ResponseBodyModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        public CreateOrderV2ResponseBodyModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        public CreateOrderV2ResponseBodyModelPayTradeIds payTradeIds;

        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static CreateOrderV2ResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2ResponseBodyModel self = new CreateOrderV2ResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2ResponseBodyModel setLmOrderList(CreateOrderV2ResponseBodyModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public CreateOrderV2ResponseBodyModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public CreateOrderV2ResponseBodyModel setOrderIds(CreateOrderV2ResponseBodyModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateOrderV2ResponseBodyModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public CreateOrderV2ResponseBodyModel setPayTradeIds(CreateOrderV2ResponseBodyModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateOrderV2ResponseBodyModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreateOrderV2ResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
