// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardsResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("Cards")
    public java.util.List<ListCardsResponseBodyCards> cards;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        // 创建时间
        @NameInMap("APN")
        public String APN;

        @NameInMap("ActivatedTime")
        public String activatedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ISP")
        public String ISP;

        // 资源一级ID
        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("Imei")
        public String imei;

        @NameInMap("Imsi")
        public String imsi;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Lock")
        public Boolean lock;

        @NameInMap("Name")
        public String name;

        // 资源名称
        @NameInMap("NetType")
        public String netType;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("UsageDataMonth")
        public Long usageDataMonth;

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

    }

}
