// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataRefundChangeRuleMapValue extends TeaModel {
    /**
     * <p>refund rule for fully-unused tickets</p>
     */
    @NameInMap("refund_rule_all_unused_list")
    public java.util.List<DataRefundChangeRuleMapValueRefundRuleAllUnusedList> refundRuleAllUnusedList;

    /**
     * <p>refund rule for partially-used tickets</p>
     */
    @NameInMap("refund_rule_part_unused_list")
    public java.util.List<DataRefundChangeRuleMapValueRefundRulePartUnusedList> refundRulePartUnusedList;

    /**
     * <p>change rule for inbound segment unused tickets</p>
     */
    @NameInMap("change_rule_in_unused_list")
    public java.util.List<DataRefundChangeRuleMapValueChangeRuleInUnusedList> changeRuleInUnusedList;

    /**
     * <p>change rule for outbound-flight-unused tickets</p>
     */
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
        /**
         * <p>type: 0 - fully-unused ticket; 1 - partially used ticket</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <p>time unit: day/hour</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("time_unit")
        public String timeUnit;

        /**
         * <p>applicable refund rule start time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        /**
         * <p>applicable refund rule end time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        /**
         * <p>whether refundable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_refund")
        public Boolean canRefund;

        /**
         * <p>refund fee X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("refund_fee")
        public Double refundFee;

        /**
         * <p>whether tax is fully refundable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_return_all_tax")
        public Boolean canReturnAllTax;

        /**
         * <p>tax amount refundable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>type: 0 - fully-unused ticket; 1 - partially used ticket</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <p>time unit: day/hour</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("time_unit")
        public String timeUnit;

        /**
         * <p>applicable refund rule start time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        /**
         * <p>applicable refund rule end time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        /**
         * <p>whether refundable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_refund")
        public Boolean canRefund;

        /**
         * <p>refund fee X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("refund_fee")
        public Double refundFee;

        /**
         * <p>whether tax is fully refundable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_return_all_tax")
        public Boolean canReturnAllTax;

        /**
         * <p>tax amount refundable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>type: 2 - outbound segment unused; 3 - inbound segment unused</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <p>time unit: day/hour</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("time_unit")
        public String timeUnit;

        /**
         * <p>applicable change rule start time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        /**
         * <p>applicable change rule end time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        /**
         * <p>whether changeable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_change")
        public Boolean canChange;

        /**
         * <p>change fee X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>type: 2 - outbound segment unused; 3 - inbound segment unused</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <p>time unit: day/hour</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("time_unit")
        public String timeUnit;

        /**
         * <p>applicable change rule start time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("rule_start_time")
        public Integer ruleStartTime;

        /**
         * <p>applicable change rule end time, time unit (day/hour)</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("rule_end_time")
        public Integer ruleEndTime;

        /**
         * <p>whether changeable X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_change")
        public Boolean canChange;

        /**
         * <p>change fee X-Y hour(day) before departure</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
