// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether the disk to be attached is released with the instance. Valid values:</p>
     * <br>
     * <p>*   true: The disk will be released when the ECS instance is released.</p>
     * <p>*   false: The disk will be retained when the ECS instance is released.</p>
     * <p>*   If you leave this parameter empty, the default value is used.</p>
     */
    @NameInMap("DeleteWithInstance")
    public String deleteWithInstance;

    /**
     * <p>The ID of the disk to be attached. The cloud disk and the instance must belong to the same zone.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AttachDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDiskRequest self = new AttachDiskRequest();
        return TeaModel.build(map, self);
    }

    public AttachDiskRequest setDeleteWithInstance(String deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public String getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public AttachDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public AttachDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
