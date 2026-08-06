// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPromptResponseBody extends TeaModel {
    /**
     * <p>The access type. Valid values:</p>
     * <ul>
     * <li>PUBLIC: All members in the current workspace can access the prompt.</li>
     * <li>PRIVATE: Only the creator can access the prompt.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16T01:44:10Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The prompt description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an information extraction prompt for autonomous driving highway scenarios, focusing on extracting lane and weather information</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The prompt content.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;context&quot;:&quot;You are an experienced driver with ten years of driving experience. Please analyze and make judgments about the following image scenarios.&quot;,
     *   &quot;inputData&quot;:&quot;{
     *     \&quot;Reflective strips\&quot;: \&quot;Usually yellow or yellow-black alternating, attached to permanent protruding obstacles such as wall corners to remind drivers to avoid them. They are strip-shaped, not cones, not ground locks, not water barriers!\&quot;,
     *     \&quot;Ground lock\&quot;: \&quot;Also called a parking space lock, it can prevent a parking space from being occupied when raised. When a ground lock is present, you must indicate whether it is in the raised or lowered state. It is in the raised state when there is a raised frame, otherwise it is in the lowered state.\&quot;,
     *   }&quot;
     * }</p>
     */
    @NameInMap("FrameworkContent")
    public String frameworkContent;

    /**
     * <p>The prompt template framework type.</p>
     * 
     * <strong>example:</strong>
     * <p>ICIO</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-27T02:01:10Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The prompt name.</p>
     * 
     * <strong>example:</strong>
     * <p>Autonomous driving prompt</p>
     */
    @NameInMap("PromptName")
    public String promptName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPromptResponseBody self = new GetPromptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPromptResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetPromptResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetPromptResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetPromptResponseBody setFrameworkContent(String frameworkContent) {
        this.frameworkContent = frameworkContent;
        return this;
    }
    public String getFrameworkContent() {
        return this.frameworkContent;
    }

    public GetPromptResponseBody setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public GetPromptResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetPromptResponseBody setPromptName(String promptName) {
        this.promptName = promptName;
        return this;
    }
    public String getPromptName() {
        return this.promptName;
    }

    public GetPromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
