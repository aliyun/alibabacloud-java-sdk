// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListOrdersResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // 数组，返回示例目录。
    @NameInMap("Orders")
    public java.util.List<ListOrdersResponseBodyOrders> orders;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrdersResponseBody self = new ListOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrdersResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListOrdersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrdersResponseBody setOrders(java.util.List<ListOrdersResponseBodyOrders> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<ListOrdersResponseBodyOrders> getOrders() {
        return this.orders;
    }

    public ListOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrdersResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrdersResponseBodyOrders extends TeaModel {
        // 创建时间
        @NameInMap("Action")
        public String action;

        @NameInMap("CardCount")
        public String cardCount;

        @NameInMap("CardNetType")
        public String cardNetType;

        @NameInMap("CardType")
        public String cardType;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("ContactPhone")
        public String contactPhone;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("LogisticsId")
        public String logisticsId;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("LogisticsType")
        public String logisticsType;

        @NameInMap("LogisticsUpdateTime")
        public String logisticsUpdateTime;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PayTime")
        public String payTime;

        @NameInMap("PostAddress")
        public String postAddress;

        @NameInMap("RegionId")
        public String regionId;

        // 资源名称
        @NameInMap("Status")
        public String status;

        public static ListOrdersResponseBodyOrders build(java.util.Map<String, ?> map) throws Exception {
            ListOrdersResponseBodyOrders self = new ListOrdersResponseBodyOrders();
            return TeaModel.build(map, self);
        }

        public ListOrdersResponseBodyOrders setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListOrdersResponseBodyOrders setCardCount(String cardCount) {
            this.cardCount = cardCount;
            return this;
        }
        public String getCardCount() {
            return this.cardCount;
        }

        public ListOrdersResponseBodyOrders setCardNetType(String cardNetType) {
            this.cardNetType = cardNetType;
            return this;
        }
        public String getCardNetType() {
            return this.cardNetType;
        }

        public ListOrdersResponseBodyOrders setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public ListOrdersResponseBodyOrders setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListOrdersResponseBodyOrders setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public ListOrdersResponseBodyOrders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOrdersResponseBodyOrders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOrdersResponseBodyOrders setLogisticsId(String logisticsId) {
            this.logisticsId = logisticsId;
            return this;
        }
        public String getLogisticsId() {
            return this.logisticsId;
        }

        public ListOrdersResponseBodyOrders setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public ListOrdersResponseBodyOrders setLogisticsType(String logisticsType) {
            this.logisticsType = logisticsType;
            return this;
        }
        public String getLogisticsType() {
            return this.logisticsType;
        }

        public ListOrdersResponseBodyOrders setLogisticsUpdateTime(String logisticsUpdateTime) {
            this.logisticsUpdateTime = logisticsUpdateTime;
            return this;
        }
        public String getLogisticsUpdateTime() {
            return this.logisticsUpdateTime;
        }

        public ListOrdersResponseBodyOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListOrdersResponseBodyOrders setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public ListOrdersResponseBodyOrders setPostAddress(String postAddress) {
            this.postAddress = postAddress;
            return this;
        }
        public String getPostAddress() {
            return this.postAddress;
        }

        public ListOrdersResponseBodyOrders setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOrdersResponseBodyOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
