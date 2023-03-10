// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue extends TeaModel {
    @NameInMap("refund_rule_all_unused_list")
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList;

    @NameInMap("refund_rule_part_unused_list")
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList;

    @NameInMap("change_rule_in_unused_list")
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList;

    @NameInMap("change_rule_out_unused_list")
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList;

    public static DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue self = new DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue();
        return TeaModel.build(map, self);
    }

    public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setRefundRuleAllUnusedList(java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList) {
        this.refundRuleAllUnusedList = refundRuleAllUnusedList;
        return this;
    }
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> getRefundRuleAllUnusedList() {
        return this.refundRuleAllUnusedList;
    }

    public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setRefundRulePartUnusedList(java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList) {
        this.refundRulePartUnusedList = refundRulePartUnusedList;
        return this;
    }
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> getRefundRulePartUnusedList() {
        return this.refundRulePartUnusedList;
    }

    public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setChangeRuleInUnusedList(java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList) {
        this.changeRuleInUnusedList = changeRuleInUnusedList;
        return this;
    }
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> getChangeRuleInUnusedList() {
        return this.changeRuleInUnusedList;
    }

    public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setChangeRuleOutUnusedList(java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList) {
        this.changeRuleOutUnusedList = changeRuleOutUnusedList;
        return this;
    }
    public java.util.List<DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> getChangeRuleOutUnusedList() {
        return this.changeRuleOutUnusedList;
    }

    public static class DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList extends TeaModel {
        @NameInMap("type")
        public Integer type;

        @NameInMap("time_unit")
        public String timeUnit;

        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        @NameInMap("can_refund")
        public Boolean canRefund;

        @NameInMap("refund_fee")
        public Double refundFee;

        @NameInMap("can_return_all_tax")
        public Boolean canReturnAllTax;

        @NameInMap("return_part_tax_fee")
        public Double returnPartTaxFee;

        public static DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList self = new DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList extends TeaModel {
        @NameInMap("type")
        public Integer type;

        @NameInMap("time_unit")
        public String timeUnit;

        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        @NameInMap("can_refund")
        public Boolean canRefund;

        @NameInMap("refund_fee")
        public Double refundFee;

        @NameInMap("can_return_all_tax")
        public Boolean canReturnAllTax;

        @NameInMap("return_part_tax_fee")
        public Double returnPartTaxFee;

        public static DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList self = new DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList extends TeaModel {
        @NameInMap("type")
        public Integer type;

        @NameInMap("time_unit")
        public String timeUnit;

        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        @NameInMap("can_change")
        public Boolean canChange;

        @NameInMap("change_fee")
        public Double changeFee;

        public static DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList self = new DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

    public static class DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList extends TeaModel {
        @NameInMap("type")
        public Integer type;

        @NameInMap("time_unit")
        public String timeUnit;

        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        @NameInMap("can_change")
        public Boolean canChange;

        @NameInMap("change_fee")
        public Double changeFee;

        public static DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList self = new DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

}
