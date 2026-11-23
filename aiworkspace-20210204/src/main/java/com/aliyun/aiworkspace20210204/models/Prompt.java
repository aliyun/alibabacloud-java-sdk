// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Prompt extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>2024-11-15T07:06:42Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>这是一个自动驾驶场景的提示词。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;context&quot;: &quot;你是一个拥有十年驾龄的老司机，请你针对以下图片场景做出你的分析判断。&quot;,
     *   &quot;inputData&quot;: &quot;{\n  \&quot;反光贴条\&quot;: \&quot; 通常为黄色，或者黄黑间隔，贴在墙角等永久的突出障碍物上，用于提示车主避让。为条带状，不是锥筒，不是地锁，不是水马！\&quot;,\n  \&quot;地锁\&quot;: \&quot;也叫车位锁，升起时可以阻止车位被占用。存在地锁时，务必输出地锁为升起还是降下状态。有升起架子时为升起状态,否则为降下状态。\&quot;\n}&quot;
     * }</p>
     */
    @NameInMap("FrameworkContent")
    public String frameworkContent;

    /**
     * <strong>example:</strong>
     * <p>ICIO</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <strong>example:</strong>
     * <p>2024-12-26T02:17:18Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>pmt-axbxtc****xxx</p>
     */
    @NameInMap("PromptId")
    public String promptId;

    /**
     * <strong>example:</strong>
     * <p>自动驾驶提示词</p>
     */
    @NameInMap("PromptName")
    public String promptName;

    public static Prompt build(java.util.Map<String, ?> map) throws Exception {
        Prompt self = new Prompt();
        return TeaModel.build(map, self);
    }

    public Prompt setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Prompt setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Prompt setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Prompt setFrameworkContent(String frameworkContent) {
        this.frameworkContent = frameworkContent;
        return this;
    }
    public String getFrameworkContent() {
        return this.frameworkContent;
    }

    public Prompt setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public Prompt setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public Prompt setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

    public Prompt setPromptName(String promptName) {
        this.promptName = promptName;
        return this;
    }
    public String getPromptName() {
        return this.promptName;
    }

}
