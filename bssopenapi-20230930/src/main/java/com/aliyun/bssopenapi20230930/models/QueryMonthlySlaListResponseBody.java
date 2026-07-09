// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryMonthlySlaListResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryMonthlySlaListResponseBodyData> data;

    /**
     * <p>The response metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryMonthlySlaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlySlaListResponseBody self = new QueryMonthlySlaListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonthlySlaListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMonthlySlaListResponseBody setData(java.util.List<QueryMonthlySlaListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMonthlySlaListResponseBodyData> getData() {
        return this.data;
    }

    public QueryMonthlySlaListResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public QueryMonthlySlaListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMonthlySlaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlySlaListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryMonthlySlaListResponseBodyData extends TeaModel {
        /**
         * <p>The service availability.</p>
         * 
         * <strong>example:</strong>
         * <p>99.9155</p>
         */
        @NameInMap("AvailableRate")
        public Double availableRate;

        /**
         * <p>The unique identifier of the damage record, which is used for targeted compensation application.</p>
         * 
         * <strong>example:</strong>
         * <p>9b7***9413</p>
         */
        @NameInMap("DamagedId")
        public String damagedId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSBAG-cn-0xl0n****003</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The month in yyyyMM format.</p>
         * 
         * <strong>example:</strong>
         * <p>202603</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>The monthly service charge.</p>
         * 
         * <strong>example:</strong>
         * <p>365.00</p>
         */
        @NameInMap("MonthlyServiceCharge")
        public Double monthlyServiceCharge;

        /**
         * <p>The compensation description.</p>
         * 
         * <strong>example:</strong>
         * <p>SLA赔付</p>
         */
        @NameInMap("PayDescription")
        public String payDescription;

        /**
         * <p>The compensation ratio. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PayRate")
        public Double payRate;

        /**
         * <p>The compensation status. Valid values: 0 (uncompensated) and 1 (compensated).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PayStatus")
        public Integer payStatus;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The compensation amount.</p>
         * 
         * <strong>example:</strong>
         * <p>36.5</p>
         */
        @NameInMap("ShouldPaySum")
        public Double shouldPaySum;

        public static QueryMonthlySlaListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlySlaListResponseBodyData self = new QueryMonthlySlaListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMonthlySlaListResponseBodyData setAvailableRate(Double availableRate) {
            this.availableRate = availableRate;
            return this;
        }
        public Double getAvailableRate() {
            return this.availableRate;
        }

        public QueryMonthlySlaListResponseBodyData setDamagedId(String damagedId) {
            this.damagedId = damagedId;
            return this;
        }
        public String getDamagedId() {
            return this.damagedId;
        }

        public QueryMonthlySlaListResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMonthlySlaListResponseBodyData setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public QueryMonthlySlaListResponseBodyData setMonthlyServiceCharge(Double monthlyServiceCharge) {
            this.monthlyServiceCharge = monthlyServiceCharge;
            return this;
        }
        public Double getMonthlyServiceCharge() {
            return this.monthlyServiceCharge;
        }

        public QueryMonthlySlaListResponseBodyData setPayDescription(String payDescription) {
            this.payDescription = payDescription;
            return this;
        }
        public String getPayDescription() {
            return this.payDescription;
        }

        public QueryMonthlySlaListResponseBodyData setPayRate(Double payRate) {
            this.payRate = payRate;
            return this;
        }
        public Double getPayRate() {
            return this.payRate;
        }

        public QueryMonthlySlaListResponseBodyData setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public QueryMonthlySlaListResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryMonthlySlaListResponseBodyData setShouldPaySum(Double shouldPaySum) {
            this.shouldPaySum = shouldPaySum;
            return this;
        }
        public Double getShouldPaySum() {
            return this.shouldPaySum;
        }

    }

}
