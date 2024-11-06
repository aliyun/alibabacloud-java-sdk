// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class ElectrobikeDirectionNovaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40.234564</p>
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
     * <p>116.345456</p>
     */
    @NameInMap("originLongitude")
    public String originLongitude;

    public static ElectrobikeDirectionNovaRequest build(java.util.Map<String, ?> map) throws Exception {
        ElectrobikeDirectionNovaRequest self = new ElectrobikeDirectionNovaRequest();
        return TeaModel.build(map, self);
    }

    public ElectrobikeDirectionNovaRequest setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
        return this;
    }
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    public ElectrobikeDirectionNovaRequest setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
        return this;
    }
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    public ElectrobikeDirectionNovaRequest setOriginLatitude(String originLatitude) {
        this.originLatitude = originLatitude;
        return this;
    }
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    public ElectrobikeDirectionNovaRequest setOriginLongitude(String originLongitude) {
        this.originLongitude = originLongitude;
        return this;
    }
    public String getOriginLongitude() {
        return this.originLongitude;
    }

}
