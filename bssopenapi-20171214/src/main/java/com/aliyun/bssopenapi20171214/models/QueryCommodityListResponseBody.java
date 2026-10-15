// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCommodityListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NotApplicable</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryCommodityListResponseBodyData data;

    /**
     * <p>The additional information about the call result.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CC706AAC-75A6-55B5-9AB7-7D171C6C7655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCommodityListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityListResponseBody self = new QueryCommodityListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommodityListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCommodityListResponseBody setData(QueryCommodityListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCommodityListResponseBodyData getData() {
        return this.data;
    }

    public QueryCommodityListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCommodityListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommodityListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCommodityListResponseBodyDataCommodityList extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>POSTPAY: pay-as-you-go.</li>
         * <li>PREPAY: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code, which is the same as the product detail code in Billing Management.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity name.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service (Pay-As-You-Go)</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        public static QueryCommodityListResponseBodyDataCommodityList build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityListResponseBodyDataCommodityList self = new QueryCommodityListResponseBodyDataCommodityList();
            return TeaModel.build(map, self);
        }

        public QueryCommodityListResponseBodyDataCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public QueryCommodityListResponseBodyDataCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryCommodityListResponseBodyDataCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

    }

    public static class QueryCommodityListResponseBodyData extends TeaModel {
        /**
         * <p>The commodity list.</p>
         */
        @NameInMap("CommodityList")
        public java.util.List<QueryCommodityListResponseBodyDataCommodityList> commodityList;

        public static QueryCommodityListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCommodityListResponseBodyData self = new QueryCommodityListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCommodityListResponseBodyData setCommodityList(java.util.List<QueryCommodityListResponseBodyDataCommodityList> commodityList) {
            this.commodityList = commodityList;
            return this;
        }
        public java.util.List<QueryCommodityListResponseBodyDataCommodityList> getCommodityList() {
            return this.commodityList;
        }

    }

}
