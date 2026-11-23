// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdatePromptRequest extends TeaModel {
    /**
     * <p>The description of the prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an information extraction prompt for autonomous driving highway scenarios, focusing on extracting lane and weather information.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The content of the prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;context&quot;:&quot;You are an experienced driver with ten years of driving experience. Please analyze and judge the image scenario below.&quot;,
     *   &quot;inputData&quot;:&quot;{
     *     \&quot;Reflective tape\&quot;: \&quot;Usually yellow or yellow-and-black striped, affixed to permanent protruding obstacles such as wall corners to alert drivers.\&quot;,
     *     \&quot;Parking lock\&quot;: \&quot;Also known as a parking space lock. When raised, it prevents the parking space from being occupied. If a parking lock is present, be sure to indicate whether it is in the raised or lowered state.\&quot;,
     *   }&quot;
     * }</p>
     */
    @NameInMap("FrameworkContent")
    public String frameworkContent;

    /**
     * <p>The framework type of the prompt template.</p>
     * 
     * <strong>example:</strong>
     * <p>ICIO</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <p>The ID of the workspace. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>302914</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdatePromptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptRequest self = new UpdatePromptRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePromptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePromptRequest setFrameworkContent(String frameworkContent) {
        this.frameworkContent = frameworkContent;
        return this;
    }
    public String getFrameworkContent() {
        return this.frameworkContent;
    }

    public UpdatePromptRequest setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public UpdatePromptRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
