// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataRefundChangeRuleMapValue extends TeaModel {
    @NameInMap("refund_rule_all_unused_list")
    public java.util.List<DataRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList;

    @NameInMap("refund_rule_part_unused_list")
    public java.util.List<DataRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList;

    @NameInMap("change_rule_in_unused_list")
    public java.util.List<DataRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList;

    @NameInMap("change_rule_out_unused_list")
    public java.util.List<DataRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList;

    public static DataRefundChangeRuleMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataRefundChangeRuleMapValue self = new DataRefundChangeRuleMapValue();
        return TeaModel.build(map, self);
    }

    public DataRefundChangeRuleMapValue setRefundRuleAllUnusedList(java.util.List<DataRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList) {
        this.refundRuleAllUnusedList = refundRuleAllUnusedList;
        return this;
    }
    public java.util.List<DataRefundChangeRuleMapValueRefundRuleAllUnusedList> getRefundRuleAllUnusedList() {
        return this.refundRuleAllUnusedList;
    }

    public DataRefundChangeRuleMapValue setRefundRulePartUnusedList(java.util.List<DataRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList) {
        this.refundRulePartUnusedList = refundRulePartUnusedList;
        return this;
    }
    public java.util.List<DataRefundChangeRuleMapValueRefundRulePartUnusedList> getRefundRulePartUnusedList() {
        return this.refundRulePartUnusedList;
    }

    public DataRefundChangeRuleMapValue setChangeRuleInUnusedList(java.util.List<DataRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList) {
        this.changeRuleInUnusedList = changeRuleInUnusedList;
        return this;
    }
    public java.util.List<DataRefundChangeRuleMapValueChangeRuleInUnusedList> getChangeRuleInUnusedList() {
        return this.changeRuleInUnusedList;
    }

    public DataRefundChangeRuleMapValue setChangeRuleOutUnusedList(java.util.List<DataRefundChangeRuleMapValueChangeRuleOutUnusedList> changeRuleOutUnusedList) {
        this.changeRuleOutUnusedList = changeRuleOutUnusedList;
        return this;
    }
    public java.util.List<DataRefundChangeRuleMapValueChangeRuleOutUnusedList> getChangeRuleOutUnusedList() {
        return this.changeRuleOutUnusedList;
    }

    public static class DataRefundChangeRuleMapValueRefundRuleAllUnusedList extends TeaModel {
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

        public static DataRefundChangeRuleMapValueRefundRuleAllUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataRefundChangeRuleMapValueRefundRuleAllUnusedList self = new DataRefundChangeRuleMapValueRefundRuleAllUnusedList();
            return TeaModel.build(map, self);
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataRefundChangeRuleMapValueRefundRuleAllUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataRefundChangeRuleMapValueRefundRulePartUnusedList extends TeaModel {
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

        public static DataRefundChangeRuleMapValueRefundRulePartUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataRefundChangeRuleMapValueRefundRulePartUnusedList self = new DataRefundChangeRuleMapValueRefundRulePartUnusedList();
            return TeaModel.build(map, self);
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setCanReturnAllTax(Boolean canReturnAllTax) {
            this.canReturnAllTax = canReturnAllTax;
            return this;
        }
        public Boolean getCanReturnAllTax() {
            return this.canReturnAllTax;
        }

        public DataRefundChangeRuleMapValueRefundRulePartUnusedList setReturnPartTaxFee(Double returnPartTaxFee) {
            this.returnPartTaxFee = returnPartTaxFee;
            return this;
        }
        public Double getReturnPartTaxFee() {
            return this.returnPartTaxFee;
        }

    }

    public static class DataRefundChangeRuleMapValueChangeRuleInUnusedList extends TeaModel {
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

        public static DataRefundChangeRuleMapValueChangeRuleInUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataRefundChangeRuleMapValueChangeRuleInUnusedList self = new DataRefundChangeRuleMapValueChangeRuleInUnusedList();
            return TeaModel.build(map, self);
        }

        public DataRefundChangeRuleMapValueChangeRuleInUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataRefundChangeRuleMapValueChangeRuleInUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataRefundChangeRuleMapValueChangeRuleInUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataRefundChangeRuleMapValueChangeRuleInUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataRefundChangeRuleMapValueChangeRuleInUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataRefundChangeRuleMapValueChangeRuleInUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

    public static class DataRefundChangeRuleMapValueChangeRuleOutUnusedList extends TeaModel {
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

        public static DataRefundChangeRuleMapValueChangeRuleOutUnusedList build(java.util.Map<String, ?> map) throws Exception {
            DataRefundChangeRuleMapValueChangeRuleOutUnusedList self = new DataRefundChangeRuleMapValueChangeRuleOutUnusedList();
            return TeaModel.build(map, self);
        }

        public DataRefundChangeRuleMapValueChangeRuleOutUnusedList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DataRefundChangeRuleMapValueChangeRuleOutUnusedList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public DataRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleStartTime(Integer ruleStartTime) {
            this.ruleStartTime = ruleStartTime;
            return this;
        }
        public Integer getRuleStartTime() {
            return this.ruleStartTime;
        }

        public DataRefundChangeRuleMapValueChangeRuleOutUnusedList setRuleEndTime(Integer ruleEndTime) {
            this.ruleEndTime = ruleEndTime;
            return this;
        }
        public Integer getRuleEndTime() {
            return this.ruleEndTime;
        }

        public DataRefundChangeRuleMapValueChangeRuleOutUnusedList setCanChange(Boolean canChange) {
            this.canChange = canChange;
            return this;
        }
        public Boolean getCanChange() {
            return this.canChange;
        }

        public DataRefundChangeRuleMapValueChangeRuleOutUnusedList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

    }

}
