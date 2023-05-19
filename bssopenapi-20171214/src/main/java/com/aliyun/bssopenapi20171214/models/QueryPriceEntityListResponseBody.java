// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPriceEntityListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public QueryPriceEntityListResponseBodyData data;

    /**
     * <p>The message that is returned.</p>
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

    public static QueryPriceEntityListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceEntityListResponseBody self = new QueryPriceEntityListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPriceEntityListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPriceEntityListResponseBody setData(QueryPriceEntityListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPriceEntityListResponseBodyData getData() {
        return this.data;
    }

    public QueryPriceEntityListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPriceEntityListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPriceEntityListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList extends TeaModel {
        /**
         * <p>The code of the factor.</p>
         */
        @NameInMap("PriceFactorCode")
        public String priceFactorCode;

        /**
         * <p>The name of the factor.</p>
         */
        @NameInMap("PriceFactorName")
        public String priceFactorName;

        /**
         * <p>The values of the factor.</p>
         */
        @NameInMap("PriceFactorValueList")
        public java.util.List<String> priceFactorValueList;

        public static QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList self = new QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList();
            return TeaModel.build(map, self);
        }

        public QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList setPriceFactorCode(String priceFactorCode) {
            this.priceFactorCode = priceFactorCode;
            return this;
        }
        public String getPriceFactorCode() {
            return this.priceFactorCode;
        }

        public QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList setPriceFactorName(String priceFactorName) {
            this.priceFactorName = priceFactorName;
            return this;
        }
        public String getPriceFactorName() {
            return this.priceFactorName;
        }

        public QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList setPriceFactorValueList(java.util.List<String> priceFactorValueList) {
            this.priceFactorValueList = priceFactorValueList;
            return this;
        }
        public java.util.List<String> getPriceFactorValueList() {
            return this.priceFactorValueList;
        }

    }

    public static class QueryPriceEntityListResponseBodyDataPriceEntityInfoList extends TeaModel {
        /**
         * <p>The code of the billable item.</p>
         */
        @NameInMap("PriceEntityCode")
        public String priceEntityCode;

        /**
         * <p>The name of the billable item.</p>
         */
        @NameInMap("PriceEntityName")
        public String priceEntityName;

        /**
         * <p>The factors of the billable item.</p>
         */
        @NameInMap("PriceFactorList")
        public java.util.List<QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList> priceFactorList;

        public static QueryPriceEntityListResponseBodyDataPriceEntityInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceEntityListResponseBodyDataPriceEntityInfoList self = new QueryPriceEntityListResponseBodyDataPriceEntityInfoList();
            return TeaModel.build(map, self);
        }

        public QueryPriceEntityListResponseBodyDataPriceEntityInfoList setPriceEntityCode(String priceEntityCode) {
            this.priceEntityCode = priceEntityCode;
            return this;
        }
        public String getPriceEntityCode() {
            return this.priceEntityCode;
        }

        public QueryPriceEntityListResponseBodyDataPriceEntityInfoList setPriceEntityName(String priceEntityName) {
            this.priceEntityName = priceEntityName;
            return this;
        }
        public String getPriceEntityName() {
            return this.priceEntityName;
        }

        public QueryPriceEntityListResponseBodyDataPriceEntityInfoList setPriceFactorList(java.util.List<QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList> priceFactorList) {
            this.priceFactorList = priceFactorList;
            return this;
        }
        public java.util.List<QueryPriceEntityListResponseBodyDataPriceEntityInfoListPriceFactorList> getPriceFactorList() {
            return this.priceFactorList;
        }

    }

    public static class QueryPriceEntityListResponseBodyData extends TeaModel {
        /**
         * <p>The information about the billable items.</p>
         */
        @NameInMap("PriceEntityInfoList")
        public java.util.List<QueryPriceEntityListResponseBodyDataPriceEntityInfoList> priceEntityInfoList;

        public static QueryPriceEntityListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceEntityListResponseBodyData self = new QueryPriceEntityListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPriceEntityListResponseBodyData setPriceEntityInfoList(java.util.List<QueryPriceEntityListResponseBodyDataPriceEntityInfoList> priceEntityInfoList) {
            this.priceEntityInfoList = priceEntityInfoList;
            return this;
        }
        public java.util.List<QueryPriceEntityListResponseBodyDataPriceEntityInfoList> getPriceEntityInfoList() {
            return this.priceEntityInfoList;
        }

    }

}
