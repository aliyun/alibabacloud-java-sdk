// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsTemplateResponseBody extends TeaModel {
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
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Work order number.</p>
     * <p>This parameter is used by auditors when querying audits. You need to provide this work order number when requesting expedited review.</p>
     * 
     * <strong>example:</strong>
     * <p>20041271****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of this call request, which is a unique identifier generated by Alibaba Cloud for the request and can be used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Code of the SMS template.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_152550****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>Name of the SMS template.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static UpdateSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsTemplateResponseBody self = new UpdateSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSmsTemplateResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSmsTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public UpdateSmsTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
