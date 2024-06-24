// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CommonApplySyncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;list\&quot;: [], \&quot;pageSize\&quot;: 20, \&quot;pageNo\&quot;: 1}</p>
     */
    @NameInMap("module")
    public Boolean module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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

    public static CommonApplySyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommonApplySyncResponseBody self = new CommonApplySyncResponseBody();
        return TeaModel.build(map, self);
    }

    public CommonApplySyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommonApplySyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CommonApplySyncResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public CommonApplySyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommonApplySyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CommonApplySyncResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
