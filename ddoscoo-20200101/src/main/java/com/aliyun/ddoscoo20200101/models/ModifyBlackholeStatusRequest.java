// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlackholeStatusRequest extends TeaModel {
    /**
     * <p>The action that you want to perform on the instance. Set the value to **undo**, which indicates that you want to deactivate blackhole filtering.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlackholeStatus")
    public String blackholeStatus;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
