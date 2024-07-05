// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowTriggerModeRequest extends TeaModel {
    /**
     * <p>The ID of the media workflow that you want to update. To obtain the ID of the media workflow, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Workflow Settings</strong> in the left-side navigation pane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e00732b977da427d9177a4dee646****</p>
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
     * <ul>
     * <li><strong>OssAutoTrigger</strong>: automatically triggers the media workflow.</li>
     * <li><strong>NotInAuto</strong>: does not automatically trigger the media workflow.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NotInAuto</p>
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
