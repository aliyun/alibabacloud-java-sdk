// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>Request status code.</p>
     * <ul>
     * <li>OK indicates a successful request.</li>
     * <li>For other error codes, refer to the <strong>Error Codes</strong> section of this chapter or the product\&quot;s <a href="https://help.aliyun.com/document_detail/101346.html">API Error Codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Work order ID.</p>
     * <p>This parameter is used by auditors when querying audits. If you need expedited review, you must provide this work order number.</p>
     * 
     * <strong>example:</strong>
     * <p>2005020****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID generated by Alibaba Cloud for this request, which is a unique identifier that can be used for troubleshooting and issue定位.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>SMS template code.</p>
     * <p>After submitting the template application, you can use the SMS template code to query the template audit details via the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-getsmstemplate?">GetSmsTemplate</a> API. You can also <a href="https://help.aliyun.com/zh/sms/developer-reference/configure-delivery-receipts-1?spm">configure delivery receipts</a>, and obtain the template audit status messages through TemplateSmsReport.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_10000****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>SMS template name.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunCode</p>
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
