// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CommonApplyQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CommonApplyQueryResponseBodyModule module;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static CommonApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommonApplyQueryResponseBody self = new CommonApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CommonApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommonApplyQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CommonApplyQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CommonApplyQueryResponseBody setModule(CommonApplyQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CommonApplyQueryResponseBodyModule getModule() {
        return this.module;
    }

    public CommonApplyQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CommonApplyQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CommonApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("biz_category")
        public Integer bizCategory;

        @NameInMap("cause")
        public String cause;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("extend_value")
        public String extendValue;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("status")
        public Integer status;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("thirdpart_id")
        public String thirdpartId;

        @NameInMap("trip_cause")
        public String tripCause;

        @NameInMap("user_id")
        public String userId;

        public static CommonApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CommonApplyQueryResponseBodyModule self = new CommonApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CommonApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public CommonApplyQueryResponseBodyModule setBizCategory(Integer bizCategory) {
            this.bizCategory = bizCategory;
            return this;
        }
        public Integer getBizCategory() {
            return this.bizCategory;
        }

        public CommonApplyQueryResponseBodyModule setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public CommonApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CommonApplyQueryResponseBodyModule setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public CommonApplyQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CommonApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CommonApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public CommonApplyQueryResponseBodyModule setThirdpartId(String thirdpartId) {
            this.thirdpartId = thirdpartId;
            return this;
        }
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        public CommonApplyQueryResponseBodyModule setTripCause(String tripCause) {
            this.tripCause = tripCause;
            return this;
        }
        public String getTripCause() {
            return this.tripCause;
        }

        public CommonApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
