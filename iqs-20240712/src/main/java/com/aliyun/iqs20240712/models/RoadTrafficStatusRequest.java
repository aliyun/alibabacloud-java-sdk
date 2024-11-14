// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RoadTrafficStatusRequest extends TeaModel {
    @NameInMap("city")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>HIGHWAY</p>
     */
    @NameInMap("roadLevel")
    public String roadLevel;

    @NameInMap("roadName")
    public String roadName;

    public static RoadTrafficStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        RoadTrafficStatusRequest self = new RoadTrafficStatusRequest();
        return TeaModel.build(map, self);
    }

    public RoadTrafficStatusRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public RoadTrafficStatusRequest setRoadLevel(String roadLevel) {
        this.roadLevel = roadLevel;
        return this;
    }
    public String getRoadLevel() {
        return this.roadLevel;
    }

    public RoadTrafficStatusRequest setRoadName(String roadName) {
        this.roadName = roadName;
        return this;
    }
    public String getRoadName() {
        return this.roadName;
    }

}
