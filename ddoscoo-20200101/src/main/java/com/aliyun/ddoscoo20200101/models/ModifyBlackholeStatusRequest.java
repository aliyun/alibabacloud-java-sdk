// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlackholeStatusRequest extends TeaModel {
    @NameInMap("BlackholeStatus")
    public String blackholeStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyBlackholeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlackholeStatusRequest self = new ModifyBlackholeStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBlackholeStatusRequest setBlackholeStatus(String blackholeStatus) {
        this.blackholeStatus = blackholeStatus;
        return this;
    }
    public String getBlackholeStatus() {
        return this.blackholeStatus;
    }

    public ModifyBlackholeStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
