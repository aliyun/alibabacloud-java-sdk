// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyAddResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     */
    @NameInMap("module")
    public ApplyAddResponseBodyModule module;

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

    public static ApplyAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAddResponseBody self = new ApplyAddResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAddResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
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

    public ApplyAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        /**
         * <strong>example:</strong>
         * <p>thirdpart12132</p>
         */
        @NameInMap("apply_id")
        public Long applyId;

        /**
         * <strong>example:</strong>
         * <p>thirdpart12132</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>20220702001</p>
         */
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
