// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsSignResponseBody extends TeaModel {
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>签名名称。</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static ModifySmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySmsSignResponseBody self = new ModifySmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySmsSignResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
