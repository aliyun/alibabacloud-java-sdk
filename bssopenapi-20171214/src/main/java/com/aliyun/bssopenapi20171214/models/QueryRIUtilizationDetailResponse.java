// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryRIUtilizationDetailResponseData data;

    public static QueryRIUtilizationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRIUtilizationDetailResponse self = new QueryRIUtilizationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRIUtilizationDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRIUtilizationDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRIUtilizationDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRIUtilizationDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRIUtilizationDetailResponse setData(QueryRIUtilizationDetailResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRIUtilizationDetailResponseData getData() {
        return this.data;
    }

    public static class QueryRIUtilizationDetailResponseDataDetailListDetailList extends TeaModel {
        @NameInMap("RIInstanceId")
        @Validation(required = true)
        public String RIInstanceId;

        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public String instanceSpec;

        @NameInMap("DeductedInstanceId")
        @Validation(required = true)
        public String deductedInstanceId;

        @NameInMap("DeductedCommodityCode")
        @Validation(required = true)
        public String deductedCommodityCode;

        @NameInMap("DeductDate")
        @Validation(required = true)
        public String deductDate;

        @NameInMap("DeductHours")
        @Validation(required = true)
        public String deductHours;

        @NameInMap("DeductedProductDetail")
        @Validation(required = true)
        public String deductedProductDetail;

        @NameInMap("DeductQuantity")
        @Validation(required = true)
        public Float deductQuantity;

        @NameInMap("DeductFactorTotal")
        @Validation(required = true)
        public Float deductFactorTotal;

        public static QueryRIUtilizationDetailResponseDataDetailListDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryRIUtilizationDetailResponseDataDetailListDetailList self = new QueryRIUtilizationDetailResponseDataDetailListDetailList();
            return TeaModel.build(map, self);
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setRIInstanceId(String RIInstanceId) {
            this.RIInstanceId = RIInstanceId;
            return this;
        }
        public String getRIInstanceId() {
            return this.RIInstanceId;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setDeductedInstanceId(String deductedInstanceId) {
            this.deductedInstanceId = deductedInstanceId;
            return this;
        }
        public String getDeductedInstanceId() {
            return this.deductedInstanceId;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setDeductedCommodityCode(String deductedCommodityCode) {
            this.deductedCommodityCode = deductedCommodityCode;
            return this;
        }
        public String getDeductedCommodityCode() {
            return this.deductedCommodityCode;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setDeductDate(String deductDate) {
            this.deductDate = deductDate;
            return this;
        }
        public String getDeductDate() {
            return this.deductDate;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setDeductHours(String deductHours) {
            this.deductHours = deductHours;
            return this;
        }
        public String getDeductHours() {
            return this.deductHours;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setDeductedProductDetail(String deductedProductDetail) {
            this.deductedProductDetail = deductedProductDetail;
            return this;
        }
        public String getDeductedProductDetail() {
            return this.deductedProductDetail;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public QueryRIUtilizationDetailResponseDataDetailListDetailList setDeductFactorTotal(Float deductFactorTotal) {
            this.deductFactorTotal = deductFactorTotal;
            return this;
        }
        public Float getDeductFactorTotal() {
            return this.deductFactorTotal;
        }

    }

    public static class QueryRIUtilizationDetailResponseDataDetailList extends TeaModel {
        @NameInMap("DetailList")
        @Validation(required = true)
        public java.util.List<QueryRIUtilizationDetailResponseDataDetailListDetailList> detailList;

        public static QueryRIUtilizationDetailResponseDataDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryRIUtilizationDetailResponseDataDetailList self = new QueryRIUtilizationDetailResponseDataDetailList();
            return TeaModel.build(map, self);
        }

        public QueryRIUtilizationDetailResponseDataDetailList setDetailList(java.util.List<QueryRIUtilizationDetailResponseDataDetailListDetailList> detailList) {
            this.detailList = detailList;
            return this;
        }
        public java.util.List<QueryRIUtilizationDetailResponseDataDetailListDetailList> getDetailList() {
            return this.detailList;
        }

    }

    public static class QueryRIUtilizationDetailResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Long pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DetailList")
        @Validation(required = true)
        public QueryRIUtilizationDetailResponseDataDetailList detailList;

        public static QueryRIUtilizationDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRIUtilizationDetailResponseData self = new QueryRIUtilizationDetailResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRIUtilizationDetailResponseData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public QueryRIUtilizationDetailResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRIUtilizationDetailResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryRIUtilizationDetailResponseData setDetailList(QueryRIUtilizationDetailResponseDataDetailList detailList) {
            this.detailList = detailList;
            return this;
        }
        public QueryRIUtilizationDetailResponseDataDetailList getDetailList() {
            return this.detailList;
        }

    }

}
