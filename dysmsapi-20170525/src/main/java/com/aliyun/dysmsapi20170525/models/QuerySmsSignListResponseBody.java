// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsSignList")
    public java.util.List<QuerySmsSignListResponseBodySmsSignList> smsSignList;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QuerySmsSignListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignListResponseBody self = new QuerySmsSignListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsSignListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QuerySmsSignListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsSignListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsSignListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSignListResponseBody setSmsSignList(java.util.List<QuerySmsSignListResponseBodySmsSignList> smsSignList) {
        this.smsSignList = smsSignList;
        return this;
    }
    public java.util.List<QuerySmsSignListResponseBodySmsSignList> getSmsSignList() {
        return this.smsSignList;
    }

    public QuerySmsSignListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QuerySmsSignListResponseBodySmsSignListReason extends TeaModel {
        @NameInMap("RejectDate")
        public String rejectDate;

        @NameInMap("RejectInfo")
        public String rejectInfo;

        @NameInMap("RejectSubInfo")
        public String rejectSubInfo;

        public static QuerySmsSignListResponseBodySmsSignListReason build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListResponseBodySmsSignListReason self = new QuerySmsSignListResponseBodySmsSignListReason();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListResponseBodySmsSignListReason setRejectDate(String rejectDate) {
            this.rejectDate = rejectDate;
            return this;
        }
        public String getRejectDate() {
            return this.rejectDate;
        }

        public QuerySmsSignListResponseBodySmsSignListReason setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        public QuerySmsSignListResponseBodySmsSignListReason setRejectSubInfo(String rejectSubInfo) {
            this.rejectSubInfo = rejectSubInfo;
            return this;
        }
        public String getRejectSubInfo() {
            return this.rejectSubInfo;
        }

    }

    public static class QuerySmsSignListResponseBodySmsSignList extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Reason")
        public QuerySmsSignListResponseBodySmsSignListReason reason;

        @NameInMap("SignName")
        public String signName;

        public static QuerySmsSignListResponseBodySmsSignList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListResponseBodySmsSignList self = new QuerySmsSignListResponseBodySmsSignList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListResponseBodySmsSignList setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public QuerySmsSignListResponseBodySmsSignList setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public QuerySmsSignListResponseBodySmsSignList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QuerySmsSignListResponseBodySmsSignList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySmsSignListResponseBodySmsSignList setReason(QuerySmsSignListResponseBodySmsSignListReason reason) {
            this.reason = reason;
            return this;
        }
        public QuerySmsSignListResponseBodySmsSignListReason getReason() {
            return this.reason;
        }

        public QuerySmsSignListResponseBodySmsSignList setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

    }

}
