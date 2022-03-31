// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowInstanceRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    @NameInMap("Tid")
    public Long tid;

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
