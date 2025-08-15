// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class EnableInsightRequest extends TeaModel {
    /**
     * <p>The type of the Insights event. Valid values:</p>
     * <ul>
     * <li>IpInsight: Insights event on IP address</li>
     * <li>ApiCallRateInsight: Insights event on API call rate</li>
     * <li>ApiErrorRateInsight: Insights event on API error rate</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IpInsight</p>
     */
    @NameInMap("InsightType")
    public String insightType;

    public static EnableInsightRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInsightRequest self = new EnableInsightRequest();
        return TeaModel.build(map, self);
    }

    public EnableInsightRequest setInsightType(String insightType) {
        this.insightType = insightType;
        return this;
    }
    public String getInsightType() {
        return this.insightType;
    }

}
