// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditDetailRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1782906240000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of plan packages or credit top-up packages.</p>
     */
    @NameInMap("PackageIds")
    public java.util.List<String> packageIds;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1782819840000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeCreditDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditDetailRequest self = new DescribeCreditDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreditDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeCreditDetailRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeCreditDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCreditDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCreditDetailRequest setPackageIds(java.util.List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    public DescribeCreditDetailRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public DescribeCreditDetailRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCreditDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
