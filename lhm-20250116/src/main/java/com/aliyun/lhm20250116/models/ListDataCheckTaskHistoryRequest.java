// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckTaskHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the validation job.</p>
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
     * <p>The end of the job creation time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 10:00:00</p>
     */
    @NameInMap("createEndTime")
    public String createEndTime;

    /**
     * <p>The start of the job creation time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 00:00:00</p>
     */
    @NameInMap("createStartTime")
    public String createStartTime;

    /**
     * <p>The end of the execution start time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 12:00:00</p>
     */
    @NameInMap("execEndTime")
    public String execEndTime;

    /**
     * <p>The start of the execution start time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 10:00:00</p>
     */
    @NameInMap("execStartTime")
    public String execStartTime;

    /**
     * <p>Filters by execution status. Valid values:</p>
     * <ul>
     * <li>0: Pending.</li>
     * <li>1: Running.</li>
     * <li>2: Stopped.</li>
     * <li>3: Failed.</li>
     * <li>4: Completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("execStatus")
    public Integer execStatus;

    /**
     * <p>The end of the execution end time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 12:30:00</p>
     */
    @NameInMap("finishEndTime")
    public String finishEndTime;

    /**
     * <p>The start of the execution end time filter range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 10:30:00</p>
     */
    @NameInMap("finishStartTime")
    public String finishStartTime;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the data validation task.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static ListDataCheckTaskHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckTaskHistoryRequest self = new ListDataCheckTaskHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCheckTaskHistoryRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public ListDataCheckTaskHistoryRequest setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public Integer getCheckResult() {
        return this.checkResult;
    }

    public ListDataCheckTaskHistoryRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public ListDataCheckTaskHistoryRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public ListDataCheckTaskHistoryRequest setExecEndTime(String execEndTime) {
        this.execEndTime = execEndTime;
        return this;
    }
    public String getExecEndTime() {
        return this.execEndTime;
    }

    public ListDataCheckTaskHistoryRequest setExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
        return this;
    }
    public String getExecStartTime() {
        return this.execStartTime;
    }

    public ListDataCheckTaskHistoryRequest setExecStatus(Integer execStatus) {
        this.execStatus = execStatus;
        return this;
    }
    public Integer getExecStatus() {
        return this.execStatus;
    }

    public ListDataCheckTaskHistoryRequest setFinishEndTime(String finishEndTime) {
        this.finishEndTime = finishEndTime;
        return this;
    }
    public String getFinishEndTime() {
        return this.finishEndTime;
    }

    public ListDataCheckTaskHistoryRequest setFinishStartTime(String finishStartTime) {
        this.finishStartTime = finishStartTime;
        return this;
    }
    public String getFinishStartTime() {
        return this.finishStartTime;
    }

    public ListDataCheckTaskHistoryRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckTaskHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckTaskHistoryRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
