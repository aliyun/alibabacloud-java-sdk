// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBrokerDemandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryBrokerDemandResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>497F7522-82B0-4BD4-84FE-AE8749E4C2F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryBrokerDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBrokerDemandResponseBody self = new QueryBrokerDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBrokerDemandResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryBrokerDemandResponseBody setData(java.util.List<QueryBrokerDemandResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryBrokerDemandResponseBodyData> getData() {
        return this.data;
    }

    public QueryBrokerDemandResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBrokerDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBrokerDemandResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryBrokerDemandResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryBrokerDemandResponseBodyData extends TeaModel {
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <strong>example:</strong>
         * <p>13300000001</p>
         */
        @NameInMap("BargainSellerMobile")
        public String bargainSellerMobile;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BargainSellerPrice")
        public Float bargainSellerPrice;

        /**
         * <strong>example:</strong>
         * <p>SE20183915FI0178</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>taobao.com</p>
         */
        @NameInMap("DemandDomain")
        public String demandDomain;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DemandPrice")
        public Float demandPrice;

        @NameInMap("Description")
        public String description;

        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>13300000000</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("OrderType")
        public Integer orderType;

        @NameInMap("PartnerDomain")
        public String partnerDomain;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("PayDomain")
        public String payDomain;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PayPrice")
        public Float payPrice;

        /**
         * <strong>example:</strong>
         * <p>1524800053000</p>
         */
        @NameInMap("PayTime")
        public Long payTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProduceType")
        public Integer produceType;

        /**
         * <strong>example:</strong>
         * <p>1524800053000</p>
         */
        @NameInMap("PublishTime")
        public Long publishTime;

        @NameInMap("PurchaseStatus")
        public Integer purchaseStatus;

        /**
         * <strong>example:</strong>
         * <p>18800</p>
         */
        @NameInMap("ServicePayPrice")
        public Float servicePayPrice;

        @NameInMap("SettleBasePrice")
        public Float settleBasePrice;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryBrokerDemandResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBrokerDemandResponseBodyData self = new QueryBrokerDemandResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBrokerDemandResponseBodyData setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public QueryBrokerDemandResponseBodyData setBargainSellerMobile(String bargainSellerMobile) {
            this.bargainSellerMobile = bargainSellerMobile;
            return this;
        }
        public String getBargainSellerMobile() {
            return this.bargainSellerMobile;
        }

        public QueryBrokerDemandResponseBodyData setBargainSellerPrice(Float bargainSellerPrice) {
            this.bargainSellerPrice = bargainSellerPrice;
            return this;
        }
        public Float getBargainSellerPrice() {
            return this.bargainSellerPrice;
        }

        public QueryBrokerDemandResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryBrokerDemandResponseBodyData setDemandDomain(String demandDomain) {
            this.demandDomain = demandDomain;
            return this;
        }
        public String getDemandDomain() {
            return this.demandDomain;
        }

        public QueryBrokerDemandResponseBodyData setDemandPrice(Float demandPrice) {
            this.demandPrice = demandPrice;
            return this;
        }
        public Float getDemandPrice() {
            return this.demandPrice;
        }

        public QueryBrokerDemandResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBrokerDemandResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryBrokerDemandResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryBrokerDemandResponseBodyData setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public QueryBrokerDemandResponseBodyData setPartnerDomain(String partnerDomain) {
            this.partnerDomain = partnerDomain;
            return this;
        }
        public String getPartnerDomain() {
            return this.partnerDomain;
        }

        public QueryBrokerDemandResponseBodyData setPayDomain(String payDomain) {
            this.payDomain = payDomain;
            return this;
        }
        public String getPayDomain() {
            return this.payDomain;
        }

        public QueryBrokerDemandResponseBodyData setPayPrice(Float payPrice) {
            this.payPrice = payPrice;
            return this;
        }
        public Float getPayPrice() {
            return this.payPrice;
        }

        public QueryBrokerDemandResponseBodyData setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public QueryBrokerDemandResponseBodyData setProduceType(Integer produceType) {
            this.produceType = produceType;
            return this;
        }
        public Integer getProduceType() {
            return this.produceType;
        }

        public QueryBrokerDemandResponseBodyData setPublishTime(Long publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public Long getPublishTime() {
            return this.publishTime;
        }

        public QueryBrokerDemandResponseBodyData setPurchaseStatus(Integer purchaseStatus) {
            this.purchaseStatus = purchaseStatus;
            return this;
        }
        public Integer getPurchaseStatus() {
            return this.purchaseStatus;
        }

        public QueryBrokerDemandResponseBodyData setServicePayPrice(Float servicePayPrice) {
            this.servicePayPrice = servicePayPrice;
            return this;
        }
        public Float getServicePayPrice() {
            return this.servicePayPrice;
        }

        public QueryBrokerDemandResponseBodyData setSettleBasePrice(Float settleBasePrice) {
            this.settleBasePrice = settleBasePrice;
            return this;
        }
        public Float getSettleBasePrice() {
            return this.settleBasePrice;
        }

        public QueryBrokerDemandResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
