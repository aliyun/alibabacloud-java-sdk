// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDefaultSLARulesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SLARuleList")
    public ListDefaultSLARulesResponseBodySLARuleList SLARuleList;

    @NameInMap("Success")
    public Boolean success;

    public static ListDefaultSLARulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultSLARulesResponseBody self = new ListDefaultSLARulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDefaultSLARulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDefaultSLARulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDefaultSLARulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDefaultSLARulesResponseBody setSLARuleList(ListDefaultSLARulesResponseBodySLARuleList SLARuleList) {
        this.SLARuleList = SLARuleList;
        return this;
    }
    public ListDefaultSLARulesResponseBodySLARuleList getSLARuleList() {
        return this.SLARuleList;
    }

    public ListDefaultSLARulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDefaultSLARulesResponseBodySLARuleListSLARule extends TeaModel {
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

        public static ListDefaultSLARulesResponseBodySLARuleListSLARule build(java.util.Map<String, ?> map) throws Exception {
            ListDefaultSLARulesResponseBodySLARuleListSLARule self = new ListDefaultSLARulesResponseBodySLARuleListSLARule();
            return TeaModel.build(map, self);
        }

        public ListDefaultSLARulesResponseBodySLARuleListSLARule setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListDefaultSLARulesResponseBodySLARuleListSLARule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDefaultSLARulesResponseBodySLARuleListSLARule setIntervalMinutes(Integer intervalMinutes) {
            this.intervalMinutes = intervalMinutes;
            return this;
        }
        public Integer getIntervalMinutes() {
            return this.intervalMinutes;
        }

        public ListDefaultSLARulesResponseBodySLARuleListSLARule setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListDefaultSLARulesResponseBodySLARuleListSLARule setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

    }

    public static class ListDefaultSLARulesResponseBodySLARuleList extends TeaModel {
        @NameInMap("SLARule")
        public java.util.List<ListDefaultSLARulesResponseBodySLARuleListSLARule> SLARule;

        public static ListDefaultSLARulesResponseBodySLARuleList build(java.util.Map<String, ?> map) throws Exception {
            ListDefaultSLARulesResponseBodySLARuleList self = new ListDefaultSLARulesResponseBodySLARuleList();
            return TeaModel.build(map, self);
        }

        public ListDefaultSLARulesResponseBodySLARuleList setSLARule(java.util.List<ListDefaultSLARulesResponseBodySLARuleListSLARule> SLARule) {
            this.SLARule = SLARule;
            return this;
        }
        public java.util.List<ListDefaultSLARulesResponseBodySLARuleListSLARule> getSLARule() {
            return this.SLARule;
        }

    }

}
