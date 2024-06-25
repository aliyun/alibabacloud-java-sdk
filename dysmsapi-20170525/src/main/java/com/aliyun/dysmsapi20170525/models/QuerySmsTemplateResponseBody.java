// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateResponseBody extends TeaModel {
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
     * <p>The time when the message template was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-04 11:42:17</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The approval remarks.</p>
     * <ul>
     * <li>If the value of AuditStatus is <strong>AUDIT_STATE_PASS</strong> or <strong>AUDIT_STATE_INIT</strong>, the value of Reason is No Approval Remarks.</li>
     * <li>If the value of AuditStatus is <strong>AUDIT_STATE_NOT_PASS</strong>, the reason why the message template is rejected is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
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
     * <p>The code of the message template.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_16703****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The content of the message template.</p>
     * 
     * <strong>example:</strong>
     * <p>You are applying for mobile registration. The verification code is: ${code}, valid for 5 minutes!</p>
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
     * <p>The approval status of the message template. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The message template is pending approval.</li>
     * <li><strong>1</strong>: The message template is approved.</li>
     * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The message template is rejected. You can view the reason in the Reason response parameter.</li>
     * <li><strong>10</strong>: The approval is canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    /**
     * <p>The type of the message. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: verification code</li>
     * <li><strong>1</strong>: notification message</li>
     * <li><strong>2</strong>: promotional message</li>
     * <li><strong>3</strong>: message sent to countries or regions outside the Chinese mainland</li>
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
