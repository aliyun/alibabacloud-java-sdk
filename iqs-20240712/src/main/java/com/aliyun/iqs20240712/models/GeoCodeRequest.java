// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class GeoCodeRequest extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("city")
    public String city;

    public static GeoCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GeoCodeRequest self = new GeoCodeRequest();
        return TeaModel.build(map, self);
    }

    public GeoCodeRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public GeoCodeRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

}
