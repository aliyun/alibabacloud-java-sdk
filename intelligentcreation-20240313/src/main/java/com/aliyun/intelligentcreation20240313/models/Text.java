// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class Text extends TeaModel {
    @NameInMap("agentId")
    public String agentId;

    @NameInMap("agentName")
    public String agentName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("desc")
    public String desc;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("illustrationTaskIdList")
    public java.util.List<Long> illustrationTaskIdList;

    @NameInMap("publishStatus")
    public String publishStatus;

    @NameInMap("textContent")
    public String textContent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("textId")
    public Long textId;

    @NameInMap("textIllustrationTag")
    public Boolean textIllustrationTag;

    @NameInMap("textModeType")
    public String textModeType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("textStatus")
    public String textStatus;

    @NameInMap("textStyleType")
    public String textStyleType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("textTaskId")
    public Long textTaskId;

    @NameInMap("textThemes")
    public java.util.List<String> textThemes;

    @NameInMap("title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userNameCreate")
    public String userNameCreate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userNameModified")
    public String userNameModified;

    public static Text build(java.util.Map<String, ?> map) throws Exception {
        Text self = new Text();
        return TeaModel.build(map, self);
    }

    public Text setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public Text setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public Text setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public Text setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Text setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Text setIllustrationTaskIdList(java.util.List<Long> illustrationTaskIdList) {
        this.illustrationTaskIdList = illustrationTaskIdList;
        return this;
    }
    public java.util.List<Long> getIllustrationTaskIdList() {
        return this.illustrationTaskIdList;
    }

    public Text setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public Text setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public Text setTextId(Long textId) {
        this.textId = textId;
        return this;
    }
    public Long getTextId() {
        return this.textId;
    }

    public Text setTextIllustrationTag(Boolean textIllustrationTag) {
        this.textIllustrationTag = textIllustrationTag;
        return this;
    }
    public Boolean getTextIllustrationTag() {
        return this.textIllustrationTag;
    }

    public Text setTextModeType(String textModeType) {
        this.textModeType = textModeType;
        return this;
    }
    public String getTextModeType() {
        return this.textModeType;
    }

    public Text setTextStatus(String textStatus) {
        this.textStatus = textStatus;
        return this;
    }
    public String getTextStatus() {
        return this.textStatus;
    }

    public Text setTextStyleType(String textStyleType) {
        this.textStyleType = textStyleType;
        return this;
    }
    public String getTextStyleType() {
        return this.textStyleType;
    }

    public Text setTextTaskId(Long textTaskId) {
        this.textTaskId = textTaskId;
        return this;
    }
    public Long getTextTaskId() {
        return this.textTaskId;
    }

    public Text setTextThemes(java.util.List<String> textThemes) {
        this.textThemes = textThemes;
        return this;
    }
    public java.util.List<String> getTextThemes() {
        return this.textThemes;
    }

    public Text setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Text setUserNameCreate(String userNameCreate) {
        this.userNameCreate = userNameCreate;
        return this;
    }
    public String getUserNameCreate() {
        return this.userNameCreate;
    }

    public Text setUserNameModified(String userNameModified) {
        this.userNameModified = userNameModified;
        return this;
    }
    public String getUserNameModified() {
        return this.userNameModified;
    }

}
