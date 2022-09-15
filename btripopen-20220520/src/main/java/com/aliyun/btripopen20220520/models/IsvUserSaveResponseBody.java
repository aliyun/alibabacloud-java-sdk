// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvUserSaveResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public String module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IsvUserSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsvUserSaveResponseBody self = new IsvUserSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public IsvUserSaveResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public IsvUserSaveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IsvUserSaveResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public IsvUserSaveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IsvUserSaveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IsvUserSaveResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
