// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class TestDialogFlowRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    public static TestDialogFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        TestDialogFlowRequest self = new TestDialogFlowRequest();
        return TeaModel.build(map, self);
    }

    public TestDialogFlowRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
