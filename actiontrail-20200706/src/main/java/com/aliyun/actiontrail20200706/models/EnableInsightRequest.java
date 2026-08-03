// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class EnableInsightRequest extends TeaModel {
    /**
     * <p>The type of the Insights event. Valid values:</p>
     * <ul>
     * <li><p>IpInsight: IP address request events.</p>
     * </li>
     * <li><p>ApiCallRateInsight: Unusual API call events.</p>
     * </li>
     * <li><p>ApiErrorRateInsight: API error events.</p>
     * </li>
     * <li><p>AkInsight: Unusual AccessKey pair call events.</p>
     * </li>
     * <li><p>PolicyChangeInsight: Permission change events.</p>
     * </li>
     * <li><p>PasswordChangeInsight: Password change events.</p>
     * </li>
     * <li><p>TrailConcealmentInsight: Trail concealment events.</p>
     * </li>
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
