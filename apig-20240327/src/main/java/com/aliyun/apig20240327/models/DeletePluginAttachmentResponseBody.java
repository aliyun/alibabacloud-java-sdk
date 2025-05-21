// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeletePluginAttachmentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>76BDFFC7-0764-5168-B047-92EE0BC7FDDE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeletePluginAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginAttachmentResponseBody self = new DeletePluginAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePluginAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeletePluginAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePluginAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
