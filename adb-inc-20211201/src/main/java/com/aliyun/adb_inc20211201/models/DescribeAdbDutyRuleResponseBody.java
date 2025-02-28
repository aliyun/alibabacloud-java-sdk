// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbDutyRuleResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeAdbDutyRuleResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAdbDutyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbDutyRuleResponseBody self = new DescribeAdbDutyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbDutyRuleResponseBody setItems(java.util.List<DescribeAdbDutyRuleResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAdbDutyRuleResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAdbDutyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff extends TeaModel {
        @NameInMap("NickName")
        public String nickName;

        @NameInMap("WorkerNo")
        public String workerNo;

        public static DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff self = new DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff();
            return TeaModel.build(map, self);
        }

        public DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff setWorkerNo(String workerNo) {
            this.workerNo = workerNo;
            return this;
        }
        public String getWorkerNo() {
            return this.workerNo;
        }

    }

    public static class DescribeAdbDutyRuleResponseBodyItems extends TeaModel {
        @NameInMap("CurrentDutyStaff")
        public java.util.List<DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff> currentDutyStaff;

        @NameInMap("RuleCode")
        public String ruleCode;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeAdbDutyRuleResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbDutyRuleResponseBodyItems self = new DescribeAdbDutyRuleResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAdbDutyRuleResponseBodyItems setCurrentDutyStaff(java.util.List<DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff> currentDutyStaff) {
            this.currentDutyStaff = currentDutyStaff;
            return this;
        }
        public java.util.List<DescribeAdbDutyRuleResponseBodyItemsCurrentDutyStaff> getCurrentDutyStaff() {
            return this.currentDutyStaff;
        }

        public DescribeAdbDutyRuleResponseBodyItems setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public DescribeAdbDutyRuleResponseBodyItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
