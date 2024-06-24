// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyModifyResponseBody extends TeaModel {
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
    public ApplyModifyResponseBodyModule module;

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

    public static ApplyModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyModifyResponseBody self = new ApplyModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyModifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyModifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyModifyResponseBody setModule(ApplyModifyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ApplyModifyResponseBodyModule getModule() {
        return this.module;
    }

    public ApplyModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyModifyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ApplyModifyResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>118526587</p>
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

        public static ApplyModifyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyResponseBodyModule self = new ApplyModifyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ApplyModifyResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public ApplyModifyResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public ApplyModifyResponseBodyModule setThirdpartBusinessId(String thirdpartBusinessId) {
            this.thirdpartBusinessId = thirdpartBusinessId;
            return this;
        }
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

    }

}
