// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdatePluginAttachmentResponseBody extends TeaModel {
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
     * <p>F330090D-80F8-557B-8610-7EC7E386B4A4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdatePluginAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePluginAttachmentResponseBody self = new UpdatePluginAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePluginAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdatePluginAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePluginAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
