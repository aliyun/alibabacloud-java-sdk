// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostOptimizationOverviewShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11***********35</p>
     */
    @NameInMap("AssumeAliyunId")
    public Long assumeAliyunId;

    @NameInMap("AssumeAliyunIdList")
    public String assumeAliyunIdListShrink;

    @NameInMap("CheckPlanId")
    public Long checkPlanId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeCostOptimizationOverviewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostOptimizationOverviewShrinkRequest self = new DescribeCostOptimizationOverviewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostOptimizationOverviewShrinkRequest setAssumeAliyunId(Long assumeAliyunId) {
        this.assumeAliyunId = assumeAliyunId;
        return this;
    }
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    public DescribeCostOptimizationOverviewShrinkRequest setAssumeAliyunIdListShrink(String assumeAliyunIdListShrink) {
        this.assumeAliyunIdListShrink = assumeAliyunIdListShrink;
        return this;
    }
    public String getAssumeAliyunIdListShrink() {
        return this.assumeAliyunIdListShrink;
    }

    public DescribeCostOptimizationOverviewShrinkRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public DescribeCostOptimizationOverviewShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
