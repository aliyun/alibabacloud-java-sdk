// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateNetworkInsightsPathResponseBody extends TeaModel {
    @NameInMap("NetworkInsightsPathId")
    public String networkInsightsPathId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkInsightsPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInsightsPathResponseBody self = new CreateNetworkInsightsPathResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInsightsPathResponseBody setNetworkInsightsPathId(String networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
        return this;
    }
    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    public CreateNetworkInsightsPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
