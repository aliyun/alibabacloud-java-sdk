// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsListResponseBody extends TeaModel {
    /**
     * <p>The list of statistics information.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMetaStatisticsListResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
     * 
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
         * <p>The commodity (product) code.</p>
         * 
         * <strong>example:</strong>
         * <p>MOBILE_ONLINE_LENGTH</p>
         */
        @NameInMap("Api")
        public String api;

        /**
         * <p>The name corresponding to the API. Valid values:</p>
         * <ul>
         * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification</li>
         * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
         * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration</li>
         * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status</li>
         * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition)</li>
         * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition)</li>
         * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification</li>
         * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition)</li>
         * <li><strong>MOBILE_DETECT</strong>: phone number detection</li>
         * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition)</li>
         * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition</li>
         * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition</li>
         * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query</li>
         * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>身份证二要素</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The number of successful queries (billable).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BillCount")
        public Long billCount;

        /**
         * <p>The query hit rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BillRate")
        public String billRate;

        /**
         * <p>The number of successful phone number queries (exclusive to phone number detection).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChargeCount")
        public Long chargeCount;

        /**
         * <p>The date.</p>
         * 
         * <strong>example:</strong>
         * <p>11/8</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The name of the telecommunications service provider. Valid values:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile</li>
         * <li><strong>CUCC</strong>: China Unicom</li>
         * <li><strong>CTCC</strong>: China Telecom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>The number of calls with no education information found.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NoRecordCount")
        public Long noRecordCount;

        /**
         * <p>The number of authentication-passed transactions.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("PassedCount")
        public Long passedCount;

        /**
         * <p>The authentication pass rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PassedRate")
        public String passedRate;

        /**
         * <p>The number of successful calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        /**
         * <p>The call success rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SuccessRate")
        public String successRate;

        /**
         * <p>The total number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The number of authentication-failed transactions.</p>
         * 
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
