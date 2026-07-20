// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopApplyResponseBody extends TeaModel {
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
    public IntlFlightReShopApplyResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>88BA5020-561C-51F5-8E73-6659729913F0</p>
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

    public static IntlFlightReShopApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopApplyResponseBody self = new IntlFlightReShopApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopApplyResponseBody setModule(IntlFlightReShopApplyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopApplyResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopApplyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopApplyResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>asyncKey_2390u230slgw023</p>
         */
        @NameInMap("async_apply_key")
        public String asyncApplyKey;

        /**
         * <strong>example:</strong>
         * <p>JPM20241024354</p>
         */
        @NameInMap("out_re_shop_apply_id")
        public String outReShopApplyId;

        /**
         * <strong>example:</strong>
         * <p>1009035199432</p>
         */
        @NameInMap("re_shop_apply_id")
        public String reShopApplyId;

        public static IntlFlightReShopApplyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopApplyResponseBodyModule self = new IntlFlightReShopApplyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopApplyResponseBodyModule setAsyncApplyKey(String asyncApplyKey) {
            this.asyncApplyKey = asyncApplyKey;
            return this;
        }
        public String getAsyncApplyKey() {
            return this.asyncApplyKey;
        }

        public IntlFlightReShopApplyResponseBodyModule setOutReShopApplyId(String outReShopApplyId) {
            this.outReShopApplyId = outReShopApplyId;
            return this;
        }
        public String getOutReShopApplyId() {
            return this.outReShopApplyId;
        }

        public IntlFlightReShopApplyResponseBodyModule setReShopApplyId(String reShopApplyId) {
            this.reShopApplyId = reShopApplyId;
            return this;
        }
        public String getReShopApplyId() {
            return this.reShopApplyId;
        }

    }

}
