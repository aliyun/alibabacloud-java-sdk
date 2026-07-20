// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCreateResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("module")
    public IntlFlightReShopCreateResponseBodyModule module;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The global trace ID of the request, typically used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>210bc4b116835992457938931db4de</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightReShopCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopCreateResponseBody self = new IntlFlightReShopCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopCreateResponseBody setModule(IntlFlightReShopCreateResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopCreateResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopCreateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopCreateResponseBodyModule extends TeaModel {
        /**
         * <p>The asynchronous application key, used in the asynchronous commit pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>asyncKey_2390u230slgw023</p>
         */
        @NameInMap("async_apply_key")
        public String asyncApplyKey;

        /**
         * <p>Indicates whether a retry is required. This parameter is used in the asynchronous commit pattern.</p>
         */
        @NameInMap("need_retry")
        public Boolean needRetry;

        /**
         * <p>The retry time interval, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("next_retry_interval")
        public Long nextRetryInterval;

        /**
         * <p>The external rebooking application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>JPM20241024354</p>
         */
        @NameInMap("out_re_shop_apply_id")
        public String outReShopApplyId;

        /**
         * <p>The business travel rebooking application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1017035199374643191</p>
         */
        @NameInMap("re_shop_apply_id")
        public String reShopApplyId;

        public static IntlFlightReShopCreateResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopCreateResponseBodyModule self = new IntlFlightReShopCreateResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopCreateResponseBodyModule setAsyncApplyKey(String asyncApplyKey) {
            this.asyncApplyKey = asyncApplyKey;
            return this;
        }
        public String getAsyncApplyKey() {
            return this.asyncApplyKey;
        }

        public IntlFlightReShopCreateResponseBodyModule setNeedRetry(Boolean needRetry) {
            this.needRetry = needRetry;
            return this;
        }
        public Boolean getNeedRetry() {
            return this.needRetry;
        }

        public IntlFlightReShopCreateResponseBodyModule setNextRetryInterval(Long nextRetryInterval) {
            this.nextRetryInterval = nextRetryInterval;
            return this;
        }
        public Long getNextRetryInterval() {
            return this.nextRetryInterval;
        }

        public IntlFlightReShopCreateResponseBodyModule setOutReShopApplyId(String outReShopApplyId) {
            this.outReShopApplyId = outReShopApplyId;
            return this;
        }
        public String getOutReShopApplyId() {
            return this.outReShopApplyId;
        }

        public IntlFlightReShopCreateResponseBodyModule setReShopApplyId(String reShopApplyId) {
            this.reShopApplyId = reShopApplyId;
            return this;
        }
        public String getReShopApplyId() {
            return this.reShopApplyId;
        }

    }

}
