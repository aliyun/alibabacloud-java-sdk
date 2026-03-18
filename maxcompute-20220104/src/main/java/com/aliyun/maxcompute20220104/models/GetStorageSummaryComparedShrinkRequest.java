// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSummaryComparedShrinkRequest extends TeaModel {
    /**
     * <p>The start date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250601</p>
     */
    @NameInMap("beginDate")
    public String beginDate;

    /**
     * <p>The end date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250604</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>The list of projects.</p>
     */
    @NameInMap("projects")
    public String projectsShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID. You can log on to the MaxCompute console and choose <strong>Tenant Property</strong> in the navigation pane on the left to view the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>483212237127906</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetStorageSummaryComparedShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSummaryComparedShrinkRequest self = new GetStorageSummaryComparedShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageSummaryComparedShrinkRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetStorageSummaryComparedShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetStorageSummaryComparedShrinkRequest setProjectsShrink(String projectsShrink) {
        this.projectsShrink = projectsShrink;
        return this;
    }
    public String getProjectsShrink() {
        return this.projectsShrink;
    }

    public GetStorageSummaryComparedShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetStorageSummaryComparedShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
