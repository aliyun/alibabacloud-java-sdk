// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class TypeLatLng extends TeaModel {
    @NameInMap("Latitude")
    public Double latitude;

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
