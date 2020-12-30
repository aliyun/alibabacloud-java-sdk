// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceStateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStateRequest self = new GetInstanceStateRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
