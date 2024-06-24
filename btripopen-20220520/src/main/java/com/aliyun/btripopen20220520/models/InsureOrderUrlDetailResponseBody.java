// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderUrlDetailResponseBody extends TeaModel {
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
     * <p><a href="https://siopuat.mingya.com.cn/siop-fliggy/index.html#/list?token=fR4iOOZWgG">https://siopuat.mingya.com.cn/siop-fliggy/index.html#/list?token=fR4iOOZWgG</a></p>
     */
    @NameInMap("module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>210bc59616861088185764700d7589</p>
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
     * <p>213e212c16975080875814628effac</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InsureOrderUrlDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderUrlDetailResponseBody self = new InsureOrderUrlDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public InsureOrderUrlDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsureOrderUrlDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsureOrderUrlDetailResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public InsureOrderUrlDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsureOrderUrlDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsureOrderUrlDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
