// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateIntentRequest extends TeaModel {
    @NameInMap("IntentDefinition")
    public String intentDefinition;

    @NameInMap("DialogId")
    public Long dialogId;

    public static CreateIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentRequest self = new CreateIntentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntentRequest setIntentDefinition(String intentDefinition) {
        this.intentDefinition = intentDefinition;
        return this;
    }
    public String getIntentDefinition() {
        return this.intentDefinition;
    }

    public CreateIntentRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
