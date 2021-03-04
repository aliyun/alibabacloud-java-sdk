// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRIUtilizationDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DeductDate")
        public String deductDate;

        @NameInMap("DeductFactorTotal")
        public Float deductFactorTotal;

        @NameInMap("DeductHours")
        public String deductHours;

        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        @NameInMap("DeductedCommodityCode")
        public String deductedCommodityCode;

        @NameInMap("DeductedInstanceId")
        public String deductedInstanceId;

        @NameInMap("DeductedProductDetail")
        public String deductedProductDetail;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

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
        @NameInMap("DetailList")
        public QueryRIUtilizationDetailResponseBodyDataDetailList detailList;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

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
