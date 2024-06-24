// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("http_status_code")
    public Integer httpStatusCode;

    @NameInMap("module")
    public IntlFlightCreateOrderResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
     */
    @NameInMap("requestId")
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
     * <p>2103ad1116826479016562032da98c</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightCreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightCreateOrderResponseBody self = new IntlFlightCreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightCreateOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public IntlFlightCreateOrderResponseBody setModule(IntlFlightCreateOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightCreateOrderResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightCreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightCreateOrderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IntlFlightCreateOrderResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public IntlFlightCreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightCreateOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightCreateOrderResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>deb6372db8194f1c94c23bc4fadc508d</p>
         */
        @NameInMap("async_create_order_key")
        public String asyncCreateOrderKey;

        /**
         * <strong>example:</strong>
         * <p>2023-08-10 17:42:32</p>
         */
        @NameInMap("latest_pay_time")
        public String latestPayTime;

        /**
         * <strong>example:</strong>
         * <p>1003038197806523003</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>F11378244642107293696</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>22300</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        public static IntlFlightCreateOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderResponseBodyModule self = new IntlFlightCreateOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderResponseBodyModule setAsyncCreateOrderKey(String asyncCreateOrderKey) {
            this.asyncCreateOrderKey = asyncCreateOrderKey;
            return this;
        }
        public String getAsyncCreateOrderKey() {
            return this.asyncCreateOrderKey;
        }

        public IntlFlightCreateOrderResponseBodyModule setLatestPayTime(String latestPayTime) {
            this.latestPayTime = latestPayTime;
            return this;
        }
        public String getLatestPayTime() {
            return this.latestPayTime;
        }

        public IntlFlightCreateOrderResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public IntlFlightCreateOrderResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public IntlFlightCreateOrderResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public IntlFlightCreateOrderResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IntlFlightCreateOrderResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

    }

}
