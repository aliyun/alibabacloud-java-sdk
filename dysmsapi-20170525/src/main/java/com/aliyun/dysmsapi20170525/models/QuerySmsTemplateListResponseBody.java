// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsTemplateList")
    public java.util.List<QuerySmsTemplateListResponseBodySmsTemplateList> smsTemplateList;

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

    public QuerySmsTemplateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class QuerySmsTemplateListResponseBodySmsTemplateListReason extends TeaModel {
        @NameInMap("RejectDate")
        public String rejectDate;

        @NameInMap("RejectInfo")
        public String rejectInfo;

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
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Reason")
        public QuerySmsTemplateListResponseBodySmsTemplateListReason reason;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateName")
        public String templateName;

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
