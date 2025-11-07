// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsListResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeMetaStatisticsListResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>3F860B3F-76B7-5555-A907-2F4433BF8868</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetaStatisticsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaStatisticsListResponseBody self = new DescribeMetaStatisticsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetaStatisticsListResponseBody setItems(java.util.List<DescribeMetaStatisticsListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeMetaStatisticsListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeMetaStatisticsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMetaStatisticsListResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MOBILE_ONLINE_LENGTH</p>
         */
        @NameInMap("Api")
        public String api;

        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BillCount")
        public Long billCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BillRate")
        public String billRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChargeCount")
        public Long chargeCount;

        /**
         * <strong>example:</strong>
         * <p>11/8</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>CUCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NoRecordCount")
        public Long noRecordCount;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("PassedCount")
        public Long passedCount;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PassedRate")
        public String passedRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SuccessRate")
        public String successRate;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnpassedCount")
        public Long unpassedCount;

        public static DescribeMetaStatisticsListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaStatisticsListResponseBodyItems self = new DescribeMetaStatisticsListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMetaStatisticsListResponseBodyItems setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public DescribeMetaStatisticsListResponseBodyItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeMetaStatisticsListResponseBodyItems setBillCount(Long billCount) {
            this.billCount = billCount;
            return this;
        }
        public Long getBillCount() {
            return this.billCount;
        }

        public DescribeMetaStatisticsListResponseBodyItems setBillRate(String billRate) {
            this.billRate = billRate;
            return this;
        }
        public String getBillRate() {
            return this.billRate;
        }

        public DescribeMetaStatisticsListResponseBodyItems setChargeCount(Long chargeCount) {
            this.chargeCount = chargeCount;
            return this;
        }
        public Long getChargeCount() {
            return this.chargeCount;
        }

        public DescribeMetaStatisticsListResponseBodyItems setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeMetaStatisticsListResponseBodyItems setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeMetaStatisticsListResponseBodyItems setNoRecordCount(Long noRecordCount) {
            this.noRecordCount = noRecordCount;
            return this;
        }
        public Long getNoRecordCount() {
            return this.noRecordCount;
        }

        public DescribeMetaStatisticsListResponseBodyItems setPassedCount(Long passedCount) {
            this.passedCount = passedCount;
            return this;
        }
        public Long getPassedCount() {
            return this.passedCount;
        }

        public DescribeMetaStatisticsListResponseBodyItems setPassedRate(String passedRate) {
            this.passedRate = passedRate;
            return this;
        }
        public String getPassedRate() {
            return this.passedRate;
        }

        public DescribeMetaStatisticsListResponseBodyItems setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public DescribeMetaStatisticsListResponseBodyItems setSuccessRate(String successRate) {
            this.successRate = successRate;
            return this;
        }
        public String getSuccessRate() {
            return this.successRate;
        }

        public DescribeMetaStatisticsListResponseBodyItems setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeMetaStatisticsListResponseBodyItems setUnpassedCount(Long unpassedCount) {
            this.unpassedCount = unpassedCount;
            return this;
        }
        public Long getUnpassedCount() {
            return this.unpassedCount;
        }

    }

}
