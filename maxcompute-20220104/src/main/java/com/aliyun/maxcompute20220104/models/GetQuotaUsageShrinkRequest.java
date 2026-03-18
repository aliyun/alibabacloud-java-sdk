// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaUsageShrinkRequest extends TeaModel {
    @NameInMap("aggMethod")
    public String aggMethod;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("from")
    public Long from;

    @NameInMap("plotTypes")
    public String plotTypesShrink;

    @NameInMap("productId")
    public String productId;

    @NameInMap("region")
    public String region;

    @NameInMap("subQuotaNickname")
    public String subQuotaNickname;

    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("to")
    public Long to;

    @NameInMap("yAxisTypes")
    public String yAxisTypesShrink;

    public static GetQuotaUsageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUsageShrinkRequest self = new GetQuotaUsageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaUsageShrinkRequest setAggMethod(String aggMethod) {
        this.aggMethod = aggMethod;
        return this;
    }
    public String getAggMethod() {
        return this.aggMethod;
    }

    public GetQuotaUsageShrinkRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetQuotaUsageShrinkRequest setPlotTypesShrink(String plotTypesShrink) {
        this.plotTypesShrink = plotTypesShrink;
        return this;
    }
    public String getPlotTypesShrink() {
        return this.plotTypesShrink;
    }

    public GetQuotaUsageShrinkRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetQuotaUsageShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQuotaUsageShrinkRequest setSubQuotaNickname(String subQuotaNickname) {
        this.subQuotaNickname = subQuotaNickname;
        return this;
    }
    public String getSubQuotaNickname() {
        return this.subQuotaNickname;
    }

    public GetQuotaUsageShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetQuotaUsageShrinkRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public GetQuotaUsageShrinkRequest setYAxisTypesShrink(String yAxisTypesShrink) {
        this.yAxisTypesShrink = yAxisTypesShrink;
        return this;
    }
    public String getYAxisTypesShrink() {
        return this.yAxisTypesShrink;
    }

}
