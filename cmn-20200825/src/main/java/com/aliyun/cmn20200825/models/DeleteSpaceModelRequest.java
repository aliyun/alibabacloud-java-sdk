// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteSpaceModelRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("SpaceModelId")
    public String spaceModelId;

    public static DeleteSpaceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceModelRequest self = new DeleteSpaceModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceModelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSpaceModelRequest setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

}
