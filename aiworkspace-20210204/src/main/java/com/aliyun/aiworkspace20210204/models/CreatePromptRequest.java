// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreatePromptRequest extends TeaModel {
    /**
     * <p>The workspace visibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): Visible only to you and administrators in this workspace.</li>
     * <li>PUBLIC: Visible to everyone in this workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The prompt description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a prompt for information extraction in autonomous driving highway scenarios, focusing on extracting lane and weather information</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The prompt framework content.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;context&quot;:&quot;You are an experienced driver with ten years of driving experience. Please analyze and make judgments about the following image scenarios.&quot;,
     *   &quot;inputData&quot;:&quot;{
     *     \&quot;Reflective strips\&quot;: \&quot;Usually yellow or yellow-black alternating, attached to permanent protruding obstacles such as wall corners to remind drivers to avoid them.\&quot;,
     *     \&quot;Ground lock\&quot;: \&quot;Also called a parking space lock. When raised, it prevents the parking space from being occupied. When a ground lock is present, you must indicate whether it is in the raised or lowered state.\&quot;,
     *   }&quot;
     * }</p>
     */
    @NameInMap("FrameworkContent")
    public String frameworkContent;

    /**
     * <p>The prompt optimization template.</p>
     * 
     * <strong>example:</strong>
     * <p>ICIO</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <p>The prompt name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Autonomous driving highway information extraction</p>
     */
    @NameInMap("PromptName")
    public String promptName;

    /**
     * <p>The workspace ID. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>796**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreatePromptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptRequest self = new CreatePromptRequest();
        return TeaModel.build(map, self);
    }

    public CreatePromptRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreatePromptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePromptRequest setFrameworkContent(String frameworkContent) {
        this.frameworkContent = frameworkContent;
        return this;
    }
    public String getFrameworkContent() {
        return this.frameworkContent;
    }

    public CreatePromptRequest setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public CreatePromptRequest setPromptName(String promptName) {
        this.promptName = promptName;
        return this;
    }
    public String getPromptName() {
        return this.promptName;
    }

    public CreatePromptRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
