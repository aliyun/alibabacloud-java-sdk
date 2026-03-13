// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCompenInfosForOpResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<QueryCompenInfosForOpResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static QueryCompenInfosForOpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCompenInfosForOpResponseBody self = new QueryCompenInfosForOpResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCompenInfosForOpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCompenInfosForOpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCompenInfosForOpResponseBody setModule(java.util.List<QueryCompenInfosForOpResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<QueryCompenInfosForOpResponseBodyModule> getModule() {
        return this.module;
    }

    public QueryCompenInfosForOpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCompenInfosForOpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCompenInfosForOpResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryCompenInfosForOpResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>82508250249123456</p>
         */
        @NameInMap("compen_id")
        public String compenId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("compensation_type")
        public String compensationType;

        /**
         * <strong>example:</strong>
         * <p>1002086203277812345</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>2025-09-22 20:13:58</p>
         */
        @NameInMap("settle_time")
        public String settleTime;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("settle_type")
        public Integer settleType;

        /**
         * <strong>example:</strong>
         * <p>999-12345678</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        public static QueryCompenInfosForOpResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryCompenInfosForOpResponseBodyModule self = new QueryCompenInfosForOpResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryCompenInfosForOpResponseBodyModule setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QueryCompenInfosForOpResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public QueryCompenInfosForOpResponseBodyModule setCompenId(String compenId) {
            this.compenId = compenId;
            return this;
        }
        public String getCompenId() {
            return this.compenId;
        }

        public QueryCompenInfosForOpResponseBodyModule setCompensationType(String compensationType) {
            this.compensationType = compensationType;
            return this;
        }
        public String getCompensationType() {
            return this.compensationType;
        }

        public QueryCompenInfosForOpResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryCompenInfosForOpResponseBodyModule setSettleTime(String settleTime) {
            this.settleTime = settleTime;
            return this;
        }
        public String getSettleTime() {
            return this.settleTime;
        }

        public QueryCompenInfosForOpResponseBodyModule setSettleType(Integer settleType) {
            this.settleType = settleType;
            return this;
        }
        public Integer getSettleType() {
            return this.settleType;
        }

        public QueryCompenInfosForOpResponseBodyModule setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

}
