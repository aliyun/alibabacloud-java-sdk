// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteDialogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDialogResponseBody self = new DeleteDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
