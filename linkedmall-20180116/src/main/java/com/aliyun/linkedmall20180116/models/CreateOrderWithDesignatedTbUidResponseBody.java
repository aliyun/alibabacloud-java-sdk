// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderWithDesignatedTbUidResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateOrderWithDesignatedTbUidResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>75F3A591-B1A6-5EFF-8ABF-35AB8804DFA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static CreateOrderWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderWithDesignatedTbUidResponseBody self = new CreateOrderWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setModel(CreateOrderWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateOrderWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOrderWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateOrderWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("AllIdsMap")
        public java.util.Map<String, java.util.Map<String, ?>> allIdsMap;

        /**
         * <strong>example:</strong>
         * <p>linkedmall-platform</p>
         */
        @NameInMap("App")
        public String app;

        @NameInMap("LmOrderIds")
        public java.util.List<String> lmOrderIds;

        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static CreateOrderWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderWithDesignatedTbUidResponseBodyModel self = new CreateOrderWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateOrderWithDesignatedTbUidResponseBodyModel setAllIdsMap(java.util.Map<String, java.util.Map<String, ?>> allIdsMap) {
            this.allIdsMap = allIdsMap;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getAllIdsMap() {
            return this.allIdsMap;
        }

        public CreateOrderWithDesignatedTbUidResponseBodyModel setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public CreateOrderWithDesignatedTbUidResponseBodyModel setLmOrderIds(java.util.List<String> lmOrderIds) {
            this.lmOrderIds = lmOrderIds;
            return this;
        }
        public java.util.List<String> getLmOrderIds() {
            return this.lmOrderIds;
        }

        public CreateOrderWithDesignatedTbUidResponseBodyModel setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        public CreateOrderWithDesignatedTbUidResponseBodyModel setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreateOrderWithDesignatedTbUidResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
