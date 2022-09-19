// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BackFillRequest extends TeaModel {
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
    public java.util.List<Long> startNodeIds;

    @NameInMap("Tid")
    public Long tid;

    public static BackFillRequest build(java.util.Map<String, ?> map) throws Exception {
        BackFillRequest self = new BackFillRequest();
        return TeaModel.build(map, self);
    }

    public BackFillRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public BackFillRequest setBackFillDate(String backFillDate) {
        this.backFillDate = backFillDate;
        return this;
    }
    public String getBackFillDate() {
        return this.backFillDate;
    }

    public BackFillRequest setBackFillDateBegin(String backFillDateBegin) {
        this.backFillDateBegin = backFillDateBegin;
        return this;
    }
    public String getBackFillDateBegin() {
        return this.backFillDateBegin;
    }

    public BackFillRequest setBackFillDateEnd(String backFillDateEnd) {
        this.backFillDateEnd = backFillDateEnd;
        return this;
    }
    public String getBackFillDateEnd() {
        return this.backFillDateEnd;
    }

    public BackFillRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public BackFillRequest setHistoryDagId(Long historyDagId) {
        this.historyDagId = historyDagId;
        return this;
    }
    public Long getHistoryDagId() {
        return this.historyDagId;
    }

    public BackFillRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public BackFillRequest setIsTriggerSubTree(Boolean isTriggerSubTree) {
        this.isTriggerSubTree = isTriggerSubTree;
        return this;
    }
    public Boolean getIsTriggerSubTree() {
        return this.isTriggerSubTree;
    }

    public BackFillRequest setStartNodeIds(java.util.List<Long> startNodeIds) {
        this.startNodeIds = startNodeIds;
        return this;
    }
    public java.util.List<Long> getStartNodeIds() {
        return this.startNodeIds;
    }

    public BackFillRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
