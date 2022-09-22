// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteNetworkInsightsPathResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkInsightsPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInsightsPathResponseBody self = new DeleteNetworkInsightsPathResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInsightsPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
