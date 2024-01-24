// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StartDataFlowResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDataFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDataFlowResponseBody self = new StartDataFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDataFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
