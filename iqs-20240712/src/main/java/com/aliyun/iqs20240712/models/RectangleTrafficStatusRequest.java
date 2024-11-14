// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RectangleTrafficStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39.966309</p>
     */
    @NameInMap("lowerLeftLatitude")
    public String lowerLeftLatitude;

    /**
     * <strong>example:</strong>
     * <p>116.351147</p>
     */
    @NameInMap("lowerLeftLongitude")
    public String lowerLeftLongitude;

    /**
     * <strong>example:</strong>
     * <p>HIGHWAY</p>
     */
    @NameInMap("roadLevel")
    public String roadLevel;

    /**
     * <strong>example:</strong>
     * <p>39.968739</p>
     */
    @NameInMap("upperRightLatitude")
    public String upperRightLatitude;

    /**
     * <strong>example:</strong>
     * <p>116.35164</p>
     */
    @NameInMap("upperRightLongitude")
    public String upperRightLongitude;

    public static RectangleTrafficStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        RectangleTrafficStatusRequest self = new RectangleTrafficStatusRequest();
        return TeaModel.build(map, self);
    }

    public RectangleTrafficStatusRequest setLowerLeftLatitude(String lowerLeftLatitude) {
        this.lowerLeftLatitude = lowerLeftLatitude;
        return this;
    }
    public String getLowerLeftLatitude() {
        return this.lowerLeftLatitude;
    }

    public RectangleTrafficStatusRequest setLowerLeftLongitude(String lowerLeftLongitude) {
        this.lowerLeftLongitude = lowerLeftLongitude;
        return this;
    }
    public String getLowerLeftLongitude() {
        return this.lowerLeftLongitude;
    }

    public RectangleTrafficStatusRequest setRoadLevel(String roadLevel) {
        this.roadLevel = roadLevel;
        return this;
    }
    public String getRoadLevel() {
        return this.roadLevel;
    }

    public RectangleTrafficStatusRequest setUpperRightLatitude(String upperRightLatitude) {
        this.upperRightLatitude = upperRightLatitude;
        return this;
    }
    public String getUpperRightLatitude() {
        return this.upperRightLatitude;
    }

    public RectangleTrafficStatusRequest setUpperRightLongitude(String upperRightLongitude) {
        this.upperRightLongitude = upperRightLongitude;
        return this;
    }
    public String getUpperRightLongitude() {
        return this.upperRightLongitude;
    }

}
