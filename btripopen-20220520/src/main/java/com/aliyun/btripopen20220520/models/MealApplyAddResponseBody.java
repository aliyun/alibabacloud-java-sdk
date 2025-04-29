// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyAddResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public MealApplyAddResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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
     * <p>210e842b16611337974412836dae27</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static MealApplyAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MealApplyAddResponseBody self = new MealApplyAddResponseBody();
        return TeaModel.build(map, self);
    }

    public MealApplyAddResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MealApplyAddResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MealApplyAddResponseBody setModule(MealApplyAddResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public MealApplyAddResponseBodyModule getModule() {
        return this.module;
    }

    public MealApplyAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MealApplyAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MealApplyAddResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MealApplyAddResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024073128454753</p>
         */
        @NameInMap("third_part_apply_id")
        public String thirdPartApplyId;

        public static MealApplyAddResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MealApplyAddResponseBodyModule self = new MealApplyAddResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MealApplyAddResponseBodyModule setThirdPartApplyId(String thirdPartApplyId) {
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }
        public String getThirdPartApplyId() {
            return this.thirdPartApplyId;
        }

    }

}
