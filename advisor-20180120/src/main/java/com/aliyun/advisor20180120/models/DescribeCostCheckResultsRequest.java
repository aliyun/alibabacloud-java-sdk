// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckResultsRequest extends TeaModel {
    @NameInMap("CheckIds")
    public java.util.List<String> checkIds;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("Product")
    public String product;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("Severity")
    public Integer severity;

    public static DescribeCostCheckResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckResultsRequest self = new DescribeCostCheckResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckResultsRequest setCheckIds(java.util.List<String> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<String> getCheckIds() {
        return this.checkIds;
    }

    public DescribeCostCheckResultsRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeCostCheckResultsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeCostCheckResultsRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public DescribeCostCheckResultsRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeCostCheckResultsRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeCostCheckResultsRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

}
