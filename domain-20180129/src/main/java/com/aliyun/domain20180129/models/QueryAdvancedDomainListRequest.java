// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryAdvancedDomainListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DomainNameSort")
    public Boolean domainNameSort;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public Integer domainStatus;

    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EndLength")
    public Integer endLength;

    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Excluded")
    public String excluded;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExcludedPrefix")
    public Boolean excludedPrefix;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExcludedSuffix")
    public Boolean excludedSuffix;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExpirationDateSort")
    public Boolean expirationDateSort;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Form")
    public Integer form;

    @NameInMap("IsPremiumDomain")
    public Boolean isPremiumDomain;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeyWordPrefix")
    public Boolean keyWordPrefix;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("KeyWordSuffix")
    public Boolean keyWordSuffix;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>gTLD</p>
     */
    @NameInMap("ProductDomainType")
    public String productDomainType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProductDomainTypeSort")
    public Boolean productDomainTypeSort;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RegistrationDateSort")
    public Boolean registrationDateSort;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmw6bpc6n7zai</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("StartLength")
    public Integer startLength;

    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    /**
     * <strong>example:</strong>
     * <p>com.cn</p>
     */
    @NameInMap("Suffixs")
    public String suffixs;

    @NameInMap("Tag")
    public java.util.List<QueryAdvancedDomainListRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TradeType")
    public Integer tradeType;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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

    public QueryAdvancedDomainListRequest setIsPremiumDomain(Boolean isPremiumDomain) {
        this.isPremiumDomain = isPremiumDomain;
        return this;
    }
    public Boolean getIsPremiumDomain() {
        return this.isPremiumDomain;
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
