// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportRequest extends TeaModel {
    /**
     * <p>The validation job (batch) ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    /**
     * <p>Filters by validation result. Valid values:</p>
     * <ul>
     * <li>0: No records.</li>
     * <li>1: Passed.</li>
     * <li>2: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkResult")
    public Integer checkResult;

    /**
     * <p>Filters by job status. Valid values:</p>
     * <ul>
     * <li>0: INIT (pending).</li>
     * <li>1: RUNNING (running).</li>
     * <li>2: FINISHED (completed).</li>
     * <li>3: STOPPED (stopped).</li>
     * <li>4: FAIL (failed).</li>
     * <li>6: READY (ready).</li>
     * <li>7: SKIPPED (skipped).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("jobStatus")
    public Integer jobStatus;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The table name to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>dim_func_with_diff_area_data_d</p>
     */
    @NameInMap("tableName")
    public String tableName;

    public static ListDataCheckReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportRequest self = new ListDataCheckReportRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public ListDataCheckReportRequest setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public Integer getCheckResult() {
        return this.checkResult;
    }

    public ListDataCheckReportRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ListDataCheckReportRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckReportRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
