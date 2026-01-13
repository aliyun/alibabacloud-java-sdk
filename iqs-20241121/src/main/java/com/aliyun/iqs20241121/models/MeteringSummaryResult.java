// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class MeteringSummaryResult extends TeaModel {
    @NameInMap("meteringSummaryList")
    public java.util.List<MeteringSummaryResultMeteringSummaryList> meteringSummaryList;

    public static MeteringSummaryResult build(java.util.Map<String, ?> map) throws Exception {
        MeteringSummaryResult self = new MeteringSummaryResult();
        return TeaModel.build(map, self);
    }

    public MeteringSummaryResult setMeteringSummaryList(java.util.List<MeteringSummaryResultMeteringSummaryList> meteringSummaryList) {
        this.meteringSummaryList = meteringSummaryList;
        return this;
    }
    public java.util.List<MeteringSummaryResultMeteringSummaryList> getMeteringSummaryList() {
        return this.meteringSummaryList;
    }

    public static class MeteringSummaryResultMeteringSummaryList extends TeaModel {
        @NameInMap("billingFunctionItem")
        public String billingFunctionItem;

        @NameInMap("billingItem")
        public String billingItem;

        @NameInMap("failCount")
        public Integer failCount;

        @NameInMap("successCount")
        public Integer successCount;

        public static MeteringSummaryResultMeteringSummaryList build(java.util.Map<String, ?> map) throws Exception {
            MeteringSummaryResultMeteringSummaryList self = new MeteringSummaryResultMeteringSummaryList();
            return TeaModel.build(map, self);
        }

        public MeteringSummaryResultMeteringSummaryList setBillingFunctionItem(String billingFunctionItem) {
            this.billingFunctionItem = billingFunctionItem;
            return this;
        }
        public String getBillingFunctionItem() {
            return this.billingFunctionItem;
        }

        public MeteringSummaryResultMeteringSummaryList setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public MeteringSummaryResultMeteringSummaryList setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public MeteringSummaryResultMeteringSummaryList setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
