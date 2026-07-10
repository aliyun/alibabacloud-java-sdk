// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightSearchListRequest extends TeaModel {
    @NameInMap("airline_code")
    public String airlineCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("arr_city_code")
    public String arrCityCode;

    @NameInMap("arr_city_name")
    public String arrCityName;

    @NameInMap("arr_date")
    public String arrDate;

    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_city_code")
    public String depCityCode;

    @NameInMap("dep_city_name")
    public String depCityName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_date")
    public String depDate;

    @NameInMap("flight_no")
    public String flightNo;

    @NameInMap("need_multi_class_price")
    public Boolean needMultiClassPrice;

    @NameInMap("transfer_city_code")
    public String transferCityCode;

    @NameInMap("transfer_flight_no")
    public String transferFlightNo;

    @NameInMap("transfer_leave_date")
    public String transferLeaveDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trip_type")
    public String tripType;

    public static FlightSearchListRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightSearchListRequest self = new FlightSearchListRequest();
        return TeaModel.build(map, self);
    }

    public FlightSearchListRequest setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
        return this;
    }
    public String getAirlineCode() {
        return this.airlineCode;
    }

    public FlightSearchListRequest setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
        return this;
    }
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public FlightSearchListRequest setArrCityName(String arrCityName) {
        this.arrCityName = arrCityName;
        return this;
    }
    public String getArrCityName() {
        return this.arrCityName;
    }

    public FlightSearchListRequest setArrDate(String arrDate) {
        this.arrDate = arrDate;
        return this;
    }
    public String getArrDate() {
        return this.arrDate;
    }

    public FlightSearchListRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public FlightSearchListRequest setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
        return this;
    }
    public String getDepCityCode() {
        return this.depCityCode;
    }

    public FlightSearchListRequest setDepCityName(String depCityName) {
        this.depCityName = depCityName;
        return this;
    }
    public String getDepCityName() {
        return this.depCityName;
    }

    public FlightSearchListRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public FlightSearchListRequest setFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return this;
    }
    public String getFlightNo() {
        return this.flightNo;
    }

    public FlightSearchListRequest setNeedMultiClassPrice(Boolean needMultiClassPrice) {
        this.needMultiClassPrice = needMultiClassPrice;
        return this;
    }
    public Boolean getNeedMultiClassPrice() {
        return this.needMultiClassPrice;
    }

    public FlightSearchListRequest setTransferCityCode(String transferCityCode) {
        this.transferCityCode = transferCityCode;
        return this;
    }
    public String getTransferCityCode() {
        return this.transferCityCode;
    }

    public FlightSearchListRequest setTransferFlightNo(String transferFlightNo) {
        this.transferFlightNo = transferFlightNo;
        return this;
    }
    public String getTransferFlightNo() {
        return this.transferFlightNo;
    }

    public FlightSearchListRequest setTransferLeaveDate(String transferLeaveDate) {
        this.transferLeaveDate = transferLeaveDate;
        return this;
    }
    public String getTransferLeaveDate() {
        return this.transferLeaveDate;
    }

    public FlightSearchListRequest setTripType(String tripType) {
        this.tripType = tripType;
        return this;
    }
    public String getTripType() {
        return this.tripType;
    }

}
