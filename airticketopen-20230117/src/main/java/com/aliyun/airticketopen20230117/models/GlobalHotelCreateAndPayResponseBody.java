// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCreateAndPayResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GlobalHotelCreateAndPayResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateOrderFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to create order</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>TraceId</p>
     * 
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelCreateAndPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCreateAndPayResponseBody self = new GlobalHotelCreateAndPayResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCreateAndPayResponseBody setData(GlobalHotelCreateAndPayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelCreateAndPayResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelCreateAndPayResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelCreateAndPayResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelCreateAndPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelCreateAndPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelCreateAndPayResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelCreateAndPayResponseBodyData extends TeaModel {
        /**
         * <p>The sales order number.</p>
         * 
         * <strong>example:</strong>
         * <p>SO202606290001</p>
         */
        @NameInMap("OrderNo")
        public String orderNo;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelCreateAndPayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCreateAndPayResponseBodyData self = new GlobalHotelCreateAndPayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCreateAndPayResponseBodyData setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public GlobalHotelCreateAndPayResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
