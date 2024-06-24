// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelCityCodeListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("country_code")
    public String countryCode;

    public static HotelCityCodeListRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelCityCodeListRequest self = new HotelCityCodeListRequest();
        return TeaModel.build(map, self);
    }

    public HotelCityCodeListRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

}
