// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsPageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Paginated list data.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMetaStatisticsPageListResponseBodyItems> items;

    /**
     * <p>Number of data entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>C379C9E4-4DA0-5D0B-821B-25E2B8693D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeMetaStatisticsPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaStatisticsPageListResponseBody self = new DescribeMetaStatisticsPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetaStatisticsPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMetaStatisticsPageListResponseBody setItems(java.util.List<DescribeMetaStatisticsPageListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeMetaStatisticsPageListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeMetaStatisticsPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetaStatisticsPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetaStatisticsPageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeMetaStatisticsPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeMetaStatisticsPageListResponseBodyItems extends TeaModel {
        /**
         * <p>API.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PERIOD</p>
         */
        @NameInMap("Api")
        public String api;

        /**
         * <p>Name corresponding to the API:</p>
         * <ul>
         * <li><strong>ID_CARD_2_META</strong>: ID Card Two-Element Verification</li>
         * <li><strong>ID_PERIOD</strong>: ID Card Validity Verification Period</li>
         * <li><strong>MOBILE_ONLINE_LENGTH</strong>: Mobile Online Duration</li>
         * <li><strong>MOBILE_ONLINE_STATUS</strong>: Mobile Online Status</li>
         * <li><strong>MOBILE_3_META_SIMPLE</strong>: Mobile Number Three-Element Verification (Simple)</li>
         * <li><strong>MOBILE_3_META</strong>: Mobile Number Three-Element Verification (Detailed)</li>
         * <li><strong>MOBILE_2_META</strong>: Mobile Number Two-Element Verification</li>
         * <li><strong>BANK_CARD_N_META</strong>: Bank Card Verification (Detailed)</li>
         * <li><strong>MOBILE_DETECT</strong>: Number Detection
         *  -<strong>VEHICLE_N_META</strong>: Vehicle Element Verification (Enhanced)</li>
         * <li><strong>VEHICLE_PENTA_INFO</strong>: Vehicle Five-Element Information Recognition</li>
         * <li><strong>VEHICLE_LICENSE_INFO</strong>: Vehicle Information Recognition</li>
         * <li><strong>VEHICLE_INSURE_DATE</strong>: Vehicle Insurance Date Query</li>
         * <li><strong>VEHICLE_CHECK</strong>: Vehicle Element Verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>车辆要素核验增强版</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>Number of hits (billed).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BillCount")
        public Long billCount;

        /**
         * <p>Hit rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("BillRate")
        public String billRate;

        /**
         * <p>Number of successful mobile number queries (exclusive to Number Detection).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChargeCount")
        public Long chargeCount;

        /**
         * <p>Date.</p>
         * 
         * <strong>example:</strong>
         * <p>11/8</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Carrier name:</p>
         * <ul>
         * <li><strong>CMCC</strong>: China Mobile</li>
         * <li><strong>CUCC</strong>: China Unicom</li>
         * <li><strong>CTCC</strong>: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Number of calls with no record information.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NoRecordCount")
        public Long noRecordCount;

        /**
         * <p>Number of passed authentications.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("PassedCount")
        public Long passedCount;

        /**
         * <p>Authentication pass rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PassedRate")
        public String passedRate;

        /**
         * <p>Number of successful requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        /**
         * <p>Call success rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SuccessRate")
        public String successRate;

        /**
         * <p>Total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>Number of failed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnpassedCount")
        public Long unpassedCount;

        public static DescribeMetaStatisticsPageListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaStatisticsPageListResponseBodyItems self = new DescribeMetaStatisticsPageListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setBillCount(Long billCount) {
            this.billCount = billCount;
            return this;
        }
        public Long getBillCount() {
            return this.billCount;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setBillRate(String billRate) {
            this.billRate = billRate;
            return this;
        }
        public String getBillRate() {
            return this.billRate;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setChargeCount(Long chargeCount) {
            this.chargeCount = chargeCount;
            return this;
        }
        public Long getChargeCount() {
            return this.chargeCount;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setNoRecordCount(Long noRecordCount) {
            this.noRecordCount = noRecordCount;
            return this;
        }
        public Long getNoRecordCount() {
            return this.noRecordCount;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setPassedCount(Long passedCount) {
            this.passedCount = passedCount;
            return this;
        }
        public Long getPassedCount() {
            return this.passedCount;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setPassedRate(String passedRate) {
            this.passedRate = passedRate;
            return this;
        }
        public String getPassedRate() {
            return this.passedRate;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setSuccessRate(String successRate) {
            this.successRate = successRate;
            return this;
        }
        public String getSuccessRate() {
            return this.successRate;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeMetaStatisticsPageListResponseBodyItems setUnpassedCount(Long unpassedCount) {
            this.unpassedCount = unpassedCount;
            return this;
        }
        public Long getUnpassedCount() {
            return this.unpassedCount;
        }

    }

}
