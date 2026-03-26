// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightSelectorsResponseBody extends TeaModel {
    @NameInMap("InsightSelectors")
    public java.util.List<String> insightSelectors;

    /**
     * <strong>example:</strong>
     * <p>D0227506-AA8C-5998-8A62-74769106****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>acs:actiontrail:cn-shanghai:159498693826****:trail/trail-name</p>
     */
    @NameInMap("TrailArn")
    public String trailArn;

    public static GetInsightSelectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInsightSelectorsResponseBody self = new GetInsightSelectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInsightSelectorsResponseBody setInsightSelectors(java.util.List<String> insightSelectors) {
        this.insightSelectors = insightSelectors;
        return this;
    }
    public java.util.List<String> getInsightSelectors() {
        return this.insightSelectors;
    }

    public GetInsightSelectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInsightSelectorsResponseBody setTrailArn(String trailArn) {
        this.trailArn = trailArn;
        return this;
    }
    public String getTrailArn() {
        return this.trailArn;
    }

}
