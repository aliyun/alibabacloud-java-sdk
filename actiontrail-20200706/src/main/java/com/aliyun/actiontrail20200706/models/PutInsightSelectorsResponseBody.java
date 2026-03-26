// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutInsightSelectorsResponseBody extends TeaModel {
    @NameInMap("InsightSelectors")
    public java.util.List<String> insightSelectors;

    /**
     * <strong>example:</strong>
     * <p>7EC26DF0-35AC-5F37-82B3-F5545D0A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>acs:actiontrail:cn-shanghai:159498693826****:trail/trail-name</p>
     */
    @NameInMap("TrailArn")
    public String trailArn;

    public static PutInsightSelectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutInsightSelectorsResponseBody self = new PutInsightSelectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutInsightSelectorsResponseBody setInsightSelectors(java.util.List<String> insightSelectors) {
        this.insightSelectors = insightSelectors;
        return this;
    }
    public java.util.List<String> getInsightSelectors() {
        return this.insightSelectors;
    }

    public PutInsightSelectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutInsightSelectorsResponseBody setTrailArn(String trailArn) {
        this.trailArn = trailArn;
        return this;
    }
    public String getTrailArn() {
        return this.trailArn;
    }

}
