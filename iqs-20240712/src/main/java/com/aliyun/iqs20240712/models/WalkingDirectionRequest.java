// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class WalkingDirectionRequest extends TeaModel {
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

    public static WalkingDirectionRequest build(java.util.Map<String, ?> map) throws Exception {
        WalkingDirectionRequest self = new WalkingDirectionRequest();
        return TeaModel.build(map, self);
    }

    public WalkingDirectionRequest setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
        return this;
    }
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    public WalkingDirectionRequest setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
        return this;
    }
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    public WalkingDirectionRequest setOriginLatitude(String originLatitude) {
        this.originLatitude = originLatitude;
        return this;
    }
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    public WalkingDirectionRequest setOriginLongitude(String originLongitude) {
        this.originLongitude = originLongitude;
        return this;
    }
    public String getOriginLongitude() {
        return this.originLongitude;
    }

}
