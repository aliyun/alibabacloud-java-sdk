// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDiscountResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QuerySavingsPlansDiscountResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySavingsPlansDiscountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDiscountResponseBody self = new QuerySavingsPlansDiscountResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDiscountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySavingsPlansDiscountResponseBody setData(QuerySavingsPlansDiscountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySavingsPlansDiscountResponseBodyData getData() {
        return this.data;
    }

    public QuerySavingsPlansDiscountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingsPlansDiscountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingsPlansDiscountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySavingsPlansDiscountResponseBodyDataItems extends TeaModel {
        /**
         * <p>The details of the service.</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The contracted discount.</p>
         */
        @NameInMap("ContractDiscountRate")
        public String contractDiscountRate;

        /**
         * <p>The cycle based on which queries were performed.</p>
         */
        @NameInMap("Cycle")
        public String cycle;

        /**
         * <p>The discount provided by the official website.</p>
         */
        @NameInMap("DiscountRate")
        public String discountRate;

        /**
         * <p>The name of the pricing module.</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The payment mode. Valid values:</p>
         * <br>
         * <p>*   total: all upfront</p>
         * <p>*   half: half upfront</p>
         * <p>*   zero: no upfront</p>
         */
        @NameInMap("PayMode")
        public String payMode;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The type of the savings plan.</p>
         */
        @NameInMap("SpnType")
        public String spnType;

        public static QuerySavingsPlansDiscountResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDiscountResponseBodyDataItems self = new QuerySavingsPlansDiscountResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setContractDiscountRate(String contractDiscountRate) {
            this.contractDiscountRate = contractDiscountRate;
            return this;
        }
        public String getContractDiscountRate() {
            return this.contractDiscountRate;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setDiscountRate(String discountRate) {
            this.discountRate = discountRate;
            return this;
        }
        public String getDiscountRate() {
            return this.discountRate;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public QuerySavingsPlansDiscountResponseBodyDataItems setSpnType(String spnType) {
            this.spnType = spnType;
            return this;
        }
        public String getSpnType() {
            return this.spnType;
        }

    }

    public static class QuerySavingsPlansDiscountResponseBodyData extends TeaModel {
        /**
         * <p>The IP address of the request.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The information about the discounts on saving plans.</p>
         */
        @NameInMap("Items")
        public java.util.List<QuerySavingsPlansDiscountResponseBodyDataItems> items;

        public static QuerySavingsPlansDiscountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingsPlansDiscountResponseBodyData self = new QuerySavingsPlansDiscountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySavingsPlansDiscountResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QuerySavingsPlansDiscountResponseBodyData setItems(java.util.List<QuerySavingsPlansDiscountResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySavingsPlansDiscountResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
