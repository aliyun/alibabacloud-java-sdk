// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class TypeLatLng extends TeaModel {
    // The latitude in degrees. It must be in the range [-90.0, +90.0].
    @NameInMap("Latitude")
    public Double latitude;

    // The longitude in degrees. It must be in the range [-180.0, +180.0].
    @NameInMap("Longitude")
    public Double longitude;

    public static TypeLatLng build(java.util.Map<String, ?> map) throws Exception {
        TypeLatLng self = new TypeLatLng();
        return TeaModel.build(map, self);
    }

    public TypeLatLng setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }
    public Double getLatitude() {
        return this.latitude;
    }

    public TypeLatLng setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }
    public Double getLongitude() {
        return this.longitude;
    }

}
