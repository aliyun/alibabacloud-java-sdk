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
        public Double deductQuantity;

        @NameInMap("DeductFactorTotal")
        @Validation(required = true)
        public Double deductFactorTotal;

        public static QueryRIUtilizationDetailResponseDataDetailListDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryRIUtilizationDetailResponseDataDetailListDetailList self = new QueryRIUtilizationDetailResponseDataDetailListDetailList();
            return TeaModel.build(map, self);
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

    }

}
