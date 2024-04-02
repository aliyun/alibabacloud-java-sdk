// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckResultsShrinkRequest extends TeaModel {
    @NameInMap("CheckIds")
    public String checkIdsShrink;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("Product")
    public String product;

    @NameInMap("RegionIds")
    public String regionIdsShrink;

    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("Severity")
    public Integer severity;

    public static DescribeCostCheckResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckResultsShrinkRequest self = new DescribeCostCheckResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckResultsShrinkRequest setCheckIdsShrink(String checkIdsShrink) {
        this.checkIdsShrink = checkIdsShrink;
        return this;
    }
    public String getCheckIdsShrink() {
        return this.checkIdsShrink;
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

}
