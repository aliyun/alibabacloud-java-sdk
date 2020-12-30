// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ScrollDomainListRequest extends TeaModel {
    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    @NameInMap("ProductDomainType")
    public String productDomainType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    @NameInMap("DomainStatus")
    public Integer domainStatus;

    @NameInMap("EndLength")
    public Integer endLength;

    @NameInMap("Excluded")
    public String excluded;

    @NameInMap("ExcludedPrefix")
    public Boolean excludedPrefix;

    @NameInMap("ExcludedSuffix")
    public Boolean excludedSuffix;

    @NameInMap("Form")
    public Integer form;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("KeyWordPrefix")
    public Boolean keyWordPrefix;

    @NameInMap("KeyWordSuffix")
    public Boolean keyWordSuffix;

    @NameInMap("StartLength")
    public Integer startLength;

    @NameInMap("TradeType")
    public Integer tradeType;

    @NameInMap("Suffixs")
    public String suffixs;

    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    @NameInMap("ScrollId")
    public String scrollId;

    public static ScrollDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        ScrollDomainListRequest self = new ScrollDomainListRequest();
        return TeaModel.build(map, self);
    }

    public ScrollDomainListRequest setEndExpirationDate(Long endExpirationDate) {
        this.endExpirationDate = endExpirationDate;
        return this;
    }
    public Long getEndExpirationDate() {
        return this.endExpirationDate;
    }

    public ScrollDomainListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public ScrollDomainListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ScrollDomainListRequest setStartExpirationDate(Long startExpirationDate) {
        this.startExpirationDate = startExpirationDate;
        return this;
    }
    public Long getStartExpirationDate() {
        return this.startExpirationDate;
    }

    public ScrollDomainListRequest setProductDomainType(String productDomainType) {
        this.productDomainType = productDomainType;
        return this;
    }
    public String getProductDomainType() {
        return this.productDomainType;
    }

    public ScrollDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ScrollDomainListRequest setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public ScrollDomainListRequest setDomainStatus(Integer domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public Integer getDomainStatus() {
        return this.domainStatus;
    }

    public ScrollDomainListRequest setEndLength(Integer endLength) {
        this.endLength = endLength;
        return this;
    }
    public Integer getEndLength() {
        return this.endLength;
    }

    public ScrollDomainListRequest setExcluded(String excluded) {
        this.excluded = excluded;
        return this;
    }
    public String getExcluded() {
        return this.excluded;
    }

    public ScrollDomainListRequest setExcludedPrefix(Boolean excludedPrefix) {
        this.excludedPrefix = excludedPrefix;
        return this;
    }
    public Boolean getExcludedPrefix() {
        return this.excludedPrefix;
    }

    public ScrollDomainListRequest setExcludedSuffix(Boolean excludedSuffix) {
        this.excludedSuffix = excludedSuffix;
        return this;
    }
    public Boolean getExcludedSuffix() {
        return this.excludedSuffix;
    }

    public ScrollDomainListRequest setForm(Integer form) {
        this.form = form;
        return this;
    }
    public Integer getForm() {
        return this.form;
    }

    public ScrollDomainListRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ScrollDomainListRequest setKeyWordPrefix(Boolean keyWordPrefix) {
        this.keyWordPrefix = keyWordPrefix;
        return this;
    }
    public Boolean getKeyWordPrefix() {
        return this.keyWordPrefix;
    }

    public ScrollDomainListRequest setKeyWordSuffix(Boolean keyWordSuffix) {
        this.keyWordSuffix = keyWordSuffix;
        return this;
    }
    public Boolean getKeyWordSuffix() {
        return this.keyWordSuffix;
    }

    public ScrollDomainListRequest setStartLength(Integer startLength) {
        this.startLength = startLength;
        return this;
    }
    public Integer getStartLength() {
        return this.startLength;
    }

    public ScrollDomainListRequest setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public Integer getTradeType() {
        return this.tradeType;
    }

    public ScrollDomainListRequest setSuffixs(String suffixs) {
        this.suffixs = suffixs;
        return this;
    }
    public String getSuffixs() {
        return this.suffixs;
    }

    public ScrollDomainListRequest setStartRegistrationDate(Long startRegistrationDate) {
        this.startRegistrationDate = startRegistrationDate;
        return this;
    }
    public Long getStartRegistrationDate() {
        return this.startRegistrationDate;
    }

    public ScrollDomainListRequest setEndRegistrationDate(Long endRegistrationDate) {
        this.endRegistrationDate = endRegistrationDate;
        return this;
    }
    public Long getEndRegistrationDate() {
        return this.endRegistrationDate;
    }

    public ScrollDomainListRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

}
