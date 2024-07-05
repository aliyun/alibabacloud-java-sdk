// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdatePipelineRequest extends TeaModel {
    @NameInMap("ExtendConfig")
    public String extendConfig;

    /**
     * <p>The new name of the MPS queue. The value can contain letters, digits, and special characters such as hyphens (-) and can be up to 128 bytes in size. The value cannot start with a special character.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-pipeline-****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Message Service (MNS) configuration, such as the information about the MNS queue or topic. For more information, see the &quot;NotifyConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Topic&quot;:&quot;example-topic-****&quot;}</p>
     */
    @NameInMap("NotifyConfig")
    public String notifyConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue that you want to update. To view the MPS queue ID, log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d1ce4d3efcb549419193f50f1fcd****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role that is assigned to the current RAM user. To obtain the role, you can log on to the <strong>Resource Access Management (RAM) console</strong> and choose <strong>Identities</strong> &gt; <strong>Roles</strong> in the left-side navigation pane.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunMTSDefaultRole</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The new state of the MPS queue.</p>
     * <ul>
     * <li><strong>Active</strong>: The MPS queue is active. Jobs in the MPS queue can be scheduled and run by MPS.</li>
     * <li><strong>Paused</strong>: The MPS queue is paused. Jobs in the MPS queue cannot be scheduled or run by MPS, and all jobs remain in the Submitted state. Jobs that are running will not be affected.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Paused</p>
     */
    @NameInMap("State")
    public String state;

    public static UpdatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRequest self = new UpdatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRequest setExtendConfig(String extendConfig) {
        this.extendConfig = extendConfig;
        return this;
    }
    public String getExtendConfig() {
        return this.extendConfig;
    }

    public UpdatePipelineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePipelineRequest setNotifyConfig(String notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public String getNotifyConfig() {
        return this.notifyConfig;
    }

    public UpdatePipelineRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdatePipelineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdatePipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public UpdatePipelineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdatePipelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdatePipelineRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdatePipelineRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
