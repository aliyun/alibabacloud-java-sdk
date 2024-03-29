// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateMovieTicketOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateMovieTicketOrderResponseBodyModel model;

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

    public static CreateMovieTicketOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMovieTicketOrderResponseBody self = new CreateMovieTicketOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMovieTicketOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMovieTicketOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateMovieTicketOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMovieTicketOrderResponseBody setModel(CreateMovieTicketOrderResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateMovieTicketOrderResponseBodyModel getModel() {
        return this.model;
    }

    public CreateMovieTicketOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMovieTicketOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateMovieTicketOrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateMovieTicketOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateMovieTicketOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateMovieTicketOrderResponseBodyModelOrderIds extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        public static CreateMovieTicketOrderResponseBodyModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateMovieTicketOrderResponseBodyModelOrderIds self = new CreateMovieTicketOrderResponseBodyModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateMovieTicketOrderResponseBodyModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateMovieTicketOrderResponseBodyModelPayTradeIds extends TeaModel {
        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        public static CreateMovieTicketOrderResponseBodyModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateMovieTicketOrderResponseBodyModelPayTradeIds self = new CreateMovieTicketOrderResponseBodyModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateMovieTicketOrderResponseBodyModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateMovieTicketOrderResponseBodyModel extends TeaModel {
        @NameInMap("OrderIds")
        public CreateMovieTicketOrderResponseBodyModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        public CreateMovieTicketOrderResponseBodyModelPayTradeIds payTradeIds;

        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static CreateMovieTicketOrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateMovieTicketOrderResponseBodyModel self = new CreateMovieTicketOrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateMovieTicketOrderResponseBodyModel setOrderIds(CreateMovieTicketOrderResponseBodyModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateMovieTicketOrderResponseBodyModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public CreateMovieTicketOrderResponseBodyModel setPayTradeIds(CreateMovieTicketOrderResponseBodyModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateMovieTicketOrderResponseBodyModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreateMovieTicketOrderResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
