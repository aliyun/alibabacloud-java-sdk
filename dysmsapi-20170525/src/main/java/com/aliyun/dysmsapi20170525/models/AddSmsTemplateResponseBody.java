// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API error codes</a>.</li>
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
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SMS template code.</p>
     * <p>After submitting the template application, you can use the SMS template code to query the template review details through the <a href="https://help.aliyun.com/document_detail/419289.html">QuerySmsTemplate</a> operation. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure receipt messages</a> and obtain the template review status messages through <a href="https://help.aliyun.com/document_detail/120999.html">TemplateSmsReport</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_46817****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static AddSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSmsTemplateResponseBody self = new AddSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddSmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSmsTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
