// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopPayResponseBody extends TeaModel {
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
    public IntlFlightReShopPayResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
     * <p>210bc4b116835992457938931db4de</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightReShopPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopPayResponseBody self = new IntlFlightReShopPayResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopPayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopPayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopPayResponseBody setModule(IntlFlightReShopPayResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopPayResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopPayResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopPayResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("actual_pay_price")
        public Long actualPayPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        public static IntlFlightReShopPayResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopPayResponseBodyModule self = new IntlFlightReShopPayResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopPayResponseBodyModule setActualPayPrice(Long actualPayPrice) {
            this.actualPayPrice = actualPayPrice;
            return this;
        }
        public Long getActualPayPrice() {
            return this.actualPayPrice;
        }

        public IntlFlightReShopPayResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

    }

}
