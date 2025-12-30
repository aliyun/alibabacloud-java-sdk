// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizMetricByNameShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizMetricByNameQuery")
    public String bizMetricByNameQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetBizMetricByNameShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBizMetricByNameShrinkRequest self = new GetBizMetricByNameShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetBizMetricByNameShrinkRequest setBizMetricByNameQueryShrink(String bizMetricByNameQueryShrink) {
        this.bizMetricByNameQueryShrink = bizMetricByNameQueryShrink;
        return this;
    }
    public String getBizMetricByNameQueryShrink() {
        return this.bizMetricByNameQueryShrink;
    }

    public GetBizMetricByNameShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
