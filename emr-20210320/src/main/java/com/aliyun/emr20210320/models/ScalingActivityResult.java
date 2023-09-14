// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingActivityResult extends TeaModel {
    /**
     * <p>实例ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ScalingActivityResult build(java.util.Map<String, ?> map) throws Exception {
        ScalingActivityResult self = new ScalingActivityResult();
        return TeaModel.build(map, self);
    }

    public ScalingActivityResult setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
