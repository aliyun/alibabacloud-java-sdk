// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue extends TeaModel {
    @NameInMap("refund_rule_all_unused_list")
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList;

    @NameInMap("refund_rule_part_unused_list")
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList;

    @NameInMap("change_rule_in_unused_list")
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList;

    @NameInMap("change_rule_out_unused_list")
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList;

    public static DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue self = new DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue();
        return TeaModel.build(map, self);
    }

    public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setRefundRuleAllUnusedList(java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList) {
        this.refundRuleAllUnusedList = refundRuleAllUnusedList;
        return this;
    }
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList> getRefundRuleAllUnusedList() {
        return this.refundRuleAllUnusedList;
    }

    public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setRefundRulePartUnusedList(java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList) {
        this.refundRulePartUnusedList = refundRulePartUnusedList;
        return this;
    }
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList> getRefundRulePartUnusedList() {
        return this.refundRulePartUnusedList;
    }

    public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setChangeRuleInUnusedList(java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList) {
        this.changeRuleInUnusedList = changeRuleInUnusedList;
        return this;
    }
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList> getChangeRuleInUnusedList() {
        return this.changeRuleInUnusedList;
    }

    public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue setChangeRuleOutUnusedList(java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList) {
        this.changeRuleOutUnusedList = changeRuleOutUnusedList;
        return this;
    }
    public java.util.List<DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList> getChangeRuleOutUnusedList() {
        return this.changeRuleOutUnusedList;
    }

    public static class DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList extends TeaModel {
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

        public static DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList self = new DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRuleAllUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList extends TeaModel {
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

        public static DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList self = new DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueRefundRulePartUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList extends TeaModel {
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

        public static DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList self = new DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleInUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

    public static class DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList extends TeaModel {
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

        public static DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList self = new DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList();
            return TeaModel.build(map, self);
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValueChangeRuleOutUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

}
