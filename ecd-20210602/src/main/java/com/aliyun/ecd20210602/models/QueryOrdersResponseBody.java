// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class QueryOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryOrdersResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersResponseBody self = new QueryOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrdersResponseBody setData(java.util.List<QueryOrdersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOrdersResponseBodyData> getData() {
        return this.data;
    }

    public QueryOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrdersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrdersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrdersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrdersResponseBodyDataAppDTO extends TeaModel {
        @NameInMap("Developer")
        public String developer;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("LicenseType")
        public Long licenseType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static QueryOrdersResponseBodyDataAppDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseBodyDataAppDTO self = new QueryOrdersResponseBodyDataAppDTO();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseBodyDataAppDTO setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public QueryOrdersResponseBodyDataAppDTO setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryOrdersResponseBodyDataAppDTO setLicenseType(Long licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Long getLicenseType() {
            return this.licenseType;
        }

        public QueryOrdersResponseBodyDataAppDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrdersResponseBodyDataAppDTO setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryOrdersResponseBodyData extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        @NameInMap("AppDTO")
        public QueryOrdersResponseBodyDataAppDTO appDTO;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OrderName")
        public String orderName;

        @NameInMap("OrderTime")
        public String orderTime;

        @NameInMap("OutDateTime")
        public Long outDateTime;

        @NameInMap("PaymentTime")
        public String paymentTime;

        @NameInMap("Price")
        public String price;

        @NameInMap("RawPrice")
        public String rawPrice;

        @NameInMap("Status")
        public Long status;

        @NameInMap("orderId")
        public String orderId;

        public static QueryOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseBodyData self = new QueryOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseBodyData setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QueryOrdersResponseBodyData setAppDTO(QueryOrdersResponseBodyDataAppDTO appDTO) {
            this.appDTO = appDTO;
            return this;
        }
        public QueryOrdersResponseBodyDataAppDTO getAppDTO() {
            return this.appDTO;
        }

        public QueryOrdersResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOrdersResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryOrdersResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryOrdersResponseBodyData setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }
        public String getOrderName() {
            return this.orderName;
        }

        public QueryOrdersResponseBodyData setOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public String getOrderTime() {
            return this.orderTime;
        }

        public QueryOrdersResponseBodyData setOutDateTime(Long outDateTime) {
            this.outDateTime = outDateTime;
            return this;
        }
        public Long getOutDateTime() {
            return this.outDateTime;
        }

        public QueryOrdersResponseBodyData setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QueryOrdersResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QueryOrdersResponseBodyData setRawPrice(String rawPrice) {
            this.rawPrice = rawPrice;
            return this;
        }
        public String getRawPrice() {
            return this.rawPrice;
        }

        public QueryOrdersResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryOrdersResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
