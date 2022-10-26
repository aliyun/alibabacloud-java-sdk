// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class EnableOrderWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public EnableOrderWithDesignatedTbUidResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

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

    public static EnableOrderWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableOrderWithDesignatedTbUidResponseBody self = new EnableOrderWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableOrderWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setModel(EnableOrderWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public EnableOrderWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableOrderWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList extends TeaModel {
        @NameInMap("ExtJson")
        public java.util.Map<String, String> extJson;

        @NameInMap("LmOrderId")
        public String lmOrderId;

        @NameInMap("SubLmOrderIdList")
        public java.util.List<String> subLmOrderIdList;

        public static EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList self = new EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList();
            return TeaModel.build(map, self);
        }

        public EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList setExtJson(java.util.Map<String, String> extJson) {
            this.extJson = extJson;
            return this;
        }
        public java.util.Map<String, String> getExtJson() {
            return this.extJson;
        }

        public EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        public EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList setSubLmOrderIdList(java.util.List<String> subLmOrderIdList) {
            this.subLmOrderIdList = subLmOrderIdList;
            return this;
        }
        public java.util.List<String> getSubLmOrderIdList() {
            return this.subLmOrderIdList;
        }

    }

    public static class EnableOrderWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList> lmOrderList;

        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static EnableOrderWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            EnableOrderWithDesignatedTbUidResponseBodyModel self = new EnableOrderWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public EnableOrderWithDesignatedTbUidResponseBodyModel setLmOrderList(java.util.List<EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<EnableOrderWithDesignatedTbUidResponseBodyModelLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

        public EnableOrderWithDesignatedTbUidResponseBodyModel setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        public EnableOrderWithDesignatedTbUidResponseBodyModel setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        public EnableOrderWithDesignatedTbUidResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
