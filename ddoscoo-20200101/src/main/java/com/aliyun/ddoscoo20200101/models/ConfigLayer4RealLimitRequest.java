// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RealLimitRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the threshold of the clean bandwidth. Valid values: 0 to 15360. The value 0 indicates that rate limiting is never triggered. Unit: Mbit/s</p>
     */
    @NameInMap("LimitValue")
    public Long limitValue;

    public static ConfigLayer4RealLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RealLimitRequest self = new ConfigLayer4RealLimitRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RealLimitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigLayer4RealLimitRequest setLimitValue(Long limitValue) {
        this.limitValue = limitValue;
        return this;
    }
    public Long getLimitValue() {
        return this.limitValue;
    }

}
