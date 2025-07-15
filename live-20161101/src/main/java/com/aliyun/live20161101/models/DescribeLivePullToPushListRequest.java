// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullToPushListRequest extends TeaModel {
    /**
     * <p>The destination URL. Fuzzy search is performed based on the destination URL.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://qd</p>
     */
    @NameInMap("DstUrl")
    public String dstUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <blockquote>
     * <p> The value must be greater than 0 and not greater than the maximum value of the Integer data type. Default value: 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <blockquote>
     * <p> Valid values: [1,100]. Default value: 10.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region of the live center. Valid values:</p>
     * <ul>
     * <li>ap-southeast-1: Singapore</li>
     * <li>ap-southeast-5: Indonesia (Jakarta)</li>
     * <li>cn-beijing: China (Beijing)</li>
     * <li>cn-shanghai: China (Shanghai)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task ID. Fuzzy search is performed based on the task ID.</p>
     * <blockquote>
     * <p> The ID can be up to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>861009</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task name. Fuzzy search is performed based on the task name.</p>
     * 
     * <strong>example:</strong>
     * <p>task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeLivePullToPushListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullToPushListRequest self = new DescribeLivePullToPushListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullToPushListRequest setDstUrl(String dstUrl) {
        this.dstUrl = dstUrl;
        return this;
    }
    public String getDstUrl() {
        return this.dstUrl;
    }

    public DescribeLivePullToPushListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLivePullToPushListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLivePullToPushListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLivePullToPushListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLivePullToPushListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLivePullToPushListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeLivePullToPushListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
