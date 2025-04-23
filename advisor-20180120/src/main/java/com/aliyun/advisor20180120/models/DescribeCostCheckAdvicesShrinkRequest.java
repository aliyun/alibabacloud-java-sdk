// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckAdvicesShrinkRequest extends TeaModel {
    @NameInMap("AssumeAliyunIdList")
    public String assumeAliyunIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>EcsCostLowUtilizationCheck</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("CheckPlanId")
    public Long checkPlanId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>test</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Severity")
    public String severity;

    @NameInMap("TagKeys")
    public String tagKeysShrink;

    @NameInMap("TagList")
    public String tagListShrink;

    @NameInMap("TagValues")
    public String tagValuesShrink;

    public static DescribeCostCheckAdvicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckAdvicesShrinkRequest self = new DescribeCostCheckAdvicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckAdvicesShrinkRequest setAssumeAliyunIdListShrink(String assumeAliyunIdListShrink) {
        this.assumeAliyunIdListShrink = assumeAliyunIdListShrink;
        return this;
    }
    public String getAssumeAliyunIdListShrink() {
        return this.assumeAliyunIdListShrink;
    }

    public DescribeCostCheckAdvicesShrinkRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeCostCheckAdvicesShrinkRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public DescribeCostCheckAdvicesShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeCostCheckAdvicesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCostCheckAdvicesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCostCheckAdvicesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public DescribeCostCheckAdvicesShrinkRequest setResourceGroupIdListShrink(String resourceGroupIdListShrink) {
        this.resourceGroupIdListShrink = resourceGroupIdListShrink;
        return this;
    }
    public String getResourceGroupIdListShrink() {
        return this.resourceGroupIdListShrink;
    }

    public DescribeCostCheckAdvicesShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeCostCheckAdvicesShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

    public DescribeCostCheckAdvicesShrinkRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeCostCheckAdvicesShrinkRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public DescribeCostCheckAdvicesShrinkRequest setTagKeysShrink(String tagKeysShrink) {
        this.tagKeysShrink = tagKeysShrink;
        return this;
    }
    public String getTagKeysShrink() {
        return this.tagKeysShrink;
    }

    public DescribeCostCheckAdvicesShrinkRequest setTagListShrink(String tagListShrink) {
        this.tagListShrink = tagListShrink;
        return this;
    }
    public String getTagListShrink() {
        return this.tagListShrink;
    }

    public DescribeCostCheckAdvicesShrinkRequest setTagValuesShrink(String tagValuesShrink) {
        this.tagValuesShrink = tagValuesShrink;
        return this;
    }
    public String getTagValuesShrink() {
        return this.tagValuesShrink;
    }

}
