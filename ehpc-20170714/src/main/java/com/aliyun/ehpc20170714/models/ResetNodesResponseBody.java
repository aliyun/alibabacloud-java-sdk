// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ResetNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetNodesResponseBody self = new ResetNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
