// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class TransitIntegratedDirectionRequest extends TeaModel {
    @NameInMap("destinationCity")
    public String destinationCity;

    /**
     * <strong>example:</strong>
     * <p>40.345456</p>
     */
    @NameInMap("destinationLatitude")
    public String destinationLatitude;

    /**
     * <strong>example:</strong>
     * <p>116.46424</p>
     */
    @NameInMap("destinationLongitude")
    public String destinationLongitude;

    @NameInMap("originCity")
    public String originCity;

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

    public static TransitIntegratedDirectionRequest build(java.util.Map<String, ?> map) throws Exception {
        TransitIntegratedDirectionRequest self = new TransitIntegratedDirectionRequest();
        return TeaModel.build(map, self);
    }

    public TransitIntegratedDirectionRequest setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
        return this;
    }
    public String getDestinationCity() {
        return this.destinationCity;
    }

    public TransitIntegratedDirectionRequest setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
        return this;
    }
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    public TransitIntegratedDirectionRequest setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
        return this;
    }
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    public TransitIntegratedDirectionRequest setOriginCity(String originCity) {
        this.originCity = originCity;
        return this;
    }
    public String getOriginCity() {
        return this.originCity;
    }

    public TransitIntegratedDirectionRequest setOriginLatitude(String originLatitude) {
        this.originLatitude = originLatitude;
        return this;
    }
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    public TransitIntegratedDirectionRequest setOriginLongitude(String originLongitude) {
        this.originLongitude = originLongitude;
        return this;
    }
    public String getOriginLongitude() {
        return this.originLongitude;
    }

}
