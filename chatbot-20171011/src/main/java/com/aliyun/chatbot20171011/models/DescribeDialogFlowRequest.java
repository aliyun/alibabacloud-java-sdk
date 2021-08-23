// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeDialogFlowRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    public static DescribeDialogFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogFlowRequest self = new DescribeDialogFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDialogFlowRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
