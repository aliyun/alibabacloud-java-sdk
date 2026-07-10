// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyAddResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public MealApplyAddResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

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
