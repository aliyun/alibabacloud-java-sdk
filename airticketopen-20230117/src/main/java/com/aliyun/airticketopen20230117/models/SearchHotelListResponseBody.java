// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchHotelListResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchHotelListResponseBodyData data;

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

    public static SearchHotelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchHotelListResponseBody self = new SearchHotelListResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchHotelListResponseBody setData(SearchHotelListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchHotelListResponseBodyData getData() {
        return this.data;
    }

    public SearchHotelListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchHotelListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchHotelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchHotelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchHotelListResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class SearchHotelListResponseBodyDataHotels extends TeaModel {
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

        public static SearchHotelListResponseBodyDataHotels build(java.util.Map<String, ?> map) throws Exception {
            SearchHotelListResponseBodyDataHotels self = new SearchHotelListResponseBodyDataHotels();
            return TeaModel.build(map, self);
        }

        public SearchHotelListResponseBodyDataHotels setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public SearchHotelListResponseBodyDataHotels setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public SearchHotelListResponseBodyDataHotels setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public SearchHotelListResponseBodyDataHotels setStandardHotelId(String standardHotelId) {
            this.standardHotelId = standardHotelId;
            return this;
        }
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

        public SearchHotelListResponseBodyDataHotels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class SearchHotelListResponseBodyData extends TeaModel {
        @NameInMap("Hotels")
        public java.util.List<SearchHotelListResponseBodyDataHotels> hotels;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static SearchHotelListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchHotelListResponseBodyData self = new SearchHotelListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchHotelListResponseBodyData setHotels(java.util.List<SearchHotelListResponseBodyDataHotels> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.List<SearchHotelListResponseBodyDataHotels> getHotels() {
            return this.hotels;
        }

        public SearchHotelListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
