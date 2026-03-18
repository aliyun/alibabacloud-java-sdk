// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ConversationCreateCmd extends TeaModel {
    @NameInMap("chatData")
    public String chatData;

    @NameInMap("modelIds")
    public String modelIds;

    @NameInMap("title")
    public String title;

    public static ConversationCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        ConversationCreateCmd self = new ConversationCreateCmd();
        return TeaModel.build(map, self);
    }

    public ConversationCreateCmd setChatData(String chatData) {
        this.chatData = chatData;
        return this;
    }
    public String getChatData() {
        return this.chatData;
    }

    public ConversationCreateCmd setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public ConversationCreateCmd setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
