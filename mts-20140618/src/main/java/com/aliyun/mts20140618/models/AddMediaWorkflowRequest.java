// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaWorkflowRequest extends TeaModel {
    /**
     * <p>The name of the media workflow.</p>
     * <br>
     * <p>*   The value cannot be empty.</p>
     * <p>*   The name cannot be the same as that of an existing media workflow within the current Alibaba Cloud account.</p>
     * <p>*   The name can be up to 64 characters in length.</p>
     * <p>*   The name can contain only UTF-8 characters.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The topology of the media workflow. The value must be a JSON object that contains the activity list and activity dependencies. For more information, see the **Sample topology** section of this topic.</p>
     */
    @NameInMap("Topology")
    public String topology;

    /**
     * <p>The trigger mode of the media workflow. Valid values:</p>
     * <br>
     * <p>*   **OssAutoTrigger**: The media workflow is automatically triggered.</p>
     * <p>*   **NotInAuto**: The media workflow is not automatically triggered.</p>
     */
    @NameInMap("TriggerMode")
    public String triggerMode;

    public static AddMediaWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMediaWorkflowRequest self = new AddMediaWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public AddMediaWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMediaWorkflowRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddMediaWorkflowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddMediaWorkflowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddMediaWorkflowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddMediaWorkflowRequest setTopology(String topology) {
        this.topology = topology;
        return this;
    }
    public String getTopology() {
        return this.topology;
    }

    public AddMediaWorkflowRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}
