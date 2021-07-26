// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSpaceModelRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 物理空间类型
    @NameInMap("SpaceType")
    public String spaceType;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateSpaceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceModelRequest self = new CreateSpaceModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpaceModelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSpaceModelRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public CreateSpaceModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
