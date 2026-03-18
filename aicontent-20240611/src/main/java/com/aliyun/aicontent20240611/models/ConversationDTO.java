// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ConversationDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("chatData")
    public String chatData;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("messageCount")
    public Integer messageCount;

    /**
     * <strong>example:</strong>
     * <p>[1,2,3]</p>
     */
    @NameInMap("modelIds")
    public String modelIds;

    /**
     * <strong>example:</strong>
     * <p>我的对话</p>
     */
    @NameInMap("title")
    public String title;

    public static ConversationDTO build(java.util.Map<String, ?> map) throws Exception {
        ConversationDTO self = new ConversationDTO();
        return TeaModel.build(map, self);
    }

    public ConversationDTO setChatData(String chatData) {
        this.chatData = chatData;
        return this;
    }
    public String getChatData() {
        return this.chatData;
    }

    public ConversationDTO setDeleteTag(Integer deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    public ConversationDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ConversationDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ConversationDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ConversationDTO setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }
    public Integer getMessageCount() {
        return this.messageCount;
    }

    public ConversationDTO setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public ConversationDTO setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
