// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class TransitIntegratedDirectionOldRequest extends TeaModel {
    @NameInMap("destinationCity")
    public String destinationCity;

    /**
     * <strong>example:</strong>
     * <p>39.896463</p>
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

    public static TransitIntegratedDirectionOldRequest build(java.util.Map<String, ?> map) throws Exception {
        TransitIntegratedDirectionOldRequest self = new TransitIntegratedDirectionOldRequest();
        return TeaModel.build(map, self);
    }

    public TransitIntegratedDirectionOldRequest setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
        return this;
    }
    public String getDestinationCity() {
        return this.destinationCity;
    }

    public TransitIntegratedDirectionOldRequest setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
        return this;
    }
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    public TransitIntegratedDirectionOldRequest setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
        return this;
    }
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    public TransitIntegratedDirectionOldRequest setOriginCity(String originCity) {
        this.originCity = originCity;
        return this;
    }
    public String getOriginCity() {
        return this.originCity;
    }

    public TransitIntegratedDirectionOldRequest setOriginLatitude(String originLatitude) {
        this.originLatitude = originLatitude;
        return this;
    }
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    public TransitIntegratedDirectionOldRequest setOriginLongitude(String originLongitude) {
        this.originLongitude = originLongitude;
        return this;
    }
    public String getOriginLongitude() {
        return this.originLongitude;
    }

}
