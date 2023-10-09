// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ConvertPostPayOrderRequest extends TeaModel {
    /**
     * <p>The subscription duration. Unit: months. Valid values:</p>
     * <br>
     * <p>*   **1~12**</p>
     * <p>*   **24**</p>
     * <p>*   **36**</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ConvertPostPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertPostPayOrderRequest self = new ConvertPostPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public ConvertPostPayOrderRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ConvertPostPayOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConvertPostPayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
