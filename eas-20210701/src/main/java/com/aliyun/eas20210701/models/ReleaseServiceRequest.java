// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReleaseServiceRequest extends TeaModel {
    @NameInMap("TrafficState")
    public String trafficState;

    @NameInMap("Weight")
    public Integer weight;

    public static ReleaseServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceRequest self = new ReleaseServiceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceRequest setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }
    public String getTrafficState() {
        return this.trafficState;
    }

    public ReleaseServiceRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
