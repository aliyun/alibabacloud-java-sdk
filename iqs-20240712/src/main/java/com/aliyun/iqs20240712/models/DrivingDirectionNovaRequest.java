// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class DrivingDirectionNovaRequest extends TeaModel {
    @NameInMap("carType")
    public String carType;

    /**
     * <strong>example:</strong>
     * <p>43.345456</p>
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
     * <p>116.466485</p>
     */
    @NameInMap("originLongitude")
    public String originLongitude;

    @NameInMap("plate")
    public String plate;

    @NameInMap("showPolyline")
    public Boolean showPolyline;

    public static DrivingDirectionNovaRequest build(java.util.Map<String, ?> map) throws Exception {
        DrivingDirectionNovaRequest self = new DrivingDirectionNovaRequest();
        return TeaModel.build(map, self);
    }

    public DrivingDirectionNovaRequest setCarType(String carType) {
        this.carType = carType;
        return this;
    }
    public String getCarType() {
        return this.carType;
    }

    public DrivingDirectionNovaRequest setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
        return this;
    }
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    public DrivingDirectionNovaRequest setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
        return this;
    }
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    public DrivingDirectionNovaRequest setOriginLatitude(String originLatitude) {
        this.originLatitude = originLatitude;
        return this;
    }
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    public DrivingDirectionNovaRequest setOriginLongitude(String originLongitude) {
        this.originLongitude = originLongitude;
        return this;
    }
    public String getOriginLongitude() {
        return this.originLongitude;
    }

    public DrivingDirectionNovaRequest setPlate(String plate) {
        this.plate = plate;
        return this;
    }
    public String getPlate() {
        return this.plate;
    }

    public DrivingDirectionNovaRequest setShowPolyline(Boolean showPolyline) {
        this.showPolyline = showPolyline;
        return this;
    }
    public Boolean getShowPolyline() {
        return this.showPolyline;
    }

}
