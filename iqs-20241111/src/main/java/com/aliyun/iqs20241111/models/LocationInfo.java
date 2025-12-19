// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class LocationInfo extends TeaModel {
    @NameInMap("city")
    public String city;

    @NameInMap("ip")
    public String ip;

    public static LocationInfo build(java.util.Map<String, ?> map) throws Exception {
        LocationInfo self = new LocationInfo();
        return TeaModel.build(map, self);
    }

    public LocationInfo setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public LocationInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
