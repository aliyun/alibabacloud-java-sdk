// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryPurchasedDomainsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryPurchasedDomainsResponseBodyData> data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryPurchasedDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPurchasedDomainsResponseBody self = new QueryPurchasedDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPurchasedDomainsResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryPurchasedDomainsResponseBody setData(java.util.List<QueryPurchasedDomainsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryPurchasedDomainsResponseBodyData> getData() {
        return this.data;
    }

    public QueryPurchasedDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPurchasedDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPurchasedDomainsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryPurchasedDomainsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryPurchasedDomainsResponseBodyData extends TeaModel {
        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("OperationStatus")
        public String operationStatus;

        @NameInMap("OperationTime")
        public String operationTime;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("TradeMoney")
        public Double tradeMoney;

        public static QueryPurchasedDomainsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPurchasedDomainsResponseBodyData self = new QueryPurchasedDomainsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPurchasedDomainsResponseBodyData setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public QueryPurchasedDomainsResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryPurchasedDomainsResponseBodyData setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public QueryPurchasedDomainsResponseBodyData setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public QueryPurchasedDomainsResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryPurchasedDomainsResponseBodyData setTradeMoney(Double tradeMoney) {
            this.tradeMoney = tradeMoney;
            return this;
        }
        public Double getTradeMoney() {
            return this.tradeMoney;
        }

    }

}
