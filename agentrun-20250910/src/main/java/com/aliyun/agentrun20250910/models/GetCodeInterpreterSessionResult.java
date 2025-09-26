// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetCodeInterpreterSessionResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CodeInterpreterSessionOut data;

    @NameInMap("requestId")
    public String requestId;

    public static GetCodeInterpreterSessionResult build(java.util.Map<String, ?> map) throws Exception {
        GetCodeInterpreterSessionResult self = new GetCodeInterpreterSessionResult();
        return TeaModel.build(map, self);
    }

    public GetCodeInterpreterSessionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCodeInterpreterSessionResult setData(CodeInterpreterSessionOut data) {
        this.data = data;
        return this;
    }
    public CodeInterpreterSessionOut getData() {
        return this.data;
    }

    public GetCodeInterpreterSessionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
