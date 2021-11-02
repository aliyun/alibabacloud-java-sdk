// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class EnableOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public EnableOrderResponseBodyModel model;

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

    public static EnableOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableOrderResponseBody self = new EnableOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public EnableOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableOrderResponseBody setModel(EnableOrderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public EnableOrderResponseBodyModel getModel() {
        return this.model;
    }

    public EnableOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public EnableOrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public EnableOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class EnableOrderResponseBodyModelLmOrderListLmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
        public String lmOrderId;

        public static EnableOrderResponseBodyModelLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseBodyModelLmOrderListLmOrderList self = new EnableOrderResponseBodyModelLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseBodyModelLmOrderListLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class EnableOrderResponseBodyModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<EnableOrderResponseBodyModelLmOrderListLmOrderList> lmOrderList;

        public static EnableOrderResponseBodyModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseBodyModelLmOrderList self = new EnableOrderResponseBodyModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseBodyModelLmOrderList setLmOrderList(java.util.List<EnableOrderResponseBodyModelLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<EnableOrderResponseBodyModelLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class EnableOrderResponseBodyModelOrderIds extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        public static EnableOrderResponseBodyModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseBodyModelOrderIds self = new EnableOrderResponseBodyModelOrderIds();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseBodyModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class EnableOrderResponseBodyModelPayTradeIds extends TeaModel {
        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        public static EnableOrderResponseBodyModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseBodyModelPayTradeIds self = new EnableOrderResponseBodyModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseBodyModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class EnableOrderResponseBodyModel extends TeaModel {
        @NameInMap("LmOrderList")
        public EnableOrderResponseBodyModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        public EnableOrderResponseBodyModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        public EnableOrderResponseBodyModelPayTradeIds payTradeIds;

        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static EnableOrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderResponseBodyModel self = new EnableOrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public EnableOrderResponseBodyModel setLmOrderList(EnableOrderResponseBodyModelLmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public EnableOrderResponseBodyModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        public EnableOrderResponseBodyModel setOrderIds(EnableOrderResponseBodyModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public EnableOrderResponseBodyModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public EnableOrderResponseBodyModel setPayTradeIds(EnableOrderResponseBodyModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public EnableOrderResponseBodyModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

        public EnableOrderResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
