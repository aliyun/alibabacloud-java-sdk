// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlackholeStatusRequest extends TeaModel {
    /**
     * <p>The action that you want to perform on the instance. Set the value to <strong>undo</strong>, which indicates that you want to deactivate blackhole filtering.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>undo</p>
     */
    @NameInMap("BlackholeStatus")
    public String blackholeStatus;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
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
