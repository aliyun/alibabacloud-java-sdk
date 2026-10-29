// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether the cloud disk to be mounted is released when the instance is released. Valid values:</p>
     * <ul>
     * <li>true: The cloud disk is released when the instance is released.</li>
     * <li>false: The cloud disk is retained when the instance is released.</li>
     * <li>Empty: The default value is false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public String deleteWithInstance;

    /**
     * <p>The ID of the cloud disk to mount. The cloud disk and the instance must be in the same edge zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-5saf13yy6sopmmg88mzsg****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The instance ID.</p>
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
