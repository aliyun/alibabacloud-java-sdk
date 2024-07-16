// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardsResponseBody extends TeaModel {
    @NameInMap("Cards")
    public java.util.List<ListCardsResponseBodyCards> cards;

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

    public static ListCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCardsResponseBody self = new ListCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCardsResponseBody setCards(java.util.List<ListCardsResponseBodyCards> cards) {
        this.cards = cards;
        return this;
    }
    public java.util.List<ListCardsResponseBodyCards> getCards() {
        return this.cards;
    }

    public ListCardsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListCardsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCardsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListCardsResponseBodyCards extends TeaModel {
        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>bjaliyun01s.5gbj.bjiot</p>
         */
        @NameInMap("APN")
        public String APN;

        /**
         * <strong>example:</strong>
         * <p>2022-3-15 22:20:00</p>
         */
        @NameInMap("ActivatedTime")
        public String activatedTime;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Telecom</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>89091231231219123</p>
         */
        @NameInMap("Iccid")
        public String iccid;

        /**
         * <strong>example:</strong>
         * <p>7896129300</p>
         */
        @NameInMap("Imei")
        public String imei;

        /**
         * <strong>example:</strong>
         * <p>8912039123</p>
         */
        @NameInMap("Imsi")
        public String imsi;

        /**
         * <strong>example:</strong>
         * <p>10.0.0.118</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Lock")
        public Boolean lock;

        /**
         * <strong>example:</strong>
         * <p>1441204374591</p>
         */
        @NameInMap("Msisdn")
        public String msisdn;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>5G</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>89099123012</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>CONSUMER_THREE_IN_ONE</p>
         */
        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UsageDataMonth")
        public Long usageDataMonth;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("UsageDataTotal")
        public String usageDataTotal;

        public static ListCardsResponseBodyCards build(java.util.Map<String, ?> map) throws Exception {
            ListCardsResponseBodyCards self = new ListCardsResponseBodyCards();
            return TeaModel.build(map, self);
        }

        public ListCardsResponseBodyCards setAPN(String APN) {
            this.APN = APN;
            return this;
        }
        public String getAPN() {
            return this.APN;
        }

        public ListCardsResponseBodyCards setActivatedTime(String activatedTime) {
            this.activatedTime = activatedTime;
            return this;
        }
        public String getActivatedTime() {
            return this.activatedTime;
        }

        public ListCardsResponseBodyCards setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListCardsResponseBodyCards setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCardsResponseBodyCards setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public ListCardsResponseBodyCards setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public ListCardsResponseBodyCards setImei(String imei) {
            this.imei = imei;
            return this;
        }
        public String getImei() {
            return this.imei;
        }

        public ListCardsResponseBodyCards setImsi(String imsi) {
            this.imsi = imsi;
            return this;
        }
        public String getImsi() {
            return this.imsi;
        }

        public ListCardsResponseBodyCards setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListCardsResponseBodyCards setLock(Boolean lock) {
            this.lock = lock;
            return this;
        }
        public Boolean getLock() {
            return this.lock;
        }

        public ListCardsResponseBodyCards setMsisdn(String msisdn) {
            this.msisdn = msisdn;
            return this;
        }
        public String getMsisdn() {
            return this.msisdn;
        }

        public ListCardsResponseBodyCards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCardsResponseBodyCards setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public ListCardsResponseBodyCards setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListCardsResponseBodyCards setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListCardsResponseBodyCards setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCardsResponseBodyCards setUsageDataMonth(Long usageDataMonth) {
            this.usageDataMonth = usageDataMonth;
            return this;
        }
        public Long getUsageDataMonth() {
            return this.usageDataMonth;
        }

        public ListCardsResponseBodyCards setUsageDataTotal(String usageDataTotal) {
            this.usageDataTotal = usageDataTotal;
            return this;
        }
        public String getUsageDataTotal() {
            return this.usageDataTotal;
        }

    }

}
