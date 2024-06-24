// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MU</p>
     */
    @NameInMap("airline_code")
    public String airlineCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HGH</p>
     */
    @NameInMap("arr_city_code")
    public String arrCityCode;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BJS</p>
     */
    @NameInMap("dep_city_code")
    public String depCityCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-26</p>
     */
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
