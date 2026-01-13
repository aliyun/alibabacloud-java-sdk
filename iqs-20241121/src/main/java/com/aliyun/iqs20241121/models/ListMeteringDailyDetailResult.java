// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListMeteringDailyDetailResult extends TeaModel {
    @NameInMap("meteringDailyDetailList")
    public java.util.List<ListMeteringDailyDetailResultMeteringDailyDetailList> meteringDailyDetailList;

    public static ListMeteringDailyDetailResult build(java.util.Map<String, ?> map) throws Exception {
        ListMeteringDailyDetailResult self = new ListMeteringDailyDetailResult();
        return TeaModel.build(map, self);
    }

    public ListMeteringDailyDetailResult setMeteringDailyDetailList(java.util.List<ListMeteringDailyDetailResultMeteringDailyDetailList> meteringDailyDetailList) {
        this.meteringDailyDetailList = meteringDailyDetailList;
        return this;
    }
    public java.util.List<ListMeteringDailyDetailResultMeteringDailyDetailList> getMeteringDailyDetailList() {
        return this.meteringDailyDetailList;
    }

    public static class ListMeteringDailyDetailResultMeteringDailyDetailList extends TeaModel {
        @NameInMap("billDate")
        public String billDate;

        @NameInMap("billPeriod")
        public String billPeriod;

        @NameInMap("billingFunctionItem")
        public String billingFunctionItem;

        @NameInMap("billingItem")
        public String billingItem;

        @NameInMap("billingQps")
        public Integer billingQps;

        @NameInMap("failedCount")
        public Integer failedCount;

        @NameInMap("ladderTypeCode")
        public Integer ladderTypeCode;

        @NameInMap("subAccountId")
        public String subAccountId;

        @NameInMap("successCount")
        public Integer successCount;

        public static ListMeteringDailyDetailResultMeteringDailyDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListMeteringDailyDetailResultMeteringDailyDetailList self = new ListMeteringDailyDetailResultMeteringDailyDetailList();
            return TeaModel.build(map, self);
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setBillDate(String billDate) {
            this.billDate = billDate;
            return this;
        }
        public String getBillDate() {
            return this.billDate;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setBillPeriod(String billPeriod) {
            this.billPeriod = billPeriod;
            return this;
        }
        public String getBillPeriod() {
            return this.billPeriod;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setBillingFunctionItem(String billingFunctionItem) {
            this.billingFunctionItem = billingFunctionItem;
            return this;
        }
        public String getBillingFunctionItem() {
            return this.billingFunctionItem;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setBillingQps(Integer billingQps) {
            this.billingQps = billingQps;
            return this;
        }
        public Integer getBillingQps() {
            return this.billingQps;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setLadderTypeCode(Integer ladderTypeCode) {
            this.ladderTypeCode = ladderTypeCode;
            return this;
        }
        public Integer getLadderTypeCode() {
            return this.ladderTypeCode;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setSubAccountId(String subAccountId) {
            this.subAccountId = subAccountId;
            return this;
        }
        public String getSubAccountId() {
            return this.subAccountId;
        }

        public ListMeteringDailyDetailResultMeteringDailyDetailList setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
