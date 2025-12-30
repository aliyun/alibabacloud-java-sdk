// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExportDomainExpireSnatchsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryExportDomainExpireSnatchsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryExportDomainExpireSnatchsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExportDomainExpireSnatchsResponseBody self = new QueryExportDomainExpireSnatchsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExportDomainExpireSnatchsResponseBody setData(java.util.List<QueryExportDomainExpireSnatchsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryExportDomainExpireSnatchsResponseBodyData> getData() {
        return this.data;
    }

    public QueryExportDomainExpireSnatchsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryExportDomainExpireSnatchsResponseBodyData extends TeaModel {
        @NameInMap("AuctionEndTime")
        public String auctionEndTime;

        @NameInMap("AuctionRemainingSeconds")
        public Long auctionRemainingSeconds;

        @NameInMap("BaiduAntiLink")
        public Integer baiduAntiLink;

        @NameInMap("BaiduExLink")
        public Integer baiduExLink;

        @NameInMap("BaiduIndex")
        public Integer baiduIndex;

        @NameInMap("BaiduWeight")
        public Integer baiduWeight;

        @NameInMap("BookEndTime")
        public String bookEndTime;

        @NameInMap("BookRemainingSeconds")
        public Long bookRemainingSeconds;

        @NameInMap("BookedNum")
        public Integer bookedNum;

        @NameInMap("BookedPartners")
        public String bookedPartners;

        @NameInMap("Constitute")
        public String constitute;

        @NameInMap("CurrencyType")
        public String currencyType;

        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("DomainLen")
        public Integer domainLen;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("FreezeAmount")
        public Double freezeAmount;

        @NameInMap("IcpNumber")
        public String icpNumber;

        @NameInMap("IcpStatus")
        public Boolean icpStatus;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("IsPremium")
        public Boolean isPremium;

        @NameInMap("PartnerTypes")
        public String partnerTypes;

        @NameInMap("Price")
        public Double price;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("RegDate")
        public String regDate;

        @NameInMap("Registrar")
        public String registrar;

        @NameInMap("RenewPrice")
        public Double renewPrice;

        @NameInMap("Reserved")
        public Boolean reserved;

        @NameInMap("RmbPrice")
        public Double rmbPrice;

        @NameInMap("S360Weight")
        public Integer s360Weight;

        @NameInMap("SeoAttributes")
        public String seoAttributes;

        @NameInMap("ShortName")
        public String shortName;

        @NameInMap("SnatchNo")
        public String snatchNo;

        @NameInMap("SnatchTypeDesc")
        public String snatchTypeDesc;

        @NameInMap("SougouAntiLink")
        public Integer sougouAntiLink;

        @NameInMap("SougouIndex")
        public Integer sougouIndex;

        @NameInMap("SougouWeight")
        public Integer sougouWeight;

        @NameInMap("Suffix")
        public String suffix;

        @NameInMap("Weight")
        public Integer weight;

        public static QueryExportDomainExpireSnatchsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryExportDomainExpireSnatchsResponseBodyData self = new QueryExportDomainExpireSnatchsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setAuctionEndTime(String auctionEndTime) {
            this.auctionEndTime = auctionEndTime;
            return this;
        }
        public String getAuctionEndTime() {
            return this.auctionEndTime;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setAuctionRemainingSeconds(Long auctionRemainingSeconds) {
            this.auctionRemainingSeconds = auctionRemainingSeconds;
            return this;
        }
        public Long getAuctionRemainingSeconds() {
            return this.auctionRemainingSeconds;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBaiduAntiLink(Integer baiduAntiLink) {
            this.baiduAntiLink = baiduAntiLink;
            return this;
        }
        public Integer getBaiduAntiLink() {
            return this.baiduAntiLink;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBaiduExLink(Integer baiduExLink) {
            this.baiduExLink = baiduExLink;
            return this;
        }
        public Integer getBaiduExLink() {
            return this.baiduExLink;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBaiduIndex(Integer baiduIndex) {
            this.baiduIndex = baiduIndex;
            return this;
        }
        public Integer getBaiduIndex() {
            return this.baiduIndex;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBaiduWeight(Integer baiduWeight) {
            this.baiduWeight = baiduWeight;
            return this;
        }
        public Integer getBaiduWeight() {
            return this.baiduWeight;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBookEndTime(String bookEndTime) {
            this.bookEndTime = bookEndTime;
            return this;
        }
        public String getBookEndTime() {
            return this.bookEndTime;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBookRemainingSeconds(Long bookRemainingSeconds) {
            this.bookRemainingSeconds = bookRemainingSeconds;
            return this;
        }
        public Long getBookRemainingSeconds() {
            return this.bookRemainingSeconds;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBookedNum(Integer bookedNum) {
            this.bookedNum = bookedNum;
            return this;
        }
        public Integer getBookedNum() {
            return this.bookedNum;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setBookedPartners(String bookedPartners) {
            this.bookedPartners = bookedPartners;
            return this;
        }
        public String getBookedPartners() {
            return this.bookedPartners;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setConstitute(String constitute) {
            this.constitute = constitute;
            return this;
        }
        public String getConstitute() {
            return this.constitute;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setCurrencyType(String currencyType) {
            this.currencyType = currencyType;
            return this;
        }
        public String getCurrencyType() {
            return this.currencyType;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setDomainLen(Integer domainLen) {
            this.domainLen = domainLen;
            return this;
        }
        public Integer getDomainLen() {
            return this.domainLen;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setFreezeAmount(Double freezeAmount) {
            this.freezeAmount = freezeAmount;
            return this;
        }
        public Double getFreezeAmount() {
            return this.freezeAmount;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setIcpNumber(String icpNumber) {
            this.icpNumber = icpNumber;
            return this;
        }
        public String getIcpNumber() {
            return this.icpNumber;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setIcpStatus(Boolean icpStatus) {
            this.icpStatus = icpStatus;
            return this;
        }
        public Boolean getIcpStatus() {
            return this.icpStatus;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setIsPremium(Boolean isPremium) {
            this.isPremium = isPremium;
            return this;
        }
        public Boolean getIsPremium() {
            return this.isPremium;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setPartnerTypes(String partnerTypes) {
            this.partnerTypes = partnerTypes;
            return this;
        }
        public String getPartnerTypes() {
            return this.partnerTypes;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }
        public String getRegDate() {
            return this.regDate;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setRegistrar(String registrar) {
            this.registrar = registrar;
            return this;
        }
        public String getRegistrar() {
            return this.registrar;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setRenewPrice(Double renewPrice) {
            this.renewPrice = renewPrice;
            return this;
        }
        public Double getRenewPrice() {
            return this.renewPrice;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setReserved(Boolean reserved) {
            this.reserved = reserved;
            return this;
        }
        public Boolean getReserved() {
            return this.reserved;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setRmbPrice(Double rmbPrice) {
            this.rmbPrice = rmbPrice;
            return this;
        }
        public Double getRmbPrice() {
            return this.rmbPrice;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setS360Weight(Integer s360Weight) {
            this.s360Weight = s360Weight;
            return this;
        }
        public Integer getS360Weight() {
            return this.s360Weight;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setSeoAttributes(String seoAttributes) {
            this.seoAttributes = seoAttributes;
            return this;
        }
        public String getSeoAttributes() {
            return this.seoAttributes;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setSnatchNo(String snatchNo) {
            this.snatchNo = snatchNo;
            return this;
        }
        public String getSnatchNo() {
            return this.snatchNo;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setSnatchTypeDesc(String snatchTypeDesc) {
            this.snatchTypeDesc = snatchTypeDesc;
            return this;
        }
        public String getSnatchTypeDesc() {
            return this.snatchTypeDesc;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setSougouAntiLink(Integer sougouAntiLink) {
            this.sougouAntiLink = sougouAntiLink;
            return this;
        }
        public Integer getSougouAntiLink() {
            return this.sougouAntiLink;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setSougouIndex(Integer sougouIndex) {
            this.sougouIndex = sougouIndex;
            return this;
        }
        public Integer getSougouIndex() {
            return this.sougouIndex;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setSougouWeight(Integer sougouWeight) {
            this.sougouWeight = sougouWeight;
            return this;
        }
        public Integer getSougouWeight() {
            return this.sougouWeight;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public QueryExportDomainExpireSnatchsResponseBodyData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
