// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCancelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     */
    @NameInMap("module")
    public HotelOrderCancelResponseBodyModule module;

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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cancel_success")
        public Boolean cancelSuccess;

        @NameInMap("code")
        public String code;

        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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

        public HotelOrderCancelResponseBodyModule setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public HotelOrderCancelResponseBodyModule setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
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
