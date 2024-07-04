// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether the disk to be attached is released with the instance. Valid values:</p>
     * <ul>
     * <li>true: The disk will be released when the ECS instance is released.</li>
     * <li>false: The disk will be retained when the ECS instance is released.</li>
     * <li>If you leave this parameter empty, the default value is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public String deleteWithInstance;

    /**
     * <p>The ID of the disk to be attached. The cloud disk and the instance must belong to the same node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-5saf13yy6sopmmg88mzsg****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5rr19av7tkpgi9os52ag1****</p>
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
