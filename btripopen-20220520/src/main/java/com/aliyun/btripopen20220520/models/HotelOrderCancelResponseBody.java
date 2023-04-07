// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCancelResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     */
    @NameInMap("module")
    public HotelOrderCancelResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderCancelResponseBody self = new HotelOrderCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderCancelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderCancelResponseBody setModule(HotelOrderCancelResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderCancelResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderCancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderCancelResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderCancelResponseBodyModule extends TeaModel {
        @NameInMap("cancel_success")
        public Boolean cancelSuccess;

        @NameInMap("forfeit_fee")
        public Long forfeitFee;

        public static HotelOrderCancelResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderCancelResponseBodyModule self = new HotelOrderCancelResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderCancelResponseBodyModule setCancelSuccess(Boolean cancelSuccess) {
            this.cancelSuccess = cancelSuccess;
            return this;
        }
        public Boolean getCancelSuccess() {
            return this.cancelSuccess;
        }

        public HotelOrderCancelResponseBodyModule setForfeitFee(Long forfeitFee) {
            this.forfeitFee = forfeitFee;
            return this;
        }
        public Long getForfeitFee() {
            return this.forfeitFee;
        }

    }

}
