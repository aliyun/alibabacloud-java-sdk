// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryCalendarAvailabilityResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GlobalHotelQueryCalendarAvailabilityResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>CityCodeRequired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>City code cannot be empty</p>
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
     * <p>Indicates whether the request was successful.</p>
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

    public static GlobalHotelQueryCalendarAvailabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryCalendarAvailabilityResponseBody self = new GlobalHotelQueryCalendarAvailabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryCalendarAvailabilityResponseBody setData(GlobalHotelQueryCalendarAvailabilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelQueryCalendarAvailabilityResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelQueryCalendarAvailabilityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelQueryCalendarAvailabilityResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelQueryCalendarAvailabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelQueryCalendarAvailabilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelQueryCalendarAvailabilityResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>HOTEL_NOT_FOUND</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The hotel does not exist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The standard hotel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>H001</p>
         */
        @NameInMap("StandardHotelId")
        public String standardHotelId;

        public static GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels self = new GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels setStandardHotelId(String standardHotelId) {
            this.standardHotelId = standardHotelId;
            return this;
        }
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

    }

    public static class GlobalHotelQueryCalendarAvailabilityResponseBodyData extends TeaModel {
        /**
         * <p>The list of failed hotels (in partial success mode).</p>
         */
        @NameInMap("FailedHotels")
        public java.util.List<GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels> failedHotels;

        /**
         * <p>The calendar quotes grouped by standard hotel ID.</p>
         */
        @NameInMap("Hotels")
        public java.util.Map<String, java.util.List<DataHotelsValue>> hotels;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryCalendarAvailabilityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryCalendarAvailabilityResponseBodyData self = new GlobalHotelQueryCalendarAvailabilityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryCalendarAvailabilityResponseBodyData setFailedHotels(java.util.List<GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels> failedHotels) {
            this.failedHotels = failedHotels;
            return this;
        }
        public java.util.List<GlobalHotelQueryCalendarAvailabilityResponseBodyDataFailedHotels> getFailedHotels() {
            return this.failedHotels;
        }

        public GlobalHotelQueryCalendarAvailabilityResponseBodyData setHotels(java.util.Map<String, java.util.List<DataHotelsValue>> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.Map<String, java.util.List<DataHotelsValue>> getHotels() {
            return this.hotels;
        }

        public GlobalHotelQueryCalendarAvailabilityResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
