// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateChatSessionRequest extends TeaModel {
    /**
     * <p>The name of the chat session.</p>
     * 
     * <strong>example:</strong>
     * <p>Product consultation session</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The list of API products associated with the chat session.</p>
     */
    @NameInMap("products")
    public java.util.List<String> products;

    /**
     * <p>The conversation type of the session. Valid values: MODEL and AGENT.</p>
     * 
     * <strong>example:</strong>
     * <p>MODEL</p>
     */
    @NameInMap("talkType")
    public String talkType;

    public static CreateChatSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionRequest self = new CreateChatSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChatSessionRequest setProducts(java.util.List<String> products) {
        this.products = products;
        return this;
    }
    public java.util.List<String> getProducts() {
        return this.products;
    }

    public CreateChatSessionRequest setTalkType(String talkType) {
        this.talkType = talkType;
        return this;
    }
    public String getTalkType() {
        return this.talkType;
    }

}
