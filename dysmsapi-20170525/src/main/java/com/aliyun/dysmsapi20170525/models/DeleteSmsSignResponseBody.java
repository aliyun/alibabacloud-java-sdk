// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsSignResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For information about other return values, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the deleted signature.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static DeleteSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsSignResponseBody self = new DeleteSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSmsSignResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
