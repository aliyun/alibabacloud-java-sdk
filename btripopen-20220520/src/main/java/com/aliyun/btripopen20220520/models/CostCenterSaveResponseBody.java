// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterSaveResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CostCenterSaveResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static CostCenterSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CostCenterSaveResponseBody self = new CostCenterSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public CostCenterSaveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CostCenterSaveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CostCenterSaveResponseBody setModule(CostCenterSaveResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CostCenterSaveResponseBodyModule getModule() {
        return this.module;
    }

    public CostCenterSaveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CostCenterSaveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CostCenterSaveResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CostCenterSaveResponseBodyModule extends TeaModel {
        @NameInMap("id")
        public Long id;

        public static CostCenterSaveResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CostCenterSaveResponseBodyModule self = new CostCenterSaveResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CostCenterSaveResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
