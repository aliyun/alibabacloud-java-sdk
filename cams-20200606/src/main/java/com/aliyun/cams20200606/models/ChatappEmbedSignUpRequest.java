// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappEmbedSignUpRequest extends TeaModel {
    @NameInMap("InputToken")
    public String inputToken;

    public static ChatappEmbedSignUpRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappEmbedSignUpRequest self = new ChatappEmbedSignUpRequest();
        return TeaModel.build(map, self);
    }

    public ChatappEmbedSignUpRequest setInputToken(String inputToken) {
        this.inputToken = inputToken;
        return this;
    }
    public String getInputToken() {
        return this.inputToken;
    }

}
