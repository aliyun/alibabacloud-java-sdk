// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryAdvancedDomainListRequest extends TeaModel {
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    @NameInMap("DomainNameSort")
    public Boolean domainNameSort;

    @NameInMap("DomainStatus")
    public Integer domainStatus;

    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    @NameInMap("EndLength")
    public Integer endLength;

    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    @NameInMap("Excluded")
    public String excluded;

    @NameInMap("ExcludedPrefix")
    public Boolean excludedPrefix;

    @NameInMap("ExcludedSuffix")
    public Boolean excludedSuffix;

    @NameInMap("ExpirationDateSort")
    public Boolean expirationDateSort;

    @NameInMap("Form")
    public Integer form;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("KeyWordPrefix")
    public Boolean keyWordPrefix;

    @NameInMap("KeyWordSuffix")
    public Boolean keyWordSuffix;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductDomainType")
    public String productDomainType;

    @NameInMap("ProductDomainTypeSort")
    public Boolean productDomainTypeSort;

    @NameInMap("RegistrationDateSort")
    public Boolean registrationDateSort;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    @NameInMap("StartLength")
    public Integer startLength;

    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    @NameInMap("Suffixs")
    public String suffixs;

    @NameInMap("Tag")
    public java.util.List<QueryAdvancedDomainListRequestTag> tag;

    @NameInMap("TradeType")
    public Integer tradeType;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryAdvancedDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvancedDomainListRequest self = new QueryAdvancedDomainListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdvancedDomainListRequest setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public QueryAdvancedDomainListRequest setDomainNameSort(Boolean domainNameSort) {
        this.domainNameSort = domainNameSort;
        return this;
    }
    public Boolean getDomainNameSort() {
        return this.domainNameSort;
    }

    public QueryAdvancedDomainListRequest setDomainStatus(Integer domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public Integer getDomainStatus() {
        return this.domainStatus;
    }

    public QueryAdvancedDomainListRequest setEndExpirationDate(Long endExpirationDate) {
        this.endExpirationDate = endExpirationDate;
        return this;
    }
    public Long getEndExpirationDate() {
        return this.endExpirationDate;
    }

    public QueryAdvancedDomainListRequest setEndLength(Integer endLength) {
        this.endLength = endLength;
        return this;
    }
    public Integer getEndLength() {
        return this.endLength;
    }

    public QueryAdvancedDomainListRequest setEndRegistrationDate(Long endRegistrationDate) {
        this.endRegistrationDate = endRegistrationDate;
        return this;
    }
    public Long getEndRegistrationDate() {
        return this.endRegistrationDate;
    }

    public QueryAdvancedDomainListRequest setExcluded(String excluded) {
        this.excluded = excluded;
        return this;
    }
    public String getExcluded() {
        return this.excluded;
    }

    public QueryAdvancedDomainListRequest setExcludedPrefix(Boolean excludedPrefix) {
        this.excludedPrefix = excludedPrefix;
        return this;
    }
    public Boolean getExcludedPrefix() {
        return this.excludedPrefix;
    }

    public QueryAdvancedDomainListRequest setExcludedSuffix(Boolean excludedSuffix) {
        this.excludedSuffix = excludedSuffix;
        return this;
    }
    public Boolean getExcludedSuffix() {
        return this.excludedSuffix;
    }

    public QueryAdvancedDomainListRequest setExpirationDateSort(Boolean expirationDateSort) {
        this.expirationDateSort = expirationDateSort;
        return this;
    }
    public Boolean getExpirationDateSort() {
        return this.expirationDateSort;
    }

    public QueryAdvancedDomainListRequest setForm(Integer form) {
        this.form = form;
        return this;
    }
    public Integer getForm() {
        return this.form;
    }

    public QueryAdvancedDomainListRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryAdvancedDomainListRequest setKeyWordPrefix(Boolean keyWordPrefix) {
        this.keyWordPrefix = keyWordPrefix;
        return this;
    }
    public Boolean getKeyWordPrefix() {
        return this.keyWordPrefix;
    }

    public QueryAdvancedDomainListRequest setKeyWordSuffix(Boolean keyWordSuffix) {
        this.keyWordSuffix = keyWordSuffix;
        return this;
    }
    public Boolean getKeyWordSuffix() {
        return this.keyWordSuffix;
    }

    public QueryAdvancedDomainListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAdvancedDomainListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryAdvancedDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAdvancedDomainListRequest setProductDomainType(String productDomainType) {
        this.productDomainType = productDomainType;
        return this;
    }
    public String getProductDomainType() {
        return this.productDomainType;
    }

    public QueryAdvancedDomainListRequest setProductDomainTypeSort(Boolean productDomainTypeSort) {
        this.productDomainTypeSort = productDomainTypeSort;
        return this;
    }
    public Boolean getProductDomainTypeSort() {
        return this.productDomainTypeSort;
    }

    public QueryAdvancedDomainListRequest setRegistrationDateSort(Boolean registrationDateSort) {
        this.registrationDateSort = registrationDateSort;
        return this;
    }
    public Boolean getRegistrationDateSort() {
        return this.registrationDateSort;
    }

    public QueryAdvancedDomainListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public QueryAdvancedDomainListRequest setStartExpirationDate(Long startExpirationDate) {
        this.startExpirationDate = startExpirationDate;
        return this;
    }
    public Long getStartExpirationDate() {
        return this.startExpirationDate;
    }

    public QueryAdvancedDomainListRequest setStartLength(Integer startLength) {
        this.startLength = startLength;
        return this;
    }
    public Integer getStartLength() {
        return this.startLength;
    }

    public QueryAdvancedDomainListRequest setStartRegistrationDate(Long startRegistrationDate) {
        this.startRegistrationDate = startRegistrationDate;
        return this;
    }
    public Long getStartRegistrationDate() {
        return this.startRegistrationDate;
    }

    public QueryAdvancedDomainListRequest setSuffixs(String suffixs) {
        this.suffixs = suffixs;
        return this;
    }
    public String getSuffixs() {
        return this.suffixs;
    }

    public QueryAdvancedDomainListRequest setTag(java.util.List<QueryAdvancedDomainListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QueryAdvancedDomainListRequestTag> getTag() {
        return this.tag;
    }

    public QueryAdvancedDomainListRequest setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public Integer getTradeType() {
        return this.tradeType;
    }

    public QueryAdvancedDomainListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class QueryAdvancedDomainListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryAdvancedDomainListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvancedDomainListRequestTag self = new QueryAdvancedDomainListRequestTag();
            return TeaModel.build(map, self);
        }

        public QueryAdvancedDomainListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryAdvancedDomainListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
