// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("SpaceModelId")
    public String spaceModelId;

    public static GetSpaceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelRequest self = new GetSpaceModelRequest();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSpaceModelRequest setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

}
