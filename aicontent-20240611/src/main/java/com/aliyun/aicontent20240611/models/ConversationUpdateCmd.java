// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ConversationUpdateCmd extends TeaModel {
    /**
     * <p>The conversation data in JSON format, containing message records for each model.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;messages&quot;:[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;Hello&quot;}]}</p>
     */
    @NameInMap("chatData")
    public String chatData;

    /**
     * <p>The number of messages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("messageCount")
    public Integer messageCount;

    /**
     * <p>The list of model IDs as a JSON array string.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3]</p>
     */
    @NameInMap("modelIds")
    public String modelIds;

    /**
     * <p>The conversation title.</p>
     * 
     * <strong>example:</strong>
     * <p>My conversation</p>
     */
    @NameInMap("title")
    public String title;

    public static ConversationUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ConversationUpdateCmd self = new ConversationUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ConversationUpdateCmd setChatData(String chatData) {
        this.chatData = chatData;
        return this;
    }
    public String getChatData() {
        return this.chatData;
    }

    public ConversationUpdateCmd setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }
    public Integer getMessageCount() {
        return this.messageCount;
    }

    public ConversationUpdateCmd setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public ConversationUpdateCmd setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
