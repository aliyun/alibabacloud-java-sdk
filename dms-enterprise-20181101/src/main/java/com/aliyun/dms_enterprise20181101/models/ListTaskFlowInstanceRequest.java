// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowInstanceRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **ListTaskFlowInstance**.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the ID of the task flow.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    /**
     * <p>The ID of the task flow.</p>
     */
    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    /**
     * <p>The ID of the execution record.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The business time of the task flow. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
     */
    @NameInMap("TriggerType")
    public Integer triggerType;

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

}
