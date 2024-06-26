// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyTripTaskExecuteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
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
     * <p>2FB0D7A8-BA41-5D04-BEFC-CADA5481AC53</p>
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210bc56016876728084104176d2c35</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static ApplyTripTaskExecuteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyTripTaskExecuteResponseBody self = new ApplyTripTaskExecuteResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyTripTaskExecuteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyTripTaskExecuteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyTripTaskExecuteResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public ApplyTripTaskExecuteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyTripTaskExecuteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyTripTaskExecuteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
