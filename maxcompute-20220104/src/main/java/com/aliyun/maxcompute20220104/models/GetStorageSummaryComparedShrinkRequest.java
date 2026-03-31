// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSummaryComparedShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250601</p>
     */
    @NameInMap("beginDate")
    public String beginDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250604</p>
     */
    @NameInMap("endDate")
    public String endDate;

    @NameInMap("projects")
    public String projectsShrink;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    /**
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
