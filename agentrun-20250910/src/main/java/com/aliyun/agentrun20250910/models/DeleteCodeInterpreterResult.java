// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteCodeInterpreterResult extends TeaModel {
    /**
     * <p>Returns <code>SUCCESS</code> if the operation is successful. On failure, returns an error code, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Details of the deleted code interpreter.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public CodeInterpreter data;

    /**
     * <p>A unique request ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteCodeInterpreterResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeInterpreterResult self = new DeleteCodeInterpreterResult();
        return TeaModel.build(map, self);
    }

    public DeleteCodeInterpreterResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCodeInterpreterResult setData(CodeInterpreter data) {
        this.data = data;
        return this;
    }
    public CodeInterpreter getData() {
        return this.data;
    }

    public DeleteCodeInterpreterResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
