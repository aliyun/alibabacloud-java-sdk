// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaBasicInfosRequest extends TeaModel {
    // 媒资业务类型
    @NameInMap("BusinessType")
    public String businessType;

    // 分类
    @NameInMap("Category")
    public String category;

    // 结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 返回值中是否包含文件基础信息
    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    // 分页大小
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 媒资媒体类型
    @NameInMap("MediaType")
    public String mediaType;

    // 页号
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    // 排序
    @NameInMap("SortBy")
    public String sortBy;

    // 来源
    @NameInMap("Source")
    public String source;

    // 创建时间
    @NameInMap("StartTime")
    public String startTime;

    // 资源状态
    @NameInMap("Status")
    public String status;

    public static ListMediaBasicInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaBasicInfosRequest self = new ListMediaBasicInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaBasicInfosRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ListMediaBasicInfosRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListMediaBasicInfosRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListMediaBasicInfosRequest setIncludeFileBasicInfo(Boolean includeFileBasicInfo) {
        this.includeFileBasicInfo = includeFileBasicInfo;
        return this;
    }
    public Boolean getIncludeFileBasicInfo() {
        return this.includeFileBasicInfo;
    }

    public ListMediaBasicInfosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaBasicInfosRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListMediaBasicInfosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaBasicInfosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListMediaBasicInfosRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListMediaBasicInfosRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListMediaBasicInfosRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListMediaBasicInfosRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
