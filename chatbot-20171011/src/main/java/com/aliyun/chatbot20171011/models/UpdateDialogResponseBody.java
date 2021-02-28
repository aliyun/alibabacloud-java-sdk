// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogResponseBody self = new UpdateDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
