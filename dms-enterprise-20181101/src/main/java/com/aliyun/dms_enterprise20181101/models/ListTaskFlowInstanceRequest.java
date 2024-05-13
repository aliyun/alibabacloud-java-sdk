// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](https://help.aliyun.com/document_detail/424565.html) or [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to obtain the ID of the task flow.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.</p>
     */
    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    /**
     * <p>The end of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.</p>
     */
    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    /**
     * <p>The running status of the task node. Valid values:</p>
     * <br>
     * <p>- **0**: Waiting for scheduling</p>
     * <br>
     * <p>- **1**: Running</p>
     * <br>
     * <p>- **2**: Suspend</p>
     * <br>
     * <p>- **3**: Failed to run</p>
     * <br>
     * <p>- **4**: Run successfully</p>
     * <br>
     * <p>- **5**: Completed</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The mode in which the task flow is triggered. Valid values:</p>
     * <br>
     * <p>*   **0**: The task flow is automatically triggered based on periodic scheduling.</p>
     * <p>*   **1**: The task flow is manually triggered.</p>
     */
    @NameInMap("TriggerType")
    public Integer triggerType;

    /**
     * <p>Adjust filter conditions:</p>
     * <br>
     * <p>- true: StartTimeBegin and StartTimeEnd are the time range for filtering services.</p>
     * <br>
     * <p>- false: StartTimeBegin and StartTimeEnd are the time range for the task to run.</p>
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
