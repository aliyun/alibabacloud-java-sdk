// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderPayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IntlFlightOrderPayResponseBodyModule module;

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
     * <p>210bc4b116835992457938931db4de</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightOrderPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderPayResponseBody self = new IntlFlightOrderPayResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderPayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightOrderPayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightOrderPayResponseBody setModule(IntlFlightOrderPayResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightOrderPayResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightOrderPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightOrderPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightOrderPayResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightOrderPayResponseBodyModule extends TeaModel {
        @NameInMap("actual_pay_price")
        public Long actualPayPrice;

        @NameInMap("pay_status")
        public Integer payStatus;

        public static IntlFlightOrderPayResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderPayResponseBodyModule self = new IntlFlightOrderPayResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderPayResponseBodyModule setActualPayPrice(Long actualPayPrice) {
            this.actualPayPrice = actualPayPrice;
            return this;
        }
        public Long getActualPayPrice() {
            return this.actualPayPrice;
        }

        public IntlFlightOrderPayResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

    }

}
