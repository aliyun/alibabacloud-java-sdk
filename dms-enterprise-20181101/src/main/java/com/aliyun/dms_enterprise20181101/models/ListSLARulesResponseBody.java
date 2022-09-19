// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSLARulesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SLARuleList")
    public ListSLARulesResponseBodySLARuleList SLARuleList;

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
        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IntervalMinutes")
        public Integer intervalMinutes;

        @NameInMap("NodeId")
        public Long nodeId;

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
