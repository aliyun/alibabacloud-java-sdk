// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ResourcesExecutorValue extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    public static ResourcesExecutorValue build(java.util.Map<String, ?> map) throws Exception {
        ResourcesExecutorValue self = new ResourcesExecutorValue();
        return TeaModel.build(map, self);
    }

    public ResourcesExecutorValue setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
