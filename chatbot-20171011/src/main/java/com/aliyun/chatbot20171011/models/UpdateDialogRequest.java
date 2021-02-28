// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("DialogName")
    public String dialogName;

    @NameInMap("Description")
    public String description;

    public static UpdateDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogRequest self = new UpdateDialogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDialogRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public UpdateDialogRequest setDialogName(String dialogName) {
        this.dialogName = dialogName;
        return this;
    }
    public String getDialogName() {
        return this.dialogName;
    }

    public UpdateDialogRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
