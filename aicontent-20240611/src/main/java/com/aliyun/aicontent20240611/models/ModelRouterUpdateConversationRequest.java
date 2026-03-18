// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateConversationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;messages&quot;:[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;你好&quot;}]}</p>
     */
    @NameInMap("chatData")
    public String chatData;

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

    public static ModelRouterUpdateConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateConversationRequest self = new ModelRouterUpdateConversationRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateConversationRequest setChatData(String chatData) {
        this.chatData = chatData;
        return this;
    }
    public String getChatData() {
        return this.chatData;
    }

    public ModelRouterUpdateConversationRequest setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }
    public Integer getMessageCount() {
        return this.messageCount;
    }

    public ModelRouterUpdateConversationRequest setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public ModelRouterUpdateConversationRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
