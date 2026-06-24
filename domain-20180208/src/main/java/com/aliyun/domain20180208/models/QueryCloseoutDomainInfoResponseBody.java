// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryCloseoutDomainInfoResponseBody extends TeaModel {
    @NameInMap("Module")
    public QueryCloseoutDomainInfoResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCloseoutDomainInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCloseoutDomainInfoResponseBody self = new QueryCloseoutDomainInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCloseoutDomainInfoResponseBody setModule(QueryCloseoutDomainInfoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryCloseoutDomainInfoResponseBodyModule getModule() {
        return this.module;
    }

    public QueryCloseoutDomainInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCloseoutDomainInfoResponseBodyModule extends TeaModel {
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

        @NameInMap("BookedPartners")
        public String bookedPartners;

        @NameInMap("Constitute")
        public String constitute;

        @NameInMap("CurrencyType")
        public String currencyType;

        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("DomainLen")
        public Integer domainLen;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainType")
        public String domainType;

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

        @NameInMap("Reserved")
        public Boolean reserved;

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

        @NameInMap("TransferInPrice")
        public Double transferInPrice;

        @NameInMap("Weight")
        public Integer weight;

        public static QueryCloseoutDomainInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryCloseoutDomainInfoResponseBodyModule self = new QueryCloseoutDomainInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryCloseoutDomainInfoResponseBodyModule setAuctionEndTime(String auctionEndTime) {
            this.auctionEndTime = auctionEndTime;
            return this;
        }
        public String getAuctionEndTime() {
            return this.auctionEndTime;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setAuctionRemainingSeconds(Long auctionRemainingSeconds) {
            this.auctionRemainingSeconds = auctionRemainingSeconds;
            return this;
        }
        public Long getAuctionRemainingSeconds() {
            return this.auctionRemainingSeconds;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setBaiduAntiLink(Integer baiduAntiLink) {
            this.baiduAntiLink = baiduAntiLink;
            return this;
        }
        public Integer getBaiduAntiLink() {
            return this.baiduAntiLink;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setBaiduExLink(Integer baiduExLink) {
            this.baiduExLink = baiduExLink;
            return this;
        }
        public Integer getBaiduExLink() {
            return this.baiduExLink;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setBaiduIndex(Integer baiduIndex) {
            this.baiduIndex = baiduIndex;
            return this;
        }
        public Integer getBaiduIndex() {
            return this.baiduIndex;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setBaiduWeight(Integer baiduWeight) {
            this.baiduWeight = baiduWeight;
            return this;
        }
        public Integer getBaiduWeight() {
            return this.baiduWeight;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setBookEndTime(String bookEndTime) {
            this.bookEndTime = bookEndTime;
            return this;
        }
        public String getBookEndTime() {
            return this.bookEndTime;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setBookRemainingSeconds(Long bookRemainingSeconds) {
            this.bookRemainingSeconds = bookRemainingSeconds;
            return this;
        }
        public Long getBookRemainingSeconds() {
            return this.bookRemainingSeconds;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setBookedPartners(String bookedPartners) {
            this.bookedPartners = bookedPartners;
            return this;
        }
        public String getBookedPartners() {
            return this.bookedPartners;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setConstitute(String constitute) {
            this.constitute = constitute;
            return this;
        }
        public String getConstitute() {
            return this.constitute;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setCurrencyType(String currencyType) {
            this.currencyType = currencyType;
            return this;
        }
        public String getCurrencyType() {
            return this.currencyType;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setDomainLen(Integer domainLen) {
            this.domainLen = domainLen;
            return this;
        }
        public Integer getDomainLen() {
            return this.domainLen;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setFreezeAmount(Double freezeAmount) {
            this.freezeAmount = freezeAmount;
            return this;
        }
        public Double getFreezeAmount() {
            return this.freezeAmount;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setIcpNumber(String icpNumber) {
            this.icpNumber = icpNumber;
            return this;
        }
        public String getIcpNumber() {
            return this.icpNumber;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setIcpStatus(Boolean icpStatus) {
            this.icpStatus = icpStatus;
            return this;
        }
        public Boolean getIcpStatus() {
            return this.icpStatus;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setIsPremium(Boolean isPremium) {
            this.isPremium = isPremium;
            return this;
        }
        public Boolean getIsPremium() {
            return this.isPremium;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setPartnerTypes(String partnerTypes) {
            this.partnerTypes = partnerTypes;
            return this;
        }
        public String getPartnerTypes() {
            return this.partnerTypes;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }
        public String getRegDate() {
            return this.regDate;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setRegistrar(String registrar) {
            this.registrar = registrar;
            return this;
        }
        public String getRegistrar() {
            return this.registrar;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setReserved(Boolean reserved) {
            this.reserved = reserved;
            return this;
        }
        public Boolean getReserved() {
            return this.reserved;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setS360Weight(Integer s360Weight) {
            this.s360Weight = s360Weight;
            return this;
        }
        public Integer getS360Weight() {
            return this.s360Weight;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setSeoAttributes(String seoAttributes) {
            this.seoAttributes = seoAttributes;
            return this;
        }
        public String getSeoAttributes() {
            return this.seoAttributes;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setSnatchNo(String snatchNo) {
            this.snatchNo = snatchNo;
            return this;
        }
        public String getSnatchNo() {
            return this.snatchNo;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setSnatchTypeDesc(String snatchTypeDesc) {
            this.snatchTypeDesc = snatchTypeDesc;
            return this;
        }
        public String getSnatchTypeDesc() {
            return this.snatchTypeDesc;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setSougouAntiLink(Integer sougouAntiLink) {
            this.sougouAntiLink = sougouAntiLink;
            return this;
        }
        public Integer getSougouAntiLink() {
            return this.sougouAntiLink;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setSougouIndex(Integer sougouIndex) {
            this.sougouIndex = sougouIndex;
            return this;
        }
        public Integer getSougouIndex() {
            return this.sougouIndex;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setSougouWeight(Integer sougouWeight) {
            this.sougouWeight = sougouWeight;
            return this;
        }
        public Integer getSougouWeight() {
            return this.sougouWeight;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setTransferInPrice(Double transferInPrice) {
            this.transferInPrice = transferInPrice;
            return this;
        }
        public Double getTransferInPrice() {
            return this.transferInPrice;
        }

        public QueryCloseoutDomainInfoResponseBodyModule setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
