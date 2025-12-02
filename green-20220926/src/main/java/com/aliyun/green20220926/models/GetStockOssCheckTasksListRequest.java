// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetStockOssCheckTasksListRequest extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>End time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-18 02:08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Whether it is a scheduled scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsInc")
    public Boolean isInc;

    /**
     * <p>Media type.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("MediaType")
    public Integer mediaType;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Sort field.</p>
     */
    @NameInMap("Sort")
    public java.util.Map<String, String> sort;

    /**
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-17 02:08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Task type.</p>
     * 
     * <strong>example:</strong>
     * <p>batch</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetStockOssCheckTasksListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStockOssCheckTasksListRequest self = new GetStockOssCheckTasksListRequest();
        return TeaModel.build(map, self);
    }

    public GetStockOssCheckTasksListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetStockOssCheckTasksListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetStockOssCheckTasksListRequest setIsInc(Boolean isInc) {
        this.isInc = isInc;
        return this;
    }
    public Boolean getIsInc() {
        return this.isInc;
    }

    public GetStockOssCheckTasksListRequest setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public Integer getMediaType() {
        return this.mediaType;
    }

    public GetStockOssCheckTasksListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetStockOssCheckTasksListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStockOssCheckTasksListRequest setSort(java.util.Map<String, String> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.Map<String, String> getSort() {
        return this.sort;
    }

    public GetStockOssCheckTasksListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetStockOssCheckTasksListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
