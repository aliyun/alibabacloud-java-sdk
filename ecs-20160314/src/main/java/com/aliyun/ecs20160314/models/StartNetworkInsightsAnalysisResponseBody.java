// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class StartNetworkInsightsAnalysisResponseBody extends TeaModel {
    @NameInMap("NetworkInsightsAnalysisId")
    public String networkInsightsAnalysisId;

    @NameInMap("RequestId")
    public String requestId;

    public static StartNetworkInsightsAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartNetworkInsightsAnalysisResponseBody self = new StartNetworkInsightsAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public StartNetworkInsightsAnalysisResponseBody setNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
        this.networkInsightsAnalysisId = networkInsightsAnalysisId;
        return this;
    }
    public String getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    public StartNetworkInsightsAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
