// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateIntentShrinkRequest extends TeaModel {
    @NameInMap("IntentDefinition")
    public String intentDefinitionShrink;

    @NameInMap("DialogId")
    public Long dialogId;

    public static CreateIntentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentShrinkRequest self = new CreateIntentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntentShrinkRequest setIntentDefinitionShrink(String intentDefinitionShrink) {
        this.intentDefinitionShrink = intentDefinitionShrink;
        return this;
    }
    public String getIntentDefinitionShrink() {
        return this.intentDefinitionShrink;
    }

    public CreateIntentShrinkRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
