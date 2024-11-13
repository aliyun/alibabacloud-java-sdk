// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CollectFlightLowestPriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("lowestPriceFlightList")
    public java.util.List<CollectFlightLowestPriceRequestLowestPriceFlightList> lowestPriceFlightList;

    public static CollectFlightLowestPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        CollectFlightLowestPriceRequest self = new CollectFlightLowestPriceRequest();
        return TeaModel.build(map, self);
    }

    public CollectFlightLowestPriceRequest setLowestPriceFlightList(java.util.List<CollectFlightLowestPriceRequestLowestPriceFlightList> lowestPriceFlightList) {
        this.lowestPriceFlightList = lowestPriceFlightList;
        return this;
    }
    public java.util.List<CollectFlightLowestPriceRequestLowestPriceFlightList> getLowestPriceFlightList() {
        return this.lowestPriceFlightList;
    }

    public static class CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CA123,CA456</p>
         */
        @NameInMap("departure_flight_number")
        public String departureFlightNumber;

        /**
         * <strong>example:</strong>
         * <p>CA123,CA456</p>
         */
        @NameInMap("return_flight_number")
        public String returnFlightNumber;

        public static CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo build(java.util.Map<String, ?> map) throws Exception {
            CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo self = new CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo();
            return TeaModel.build(map, self);
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo setDepartureFlightNumber(String departureFlightNumber) {
            this.departureFlightNumber = departureFlightNumber;
            return this;
        }
        public String getDepartureFlightNumber() {
            return this.departureFlightNumber;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo setReturnFlightNumber(String returnFlightNumber) {
            this.returnFlightNumber = returnFlightNumber;
            return this;
        }
        public String getReturnFlightNumber() {
            return this.returnFlightNumber;
        }

    }

    public static class CollectFlightLowestPriceRequestLowestPriceFlightList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-11</p>
         */
        @NameInMap("departure_date")
        public String departureDate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("flight_number_info")
        public CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo flightNumberInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("market_total_price")
        public Double marketTotalPrice;

        /**
         * <strong>example:</strong>
         * <p>123456789dacd</p>
         */
        @NameInMap("request_id")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>2024-11-11</p>
         */
        @NameInMap("return_date")
        public String returnDate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100.1</p>
         */
        @NameInMap("suez_total_price")
        public Double suezTotalPrice;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        public static CollectFlightLowestPriceRequestLowestPriceFlightList build(java.util.Map<String, ?> map) throws Exception {
            CollectFlightLowestPriceRequestLowestPriceFlightList self = new CollectFlightLowestPriceRequestLowestPriceFlightList();
            return TeaModel.build(map, self);
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }
        public String getDepartureDate() {
            return this.departureDate;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setFlightNumberInfo(CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo flightNumberInfo) {
            this.flightNumberInfo = flightNumberInfo;
            return this;
        }
        public CollectFlightLowestPriceRequestLowestPriceFlightListFlightNumberInfo getFlightNumberInfo() {
            return this.flightNumberInfo;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setMarketTotalPrice(Double marketTotalPrice) {
            this.marketTotalPrice = marketTotalPrice;
            return this;
        }
        public Double getMarketTotalPrice() {
            return this.marketTotalPrice;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setReturnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }
        public String getReturnDate() {
            return this.returnDate;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setSuezTotalPrice(Double suezTotalPrice) {
            this.suezTotalPrice = suezTotalPrice;
            return this;
        }
        public Double getSuezTotalPrice() {
            return this.suezTotalPrice;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightList setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

}
