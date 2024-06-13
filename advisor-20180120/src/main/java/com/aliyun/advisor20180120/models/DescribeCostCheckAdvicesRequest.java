// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckAdvicesRequest extends TeaModel {
    @NameInMap("AssumeAliyunIdList")
    public java.util.List<Long> assumeAliyunIdList;

    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("Language")
    public String language;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

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

    public DescribeCostCheckAdvicesRequest setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

}
