// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BackFillShrinkRequest extends TeaModel {
    /**
     * <p>The running sequence of task flows for data backfill. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: reverse chronological order.</li>
     * <li><strong>1</strong>: chronological order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The date for the data to be backfilled. This parameter is required if you specify a date for data backfill.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14</p>
     */
    @NameInMap("BackFillDate")
    public String backFillDate;

    /**
     * <p>The start date of the date range for the data to be backfilled. This parameter is required if you specify a date range for data backfill.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14</p>
     */
    @NameInMap("BackFillDateBegin")
    public String backFillDateBegin;

    /**
     * <p>The end date of the date range for the data to be backfilled. This parameter is required if you specify a date range for data backfill.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-29</p>
     */
    @NameInMap("BackFillDateEnd")
    public String backFillDateEnd;

    /**
     * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15***</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>Filter condition, which specifies the list of node IDs in the task flow that do not need to supplement data.</p>
     */
    @NameInMap("FilterNodeIds")
    public String filterNodeIdsShrink;

    /**
     * <p>The ID of the historical task flow.</p>
     * 
     * <strong>example:</strong>
     * <p>16***</p>
     */
    @NameInMap("HistoryDagId")
    public Long historyDagId;

    /**
     * <p>The interval at which data backfill is performed. Unit: hours. Minimum value: 1. Default value: 24.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>Specifies whether to run descendant nodes. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTriggerSubTree")
    public Boolean isTriggerSubTree;

    /**
     * <p>The number of nodes for which you want to backfill data.</p>
     */
    @NameInMap("StartNodeIds")
    public String startNodeIdsShrink;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
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

    public BackFillShrinkRequest setFilterNodeIdsShrink(String filterNodeIdsShrink) {
        this.filterNodeIdsShrink = filterNodeIdsShrink;
        return this;
    }
    public String getFilterNodeIdsShrink() {
        return this.filterNodeIdsShrink;
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
