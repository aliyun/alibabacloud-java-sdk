// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RealLimitRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-XXXXX</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the threshold of the clean bandwidth. Valid values: 0 to 15360. The value 0 indicates that rate limiting is never triggered. Unit: Mbit/s</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
