// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPromptResponseBody extends TeaModel {
    /**
     * <p>The access type. Valid values:</p>
     * <ul>
     * <li>PUBLIC: Accessible to all members in the current workspace.</li>
     * <li>PRIVATE: Accessible only to the creator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The creation time. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16T01:44:10Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an information extraction prompt for autonomous driving highway scenarios, focusing on extracting lanes, weather, and other details</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The content of the prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;context&quot;:&quot;You are an experienced driver with ten years of driving experience. Please analyze and judge the following image scenario.&quot;,
     *   &quot;inputData&quot;:&quot;{
     *     \&quot;Reflective tape\&quot;: \&quot;Usually yellow or yellow-and-black striped, attached to permanent protruding obstacles such as wall corners to remind drivers to avoid them. It is strip-shaped, not a traffic cone, not a parking lock, and not a water barrier!\&quot;,
     *     \&quot;Parking lock\&quot;: \&quot;Also known as a parking space lock, it prevents the parking space from being occupied when raised. If a parking lock is present, make sure to output whether it is in the raised or lowered state. It is in the raised state if the lifting frame is up; otherwise, it is in the lowered state.\&quot;
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
     * <p>The update time. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-27T02:01:10Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The name of the prompt.</p>
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
