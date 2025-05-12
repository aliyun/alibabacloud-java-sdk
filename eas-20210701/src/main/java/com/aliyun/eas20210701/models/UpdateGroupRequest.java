// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
    /**
     * <p>The traffic mode. Valid values: auto and customized. auto: The traffic is automatically allocated based on the proportion of the number of instances to the total number of instances. customized: The traffic is allocated based on a custom weight.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("TrafficMode")
    public String trafficMode;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setTrafficMode(String trafficMode) {
        this.trafficMode = trafficMode;
        return this;
    }
    public String getTrafficMode() {
        return this.trafficMode;
    }

}
