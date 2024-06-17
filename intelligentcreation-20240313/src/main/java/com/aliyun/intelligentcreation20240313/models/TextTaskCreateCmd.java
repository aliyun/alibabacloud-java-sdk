// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TextTaskCreateCmd extends TeaModel {
    @NameInMap("agentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>极氪007新车上市</p>
     */
    @NameInMap("contentRequirement")
    public String contentRequirement;

    /**
     * <strong>example:</strong>
     * <p>28274623764834</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    @NameInMap("industry")
    public String industry;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("introduction")
    public String introduction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("number")
    public Integer number;

    /**
     * <strong>example:</strong>
     * <p>超强续航</p>
     */
    @NameInMap("point")
    public String point;

    @NameInMap("referenceTag")
    public ReferenceTag referenceTag;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("relatedRagIds")
    public java.util.List<Long> relatedRagIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("style")
    public String style;

    @NameInMap("target")
    public String target;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("textModeType")
    public String textModeType;

    /**
     * <strong>example:</strong>
     * <p>旅游路线</p>
     */
    @NameInMap("theme")
    public String theme;

    @NameInMap("themes")
    public java.util.List<String> themes;

    public static TextTaskCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        TextTaskCreateCmd self = new TextTaskCreateCmd();
        return TeaModel.build(map, self);
    }

    public TextTaskCreateCmd setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public TextTaskCreateCmd setContentRequirement(String contentRequirement) {
        this.contentRequirement = contentRequirement;
        return this;
    }
    public String getContentRequirement() {
        return this.contentRequirement;
    }

    public TextTaskCreateCmd setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public TextTaskCreateCmd setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public TextTaskCreateCmd setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public TextTaskCreateCmd setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Integer getNumber() {
        return this.number;
    }

    public TextTaskCreateCmd setPoint(String point) {
        this.point = point;
        return this;
    }
    public String getPoint() {
        return this.point;
    }

    public TextTaskCreateCmd setReferenceTag(ReferenceTag referenceTag) {
        this.referenceTag = referenceTag;
        return this;
    }
    public ReferenceTag getReferenceTag() {
        return this.referenceTag;
    }

    public TextTaskCreateCmd setRelatedRagIds(java.util.List<Long> relatedRagIds) {
        this.relatedRagIds = relatedRagIds;
        return this;
    }
    public java.util.List<Long> getRelatedRagIds() {
        return this.relatedRagIds;
    }

    public TextTaskCreateCmd setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public TextTaskCreateCmd setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public TextTaskCreateCmd setTextModeType(String textModeType) {
        this.textModeType = textModeType;
        return this;
    }
    public String getTextModeType() {
        return this.textModeType;
    }

    public TextTaskCreateCmd setTheme(String theme) {
        this.theme = theme;
        return this;
    }
    public String getTheme() {
        return this.theme;
    }

    public TextTaskCreateCmd setThemes(java.util.List<String> themes) {
        this.themes = themes;
        return this;
    }
    public java.util.List<String> getThemes() {
        return this.themes;
    }

}
