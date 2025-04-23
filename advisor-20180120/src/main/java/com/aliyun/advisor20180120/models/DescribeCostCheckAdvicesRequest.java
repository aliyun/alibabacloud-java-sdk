// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckAdvicesRequest extends TeaModel {
    @NameInMap("AssumeAliyunIdList")
    public java.util.List<Long> assumeAliyunIdList;

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
    public java.util.List<String> regionIds;

    @NameInMap("ResourceGroupIdList")
    public java.util.List<String> resourceGroupIdList;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

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
    public java.util.List<String> tagKeys;

    @NameInMap("TagList")
    public java.util.List<DescribeCostCheckAdvicesRequestTagList> tagList;

    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    public static DescribeCostCheckAdvicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckAdvicesRequest self = new DescribeCostCheckAdvicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckAdvicesRequest setAssumeAliyunIdList(java.util.List<Long> assumeAliyunIdList) {
        this.assumeAliyunIdList = assumeAliyunIdList;
        return this;
    }
    public java.util.List<Long> getAssumeAliyunIdList() {
        return this.assumeAliyunIdList;
    }

    public DescribeCostCheckAdvicesRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeCostCheckAdvicesRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public DescribeCostCheckAdvicesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeCostCheckAdvicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCostCheckAdvicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCostCheckAdvicesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public DescribeCostCheckAdvicesRequest setResourceGroupIdList(java.util.List<String> resourceGroupIdList) {
        this.resourceGroupIdList = resourceGroupIdList;
        return this;
    }
    public java.util.List<String> getResourceGroupIdList() {
        return this.resourceGroupIdList;
    }

    public DescribeCostCheckAdvicesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeCostCheckAdvicesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeCostCheckAdvicesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeCostCheckAdvicesRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public DescribeCostCheckAdvicesRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    public DescribeCostCheckAdvicesRequest setTagList(java.util.List<DescribeCostCheckAdvicesRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<DescribeCostCheckAdvicesRequestTagList> getTagList() {
        return this.tagList;
    }

    public DescribeCostCheckAdvicesRequest setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

    public static class DescribeCostCheckAdvicesRequestTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ecs_***_shanghai</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public java.util.List<String> tagValue;

        public static DescribeCostCheckAdvicesRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckAdvicesRequestTagList self = new DescribeCostCheckAdvicesRequestTagList();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckAdvicesRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCostCheckAdvicesRequestTagList setTagValue(java.util.List<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public java.util.List<String> getTagValue() {
            return this.tagValue;
        }

    }

}
