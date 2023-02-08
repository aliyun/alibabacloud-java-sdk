// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowTriggerModeRequest extends TeaModel {
    /**
     * <p>The ID of the media workflow to be updated. To obtain the workflow ID, you can log on to the **ApsaraVideo Media Processing (MPS) console** and choose **Workflows** > **Workflow Settings**.</p>
     */
    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The trigger mode of the media workflow. Valid values:</p>
     * <br>
     * <p>*   **OssAutoTrigger**: automatically triggers the media workflow.</p>
     * <p>*   **NotInAuto**: does not automatically trigger the media workflow.</p>
     */
    @NameInMap("TriggerMode")
    public String triggerMode;

    public static UpdateMediaWorkflowTriggerModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaWorkflowTriggerModeRequest self = new UpdateMediaWorkflowTriggerModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaWorkflowTriggerModeRequest setMediaWorkflowId(String mediaWorkflowId) {
        this.mediaWorkflowId = mediaWorkflowId;
        return this;
    }
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    public UpdateMediaWorkflowTriggerModeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateMediaWorkflowTriggerModeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMediaWorkflowTriggerModeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMediaWorkflowTriggerModeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateMediaWorkflowTriggerModeRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}
