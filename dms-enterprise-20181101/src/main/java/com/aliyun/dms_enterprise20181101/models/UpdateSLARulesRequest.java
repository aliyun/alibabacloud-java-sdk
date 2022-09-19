// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateSLARulesRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("SlaRuleList")
    public java.util.List<UpdateSLARulesRequestSlaRuleList> slaRuleList;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateSLARulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSLARulesRequest self = new UpdateSLARulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSLARulesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateSLARulesRequest setSlaRuleList(java.util.List<UpdateSLARulesRequestSlaRuleList> slaRuleList) {
        this.slaRuleList = slaRuleList;
        return this;
    }
    public java.util.List<UpdateSLARulesRequestSlaRuleList> getSlaRuleList() {
        return this.slaRuleList;
    }

    public UpdateSLARulesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class UpdateSLARulesRequestSlaRuleList extends TeaModel {
        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("IntervalMinutes")
        public Integer intervalMinutes;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("Type")
        public Integer type;

        public static UpdateSLARulesRequestSlaRuleList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSLARulesRequestSlaRuleList self = new UpdateSLARulesRequestSlaRuleList();
            return TeaModel.build(map, self);
        }

        public UpdateSLARulesRequestSlaRuleList setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public UpdateSLARulesRequestSlaRuleList setIntervalMinutes(Integer intervalMinutes) {
            this.intervalMinutes = intervalMinutes;
            return this;
        }
        public Integer getIntervalMinutes() {
            return this.intervalMinutes;
        }

        public UpdateSLARulesRequestSlaRuleList setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public UpdateSLARulesRequestSlaRuleList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
