// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTaskListRequest extends TeaModel {
    /**
     * <p>The validation result filter. Valid values:</p>
     * <ul>
     * <li>0: no record.</li>
     * <li>1: passed.</li>
     * <li>2: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkResult")
    public Integer checkResult;

    /**
     * <p>The validation type filter. Valid values:</p>
     * <ul>
     * <li>0: row count comparison.</li>
     * <li>1: metric comparison.</li>
     * <li>2: weak content comparison.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkType")
    public Integer checkType;

    /**
     * <p>The end of the creation time range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 10:00:00</p>
     */
    @NameInMap("createEndTime")
    public String createEndTime;

    /**
     * <p>The start of the creation time range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-16 00:00:00</p>
     */
    @NameInMap("createStartTime")
    public String createStartTime;

    /**
     * <p>The execution status filter. Valid values:</p>
     * <ul>
     * <li>0: pending.</li>
     * <li>1: running.</li>
     * <li>2: stopped.</li>
     * <li>3: failed.</li>
     * <li>4: completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("execStatus")
    public Integer execStatus;

    /**
     * <p>Specifies whether scheduling is enabled. Valid values:</p>
     * <ul>
     * <li>0: disabled.</li>
     * <li>1: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("isScheduled")
    public Integer isScheduled;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The task name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>data_check_task_demo</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The validation template name. Fuzzy match is supported. The server automatically converts the name into a list of template IDs for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>Row Count Validation Template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The end of the update time range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-14 13:59:03</p>
     */
    @NameInMap("updateEndTime")
    public String updateEndTime;

    /**
     * <p>The start of the update time range. Format: YYYY-MM-DD HH:MM:SS.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-14 11:21:53</p>
     */
    @NameInMap("updateStartTime")
    public String updateStartTime;

    public static GetDataCheckTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTaskListRequest self = new GetDataCheckTaskListRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTaskListRequest setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public Integer getCheckResult() {
        return this.checkResult;
    }

    public GetDataCheckTaskListRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public GetDataCheckTaskListRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public GetDataCheckTaskListRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public GetDataCheckTaskListRequest setExecStatus(Integer execStatus) {
        this.execStatus = execStatus;
        return this;
    }
    public Integer getExecStatus() {
        return this.execStatus;
    }

    public GetDataCheckTaskListRequest setIsScheduled(Integer isScheduled) {
        this.isScheduled = isScheduled;
        return this;
    }
    public Integer getIsScheduled() {
        return this.isScheduled;
    }

    public GetDataCheckTaskListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetDataCheckTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDataCheckTaskListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetDataCheckTaskListRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetDataCheckTaskListRequest setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public GetDataCheckTaskListRequest setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

}
