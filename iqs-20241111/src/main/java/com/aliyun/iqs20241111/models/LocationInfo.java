// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class LocationInfo extends TeaModel {
    /**
     * <p>The city associated with the search. It is used to return information about the corresponding region in scenarios such as weather.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("city")
    public String city;

    /**
     * <p>The IP address associated with the search. It is used to identify the region in supported scenarios and has a lower priority than city.</p>
     * 
     * <strong>example:</strong>
     * <p>117.136.110.23</p>
     */
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
