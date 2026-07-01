// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p>OK: The request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
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
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of signatures to return on each page. Default value: <strong>10</strong>. Valid values: <strong>1 to 50</strong>.</p>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of returned results.</p>
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
         * <p>The time when the signature was rejected. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-04 13:35:10</p>
         */
        @NameInMap("RejectDate")
        public String rejectDate;

        /**
         * <p>The reason for the rejection.</p>
         * 
         * <strong>example:</strong>
         * <p>文件不能证明信息真实性，请重新上传。</p>
         */
        @NameInMap("RejectInfo")
        public String rejectInfo;

        /**
         * <p>The remarks for the rejection.</p>
         * 
         * <strong>example:</strong>
         * <p>文件不能证明信息真实性，请重新上传。</p>
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
         * <p>The APP-ICP filing entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001***123</p>
         */
        @NameInMap("AppIcpRecordId")
        public Long appIcpRecordId;

        /**
         * <p>The audit status of the signature. Valid values:</p>
         * <ul>
         * <li><p><strong>AUDIT_STATE_INIT</strong>: under review.</p>
         * </li>
         * <li><p><strong>AUDIT_STATE_PASS</strong>: approved.</p>
         * </li>
         * <li><p><strong>AUDIT_STATE_NOT_PASS</strong>: rejected. You can view the rejection reason in the Reason response parameter.</p>
         * </li>
         * <li><p><strong>AUDIT_STATE_CANCEL</strong>: review canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUDIT_STATE_NOT_PASS</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The ID of the letter of authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>1000********1234</p>
         */
        @NameInMap("AuthorizationLetterId")
        public Long authorizationLetterId;

        /**
         * <p>The scenario type of the signature. Valid values:</p>
         * <ul>
         * <li><p>Verification code.</p>
         * </li>
         * <li><p>General-purpose.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>验证码类型</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The time when the SMS signature was created. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-04 11:42:17</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The order ID.</p>
         * <p>This parameter is used by auditors when querying the audit. You must provide this order ID if you need to expedite the audit.</p>
         * 
         * <strong>example:</strong>
         * <p>2005098****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The audit remarks.</p>
         * <ul>
         * <li><p>If the audit status is <strong>approved</strong> or <strong>under review</strong>, the Reason parameter is displayed as &quot;No audit remarks&quot;.</p>
         * </li>
         * <li><p>If the audit status is <strong>rejected</strong>, the Reason parameter displays the specific reason for the rejection.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Reason")
        public QuerySmsSignListResponseBodySmsSignListReason reason;

        /**
         * <p>The signature name.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>The trademark entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000009081***</p>
         */
        @NameInMap("TrademarkId")
        public Long trademarkId;

        /**
         * <p>The audit status of the letter of authorization. Valid values:</p>
         * <ul>
         * <li>true: approved.</li>
         * <li>false: not approved (includes all statuses other than approved).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("authorizationLetterAuditPass")
        public Boolean authorizationLetterAuditPass;

        public static QuerySmsSignListResponseBodySmsSignList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignListResponseBodySmsSignList self = new QuerySmsSignListResponseBodySmsSignList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignListResponseBodySmsSignList setAppIcpRecordId(Long appIcpRecordId) {
            this.appIcpRecordId = appIcpRecordId;
            return this;
        }
        public Long getAppIcpRecordId() {
            return this.appIcpRecordId;
        }

        public QuerySmsSignListResponseBodySmsSignList setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public QuerySmsSignListResponseBodySmsSignList setAuthorizationLetterId(Long authorizationLetterId) {
            this.authorizationLetterId = authorizationLetterId;
            return this;
        }
        public Long getAuthorizationLetterId() {
            return this.authorizationLetterId;
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

        public QuerySmsSignListResponseBodySmsSignList setTrademarkId(Long trademarkId) {
            this.trademarkId = trademarkId;
            return this;
        }
        public Long getTrademarkId() {
            return this.trademarkId;
        }

        public QuerySmsSignListResponseBodySmsSignList setAuthorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
            this.authorizationLetterAuditPass = authorizationLetterAuditPass;
            return this;
        }
        public Boolean getAuthorizationLetterAuditPass() {
            return this.authorizationLetterAuditPass;
        }

    }

}
