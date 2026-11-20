// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretBlacklistResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li>A value of OK indicates that the request is successful.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecretBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretBlacklistResponseBody self = new DeleteSecretBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretBlacklistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecretBlacklistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecretBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
