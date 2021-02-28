// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeDialogRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    public static DescribeDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogRequest self = new DescribeDialogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDialogRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

}
