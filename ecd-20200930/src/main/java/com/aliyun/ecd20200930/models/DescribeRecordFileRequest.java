// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordFileRequest extends TeaModel {
    /**
     * <p>The Cloud Desktop ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-7w78ozhjcwa3u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The end time of the query. Format: yyyyMMddHHmmss.</p>
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
     * <p>The field used for sorting. If this parameter is not specified, the results are sorted by recording start time in descending order. Valid values:</p>
     * <ul>
     * <li>startTime: recording start time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>asc: ascending order.</li>
     * <li>desc: descending order.</li>
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
     * <p>The maximum number of rows per page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the screen recording file. Valid values:</p>
     * <ul>
     * <li>alltime: full-time recording.</li>
     * <li>period: interval recording.</li>
     * <li>event: event-based recording.</li>
     * <li>session: session recording.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alltime</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_DESKTOP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start time of the query. Format: yyyyMMddHHmmss.</p>
     * 
     * <strong>example:</strong>
     * <p>20251218175715</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the screen recording file. Valid values:</p>
     * <ul>
     * <li>0: uploaded.</li>
     * <li>1: uploading.</li>
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
