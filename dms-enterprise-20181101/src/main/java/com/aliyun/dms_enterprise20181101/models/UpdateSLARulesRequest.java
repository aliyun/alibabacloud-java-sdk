// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateSLARulesRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The list of SLA rules.</p>
     */
    @NameInMap("SlaRuleList")
    public java.util.List<UpdateSLARulesRequestSlaRuleList> slaRuleList;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> :To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
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
        /**
         * <p>The ID of the task flow.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The timeout period. Unit: minutes.</p>
         */
        @NameInMap("IntervalMinutes")
        public Integer intervalMinutes;

        /**
         * <p>The ID of the task node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The rule type. Valid values:</p>
         * <br>
         * <p>*   **0**: SLA rules for task flows</p>
         * <p>*   **1**: SLA rules for nodes</p>
         */
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
