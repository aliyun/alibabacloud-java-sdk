// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateVirtualProductOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Model")
    public CreateVirtualProductOrderResponseBodyModel model;

    public static CreateVirtualProductOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualProductOrderResponseBody self = new CreateVirtualProductOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualProductOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualProductOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateVirtualProductOrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateVirtualProductOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVirtualProductOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVirtualProductOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateVirtualProductOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public CreateVirtualProductOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateVirtualProductOrderResponseBody setModel(CreateVirtualProductOrderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateVirtualProductOrderResponseBodyModel getModel() {
        return this.model;
    }

    public static class CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        public String lmOrderId;

        public static CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList self = new CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class CreateVirtualProductOrderResponseBodyModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList> lmOrderList;

        public static CreateVirtualProductOrderResponseBodyModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseBodyModelLmOrderList self = new CreateVirtualProductOrderResponseBodyModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseBodyModelLmOrderList setLmOrderList(java.util.List<CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<CreateVirtualProductOrderResponseBodyModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class CreateVirtualProductOrderResponseBodyModelPayTradeIds extends TeaModel {
        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        public static CreateVirtualProductOrderResponseBodyModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseBodyModelPayTradeIds self = new CreateVirtualProductOrderResponseBodyModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseBodyModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateVirtualProductOrderResponseBodyModelOrderIds extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        public static CreateVirtualProductOrderResponseBodyModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseBodyModelOrderIds self = new CreateVirtualProductOrderResponseBodyModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseBodyModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateVirtualProductOrderResponseBodyModel extends TeaModel {
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        @NameInMap("LmOrderList")
        public CreateVirtualProductOrderResponseBodyModelLmOrderList lmOrderList;

        @NameInMap("PayTradeIds")
        public CreateVirtualProductOrderResponseBodyModelPayTradeIds payTradeIds;

        @NameInMap("OrderIds")
        public CreateVirtualProductOrderResponseBodyModelOrderIds orderIds;

        public static CreateVirtualProductOrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualProductOrderResponseBodyModel self = new CreateVirtualProductOrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateVirtualProductOrderResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public CreateVirtualProductOrderResponseBodyModel setLmOrderList(CreateVirtualProductOrderResponseBodyModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public CreateVirtualProductOrderResponseBodyModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public CreateVirtualProductOrderResponseBodyModel setPayTradeIds(CreateVirtualProductOrderResponseBodyModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateVirtualProductOrderResponseBodyModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreateVirtualProductOrderResponseBodyModel setOrderIds(CreateVirtualProductOrderResponseBodyModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateVirtualProductOrderResponseBodyModelOrderIds getOrderIds() {
            return this.orderIds;
        }

    }

}
