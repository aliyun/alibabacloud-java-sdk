// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckResultsShrinkRequest extends TeaModel {
    @NameInMap("AssumeAliyunIdList")
    public String assumeAliyunIdListShrink;

    @NameInMap("CheckIds")
    public String checkIdsShrink;

    @NameInMap("CheckPlanId")
    public Long checkPlanId;

    /**
     * <strong>example:</strong>
     * <p>Category</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionIds")
    public String regionIdsShrink;

    @NameInMap("ResourceGroupIdList")
    public String resourceGroupIdListShrink;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>SYNC_********_TASK</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Severity")
    public Integer severity;

    @NameInMap("TagKeys")
    public String tagKeysShrink;

    @NameInMap("TagList")
    public String tagListShrink;

    @NameInMap("TagValues")
    public String tagValuesShrink;

    public static DescribeCostCheckResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckResultsShrinkRequest self = new DescribeCostCheckResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckResultsShrinkRequest setAssumeAliyunIdListShrink(String assumeAliyunIdListShrink) {
        this.assumeAliyunIdListShrink = assumeAliyunIdListShrink;
        return this;
    }
    public String getAssumeAliyunIdListShrink() {
        return this.assumeAliyunIdListShrink;
    }

    public DescribeCostCheckResultsShrinkRequest setCheckIdsShrink(String checkIdsShrink) {
        this.checkIdsShrink = checkIdsShrink;
        return this;
    }
    public String getCheckIdsShrink() {
        return this.checkIdsShrink;
    }

    public DescribeCostCheckResultsShrinkRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public DescribeCostCheckResultsShrinkRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeCostCheckResultsShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeCostCheckResultsShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public DescribeCostCheckResultsShrinkRequest setResourceGroupIdListShrink(String resourceGroupIdListShrink) {
        this.resourceGroupIdListShrink = resourceGroupIdListShrink;
        return this;
    }
    public String getResourceGroupIdListShrink() {
        return this.resourceGroupIdListShrink;
    }

    public DescribeCostCheckResultsShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeCostCheckResultsShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

    public DescribeCostCheckResultsShrinkRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeCostCheckResultsShrinkRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

    public DescribeCostCheckResultsShrinkRequest setTagKeysShrink(String tagKeysShrink) {
        this.tagKeysShrink = tagKeysShrink;
        return this;
    }
    public String getTagKeysShrink() {
        return this.tagKeysShrink;
    }

    public DescribeCostCheckResultsShrinkRequest setTagListShrink(String tagListShrink) {
        this.tagListShrink = tagListShrink;
        return this;
    }
    public String getTagListShrink() {
        return this.tagListShrink;
    }

    public DescribeCostCheckResultsShrinkRequest setTagValuesShrink(String tagValuesShrink) {
        this.tagValuesShrink = tagValuesShrink;
        return this;
    }
    public String getTagValuesShrink() {
        return this.tagValuesShrink;
    }

}
