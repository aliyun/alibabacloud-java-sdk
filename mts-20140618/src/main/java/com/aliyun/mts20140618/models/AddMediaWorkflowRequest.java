// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaWorkflowRequest extends TeaModel {
    /**
     * <p>The name of the media workflow.</p>
     * <ul>
     * <li>The value cannot be empty.</li>
     * <li>The name cannot be the same as that of an existing media workflow within the current Alibaba Cloud account.</li>
     * <li>The name can be up to 64 characters in length.</li>
     * <li>The value must be encoded in the UTF-8 format.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mediaworkflow-example</p>
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
     * <p>The topology of the media workflow. The value must be a JSON object that contains the activities and activity dependencies. For more information, see the <strong>Sample topology</strong> section of this topic.</p>
     * <blockquote>
     * <p> The Object Storage Service (OSS) bucket must reside in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topology")
    public String topology;

    /**
     * <p>The triggering mode of the media workflow. Valid values:</p>
     * <ul>
     * <li><strong>OssAutoTrigger</strong>: The media workflow is automatically triggered.</li>
     * <li><strong>NotInAuto</strong>: The media workflow is not automatically triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OssAutoTrigger</p>
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
