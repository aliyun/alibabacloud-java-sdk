// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateListResponseBody extends TeaModel {
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
     * <p>The number of templates per page. Valid values: <strong>1 to 50</strong>.</p>
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
     * <p>The queried message templates.</p>
     */
    @NameInMap("SmsTemplateList")
    public java.util.List<QuerySmsTemplateListResponseBodySmsTemplateList> smsTemplateList;

    /**
     * <p>The total number of templates.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QuerySmsTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateListResponseBody self = new QuerySmsTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsTemplateListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QuerySmsTemplateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsTemplateListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsTemplateListResponseBody setSmsTemplateList(java.util.List<QuerySmsTemplateListResponseBodySmsTemplateList> smsTemplateList) {
        this.smsTemplateList = smsTemplateList;
        return this;
    }
    public java.util.List<QuerySmsTemplateListResponseBodySmsTemplateList> getSmsTemplateList() {
        return this.smsTemplateList;
    }

    public QuerySmsTemplateListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QuerySmsTemplateListResponseBodySmsTemplateListReason extends TeaModel {
        /**
         * <p>The time when the message template was rejected. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-04 16:01:17</p>
         */
        @NameInMap("RejectDate")
        public String rejectDate;

        /**
         * <p>The reason why the message template was rejected.</p>
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

        public static QuerySmsTemplateListResponseBodySmsTemplateListReason build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateListResponseBodySmsTemplateListReason self = new QuerySmsTemplateListResponseBodySmsTemplateListReason();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateListResponseBodySmsTemplateListReason setRejectDate(String rejectDate) {
            this.rejectDate = rejectDate;
            return this;
        }
        public String getRejectDate() {
            return this.rejectDate;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateListReason setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateListReason setRejectSubInfo(String rejectSubInfo) {
            this.rejectSubInfo = rejectSubInfo;
            return this;
        }
        public String getRejectSubInfo() {
            return this.rejectSubInfo;
        }

    }

    public static class QuerySmsTemplateListResponseBodySmsTemplateList extends TeaModel {
        /**
         * <p>The approval status of the message template. Valid values:</p>
         * <ul>
         * <li><strong>AUDIT_STATE_INIT</strong>: The message template is pending approval.</li>
         * <li><strong>AUDIT_STATE_PASS</strong>: The message template is approved.</li>
         * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The message template is rejected. You can view the reason in the Reason response parameter.</li>
         * <li><strong>AUDIT_STATE_CANCEL</strong> or <strong>AUDIT_SATE_CANCEL</strong>: The approval is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUDIT_STATE_PASS</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The time when the message template was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-04 11:42:17</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The ticket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2361****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The type of the message template. We recommend that you specify this parameter. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: verification code</li>
         * <li><strong>1</strong>: notification message</li>
         * <li><strong>2</strong>: promotional message</li>
         * <li><strong>3</strong>: message sent to countries or regions outside the Chinese mainland</li>
         * <li><strong>7</strong>: digital message</li>
         * </ul>
         * <blockquote>
         * <p>The template type is the same as the value of the TemplateType parameter in the AddSmsTemplate and ModifySmsTemplate operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OuterTemplateType")
        public Integer outerTemplateType;

        /**
         * <p>The approval remarks.</p>
         * <ul>
         * <li>If the value of AuditStatus is <strong>AUDIT_STATE_PASS</strong> or <strong>AUDIT_STATE_INIT</strong>, the value of Reason is No Approval Remarks.</li>
         * <li>If the value of AuditStatus is <strong>AUDIT_STATE_NOT_PASS</strong>, the reason why the message template is rejected is returned.</li>
         * </ul>
         */
        @NameInMap("Reason")
        public QuerySmsTemplateListResponseBodySmsTemplateListReason reason;

        /**
         * <p>The code of the message template.</p>
         * <p>You can log on to the <a href="https://dysms.console.aliyun.com/dysms.htm">Short Message Service (SMS) console</a>, click <strong>Go China</strong> or <strong>Go Globe</strong> in the left-side navigation pane, and then view the template code on the <strong>Templates</strong> tab. You can also call the <a href="https://help.aliyun.com/document_detail/121208.html">AddSmsTemplate</a> operation to obtain the template code.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_1525***</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The content of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("TemplateContent")
        public String templateContent;

        /**
         * <p>The name of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun verification code</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the message template. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: notification message</li>
         * <li><strong>1</strong>: promotional message</li>
         * <li><strong>2</strong>: verification code</li>
         * <li><strong>6</strong>: message sent to countries or regions outside the Chinese mainland</li>
         * <li><strong>7</strong>: digital message</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TemplateType")
        public Integer templateType;

        public static QuerySmsTemplateListResponseBodySmsTemplateList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateListResponseBodySmsTemplateList self = new QuerySmsTemplateListResponseBodySmsTemplateList();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setOuterTemplateType(Integer outerTemplateType) {
            this.outerTemplateType = outerTemplateType;
            return this;
        }
        public Integer getOuterTemplateType() {
            return this.outerTemplateType;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setReason(QuerySmsTemplateListResponseBodySmsTemplateListReason reason) {
            this.reason = reason;
            return this;
        }
        public QuerySmsTemplateListResponseBodySmsTemplateListReason getReason() {
            return this.reason;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QuerySmsTemplateListResponseBodySmsTemplateList setTemplateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }
        public Integer getTemplateType() {
            return this.templateType;
        }

    }

}
