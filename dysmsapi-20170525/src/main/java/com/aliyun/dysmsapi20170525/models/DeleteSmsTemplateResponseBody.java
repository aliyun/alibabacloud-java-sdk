// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateResponseBody extends TeaModel {
    /**
     * <p>请求状态码。</p>
     * <ul>
     * <li>返回OK代表请求成功。</li>
     * <li>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">API错误码</a>。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>状态码的描述。</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>CCA2BCFF-2BA7-427C-90EE-AC6994748607</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>已删除的模板Code。</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_152550****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static DeleteSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateResponseBody self = new DeleteSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSmsTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
