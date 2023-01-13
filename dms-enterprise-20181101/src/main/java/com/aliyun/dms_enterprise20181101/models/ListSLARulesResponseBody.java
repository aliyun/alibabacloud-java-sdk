// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSLARulesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of SLA rules.</p>
     */
    @NameInMap("SLARuleList")
    public ListSLARulesResponseBodySLARuleList SLARuleList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSLARulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSLARulesResponseBody self = new ListSLARulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSLARulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSLARulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSLARulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSLARulesResponseBody setSLARuleList(ListSLARulesResponseBodySLARuleList SLARuleList) {
        this.SLARuleList = SLARuleList;
        return this;
    }
    public ListSLARulesResponseBodySLARuleList getSLARuleList() {
        return this.SLARuleList;
    }

    public ListSLARulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSLARulesResponseBodySLARuleListSLARule extends TeaModel {
        /**
         * <p>The ID of the task flow.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The ID of the SLA rule.</p>
         */
        @NameInMap("Id")
        public Long id;

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
         * <p>The type of the rule. Valid values:</p>
         * <br>
         * <p>*   **0**: an SLA rule for a task flow</p>
         * <p>*   **1**: an SLA rule for a task node</p>
         */
        @NameInMap("RuleType")
        public Integer ruleType;

        public static ListSLARulesResponseBodySLARuleListSLARule build(java.util.Map<String, ?> map) throws Exception {
            ListSLARulesResponseBodySLARuleListSLARule self = new ListSLARulesResponseBodySLARuleListSLARule();
            return TeaModel.build(map, self);
        }

        public ListSLARulesResponseBodySLARuleListSLARule setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListSLARulesResponseBodySLARuleListSLARule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSLARulesResponseBodySLARuleListSLARule setIntervalMinutes(Integer intervalMinutes) {
            this.intervalMinutes = intervalMinutes;
            return this;
        }
        public Integer getIntervalMinutes() {
            return this.intervalMinutes;
        }

        public ListSLARulesResponseBodySLARuleListSLARule setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListSLARulesResponseBodySLARuleListSLARule setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

    }

    public static class ListSLARulesResponseBodySLARuleList extends TeaModel {
        @NameInMap("SLARule")
        public java.util.List<ListSLARulesResponseBodySLARuleListSLARule> SLARule;

        public static ListSLARulesResponseBodySLARuleList build(java.util.Map<String, ?> map) throws Exception {
            ListSLARulesResponseBodySLARuleList self = new ListSLARulesResponseBodySLARuleList();
            return TeaModel.build(map, self);
        }

        public ListSLARulesResponseBodySLARuleList setSLARule(java.util.List<ListSLARulesResponseBodySLARuleListSLARule> SLARule) {
            this.SLARule = SLARule;
            return this;
        }
        public java.util.List<ListSLARulesResponseBodySLARuleListSLARule> getSLARule() {
            return this.SLARule;
        }

    }

}
