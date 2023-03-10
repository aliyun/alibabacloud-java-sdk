// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue extends TeaModel {
    @NameInMap("refund_rule_all_unused_list")
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList;

    @NameInMap("refund_rule_part_unused_list")
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList;

    @NameInMap("change_rule_in_unused_list")
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList;

    @NameInMap("change_rule_out_unused_list")
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList;

    public static DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue self = new DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue();
        return TeaModel.build(map, self);
    }

    public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setRefundRuleAllUnusedList(java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList) {
        this.refundRuleAllUnusedList = refundRuleAllUnusedList;
        return this;
    }
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> getRefundRuleAllUnusedList() {
        return this.refundRuleAllUnusedList;
    }

    public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setRefundRulePartUnusedList(java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList) {
        this.refundRulePartUnusedList = refundRulePartUnusedList;
        return this;
    }
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> getRefundRulePartUnusedList() {
        return this.refundRulePartUnusedList;
    }

    public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setChangeRuleInUnusedList(java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList) {
        this.changeRuleInUnusedList = changeRuleInUnusedList;
        return this;
    }
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> getChangeRuleInUnusedList() {
        return this.changeRuleInUnusedList;
    }

    public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setChangeRuleOutUnusedList(java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList) {
        this.changeRuleOutUnusedList = changeRuleOutUnusedList;
        return this;
    }
    public java.util.List<DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> getChangeRuleOutUnusedList() {
        return this.changeRuleOutUnusedList;
    }

    public static class DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList extends TeaModel {
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

        public static DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList self = new DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList extends TeaModel {
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

        public static DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList self = new DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList extends TeaModel {
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

        public static DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList self = new DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

    public static class DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList extends TeaModel {
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

        public static DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList self = new DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

}
