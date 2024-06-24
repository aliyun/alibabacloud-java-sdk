// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TBAccountUnbindResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("module")
    public Boolean module;

    /**
     * <strong>example:</strong>
     * <p>456456575656757</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TBAccountUnbindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TBAccountUnbindResponseBody self = new TBAccountUnbindResponseBody();
        return TeaModel.build(map, self);
    }

    public TBAccountUnbindResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TBAccountUnbindResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TBAccountUnbindResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public TBAccountUnbindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TBAccountUnbindResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TBAccountUnbindResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
