// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageCommodityListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryStorageCommodityListResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStorageCommodityListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageCommodityListResponseBody self = new QueryStorageCommodityListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStorageCommodityListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStorageCommodityListResponseBody setData(java.util.List<QueryStorageCommodityListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryStorageCommodityListResponseBodyData> getData() {
        return this.data;
    }

    public QueryStorageCommodityListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStorageCommodityListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStorageCommodityListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStorageCommodityListResponseBodyData extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("Lifecycle")
        public Integer lifecycle;

        @NameInMap("Months")
        public Integer months;

        @NameInMap("Price")
        public String price;

        @NameInMap("RecordType")
        public Integer recordType;

        @NameInMap("Specification")
        public String specification;

        public static QueryStorageCommodityListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStorageCommodityListResponseBodyData self = new QueryStorageCommodityListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStorageCommodityListResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryStorageCommodityListResponseBodyData setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryStorageCommodityListResponseBodyData setLifecycle(Integer lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        public QueryStorageCommodityListResponseBodyData setMonths(Integer months) {
            this.months = months;
            return this;
        }
        public Integer getMonths() {
            return this.months;
        }

        public QueryStorageCommodityListResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QueryStorageCommodityListResponseBodyData setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public QueryStorageCommodityListResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

}
