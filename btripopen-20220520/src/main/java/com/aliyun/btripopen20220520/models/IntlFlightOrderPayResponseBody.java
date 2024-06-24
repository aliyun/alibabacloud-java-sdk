// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderPayResponseBody extends TeaModel {
    @NameInMap("module")
    public IntlFlightOrderPayResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>9BCDD5DE-E6CB-5C25-93B9-9BE178A0AA56</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

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
    @NameInMap("trace_id")
    public String traceId;

    public static IntlFlightOrderPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderPayResponseBody self = new IntlFlightOrderPayResponseBody();
        return TeaModel.build(map, self);
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

    public IntlFlightOrderPayResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IntlFlightOrderPayResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
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
        /**
         * <strong>example:</strong>
         * <p>51000</p>
         */
        @NameInMap("price")
        public Long price;

        public static IntlFlightOrderPayResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderPayResponseBodyModule self = new IntlFlightOrderPayResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderPayResponseBodyModule setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

    }

}
