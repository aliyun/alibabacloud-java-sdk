// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>max</p>
     */
    @NameInMap("aggMethod")
    public String aggMethod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1669081045</p>
     */
    @NameInMap("from")
    public Long from;

    @NameInMap("plotTypes")
    public java.util.List<String> plotTypes;

    /**
     * <strong>example:</strong>
     * <p>ODPS</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>ot_tunnel_quota</p>
     */
    @NameInMap("subQuotaNickname")
    public String subQuotaNickname;

    /**
     * <strong>example:</strong>
     * <p>478403690625249</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1669360870</p>
     */
    @NameInMap("to")
    public Long to;

    @NameInMap("yAxisTypes")
    public java.util.List<String> yAxisTypes;

    public static GetQuotaUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUsageRequest self = new GetQuotaUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaUsageRequest setAggMethod(String aggMethod) {
        this.aggMethod = aggMethod;
        return this;
    }
    public String getAggMethod() {
        return this.aggMethod;
    }

    public GetQuotaUsageRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetQuotaUsageRequest setPlotTypes(java.util.List<String> plotTypes) {
        this.plotTypes = plotTypes;
        return this;
    }
    public java.util.List<String> getPlotTypes() {
        return this.plotTypes;
    }

    public GetQuotaUsageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetQuotaUsageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQuotaUsageRequest setSubQuotaNickname(String subQuotaNickname) {
        this.subQuotaNickname = subQuotaNickname;
        return this;
    }
    public String getSubQuotaNickname() {
        return this.subQuotaNickname;
    }

    public GetQuotaUsageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetQuotaUsageRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public GetQuotaUsageRequest setYAxisTypes(java.util.List<String> yAxisTypes) {
        this.yAxisTypes = yAxisTypes;
        return this;
    }
    public java.util.List<String> getYAxisTypes() {
        return this.yAxisTypes;
    }

}
