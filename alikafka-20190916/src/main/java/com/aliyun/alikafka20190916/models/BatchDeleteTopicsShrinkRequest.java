// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class BatchDeleteTopicsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Topics")
    public String topicsShrink;

    public static BatchDeleteTopicsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTopicsShrinkRequest self = new BatchDeleteTopicsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTopicsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchDeleteTopicsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchDeleteTopicsShrinkRequest setTopicsShrink(String topicsShrink) {
        this.topicsShrink = topicsShrink;
        return this;
    }
    public String getTopicsShrink() {
        return this.topicsShrink;
    }

}
