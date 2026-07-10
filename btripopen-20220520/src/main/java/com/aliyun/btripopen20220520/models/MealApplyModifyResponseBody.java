// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyModifyResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public MealApplyModifyResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static MealApplyModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MealApplyModifyResponseBody self = new MealApplyModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public MealApplyModifyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MealApplyModifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MealApplyModifyResponseBody setModule(MealApplyModifyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public MealApplyModifyResponseBodyModule getModule() {
        return this.module;
    }

    public MealApplyModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MealApplyModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MealApplyModifyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MealApplyModifyResponseBodyModule extends TeaModel {
        @NameInMap("third_party_apply_id")
        public String thirdPartyApplyId;

        public static MealApplyModifyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MealApplyModifyResponseBodyModule self = new MealApplyModifyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MealApplyModifyResponseBodyModule setThirdPartyApplyId(String thirdPartyApplyId) {
            this.thirdPartyApplyId = thirdPartyApplyId;
            return this;
        }
        public String getThirdPartyApplyId() {
            return this.thirdPartyApplyId;
        }

    }

}
