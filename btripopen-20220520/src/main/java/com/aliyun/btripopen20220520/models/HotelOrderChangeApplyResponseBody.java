// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderChangeApplyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public HotelOrderChangeApplyResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>6E9ABA14-5135-58FB-9DFC-C751B5855605</p>
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
     * <p>215045ec17018285034106091e8ba9</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderChangeApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderChangeApplyResponseBody self = new HotelOrderChangeApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderChangeApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderChangeApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderChangeApplyResponseBody setModule(HotelOrderChangeApplyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderChangeApplyResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderChangeApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderChangeApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderChangeApplyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderChangeApplyResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123445443444</p>
         */
        @NameInMap("change_order_id")
        public String changeOrderId;

        public static HotelOrderChangeApplyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderChangeApplyResponseBodyModule self = new HotelOrderChangeApplyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderChangeApplyResponseBodyModule setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
