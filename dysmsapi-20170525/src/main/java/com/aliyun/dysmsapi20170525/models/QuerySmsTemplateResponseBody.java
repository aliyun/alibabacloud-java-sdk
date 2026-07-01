// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p>OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For a list of other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the template was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-03 10:02:34</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The review notes for the template.</p>
     * <ul>
     * <li><p>If the review status is <strong>Approved</strong> or <strong>Reviewing</strong>, the message &quot;No review remarks&quot; is returned.</p>
     * </li>
     * <li><p>If the review status is <strong>Rejected</strong>, the reason for the rejection is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>无审批备注</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A974B78-02BF-4C79-ADF3-90CFBA1B55B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template code.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_1525****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template content.</p>
     * 
     * <strong>example:</strong>
     * <p>亲爱的会员！阿里云短信服务祝您新年快乐！</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>通知短信</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The review status of the template. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Reviewing.</p>
     * </li>
     * <li><p><strong>1</strong>: Approved.</p>
     * </li>
     * <li><p><strong>2</strong>: Rejected. The reason for the rejection is returned in the response. For more information, see <a href="https://help.aliyun.com/document_detail/65990.html">Suggestions for handling a failed review</a>. You can then call the <a href="https://help.aliyun.com/document_detail/419287.html">ModifySmsTemplate</a> API or modify the template on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</p>
     * </li>
     * <li><p><strong>10</strong>: Canceled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Verification code.</p>
     * </li>
     * <li><p><strong>1</strong>: Message notification.</p>
     * </li>
     * <li><p><strong>2</strong>: Promotional message.</p>
     * </li>
     * <li><p><strong>3</strong>: International message.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static QuerySmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateResponseBody self = new QuerySmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsTemplateResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public QuerySmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsTemplateResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
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

    public QuerySmsTemplateResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public QuerySmsTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public QuerySmsTemplateResponseBody setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    public QuerySmsTemplateResponseBody setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
