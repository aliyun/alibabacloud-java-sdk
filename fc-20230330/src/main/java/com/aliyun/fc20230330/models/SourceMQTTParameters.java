// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceMQTTParameters extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mqtt-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>testTopic</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static SourceMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceMQTTParameters self = new SourceMQTTParameters();
        return TeaModel.build(map, self);
    }

    public SourceMQTTParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SourceMQTTParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceMQTTParameters setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
