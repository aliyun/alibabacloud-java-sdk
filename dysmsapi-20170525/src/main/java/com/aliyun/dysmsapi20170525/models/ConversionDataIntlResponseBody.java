// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ConversionDataIntlResponseBody extends TeaModel {
    /**
     * <p>状态码。取值：</p>
     * <ul>
     * <li><p>OK：代表请求成功。</p>
     * </li>
     * <li><p>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">错误码列表</a>。</p>
     * </li>
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
     * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConversionDataIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataIntlResponseBody self = new ConversionDataIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public ConversionDataIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConversionDataIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConversionDataIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
