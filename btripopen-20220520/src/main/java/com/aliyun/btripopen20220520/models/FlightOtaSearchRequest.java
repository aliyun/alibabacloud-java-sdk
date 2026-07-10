// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaSearchRequest extends TeaModel {
    @NameInMap("airline_code")
    public String airlineCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("arr_city_code")
    public String arrCityCode;

    @NameInMap("cabin_class")
    public String cabinClass;

    @NameInMap("carrier_flight_no")
    public String carrierFlightNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_city_code")
    public String depCityCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_date")
    public String depDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("flight_no")
    public String flightNo;

    public static FlightOtaSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaSearchRequest self = new FlightOtaSearchRequest();
        return TeaModel.build(map, self);
    }

    public FlightOtaSearchRequest setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
        return this;
    }
    public String getAirlineCode() {
        return this.airlineCode;
    }

    public FlightOtaSearchRequest setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
        return this;
    }
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public FlightOtaSearchRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public FlightOtaSearchRequest setCarrierFlightNo(String carrierFlightNo) {
        this.carrierFlightNo = carrierFlightNo;
        return this;
    }
    public String getCarrierFlightNo() {
        return this.carrierFlightNo;
    }

    public FlightOtaSearchRequest setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
        return this;
    }
    public String getDepCityCode() {
        return this.depCityCode;
    }

    public FlightOtaSearchRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public FlightOtaSearchRequest setFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return this;
    }
    public String getFlightNo() {
        return this.flightNo;
    }

}
