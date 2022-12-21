// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BackFillShrinkRequest extends TeaModel {
    // The running sequence of task flows for data backfill. Valid values:
    // 
    // *   **0**: reverse chronological order.
    // *   **1**: chronological order. This is the default value.
    @NameInMap("Asc")
    public Boolean asc;

    // The date for the data to be backfilled. This parameter is required if you specify a date for data backfill.
    @NameInMap("BackFillDate")
    public String backFillDate;

    // The start date of the date range for the data to be backfilled. This parameter is required if you specify a date range for data backfill.
    @NameInMap("BackFillDateBegin")
    public String backFillDateBegin;

    // The end date of the date range for the data to be backfilled. This parameter is required if you specify a date range for data backfill.
    @NameInMap("BackFillDateEnd")
    public String backFillDateEnd;

    // The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
    @NameInMap("DagId")
    public Long dagId;

    // The ID of the historical task flow.
    @NameInMap("HistoryDagId")
    public Long historyDagId;

    // The interval at which data backfill is performed. Unit: hours. Minimum value: 1. Default value: 24.
    @NameInMap("Interval")
    public Integer interval;

    // Specifies whether to run descendant nodes. Default value: true.
    @NameInMap("IsTriggerSubTree")
    public Boolean isTriggerSubTree;

    // The number of nodes for which you want to backfill data.
    @NameInMap("StartNodeIds")
    public String startNodeIdsShrink;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
    @NameInMap("Tid")
    public Long tid;

    public static BackFillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BackFillShrinkRequest self = new BackFillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BackFillShrinkRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public BackFillShrinkRequest setBackFillDate(String backFillDate) {
        this.backFillDate = backFillDate;
        return this;
    }
    public String getBackFillDate() {
        return this.backFillDate;
    }

    public BackFillShrinkRequest setBackFillDateBegin(String backFillDateBegin) {
        this.backFillDateBegin = backFillDateBegin;
        return this;
    }
    public String getBackFillDateBegin() {
        return this.backFillDateBegin;
    }

    public BackFillShrinkRequest setBackFillDateEnd(String backFillDateEnd) {
        this.backFillDateEnd = backFillDateEnd;
        return this;
    }
    public String getBackFillDateEnd() {
        return this.backFillDateEnd;
    }

    public BackFillShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public BackFillShrinkRequest setHistoryDagId(Long historyDagId) {
        this.historyDagId = historyDagId;
        return this;
    }
    public Long getHistoryDagId() {
        return this.historyDagId;
    }

    public BackFillShrinkRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public BackFillShrinkRequest setIsTriggerSubTree(Boolean isTriggerSubTree) {
        this.isTriggerSubTree = isTriggerSubTree;
        return this;
    }
    public Boolean getIsTriggerSubTree() {
        return this.isTriggerSubTree;
    }

    public BackFillShrinkRequest setStartNodeIdsShrink(String startNodeIdsShrink) {
        this.startNodeIdsShrink = startNodeIdsShrink;
        return this;
    }
    public String getStartNodeIdsShrink() {
        return this.startNodeIdsShrink;
    }

    public BackFillShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
