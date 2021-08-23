// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateDialogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DialogId")
    public Long dialogId;

    public static CreateDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogResponseBody self = new CreateDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDialogResponseBody setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
