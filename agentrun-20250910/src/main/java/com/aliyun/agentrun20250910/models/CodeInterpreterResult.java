// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInterpreterResult extends TeaModel {
    /**
     * <p>The result code of the operation. A value of <code>SUCCESS</code> indicates success, while a failed operation returns an error type such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Details about the code interpreter.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public CodeInterpreter data;

    /**
     * <p>The unique request identifier, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CodeInterpreterResult build(java.util.Map<String, ?> map) throws Exception {
        CodeInterpreterResult self = new CodeInterpreterResult();
        return TeaModel.build(map, self);
    }

    public CodeInterpreterResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CodeInterpreterResult setData(CodeInterpreter data) {
        this.data = data;
        return this;
    }
    public CodeInterpreter getData() {
        return this.data;
    }

    public CodeInterpreterResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
