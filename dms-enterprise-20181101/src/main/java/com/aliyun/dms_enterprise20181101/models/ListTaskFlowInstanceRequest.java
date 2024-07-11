// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to obtain the ID of the task flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7***</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-07</p>
     */
    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    /**
     * <p>The end of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-08</p>
     */
    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    /**
     * <p>The running status of the task node. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Waiting for scheduling</p>
     * </li>
     * <li><p><strong>1</strong>: Running</p>
     * </li>
     * <li><p><strong>2</strong>: Suspend</p>
     * </li>
     * <li><p><strong>3</strong>: Failed to run</p>
     * </li>
     * <li><p><strong>4</strong>: Run successfully</p>
     * </li>
     * <li><p><strong>5</strong>: Completed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The mode in which the task flow is triggered. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The task flow is automatically triggered based on periodic scheduling.</li>
     * <li><strong>1</strong>: The task flow is manually triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TriggerType")
    public Integer triggerType;

    /**
     * <p>Adjust filter conditions:</p>
     * <ul>
     * <li><p>true: StartTimeBegin and StartTimeEnd are the time range for filtering services.</p>
     * </li>
     * <li><p>false: StartTimeBegin and StartTimeEnd are the time range for the task to run.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseBizDate")
    public Boolean useBizDate;

    public static ListTaskFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowInstanceRequest self = new ListTaskFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowInstanceRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTaskFlowInstanceRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskFlowInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskFlowInstanceRequest setStartTimeBegin(String startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
        return this;
    }
    public String getStartTimeBegin() {
        return this.startTimeBegin;
    }

    public ListTaskFlowInstanceRequest setStartTimeEnd(String startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }
    public String getStartTimeEnd() {
        return this.startTimeEnd;
    }

    public ListTaskFlowInstanceRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListTaskFlowInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListTaskFlowInstanceRequest setTriggerType(Integer triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public Integer getTriggerType() {
        return this.triggerType;
    }

    public ListTaskFlowInstanceRequest setUseBizDate(Boolean useBizDate) {
        this.useBizDate = useBizDate;
        return this;
    }
    public Boolean getUseBizDate() {
        return this.useBizDate;
    }

}
