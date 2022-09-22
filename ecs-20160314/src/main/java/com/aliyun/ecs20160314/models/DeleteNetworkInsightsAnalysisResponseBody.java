// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteNetworkInsightsAnalysisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkInsightsAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInsightsAnalysisResponseBody self = new DeleteNetworkInsightsAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInsightsAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
