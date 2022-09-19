// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BackFillShrinkRequest extends TeaModel {
    @NameInMap("Asc")
    public Boolean asc;

    @NameInMap("BackFillDate")
    public String backFillDate;

    @NameInMap("BackFillDateBegin")
    public String backFillDateBegin;

    @NameInMap("BackFillDateEnd")
    public String backFillDateEnd;

    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("HistoryDagId")
    public Long historyDagId;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IsTriggerSubTree")
    public Boolean isTriggerSubTree;

    @NameInMap("StartNodeIds")
    public String startNodeIdsShrink;

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
