// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelSearchHotelListResponseBody extends TeaModel {
    @NameInMap("Data")
    public GlobalHotelSearchHotelListResponseBodyData data;

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
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelSearchHotelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelSearchHotelListResponseBody self = new GlobalHotelSearchHotelListResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelSearchHotelListResponseBody setData(GlobalHotelSearchHotelListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelSearchHotelListResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelSearchHotelListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelSearchHotelListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelSearchHotelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelSearchHotelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelSearchHotelListResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelSearchHotelListResponseBodyDataHotels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>中国</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <strong>example:</strong>
         * <p>北京饭店</p>
         */
        @NameInMap("HotelName")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>H001</p>
         */
        @NameInMap("StandardHotelId")
        public String standardHotelId;

        /**
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        public static GlobalHotelSearchHotelListResponseBodyDataHotels build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelSearchHotelListResponseBodyDataHotels self = new GlobalHotelSearchHotelListResponseBodyDataHotels();
            return TeaModel.build(map, self);
        }

        public GlobalHotelSearchHotelListResponseBodyDataHotels setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public GlobalHotelSearchHotelListResponseBodyDataHotels setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public GlobalHotelSearchHotelListResponseBodyDataHotels setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public GlobalHotelSearchHotelListResponseBodyDataHotels setStandardHotelId(String standardHotelId) {
            this.standardHotelId = standardHotelId;
            return this;
        }
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

        public GlobalHotelSearchHotelListResponseBodyDataHotels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GlobalHotelSearchHotelListResponseBodyData extends TeaModel {
        @NameInMap("Hotels")
        public java.util.List<GlobalHotelSearchHotelListResponseBodyDataHotels> hotels;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GlobalHotelSearchHotelListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelSearchHotelListResponseBodyData self = new GlobalHotelSearchHotelListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelSearchHotelListResponseBodyData setHotels(java.util.List<GlobalHotelSearchHotelListResponseBodyDataHotels> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.List<GlobalHotelSearchHotelListResponseBodyDataHotels> getHotels() {
            return this.hotels;
        }

        public GlobalHotelSearchHotelListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
