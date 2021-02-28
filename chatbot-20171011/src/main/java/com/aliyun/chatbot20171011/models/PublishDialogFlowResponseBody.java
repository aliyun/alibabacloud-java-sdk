// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PublishDialogFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishDialogFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishDialogFlowResponseBody self = new PublishDialogFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishDialogFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
