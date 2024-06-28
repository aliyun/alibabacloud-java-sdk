// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryRIUtilizationDetailResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryRIUtilizationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRIUtilizationDetailResponseBody self = new QueryRIUtilizationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRIUtilizationDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRIUtilizationDetailResponseBody setData(QueryRIUtilizationDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRIUtilizationDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryRIUtilizationDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRIUtilizationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRIUtilizationDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRIUtilizationDetailResponseBodyDataDetailListDetailList extends TeaModel {
        /**
         * <p>The time when the fees are deducted by using the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-23 12:00:00</p>
         */
        @NameInMap("DeductDate")
        public String deductDate;

        /**
         * <p>The total amount of computing power of the RI or capacity of SCU in the time period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductFactorTotal")
        public Float deductFactorTotal;

        /**
         * <p>The deduct factor. This parameter is returned only if the RICommodityCode parameter is set to ecsRi.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("DeductHours")
        public String deductHours;

        /**
         * <p>The computing power or capacity of the pay-as-you-go instance whose fees are deducted by using the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        /**
         * <p>The code of the service whose fees are deducted by using the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("DeductedCommodityCode")
        public String deductedCommodityCode;

        /**
         * <p>The ID of the instance whose fees are deducted by using the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>safdffghfgh</p>
         */
        @NameInMap("DeductedInstanceId")
        public String deductedInstanceId;

        /**
         * <p>The name of the service whose fees are deducted by using the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB RDS</p>
         */
        @NameInMap("DeductedProductDetail")
        public String deductedProductDetail;

        /**
         * <p>The instance type of the instance whose fees are deducted by using the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.s3.large</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The ID of the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>324253645</p>
         */
        @NameInMap("RIInstanceId")
        public String RIInstanceId;

        public static QueryRIUtilizationDetailResponseBodyDataDetailListDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryRIUtilizationDetailResponseBodyDataDetailListDetailList self = new QueryRIUtilizationDetailResponseBodyDataDetailListDetailList();
            return TeaModel.build(map, self);
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setDeductDate(String deductDate) {
            this.deductDate = deductDate;
            return this;
        }
        public String getDeductDate() {
            return this.deductDate;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setDeductFactorTotal(Float deductFactorTotal) {
            this.deductFactorTotal = deductFactorTotal;
            return this;
        }
        public Float getDeductFactorTotal() {
            return this.deductFactorTotal;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setDeductHours(String deductHours) {
            this.deductHours = deductHours;
            return this;
        }
        public String getDeductHours() {
            return this.deductHours;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setDeductedCommodityCode(String deductedCommodityCode) {
            this.deductedCommodityCode = deductedCommodityCode;
            return this;
        }
        public String getDeductedCommodityCode() {
            return this.deductedCommodityCode;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setDeductedInstanceId(String deductedInstanceId) {
            this.deductedInstanceId = deductedInstanceId;
            return this;
        }
        public String getDeductedInstanceId() {
            return this.deductedInstanceId;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setDeductedProductDetail(String deductedProductDetail) {
            this.deductedProductDetail = deductedProductDetail;
            return this;
        }
        public String getDeductedProductDetail() {
            return this.deductedProductDetail;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailListDetailList setRIInstanceId(String RIInstanceId) {
            this.RIInstanceId = RIInstanceId;
            return this;
        }
        public String getRIInstanceId() {
            return this.RIInstanceId;
        }

    }

    public static class QueryRIUtilizationDetailResponseBodyDataDetailList extends TeaModel {
        @NameInMap("DetailList")
        public java.util.List<QueryRIUtilizationDetailResponseBodyDataDetailListDetailList> detailList;

        public static QueryRIUtilizationDetailResponseBodyDataDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryRIUtilizationDetailResponseBodyDataDetailList self = new QueryRIUtilizationDetailResponseBodyDataDetailList();
            return TeaModel.build(map, self);
        }

        public QueryRIUtilizationDetailResponseBodyDataDetailList setDetailList(java.util.List<QueryRIUtilizationDetailResponseBodyDataDetailListDetailList> detailList) {
            this.detailList = detailList;
            return this;
        }
        public java.util.List<QueryRIUtilizationDetailResponseBodyDataDetailListDetailList> getDetailList() {
            return this.detailList;
        }

    }

    public static class QueryRIUtilizationDetailResponseBodyData extends TeaModel {
        /**
         * <p>The usage details of the RI.</p>
         */
        @NameInMap("DetailList")
        public QueryRIUtilizationDetailResponseBodyDataDetailList detailList;

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryRIUtilizationDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRIUtilizationDetailResponseBodyData self = new QueryRIUtilizationDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRIUtilizationDetailResponseBodyData setDetailList(QueryRIUtilizationDetailResponseBodyDataDetailList detailList) {
            this.detailList = detailList;
            return this;
        }
        public QueryRIUtilizationDetailResponseBodyDataDetailList getDetailList() {
            return this.detailList;
        }

        public QueryRIUtilizationDetailResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public QueryRIUtilizationDetailResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRIUtilizationDetailResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
