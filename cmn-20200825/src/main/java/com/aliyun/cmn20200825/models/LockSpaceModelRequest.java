// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class LockSpaceModelRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源id
    @NameInMap("SpaceModelId")
    public String spaceModelId;

    public static LockSpaceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        LockSpaceModelRequest self = new LockSpaceModelRequest();
        return TeaModel.build(map, self);
    }

    public LockSpaceModelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LockSpaceModelRequest setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

}
