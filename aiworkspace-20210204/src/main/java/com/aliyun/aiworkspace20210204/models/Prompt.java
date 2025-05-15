// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Prompt extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("FrameworkContent")
    public String frameworkContent;

    @NameInMap("FrameworkType")
    public String frameworkType;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("PromptId")
    public String promptId;

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
