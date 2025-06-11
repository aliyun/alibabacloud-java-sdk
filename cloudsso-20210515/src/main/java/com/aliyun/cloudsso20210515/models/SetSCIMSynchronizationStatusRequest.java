// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSCIMSynchronizationStatusRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The status of SCIM synchronization. Valid values:</p>
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("SCIMSynchronizationStatus")
    public String SCIMSynchronizationStatus;

    public static SetSCIMSynchronizationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSCIMSynchronizationStatusRequest self = new SetSCIMSynchronizationStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetSCIMSynchronizationStatusRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetSCIMSynchronizationStatusRequest setSCIMSynchronizationStatus(String SCIMSynchronizationStatus) {
        this.SCIMSynchronizationStatus = SCIMSynchronizationStatus;
        return this;
    }
    public String getSCIMSynchronizationStatus() {
        return this.SCIMSynchronizationStatus;
    }

}
