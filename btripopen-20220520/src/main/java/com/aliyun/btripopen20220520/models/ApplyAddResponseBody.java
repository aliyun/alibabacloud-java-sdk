// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyAddResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ApplyAddResponseBodyModule module;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static ApplyAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAddResponseBody self = new ApplyAddResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAddResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApplyAddResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyAddResponseBody setModule(ApplyAddResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ApplyAddResponseBodyModule getModule() {
        return this.module;
    }

    public ApplyAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyAddResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ApplyAddResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_business_id")
        public String thirdpartBusinessId;

        public static ApplyAddResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddResponseBodyModule self = new ApplyAddResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ApplyAddResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public ApplyAddResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public ApplyAddResponseBodyModule setThirdpartBusinessId(String thirdpartBusinessId) {
            this.thirdpartBusinessId = thirdpartBusinessId;
            return this;
        }
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

    }

}
