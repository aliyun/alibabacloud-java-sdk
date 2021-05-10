// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateResponseBody extends TeaModel {
    @NameInMap("TemplateContent")
    public String templateContent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    @NameInMap("Code")
    public String code;

    @NameInMap("TemplateType")
    public Integer templateType;

    @NameInMap("Message")
    public String message;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("CreateDate")
    public String createDate;

    @NameInMap("Reason")
    public String reason;

    public static QuerySmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateResponseBody self = new QuerySmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public QuerySmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QuerySmsTemplateResponseBody setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    public QuerySmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsTemplateResponseBody setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

    public QuerySmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public QuerySmsTemplateResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public QuerySmsTemplateResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
