// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteCodeInterpreterResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CodeInterpreter data;

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
