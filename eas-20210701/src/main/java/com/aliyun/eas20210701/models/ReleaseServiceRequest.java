// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReleaseServiceRequest extends TeaModel {
    /**
     * <p>The traffic state. Valid values:</p>
     * <ul>
     * <li>standalone: independent traffic.</li>
     * <li>grouping: grouped traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>grouping</p>
     */
    @NameInMap("TrafficState")
    public String trafficState;

    /**
     * <p>The weight of the service. Valid values: [-1, 1000].</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
