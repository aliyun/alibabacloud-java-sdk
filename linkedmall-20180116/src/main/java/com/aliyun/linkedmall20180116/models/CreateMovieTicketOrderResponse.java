// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateMovieTicketOrderResponse extends TeaModel {
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
    public CreateMovieTicketOrderResponseModel model;

    public static CreateMovieTicketOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMovieTicketOrderResponse self = new CreateMovieTicketOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateMovieTicketOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMovieTicketOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMovieTicketOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMovieTicketOrderResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateMovieTicketOrderResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateMovieTicketOrderResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateMovieTicketOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateMovieTicketOrderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public CreateMovieTicketOrderResponse setModel(CreateMovieTicketOrderResponseModel model) {
        this.model = model;
        return this;
    }
    public CreateMovieTicketOrderResponseModel getModel() {
        return this.model;
    }

    public static class CreateMovieTicketOrderResponseModelOrderIds extends TeaModel {
        // OrderIds
        @NameInMap("OrderIds")
        @Validation(required = true)
        public java.util.List<String> orderIds;

        public static CreateMovieTicketOrderResponseModelOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateMovieTicketOrderResponseModelOrderIds self = new CreateMovieTicketOrderResponseModelOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateMovieTicketOrderResponseModelOrderIds setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

    public static class CreateMovieTicketOrderResponseModelPayTradeIds extends TeaModel {
        // PayTradeIds
        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public java.util.List<String> payTradeIds;

        public static CreateMovieTicketOrderResponseModelPayTradeIds build(java.util.Map<String, ?> map) throws Exception {
            CreateMovieTicketOrderResponseModelPayTradeIds self = new CreateMovieTicketOrderResponseModelPayTradeIds();
            return TeaModel.build(map, self);
        }

        public CreateMovieTicketOrderResponseModelPayTradeIds setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

    }

    public static class CreateMovieTicketOrderResponseModel extends TeaModel {
        @NameInMap("RedirectUrl")
        @Validation(required = true)
        public String redirectUrl;

        @NameInMap("OrderIds")
        @Validation(required = true)
        public CreateMovieTicketOrderResponseModelOrderIds orderIds;

        @NameInMap("PayTradeIds")
        @Validation(required = true)
        public CreateMovieTicketOrderResponseModelPayTradeIds payTradeIds;

        public static CreateMovieTicketOrderResponseModel build(java.util.Map<String, ?> map) throws Exception {
            CreateMovieTicketOrderResponseModel self = new CreateMovieTicketOrderResponseModel();
            return TeaModel.build(map, self);
        }

        public CreateMovieTicketOrderResponseModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public CreateMovieTicketOrderResponseModel setOrderIds(CreateMovieTicketOrderResponseModelOrderIds orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public CreateMovieTicketOrderResponseModelOrderIds getOrderIds() {
            return this.orderIds;
        }

        public CreateMovieTicketOrderResponseModel setPayTradeIds(CreateMovieTicketOrderResponseModelPayTradeIds payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public CreateMovieTicketOrderResponseModelPayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

    }

}
