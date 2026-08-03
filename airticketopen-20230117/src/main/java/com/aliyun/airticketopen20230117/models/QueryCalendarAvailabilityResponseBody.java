// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryCalendarAvailabilityResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryCalendarAvailabilityResponseBodyData data;

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

    public static QueryCalendarAvailabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCalendarAvailabilityResponseBody self = new QueryCalendarAvailabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCalendarAvailabilityResponseBody setData(QueryCalendarAvailabilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCalendarAvailabilityResponseBodyData getData() {
        return this.data;
    }

    public QueryCalendarAvailabilityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryCalendarAvailabilityResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryCalendarAvailabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCalendarAvailabilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCalendarAvailabilityResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class QueryCalendarAvailabilityResponseBodyDataFailedHotels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HOTEL_NOT_FOUND</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>酒店不存在</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>H001</p>
         */
        @NameInMap("StandardHotelId")
        public String standardHotelId;

        public static QueryCalendarAvailabilityResponseBodyDataFailedHotels build(java.util.Map<String, ?> map) throws Exception {
            QueryCalendarAvailabilityResponseBodyDataFailedHotels self = new QueryCalendarAvailabilityResponseBodyDataFailedHotels();
            return TeaModel.build(map, self);
        }

        public QueryCalendarAvailabilityResponseBodyDataFailedHotels setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryCalendarAvailabilityResponseBodyDataFailedHotels setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryCalendarAvailabilityResponseBodyDataFailedHotels setStandardHotelId(String standardHotelId) {
            this.standardHotelId = standardHotelId;
            return this;
        }
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

    }

    public static class QueryCalendarAvailabilityResponseBodyData extends TeaModel {
        @NameInMap("FailedHotels")
        public java.util.List<QueryCalendarAvailabilityResponseBodyDataFailedHotels> failedHotels;

        @NameInMap("Hotels")
        public java.util.Map<String, java.util.List<DataHotelsValue>> hotels;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static QueryCalendarAvailabilityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCalendarAvailabilityResponseBodyData self = new QueryCalendarAvailabilityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCalendarAvailabilityResponseBodyData setFailedHotels(java.util.List<QueryCalendarAvailabilityResponseBodyDataFailedHotels> failedHotels) {
            this.failedHotels = failedHotels;
            return this;
        }
        public java.util.List<QueryCalendarAvailabilityResponseBodyDataFailedHotels> getFailedHotels() {
            return this.failedHotels;
        }

        public QueryCalendarAvailabilityResponseBodyData setHotels(java.util.Map<String, java.util.List<DataHotelsValue>> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.Map<String, java.util.List<DataHotelsValue>> getHotels() {
            return this.hotels;
        }

        public QueryCalendarAvailabilityResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
