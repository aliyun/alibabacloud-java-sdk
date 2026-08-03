// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCreateOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public GlobalHotelCreateOrderResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CreateOrderFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>创建订单失败</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelCreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCreateOrderResponseBody self = new GlobalHotelCreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCreateOrderResponseBody setData(GlobalHotelCreateOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelCreateOrderResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelCreateOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelCreateOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelCreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelCreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelCreateOrderResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelCreateOrderResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SO202606290001</p>
         */
        @NameInMap("OrderNo")
        public String orderNo;

        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelCreateOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCreateOrderResponseBodyData self = new GlobalHotelCreateOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCreateOrderResponseBodyData setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public GlobalHotelCreateOrderResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
