// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryDPUtilizationDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryDPUtilizationDetailResponseBodyData data;

    public static QueryDPUtilizationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDPUtilizationDetailResponseBody self = new QueryDPUtilizationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDPUtilizationDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDPUtilizationDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDPUtilizationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDPUtilizationDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDPUtilizationDetailResponseBody setData(QueryDPUtilizationDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDPUtilizationDetailResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDPUtilizationDetailResponseBodyDataDetailListDetailList extends TeaModel {
        @NameInMap("DeductedInstanceId")
        public String deductedInstanceId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DeductHours")
        public Float deductHours;

        @NameInMap("ShareUid")
        public Long shareUid;

        @NameInMap("DeductDate")
        public String deductDate;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("DeductedCommodityCode")
        public String deductedCommodityCode;

        @NameInMap("DeductedProductDetail")
        public String deductedProductDetail;

        @NameInMap("DeductMeasure")
        public Float deductMeasure;

        @NameInMap("Region")
        public String region;

        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        @NameInMap("DeductFactorTotal")
        public Float deductFactorTotal;

        @NameInMap("ResCode")
        public String resCode;

        @NameInMap("Uid")
        public Long uid;

        public static QueryDPUtilizationDetailResponseBodyDataDetailListDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryDPUtilizationDetailResponseBodyDataDetailListDetailList self = new QueryDPUtilizationDetailResponseBodyDataDetailListDetailList();
            return TeaModel.build(map, self);
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductedInstanceId(String deductedInstanceId) {
            this.deductedInstanceId = deductedInstanceId;
            return this;
        }
        public String getDeductedInstanceId() {
            return this.deductedInstanceId;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductHours(Float deductHours) {
            this.deductHours = deductHours;
            return this;
        }
        public Float getDeductHours() {
            return this.deductHours;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setShareUid(Long shareUid) {
            this.shareUid = shareUid;
            return this;
        }
        public Long getShareUid() {
            return this.shareUid;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductDate(String deductDate) {
            this.deductDate = deductDate;
            return this;
        }
        public String getDeductDate() {
            return this.deductDate;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductedCommodityCode(String deductedCommodityCode) {
            this.deductedCommodityCode = deductedCommodityCode;
            return this;
        }
        public String getDeductedCommodityCode() {
            return this.deductedCommodityCode;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductedProductDetail(String deductedProductDetail) {
            this.deductedProductDetail = deductedProductDetail;
            return this;
        }
        public String getDeductedProductDetail() {
            return this.deductedProductDetail;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductMeasure(Float deductMeasure) {
            this.deductMeasure = deductMeasure;
            return this;
        }
        public Float getDeductMeasure() {
            return this.deductMeasure;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductFactorTotal(Float deductFactorTotal) {
            this.deductFactorTotal = deductFactorTotal;
            return this;
        }
        public Float getDeductFactorTotal() {
            return this.deductFactorTotal;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setResCode(String resCode) {
            this.resCode = resCode;
            return this;
        }
        public String getResCode() {
            return this.resCode;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class QueryDPUtilizationDetailResponseBodyDataDetailList extends TeaModel {
        @NameInMap("DetailList")
        public java.util.List<QueryDPUtilizationDetailResponseBodyDataDetailListDetailList> detailList;

        public static QueryDPUtilizationDetailResponseBodyDataDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryDPUtilizationDetailResponseBodyDataDetailList self = new QueryDPUtilizationDetailResponseBodyDataDetailList();
            return TeaModel.build(map, self);
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailList setDetailList(java.util.List<QueryDPUtilizationDetailResponseBodyDataDetailListDetailList> detailList) {
            this.detailList = detailList;
            return this;
        }
        public java.util.List<QueryDPUtilizationDetailResponseBodyDataDetailListDetailList> getDetailList() {
            return this.detailList;
        }

    }

    public static class QueryDPUtilizationDetailResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("DetailList")
        public QueryDPUtilizationDetailResponseBodyDataDetailList detailList;

        public static QueryDPUtilizationDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDPUtilizationDetailResponseBodyData self = new QueryDPUtilizationDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDPUtilizationDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryDPUtilizationDetailResponseBodyData setDetailList(QueryDPUtilizationDetailResponseBodyDataDetailList detailList) {
            this.detailList = detailList;
            return this;
        }
        public QueryDPUtilizationDetailResponseBodyDataDetailList getDetailList() {
            return this.detailList;
        }

    }

}
