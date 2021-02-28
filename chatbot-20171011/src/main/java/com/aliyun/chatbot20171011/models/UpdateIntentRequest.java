// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateIntentRequest extends TeaModel {
    @NameInMap("IntentDefinition")
    public String intentDefinition;

    @NameInMap("IntentId")
    public Long intentId;

    public static UpdateIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntentRequest self = new UpdateIntentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntentRequest setIntentDefinition(String intentDefinition) {
        this.intentDefinition = intentDefinition;
        return this;
    }
    public String getIntentDefinition() {
        return this.intentDefinition;
    }

    public UpdateIntentRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

}
