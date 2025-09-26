// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ErrorResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误信息描述</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ErrorResult build(java.util.Map<String, ?> map) throws Exception {
        ErrorResult self = new ErrorResult();
        return TeaModel.build(map, self);
    }

    public ErrorResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ErrorResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ErrorResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
