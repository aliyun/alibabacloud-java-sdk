// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TextTask extends TeaModel {
    @NameInMap("agentId")
    public String agentId;

    @NameInMap("agentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>九寨沟三日游攻略</p>
     */
    @NameInMap("contentRequirement")
    public String contentRequirement;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("introduction")
    public String introduction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nums")
    public Integer nums;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("point")
    public String point;

    @NameInMap("referenceTag")
    public ReferenceTag referenceTag;

    @NameInMap("relatedRagIds")
    public java.util.List<Long> relatedRagIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("style")
    public String style;

    @NameInMap("target")
    public String target;

    @NameInMap("textIds")
    public java.util.List<Long> textIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("textModeType")
    public String textModeType;

    @NameInMap("textTaskId")
    public Long textTaskId;

    @NameInMap("textTaskStatus")
    public String textTaskStatus;

    @NameInMap("texts")
    public java.util.List<Text> texts;

    /**
     * <strong>example:</strong>
     * <p>旅游路线</p>
     */
    @NameInMap("theme")
    public String theme;

    @NameInMap("themeDesc")
    public String themeDesc;

    public static TextTask build(java.util.Map<String, ?> map) throws Exception {
        TextTask self = new TextTask();
        return TeaModel.build(map, self);
    }

    public TextTask setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public TextTask setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public TextTask setContentRequirement(String contentRequirement) {
        this.contentRequirement = contentRequirement;
        return this;
    }
    public String getContentRequirement() {
        return this.contentRequirement;
    }

    public TextTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TextTask setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TextTask setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public TextTask setNums(Integer nums) {
        this.nums = nums;
        return this;
    }
    public Integer getNums() {
        return this.nums;
    }

    public TextTask setPoint(String point) {
        this.point = point;
        return this;
    }
    public String getPoint() {
        return this.point;
    }

    public TextTask setReferenceTag(ReferenceTag referenceTag) {
        this.referenceTag = referenceTag;
        return this;
    }
    public ReferenceTag getReferenceTag() {
        return this.referenceTag;
    }

    public TextTask setRelatedRagIds(java.util.List<Long> relatedRagIds) {
        this.relatedRagIds = relatedRagIds;
        return this;
    }
    public java.util.List<Long> getRelatedRagIds() {
        return this.relatedRagIds;
    }

    public TextTask setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public TextTask setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public TextTask setTextIds(java.util.List<Long> textIds) {
        this.textIds = textIds;
        return this;
    }
    public java.util.List<Long> getTextIds() {
        return this.textIds;
    }

    public TextTask setTextModeType(String textModeType) {
        this.textModeType = textModeType;
        return this;
    }
    public String getTextModeType() {
        return this.textModeType;
    }

    public TextTask setTextTaskId(Long textTaskId) {
        this.textTaskId = textTaskId;
        return this;
    }
    public Long getTextTaskId() {
        return this.textTaskId;
    }

    public TextTask setTextTaskStatus(String textTaskStatus) {
        this.textTaskStatus = textTaskStatus;
        return this;
    }
    public String getTextTaskStatus() {
        return this.textTaskStatus;
    }

    public TextTask setTexts(java.util.List<Text> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<Text> getTexts() {
        return this.texts;
    }

    public TextTask setTheme(String theme) {
        this.theme = theme;
        return this;
    }
    public String getTheme() {
        return this.theme;
    }

    public TextTask setThemeDesc(String themeDesc) {
        this.themeDesc = themeDesc;
        return this;
    }
    public String getThemeDesc() {
        return this.themeDesc;
    }

}
