// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapAoisRequest extends TeaModel {
    @NameInMap("Radius")
    @Validation(required = true)
    public Integer radius;

    @NameInMap("Latitude")
    @Validation(required = true)
    public String latitude;

    @NameInMap("Longitude")
    @Validation(required = true)
    public String longitude;

    public static ListCityMapAoisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapAoisRequest self = new ListCityMapAoisRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapAoisRequest setRadius(Integer radius) {
        this.radius = radius;
        return this;
    }
    public Integer getRadius() {
        return this.radius;
    }

    public ListCityMapAoisRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public ListCityMapAoisRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

}
