// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SmsConversionIntlResponseBody extends TeaModel {
    /**
     * <p>The response code. If OK is returned, the request is successful. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html?spm=a2c4g.101345.0.0.74326ff2J5EZyt">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SmsConversionIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionIntlResponseBody self = new SmsConversionIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsConversionIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SmsConversionIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SmsConversionIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
