// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteShortUrlResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p><code>OK</code> indicates the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
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
     * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteShortUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteShortUrlResponseBody self = new DeleteShortUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteShortUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteShortUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteShortUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
