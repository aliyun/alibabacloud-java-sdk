// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsPageListResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The paginated list data.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMetaStatisticsPageListResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C379C9E4-4DA0-5D0B-821B-25E2B8693D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
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
         * <p>Api。</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PERIOD</p>
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
         * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>车辆要素核验增强版</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The number of successful queries (billable).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BillCount")
        public Long billCount;

        /**
         * <p>The query hit rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("BillRate")
        public String billRate;

        /**
         * <p>The number of successful phone number queries (exclusive to phone number detection).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChargeCount")
        public Long chargeCount;

        /**
         * <p>The date. Format: M/d (month/day). For example, 11/8 indicates November 8.</p>
         * 
         * <strong>example:</strong>
         * <p>11/8</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The carrier name. Valid values:</p>
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
         * <p>The number of calls with no education information found.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NoRecordCount")
        public Long noRecordCount;

        /**
         * <p>The number of authentication-passed transactions.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("PassedCount")
        public Long passedCount;

        /**
         * <p>The authentication pass rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PassedRate")
        public String passedRate;

        /**
         * <p>The number of successful requests.</p>
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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The number of authentication-failed calls.</p>
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
