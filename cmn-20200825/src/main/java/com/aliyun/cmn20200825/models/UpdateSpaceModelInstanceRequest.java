// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelInstanceRequest extends TeaModel {
    // 物理空间实例
    @NameInMap("Instance")
    public String instance;

    // 物理空间id
    @NameInMap("SpaceId")
    public String spaceId;

    public static UpdateSpaceModelInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceModelInstanceRequest self = new UpdateSpaceModelInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceModelInstanceRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public UpdateSpaceModelInstanceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
