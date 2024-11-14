// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class CircleTrafficStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39.98641364</p>
     */
    @NameInMap("latitude")
    public String latitude;

    /**
     * <strong>example:</strong>
     * <p>116.3057764</p>
     */
    @NameInMap("longitude")
    public String longitude;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("radius")
    public String radius;

    /**
     * <strong>example:</strong>
     * <p>HIGHWAY</p>
     */
    @NameInMap("roadLevel")
    public String roadLevel;

    public static CircleTrafficStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CircleTrafficStatusRequest self = new CircleTrafficStatusRequest();
        return TeaModel.build(map, self);
    }

    public CircleTrafficStatusRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public CircleTrafficStatusRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public CircleTrafficStatusRequest setRadius(String radius) {
        this.radius = radius;
        return this;
    }
    public String getRadius() {
        return this.radius;
    }

    public CircleTrafficStatusRequest setRoadLevel(String roadLevel) {
        this.roadLevel = roadLevel;
        return this;
    }
    public String getRoadLevel() {
        return this.roadLevel;
    }

}
