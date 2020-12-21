// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
