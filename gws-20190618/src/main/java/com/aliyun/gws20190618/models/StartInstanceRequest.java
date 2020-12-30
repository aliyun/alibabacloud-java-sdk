// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
