// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizBandWidthRequest extends TeaModel {
    /**
     * <p>The burstable clean bandwidth. Unit: Mbit/s. The burstable clean bandwidth cannot exceed nine times the clean bandwidth of your Anti-DDoS Pro or Anti-DDoS Premium instance, and the sum of the clean bandwidth and the burstable clean bandwidth cannot exceed the maximum clean bandwidth that is supported by your instance. The value 0 indicates that the burstable clean bandwidth feature is disabled. You can disable the burstable clean bandwidth feature once a month.</p>
     */
    @NameInMap("ElasticBizBandwidth")
    public Integer elasticBizBandwidth;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the burstable clean bandwidth feature. Valid values:</p>
     * <br>
     * <p>*   **month**: the metering method of monthly 95th percentile</p>
     * <p>*   **day**: the metering method of daily 95th percentile</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static ModifyElasticBizBandWidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizBandWidthRequest self = new ModifyElasticBizBandWidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizBandWidthRequest setElasticBizBandwidth(Integer elasticBizBandwidth) {
        this.elasticBizBandwidth = elasticBizBandwidth;
        return this;
    }
    public Integer getElasticBizBandwidth() {
        return this.elasticBizBandwidth;
    }

    public ModifyElasticBizBandWidthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyElasticBizBandWidthRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
