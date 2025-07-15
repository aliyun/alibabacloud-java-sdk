// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamPreloadTasksRequest extends TeaModel {
    /**
     * <p>The streaming domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2016-06-30T19:00:00Z. The interval between the start time and end time cannot exceed three days.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-30T19:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The streaming URL. You can specify up to 100 streaming URLs in a request. Separate multiple streaming URLs with commas (,).</p>
     */
    @NameInMap("PlayUrl")
    public String playUrl;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2016-06-29T19:00:00Z. You can query only data in the previous three days.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T19:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the prefetch task. Valid values:</p>
     * <ul>
     * <li>complete</li>
     * <li>pending</li>
     * <li>preloading</li>
     * <li>failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the prefetch task. The task ID is returned when you call the <a href="https://help.aliyun.com/document_detail/2519938.html">SetLiveStreamPreloadTasks</a> operation to configure the prefetch task.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeLiveStreamPreloadTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamPreloadTasksRequest self = new DescribeLiveStreamPreloadTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamPreloadTasksRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamPreloadTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamPreloadTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamPreloadTasksRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamPreloadTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamPreloadTasksRequest setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
        return this;
    }
    public String getPlayUrl() {
        return this.playUrl;
    }

    public DescribeLiveStreamPreloadTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamPreloadTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamPreloadTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLiveStreamPreloadTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
