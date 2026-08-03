// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryAvailabilityResponseBody extends TeaModel {
    @NameInMap("Data")
    public GlobalHotelQueryAvailabilityResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CityCodeRequired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>城市编码不能为空</p>
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

    /**
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelQueryAvailabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryAvailabilityResponseBody self = new GlobalHotelQueryAvailabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryAvailabilityResponseBody setData(GlobalHotelQueryAvailabilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelQueryAvailabilityResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelQueryAvailabilityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelQueryAvailabilityResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelQueryAvailabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelQueryAvailabilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelQueryAvailabilityResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelQueryAvailabilityResponseBodyData extends TeaModel {
        @NameInMap("Hotels")
        public java.util.Map<String, java.util.List<DataHotelsValue>> hotels;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryAvailabilityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryAvailabilityResponseBodyData self = new GlobalHotelQueryAvailabilityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryAvailabilityResponseBodyData setHotels(java.util.Map<String, java.util.List<DataHotelsValue>> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.Map<String, java.util.List<DataHotelsValue>> getHotels() {
            return this.hotels;
        }

        public GlobalHotelQueryAvailabilityResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
