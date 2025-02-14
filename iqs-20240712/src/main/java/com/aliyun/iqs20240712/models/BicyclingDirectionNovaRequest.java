// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class BicyclingDirectionNovaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39.995197</p>
     */
    @NameInMap("destinationLatitude")
    public String destinationLatitude;

    /**
     * <strong>example:</strong>
     * <p>116.46424</p>
     */
    @NameInMap("destinationLongitude")
    public String destinationLongitude;

    /**
     * <strong>example:</strong>
     * <p>39.995197</p>
     */
    @NameInMap("originLatitude")
    public String originLatitude;

    /**
     * <strong>example:</strong>
     * <p>117.466485</p>
     */
    @NameInMap("originLongitude")
    public String originLongitude;

    @NameInMap("showPolyline")
    public Boolean showPolyline;

    public static BicyclingDirectionNovaRequest build(java.util.Map<String, ?> map) throws Exception {
        BicyclingDirectionNovaRequest self = new BicyclingDirectionNovaRequest();
        return TeaModel.build(map, self);
    }

    public BicyclingDirectionNovaRequest setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
        return this;
    }
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    public BicyclingDirectionNovaRequest setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
        return this;
    }
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    public BicyclingDirectionNovaRequest setOriginLatitude(String originLatitude) {
        this.originLatitude = originLatitude;
        return this;
    }
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    public BicyclingDirectionNovaRequest setOriginLongitude(String originLongitude) {
        this.originLongitude = originLongitude;
        return this;
    }
    public String getOriginLongitude() {
        return this.originLongitude;
    }

    public BicyclingDirectionNovaRequest setShowPolyline(Boolean showPolyline) {
        this.showPolyline = showPolyline;
        return this;
    }
    public Boolean getShowPolyline() {
        return this.showPolyline;
    }

}
