// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("newResourceGroupId")
    public String newResourceGroupId;

    public static ChangeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupRequest self = new ChangeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

}
