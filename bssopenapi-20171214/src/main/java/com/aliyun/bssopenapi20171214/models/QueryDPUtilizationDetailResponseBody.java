// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryDPUtilizationDetailResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryDPUtilizationDetailResponseBodyData data;

    /**
     * <p>The error message.</p>
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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public QueryDPUtilizationDetailResponseBody setData(QueryDPUtilizationDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDPUtilizationDetailResponseBodyData getData() {
        return this.data;
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

    public static class QueryDPUtilizationDetailResponseBodyDataDetailListDetailList extends TeaModel {
        /**
         * <p>The deduction date.</p>
         * 
         * <strong>example:</strong>
         * <p>2019/5/23 12:00</p>
         */
        @NameInMap("DeductDate")
        public String deductDate;

        /**
         * <p>The total computing capacity or storage capacity of the RI or SCU during the deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductFactorTotal")
        public Float deductFactorTotal;

        /**
         * <p>The deduct factor. This parameter is returned only if the CommodityCode parameter is set to ecsRi.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("DeductHours")
        public Float deductHours;

        /**
         * <p>The original measured amount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductMeasure")
        public Float deductMeasure;

        /**
         * <p>The computing capacity or storage capacity that is deducted in a pay-as-you-go instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        /**
         * <p>The code of the deducted service.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("DeductedCommodityCode")
        public String deductedCommodityCode;

        /**
         * <p>The ID of the deducted instance.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-123123</p>
         */
        @NameInMap("DeductedInstanceId")
        public String deductedInstanceId;

        /**
         * <p>The name of the deducted service.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB RDS</p>
         */
        @NameInMap("DeductedProductDetail")
        public String deductedProductDetail;

        /**
         * <p>The ID of the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-123123</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance type of the deducted instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.s3.large</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The region in which the instance resides. This parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The billable item.</p>
         * 
         * <strong>example:</strong>
         * <p>PutRequest</p>
         */
        @NameInMap("ResCode")
        public String resCode;

        /**
         * <p>The UID of the deducted instance.</p>
         * <ul>
         * <li>If the deduction is shared, the value of this parameter indicates the UID of the deducted instance.</li>
         * <li>If the deduction is not shared, the value of this parameter is the same as that of the uid parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        @NameInMap("ShareUid")
        public Long shareUid;

        /**
         * <p>The UID of the deducted instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        @NameInMap("Uid")
        public Long uid;

        public static QueryDPUtilizationDetailResponseBodyDataDetailListDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryDPUtilizationDetailResponseBodyDataDetailListDetailList self = new QueryDPUtilizationDetailResponseBodyDataDetailListDetailList();
            return TeaModel.build(map, self);
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductDate(String deductDate) {
            this.deductDate = deductDate;
            return this;
        }
        public String getDeductDate() {
            return this.deductDate;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductFactorTotal(Float deductFactorTotal) {
            this.deductFactorTotal = deductFactorTotal;
            return this;
        }
        public Float getDeductFactorTotal() {
            return this.deductFactorTotal;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductHours(Float deductHours) {
            this.deductHours = deductHours;
            return this;
        }
        public Float getDeductHours() {
            return this.deductHours;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductMeasure(Float deductMeasure) {
            this.deductMeasure = deductMeasure;
            return this;
        }
        public Float getDeductMeasure() {
            return this.deductMeasure;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductedCommodityCode(String deductedCommodityCode) {
            this.deductedCommodityCode = deductedCommodityCode;
            return this;
        }
        public String getDeductedCommodityCode() {
            return this.deductedCommodityCode;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductedInstanceId(String deductedInstanceId) {
            this.deductedInstanceId = deductedInstanceId;
            return this;
        }
        public String getDeductedInstanceId() {
            return this.deductedInstanceId;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setDeductedProductDetail(String deductedProductDetail) {
            this.deductedProductDetail = deductedProductDetail;
            return this;
        }
        public String getDeductedProductDetail() {
            return this.deductedProductDetail;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setResCode(String resCode) {
            this.resCode = resCode;
            return this;
        }
        public String getResCode() {
            return this.resCode;
        }

        public QueryDPUtilizationDetailResponseBodyDataDetailListDetailList setShareUid(Long shareUid) {
            this.shareUid = shareUid;
            return this;
        }
        public Long getShareUid() {
            return this.shareUid;
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
        /**
         * <p>The detailed resource plan usage.</p>
         */
        @NameInMap("DetailList")
        public QueryDPUtilizationDetailResponseBodyDataDetailList detailList;

        /**
         * <p>The token that is used to retrieve the next page of results. You can set the LastToken parameter to this value in the next request. If null is returned, all results are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESF***zNTAw</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static QueryDPUtilizationDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDPUtilizationDetailResponseBodyData self = new QueryDPUtilizationDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDPUtilizationDetailResponseBodyData setDetailList(QueryDPUtilizationDetailResponseBodyDataDetailList detailList) {
            this.detailList = detailList;
            return this;
        }
        public QueryDPUtilizationDetailResponseBodyDataDetailList getDetailList() {
            return this.detailList;
        }

        public QueryDPUtilizationDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
