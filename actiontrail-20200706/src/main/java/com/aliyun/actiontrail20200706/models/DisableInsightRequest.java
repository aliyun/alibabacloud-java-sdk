// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DisableInsightRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>IpInsight</p>
     */
    @NameInMap("InsightType")
    public String insightType;

    public static DisableInsightRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInsightRequest self = new DisableInsightRequest();
        return TeaModel.build(map, self);
    }

    public DisableInsightRequest setInsightType(String insightType) {
        this.insightType = insightType;
        return this;
    }
    public String getInsightType() {
        return this.insightType;
    }

}
