// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeReShopRequest extends TeaModel {
    @NameInMap("air_legs")
    public java.util.List<ChangeReShopRequestAirLegs> airLegs;

    @NameInMap("order_num")
    public Long orderNum;

    @NameInMap("passengers")
    public java.util.List<ChangeReShopRequestPassengers> passengers;

    @NameInMap("reason")
    public Integer reason;

    @NameInMap("trip_type")
    public Integer tripType;

    public static ChangeReShopRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeReShopRequest self = new ChangeReShopRequest();
        return TeaModel.build(map, self);
    }

    public ChangeReShopRequest setAirLegs(java.util.List<ChangeReShopRequestAirLegs> airLegs) {
        this.airLegs = airLegs;
        return this;
    }
    public java.util.List<ChangeReShopRequestAirLegs> getAirLegs() {
        return this.airLegs;
    }

    public ChangeReShopRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public ChangeReShopRequest setPassengers(java.util.List<ChangeReShopRequestPassengers> passengers) {
        this.passengers = passengers;
        return this;
    }
    public java.util.List<ChangeReShopRequestPassengers> getPassengers() {
        return this.passengers;
    }

    public ChangeReShopRequest setReason(Integer reason) {
        this.reason = reason;
        return this;
    }
    public Integer getReason() {
        return this.reason;
    }

    public ChangeReShopRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

    public static class ChangeReShopRequestAirLegs extends TeaModel {
        @NameInMap("arrival_airport_list")
        public java.util.List<String> arrivalAirportList;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("departure_airport_list")
        public java.util.List<String> departureAirportList;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_date")
        public String departureDate;

        public static ChangeReShopRequestAirLegs build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopRequestAirLegs self = new ChangeReShopRequestAirLegs();
            return TeaModel.build(map, self);
        }

        public ChangeReShopRequestAirLegs setArrivalAirportList(java.util.List<String> arrivalAirportList) {
            this.arrivalAirportList = arrivalAirportList;
            return this;
        }
        public java.util.List<String> getArrivalAirportList() {
            return this.arrivalAirportList;
        }

        public ChangeReShopRequestAirLegs setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeReShopRequestAirLegs setDepartureAirportList(java.util.List<String> departureAirportList) {
            this.departureAirportList = departureAirportList;
            return this;
        }
        public java.util.List<String> getDepartureAirportList() {
            return this.departureAirportList;
        }

        public ChangeReShopRequestAirLegs setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeReShopRequestAirLegs setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }
        public String getDepartureDate() {
            return this.departureDate;
        }

    }

    public static class ChangeReShopRequestPassengers extends TeaModel {
        @NameInMap("document")
        public String document;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("last_name")
        public String lastName;

        public static ChangeReShopRequestPassengers build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopRequestPassengers self = new ChangeReShopRequestPassengers();
            return TeaModel.build(map, self);
        }

        public ChangeReShopRequestPassengers setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ChangeReShopRequestPassengers setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ChangeReShopRequestPassengers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

}
