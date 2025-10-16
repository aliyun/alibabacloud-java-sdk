// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserSlsLogStorageTimeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vipcloudfw-cn-uqm3fz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("StorageTime")
    public Integer storageTime;

    public static ModifyUserSlsLogStorageTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserSlsLogStorageTimeRequest self = new ModifyUserSlsLogStorageTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserSlsLogStorageTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserSlsLogStorageTimeRequest setStorageTime(Integer storageTime) {
        this.storageTime = storageTime;
        return this;
    }
    public Integer getStorageTime() {
        return this.storageTime;
    }

}
