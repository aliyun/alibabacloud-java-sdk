// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardStatisticsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StatisticsQuery")
    public String statisticsQueryShrink;

    public static GetStandardStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardStatisticsShrinkRequest self = new GetStandardStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardStatisticsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStandardStatisticsShrinkRequest setStatisticsQueryShrink(String statisticsQueryShrink) {
        this.statisticsQueryShrink = statisticsQueryShrink;
        return this;
    }
    public String getStatisticsQueryShrink() {
        return this.statisticsQueryShrink;
    }

}
