// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListScanTasksByTargetRequest extends TeaModel {
    /**
     * <p>The page number, starting from 1. Values less than 1 are normalized to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100. Values greater than 100 are clamped to 100. Values less than 1 return HTTP status code 400.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Filters by detection intensity. If this parameter is not specified, no filtering by intensity is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SampleLevel")
    public String sampleLevel;

    /**
     * <p>Filters by scan type. If this parameter is not specified, tasks of all scan types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>attack</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The unique identifier of the scan target. Only tasks under this target are queried. If the target does not exist or does not belong to the current tenant, HTTP status code 400 is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>target-abc123def4567</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>Filters by task status. If this parameter is not specified, tasks in all statuses are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static ListScanTasksByTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScanTasksByTargetRequest self = new ListScanTasksByTargetRequest();
        return TeaModel.build(map, self);
    }

    public ListScanTasksByTargetRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListScanTasksByTargetRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListScanTasksByTargetRequest setSampleLevel(String sampleLevel) {
        this.sampleLevel = sampleLevel;
        return this;
    }
    public String getSampleLevel() {
        return this.sampleLevel;
    }

    public ListScanTasksByTargetRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public ListScanTasksByTargetRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListScanTasksByTargetRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
