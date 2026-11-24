// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessShrinkRequest extends TeaModel {
    /**
     * <p>The approval type. Valid values: 0 (built-in approval), 1 (DingTalk approval), 2 (WeCom approval), and 3 (Lark approval). Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApprovalType")
    public Integer approvalType;

    /**
     * <p>The description of the approval process. The description must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>Office endpoint software installation and uninstallation approval process</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The event callback identifier. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter is used to generate the event callback URL for the external platform. You can pass a complete callback URL, and the server retains only the part after the callback path prefix.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://callback.example.com/sase/api/v1/approval/dingtalk/callback/9m4e2mr0ui3e8a21">https://callback.example.com/sase/api/v1/approval/dingtalk/callback/9m4e2mr0ui3e8a21</a>****</p>
     */
    @NameInMap("EventLabel")
    public String eventLabel;

    /**
     * <p>The integration configuration for the external approval platform. This parameter is required when the approval type is 1 (DingTalk approval) or 3 (Lark approval). It includes integration parameters such as appKey and appSecret, and must be passed as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;appKey&quot;:&quot;dingn1a2b3c4d5e6f****&quot;,&quot;appSecret&quot;:&quot;f9c8e7d6a5b4c3d2e1f0a9b8c7d6e5f4a3b2c1d0e9f8a7b6c5d4e3f2a1b0****&quot;,&quot;eventVerifyToken&quot;:&quot;7a8b9c0d1e2f3a4b5c6d7e8f9a0b****&quot;,&quot;eventAesKey&quot;:&quot;1a2b3c4d5e6f7g8h9i0j1k2l3m4n5o6p7q8r9s0t****&quot;}</p>
     */
    @NameInMap("ExternalConfig")
    public String externalConfig;

    /**
     * <p>The external approval template configurations. Configure the approval template ID, external approval process ID, and field mappings based on the policy type. This parameter is used only when ApprovalType is set to 1 (DingTalk approval), 2 (WeCom approval), or 3 (Lark approval). If this parameter is not passed, the existing template associations of the approval process are cleared. The approval templates associated with business policies cannot be cleared.</p>
     */
    @NameInMap("MatchSchemaConfigs")
    public String matchSchemaConfigsShrink;

    /**
     * <p>The matched approval templates.</p>
     */
    @NameInMap("MatchSchemas")
    public String matchSchemasShrink;

    /**
     * <p>The ID of the approval process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-f16bf74b2b29****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The name of the approval process. The name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>Endpoint software installation approval process</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The list of approval nodes. You can define up to 5 approval nodes.</p>
     */
    @NameInMap("ProcessNodes")
    public java.util.List<java.util.List<String>> processNodes;

    public static UpdateApprovalProcessShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessShrinkRequest self = new UpdateApprovalProcessShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessShrinkRequest setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public Integer getApprovalType() {
        return this.approvalType;
    }

    public UpdateApprovalProcessShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApprovalProcessShrinkRequest setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }
    public String getEventLabel() {
        return this.eventLabel;
    }

    public UpdateApprovalProcessShrinkRequest setExternalConfig(String externalConfig) {
        this.externalConfig = externalConfig;
        return this;
    }
    public String getExternalConfig() {
        return this.externalConfig;
    }

    public UpdateApprovalProcessShrinkRequest setMatchSchemaConfigsShrink(String matchSchemaConfigsShrink) {
        this.matchSchemaConfigsShrink = matchSchemaConfigsShrink;
        return this;
    }
    public String getMatchSchemaConfigsShrink() {
        return this.matchSchemaConfigsShrink;
    }

    public UpdateApprovalProcessShrinkRequest setMatchSchemasShrink(String matchSchemasShrink) {
        this.matchSchemasShrink = matchSchemasShrink;
        return this;
    }
    public String getMatchSchemasShrink() {
        return this.matchSchemasShrink;
    }

    public UpdateApprovalProcessShrinkRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public UpdateApprovalProcessShrinkRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public UpdateApprovalProcessShrinkRequest setProcessNodes(java.util.List<java.util.List<String>> processNodes) {
        this.processNodes = processNodes;
        return this;
    }
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

}
