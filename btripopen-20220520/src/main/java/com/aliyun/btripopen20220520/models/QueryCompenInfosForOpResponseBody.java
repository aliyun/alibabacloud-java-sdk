// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCompenInfosForOpResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<QueryCompenInfosForOpResponseBodyModule> module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

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
        @NameInMap("amount")
        public Long amount;

        @NameInMap("category")
        public Integer category;

        @NameInMap("compen_id")
        public String compenId;

        @NameInMap("compensation_type")
        public String compensationType;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("settle_time")
        public String settleTime;

        @NameInMap("settle_type")
        public Integer settleType;

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
