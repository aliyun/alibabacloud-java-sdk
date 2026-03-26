// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutInsightSelectorsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;insightType&quot;:&quot;AkInsight&quot;},{&quot;insightType&quot;:&quot;IpInsight&quot;}]</p>
     */
    @NameInMap("InsightSelectors")
    public String insightSelectors;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-name</p>
     */
    @NameInMap("TrailName")
    public String trailName;

    public static PutInsightSelectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutInsightSelectorsRequest self = new PutInsightSelectorsRequest();
        return TeaModel.build(map, self);
    }

    public PutInsightSelectorsRequest setInsightSelectors(String insightSelectors) {
        this.insightSelectors = insightSelectors;
        return this;
    }
    public String getInsightSelectors() {
        return this.insightSelectors;
    }

    public PutInsightSelectorsRequest setTrailName(String trailName) {
        this.trailName = trailName;
        return this;
    }
    public String getTrailName() {
        return this.trailName;
    }

}
