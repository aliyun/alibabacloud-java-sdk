// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>The status code of the request. Valid values:</p>
     * <ul>
     * <li><p>OK: The request was successful.</p>
     * </li>
     * <li><p>For other error codes, see the <strong>Error codes</strong> list in this topic or <a href="https://help.aliyun.com/document_detail/101346.html">API Error Codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ticket ID.</p>
     * <p>Reviewers use this ID to check the review status. You must provide this ID when you request an expedited review.</p>
     * 
     * <strong>example:</strong>
     * <p>2005020****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE991</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The code of the message template.</p>
     * <p>After you submit a template application, you can use the template code to call the <a href="https://help.aliyun.com/document_detail/2807433.html">GetSmsTemplate</a> operation and query the review details of the template. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure delivery receipts</a> to receive the review status of the template in the <a href="https://help.aliyun.com/document_detail/120999.html">TemplateSmsReport</a> message.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_10000****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The name of the message template.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码模板</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateResponseBody self = new CreateSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSmsTemplateResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmsTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateSmsTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
