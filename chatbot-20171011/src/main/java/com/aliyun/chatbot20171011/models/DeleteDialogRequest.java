// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteDialogRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    public static DeleteDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDialogRequest self = new DeleteDialogRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDialogRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
