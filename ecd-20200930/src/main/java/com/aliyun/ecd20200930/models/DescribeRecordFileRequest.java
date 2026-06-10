// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordFileRequest extends TeaModel {
    /**
     * <p>The ID of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-7w78ozhjcwa3u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>20251218205715</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The name of the recording file.</p>
     * 
     * <strong>example:</strong>
     * <p>Task7</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The sorting basis. If you do not specify this parameter, the results are sorted by screen recording start time in descending order. Valid value:</p>
     * <ul>
     * <li><code>startTime</code>: the start time of a screen recording.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><p><code>asc</code>: ascending</p>
     * </li>
     * <li><p><code>desc</code>: descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderSort")
    public String orderSort;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the screen recording. Valid values:</p>
     * <ul>
     * <li><p><code>alltime</code>: full-time recording</p>
     * </li>
     * <li><p><code>period</code>: recording at intervals</p>
     * </li>
     * <li><p><code>event</code>: event-triggered recording</p>
     * </li>
     * <li><p><code>session</code>: session-based recording</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alltime</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions that are supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>20251218175715</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the screen recording file. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: The file is uploaded.</p>
     * </li>
     * <li><p><code>1</code>: The file is being uploaded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeRecordFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordFileRequest self = new DescribeRecordFileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordFileRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeRecordFileRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRecordFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeRecordFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeRecordFileRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeRecordFileRequest setOrderSort(String orderSort) {
        this.orderSort = orderSort;
        return this;
    }
    public String getOrderSort() {
        return this.orderSort;
    }

    public DescribeRecordFileRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordFileRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordFileRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public DescribeRecordFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRecordFileRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeRecordFileRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRecordFileRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
