// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListOrdersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Orders")
    public java.util.List<ListOrdersResponseBodyOrders> orders;

    /**
     * <strong>example:</strong>
     * <p>88C2F32F-B641-5980-B7A5-6907050ABCD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>NewBuy</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("CardCount")
        public String cardCount;

        /**
         * <strong>example:</strong>
         * <p>5G</p>
         */
        @NameInMap("CardNetType")
        public String cardNetType;

        /**
         * <strong>example:</strong>
         * <p>CONSUMER_THREE_IN_ONE</p>
         */
        @NameInMap("CardType")
        public String cardType;

        @NameInMap("ContactName")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>139000*******</p>
         */
        @NameInMap("ContactPhone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>2022-3-15 21:20:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>order-test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>SF14*********</p>
         */
        @NameInMap("LogisticsId")
        public String logisticsId;

        /**
         * <strong>example:</strong>
         * <p>Signed</p>
         */
        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        /**
         * <strong>example:</strong>
         * <p>SF</p>
         */
        @NameInMap("LogisticsType")
        public String logisticsType;

        /**
         * <strong>example:</strong>
         * <p>2022-3-15 22:20:00</p>
         */
        @NameInMap("LogisticsUpdateTime")
        public String logisticsUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>89************</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>2022-3-15 21:30:00</p>
         */
        @NameInMap("PayTime")
        public String payTime;

        @NameInMap("PostAddress")
        public String postAddress;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
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
