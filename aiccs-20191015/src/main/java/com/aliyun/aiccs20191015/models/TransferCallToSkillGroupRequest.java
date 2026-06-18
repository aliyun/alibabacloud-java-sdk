// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TransferCallToSkillGroupRequest extends TeaModel {
    /**
     * <p>The agent account name, which is the phone number or mailbox entered during account registration. It is unique within the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Hotline session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7719786</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>Unique ID for the customer request. Used for idempotency validation. You can generate it using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connId in the WebSocket after an inbound call.</p>
     * 
     * <strong>example:</strong>
     * <p>7719788</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The holdConnId in the WebSocket after an inbound call (required only for two-step transfer).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HoldConnectionId")
    public String holdConnectionId;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.
     * You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Default value: <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Single-step transfer.</li>
     * <li><strong>false</strong>: Two-step transfer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSingleTransfer")
    public Boolean isSingleTransfer;

    /**
     * <p>The jobId in the WebSocket after an inbound call.</p>
     * 
     * <strong>example:</strong>
     * <p>7719787</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>356543</p>
     */
    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    /**
     * <p>Default value: <strong>1</strong>. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Single-step transfer.</li>
     * <li><strong>2</strong>: Two-step transfer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static TransferCallToSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferCallToSkillGroupRequest self = new TransferCallToSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public TransferCallToSkillGroupRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public TransferCallToSkillGroupRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public TransferCallToSkillGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransferCallToSkillGroupRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public TransferCallToSkillGroupRequest setHoldConnectionId(String holdConnectionId) {
        this.holdConnectionId = holdConnectionId;
        return this;
    }
    public String getHoldConnectionId() {
        return this.holdConnectionId;
    }

    public TransferCallToSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransferCallToSkillGroupRequest setIsSingleTransfer(Boolean isSingleTransfer) {
        this.isSingleTransfer = isSingleTransfer;
        return this;
    }
    public Boolean getIsSingleTransfer() {
        return this.isSingleTransfer;
    }

    public TransferCallToSkillGroupRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public TransferCallToSkillGroupRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    public TransferCallToSkillGroupRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
