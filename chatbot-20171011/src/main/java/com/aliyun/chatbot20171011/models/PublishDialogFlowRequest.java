// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PublishDialogFlowRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    public static PublishDialogFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishDialogFlowRequest self = new PublishDialogFlowRequest();
        return TeaModel.build(map, self);
    }

    public PublishDialogFlowRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
