// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of signatures per page. Valid values: <strong>1 to 50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E47708****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried message signatures.</p>
     */
    @NameInMap("SmsSignList")
    public java.util.List<QuerySmsSignListResponseBodySmsSignList> smsSignList;

    /**
     * <p>The total number of signatures.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The time when the signature was rejected. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-08 19:02:13</p>
         */
        @NameInMap("RejectDate")
        public String rejectDate;

        /**
         * <p>The reason why the signature was rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
         */
        @NameInMap("RejectInfo")
        public String rejectInfo;

        /**
         * <p>The remarks about the rejection.</p>
         * 
         * <strong>example:</strong>
         * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
         */
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
        /**
         * <p>The approval status of the signature. Valid values:</p>
         * <ul>
         * <li><strong>AUDIT_STATE_INIT</strong>: The signature is pending approval.</li>
         * <li><strong>AUDIT_STATE_PASS</strong>: The signature is approved.</li>
         * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The signature is rejected. You can view the reason in the Reason response parameter.</li>
         * <li><strong>AUDIT_STATE_CANCEL</strong>: The approval is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUDIT_STATE_NOT_PASS</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The type of the signature scenario. The return value ends with &quot;type&quot;. Valid values:</p>
         * <ul>
         * <li>Verification code type</li>
         * <li>General-purpose type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Verification code type</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The time when the signature was created. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-08 16:44:13</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The ticket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>236****5</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The approval remarks.</p>
         * <ul>
         * <li>If the value of AuditStatus is <strong>AUDIT_STATE_PASS</strong> or <strong>AUDIT_STATE_INIT</strong>, the value of Reason is No Approval Remarks.</li>
         * <li>If the value of AuditStatus is <strong>AUDIT_STATE_NOT_PASS</strong>, the reason why the signature is rejected is returned.</li>
         * </ul>
         */
        @NameInMap("Reason")
        public QuerySmsSignListResponseBodySmsSignListReason reason;

        /**
         * <p>The name of the signature.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
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
