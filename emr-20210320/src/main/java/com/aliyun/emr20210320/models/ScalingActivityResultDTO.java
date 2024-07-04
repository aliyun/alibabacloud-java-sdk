// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingActivityResultDTO extends TeaModel {
    /**
     * <p>实例ID。</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cudc25w2bfwl5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ScalingActivityResultDTO build(java.util.Map<String, ?> map) throws Exception {
        ScalingActivityResultDTO self = new ScalingActivityResultDTO();
        return TeaModel.build(map, self);
    }

    public ScalingActivityResultDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
