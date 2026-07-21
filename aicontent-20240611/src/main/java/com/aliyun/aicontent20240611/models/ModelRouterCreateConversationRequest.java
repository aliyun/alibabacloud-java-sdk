// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateConversationRequest extends TeaModel {
    /**
     * <p>The conversation data, provided as a JSON string containing the message history for each model. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;stream&quot;:true,&quot;messages&quot;:[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;1+1&quot;}],&quot;model&quot;:&quot;qwen/qwen-max/r0&quot;,&quot;stream_options&quot;:{&quot;include_usage&quot;:true}}</p>
     */
    @NameInMap("chatData")
    public String chatData;

    /**
     * <p>A list of model IDs, provided as a JSON array string.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("modelIds")
    public String modelIds;

    /**
     * <p>The conversation title. If omitted, a title is automatically generated from the first user message.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("title")
    public String title;

    public static ModelRouterCreateConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateConversationRequest self = new ModelRouterCreateConversationRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateConversationRequest setChatData(String chatData) {
        this.chatData = chatData;
        return this;
    }
    public String getChatData() {
        return this.chatData;
    }

    public ModelRouterCreateConversationRequest setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public ModelRouterCreateConversationRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
