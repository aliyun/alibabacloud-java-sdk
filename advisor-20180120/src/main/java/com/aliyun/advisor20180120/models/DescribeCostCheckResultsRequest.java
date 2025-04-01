// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckResultsRequest extends TeaModel {
    @NameInMap("AssumeAliyunIdList")
    public java.util.List<Long> assumeAliyunIdList;

    @NameInMap("CheckIds")
    public java.util.List<String> checkIds;

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
    public java.util.List<String> regionIds;

    @NameInMap("ResourceGroupIdList")
    public java.util.List<String> resourceGroupIdList;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

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
    public java.util.List<String> tagKeys;

    @NameInMap("TagList")
    public java.util.List<DescribeCostCheckResultsRequestTagList> tagList;

    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    public static DescribeCostCheckResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckResultsRequest self = new DescribeCostCheckResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckResultsRequest setAssumeAliyunIdList(java.util.List<Long> assumeAliyunIdList) {
        this.assumeAliyunIdList = assumeAliyunIdList;
        return this;
    }
    public java.util.List<Long> getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
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

    public DescribeCostCheckResultsRequest setResourceGroupIdList(java.util.List<String> resourceGroupIdList) {
        this.resourceGroupIdList = resourceGroupIdList;
        return this;
    }
    public java.util.List<String> getResourceGroupIdList() {
        return this.resourceGroupIdList;
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

    public DescribeCostCheckResultsRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    public DescribeCostCheckResultsRequest setTagList(java.util.List<DescribeCostCheckResultsRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<DescribeCostCheckResultsRequestTagList> getTagList() {
        return this.tagList;
    }

    public DescribeCostCheckResultsRequest setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

    public static class DescribeCostCheckResultsRequestTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ERP</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public java.util.List<String> tagValue;

        public static DescribeCostCheckResultsRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckResultsRequestTagList self = new DescribeCostCheckResultsRequestTagList();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckResultsRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCostCheckResultsRequestTagList setTagValue(java.util.List<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public java.util.List<String> getTagValue() {
            return this.tagValue;
        }

    }

}
