// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkResult")
    public Integer checkResult;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("jobStatus")
    public Integer jobStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
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
