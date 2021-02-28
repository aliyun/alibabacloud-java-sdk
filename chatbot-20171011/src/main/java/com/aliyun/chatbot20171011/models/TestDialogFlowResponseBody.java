// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class TestDialogFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TestDialogFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestDialogFlowResponseBody self = new TestDialogFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public TestDialogFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
