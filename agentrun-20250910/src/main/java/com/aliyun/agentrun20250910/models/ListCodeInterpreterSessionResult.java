// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpreterSessionResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CodeInterpreterSessionListOut data;

    @NameInMap("requestId")
    public String requestId;

    public static ListCodeInterpreterSessionResult build(java.util.Map<String, ?> map) throws Exception {
        ListCodeInterpreterSessionResult self = new ListCodeInterpreterSessionResult();
        return TeaModel.build(map, self);
    }

    public ListCodeInterpreterSessionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCodeInterpreterSessionResult setData(CodeInterpreterSessionListOut data) {
        this.data = data;
        return this;
    }
    public CodeInterpreterSessionListOut getData() {
        return this.data;
    }

    public ListCodeInterpreterSessionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
