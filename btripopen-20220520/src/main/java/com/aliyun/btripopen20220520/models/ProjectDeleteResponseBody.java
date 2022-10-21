// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ProjectDeleteResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public Boolean module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static ProjectDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectDeleteResponseBody self = new ProjectDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectDeleteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectDeleteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProjectDeleteResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public ProjectDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProjectDeleteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ProjectDeleteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
