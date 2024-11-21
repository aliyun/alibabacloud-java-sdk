// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CollectFlightLowestPriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("lowest_price_flight_info_list")
    public java.util.List<CollectFlightLowestPriceRequestLowestPriceFlightInfoList> lowestPriceFlightInfoList;

    public static CollectFlightLowestPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        CollectFlightLowestPriceRequest self = new CollectFlightLowestPriceRequest();
        return TeaModel.build(map, self);
    }

    public CollectFlightLowestPriceRequest setLowestPriceFlightInfoList(java.util.List<CollectFlightLowestPriceRequestLowestPriceFlightInfoList> lowestPriceFlightInfoList) {
        this.lowestPriceFlightInfoList = lowestPriceFlightInfoList;
        return this;
    }
    public java.util.List<CollectFlightLowestPriceRequestLowestPriceFlightInfoList> getLowestPriceFlightInfoList() {
        return this.lowestPriceFlightInfoList;
    }

    public static class CollectFlightLowestPriceRequestLowestPriceFlightInfoList extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>CA123,CA456</p>
         */
        @NameInMap("departure_flight_number")
        public String departureFlightNumber;

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
         * <strong>example:</strong>
         * <p>CA123,CA456</p>
         */
        @NameInMap("return_flight_number")
        public String returnFlightNumber;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
         */
        @NameInMap("solution_id")
        public String solutionId;

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

        public static CollectFlightLowestPriceRequestLowestPriceFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            CollectFlightLowestPriceRequestLowestPriceFlightInfoList self = new CollectFlightLowestPriceRequestLowestPriceFlightInfoList();
            return TeaModel.build(map, self);
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }
        public String getDepartureDate() {
            return this.departureDate;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setDepartureFlightNumber(String departureFlightNumber) {
            this.departureFlightNumber = departureFlightNumber;
            return this;
        }
        public String getDepartureFlightNumber() {
            return this.departureFlightNumber;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setMarketTotalPrice(Double marketTotalPrice) {
            this.marketTotalPrice = marketTotalPrice;
            return this;
        }
        public Double getMarketTotalPrice() {
            return this.marketTotalPrice;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setReturnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }
        public String getReturnDate() {
            return this.returnDate;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setReturnFlightNumber(String returnFlightNumber) {
            this.returnFlightNumber = returnFlightNumber;
            return this;
        }
        public String getReturnFlightNumber() {
            return this.returnFlightNumber;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setSuezTotalPrice(Double suezTotalPrice) {
            this.suezTotalPrice = suezTotalPrice;
            return this;
        }
        public Double getSuezTotalPrice() {
            return this.suezTotalPrice;
        }

        public CollectFlightLowestPriceRequestLowestPriceFlightInfoList setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

}
