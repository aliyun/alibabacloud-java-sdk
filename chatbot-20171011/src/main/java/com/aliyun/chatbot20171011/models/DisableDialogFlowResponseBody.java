// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DisableDialogFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDialogFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDialogFlowResponseBody self = new DisableDialogFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDialogFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
