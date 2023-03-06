// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchRequest extends TeaModel {
    @NameInMap("airline_code")
    public String airlineCode;

    @NameInMap("arr_city_code")
    public String arrCityCode;

    @NameInMap("cabin_class")
    public String cabinClass;

    @NameInMap("dep_city_code")
    public String depCityCode;

    @NameInMap("dep_date")
    public String depDate;

    public static FlightListingSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightListingSearchRequest self = new FlightListingSearchRequest();
        return TeaModel.build(map, self);
    }

    public FlightListingSearchRequest setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
        return this;
    }
    public String getAirlineCode() {
        return this.airlineCode;
    }

    public FlightListingSearchRequest setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
        return this;
    }
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public FlightListingSearchRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public FlightListingSearchRequest setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
        return this;
    }
    public String getDepCityCode() {
        return this.depCityCode;
    }

    public FlightListingSearchRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

}
