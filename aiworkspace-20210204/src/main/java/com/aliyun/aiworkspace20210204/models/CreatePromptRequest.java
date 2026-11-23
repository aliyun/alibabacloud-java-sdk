// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreatePromptRequest extends TeaModel {
    /**
     * <p>The visibility of the workspace. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): Visible only to you and administrators in this workspace.</li>
     * <li>PUBLIC: Visible to all users in this workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The description of the prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an information extraction prompt for autonomous driving highway scenarios, focusing on extracting information such as lanes and weather</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The content of the prompt framework.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;context&quot;:&quot;You are an experienced driver with ten years of driving experience. Please analyze and evaluate the following image scenario.&quot;,
     *   &quot;inputData&quot;:&quot;{
     *     \&quot;Reflective tape\&quot;: \&quot;Usually yellow or alternating yellow and black, attached to permanent protruding obstacles such as wall corners to remind drivers to avoid them.\&quot;,
     *     \&quot;Parking lock\&quot;: \&quot;Also known as a parking space lock, it prevents the parking space from being occupied when raised. If a parking lock is present, be sure to output whether it is in the raised or lowered state.\&quot;,
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
     * <p>The name of the prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Autonomous driving highway information extraction</p>
     */
    @NameInMap("PromptName")
    public String promptName;

    /**
     * <p>The workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation to obtain the ID.</p>
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
