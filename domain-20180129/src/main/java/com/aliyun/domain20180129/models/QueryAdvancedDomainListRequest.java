// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryAdvancedDomainListRequest extends TeaModel {
    /**
     * <p>Domain group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>Sorting field based on lexicographic order of domain names. Valid values:  </p>
     * <ul>
     * <li><strong>false</strong>: Descending order  </li>
     * <li><strong>true</strong>: Ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DomainNameSort")
    public Boolean domainNameSort;

    /**
     * <p>Domain status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: All.</li>
     * <li><strong>1</strong>: Renewal required urgently.</li>
     * <li><strong>2</strong>: Redemption required urgently.</li>
     * <li><strong>3</strong>: Normal.</li>
     * <li><strong>4</strong>: Transferring out from HiChina.</li>
     * <li><strong>5</strong>: Registrant information being modified.</li>
     * <li><strong>6</strong>: Identity verification not completed.</li>
     * <li><strong>7</strong>: Review failed; re-initiate identity verification.</li>
     * <li><strong>8</strong>: Under review.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public Integer domainStatus;

    /**
     * <p>End time for expiration date range query, represented as the number of milliseconds since 00:00:00 UTC on January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    /**
     * <p>End length for domain name length range query.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EndLength")
    public Integer endLength;

    /**
     * <p>The end time of the registration date range query, expressed as the number of milliseconds since 00:00 on January 1, 1970, UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    /**
     * <p>Excluded keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Excluded")
    public String excluded;

    /**
     * <p>Keyword to exclude at the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExcludedPrefix")
    public Boolean excludedPrefix;

    /**
     * <p>Keyword to exclude at the end.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExcludedSuffix")
    public Boolean excludedSuffix;

    /**
     * <p>Sorting field based on expiration date. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Descending order.</li>
     * <li><strong>true</strong>: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExpirationDateSort")
    public Boolean expirationDateSort;

    /**
     * <p>Domain name composition information:  </p>
     * <ul>
     * <li><strong>11</strong>: Numeric-only domain name  </li>
     * <li><strong>12</strong>: Letter-only domain name  </li>
     * <li><strong>13</strong>: Mixed domain name (combination of letters and numbers)  </li>
     * <li><strong>14</strong>: Chinese domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Form")
    public Integer form;

    /**
     * <p>Indicates whether the domain is a premium domain. Valid values:  </p>
     * <ul>
     * <li><strong>false</strong>: No  </li>
     * <li><strong>true</strong>: Yes</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPremiumDomain")
    public Boolean isPremiumDomain;

    /**
     * <p>Keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>Keyword at the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeyWordPrefix")
    public Boolean keyWordPrefix;

    /**
     * <p>Keyword at the end.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("KeyWordSuffix")
    public Boolean keyWordSuffix;

    /**
     * <p>The language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Page number for paging. The minimum value is <strong>0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Page size for paging. The minimum value is <strong>1</strong> and the maximum value is <strong>200</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Domain name type. Valid values:</p>
     * <ul>
     * <li><strong>New gTLD</strong> (new top-level domain).</li>
     * <li><strong>gTLD</strong> (generic top-level domain).</li>
     * <li><strong>ccTLD</strong> (country code top-level domain).</li>
     * <li><strong>other</strong> (other top-level domains not listed above).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gTLD</p>
     */
    @NameInMap("ProductDomainType")
    public String productDomainType;

    /**
     * <p>Sorting field, used to sort by domain name type. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Descending order.</li>
     * <li><strong>true</strong>: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProductDomainTypeSort")
    public Boolean productDomainTypeSort;

    /**
     * <p>Sorting field based on registration date. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Descending order.</li>
     * <li><strong>true</strong>: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RegistrationDateSort")
    public Boolean registrationDateSort;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw6bpc6n7zai</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Start time for expiration date range query, represented as the number of milliseconds since 00:00:00 UTC on January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    /**
     * <p>The starting length for domain name length range queries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("StartLength")
    public Integer startLength;

    /**
     * <p>The start time of the registration date range query, expressed as the number of milliseconds since 00:00 on January 1, 1970, UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    /**
     * <p>List of suffixes to query, separated by commas (&quot;,&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>com.cn</p>
     */
    @NameInMap("Suffixs")
    public String suffixs;

    /**
     * <p>List of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<QueryAdvancedDomainListRequestTag> tag;

    /**
     * <p>Publishing status. Valid values:  </p>
     * <ul>
     * <li><strong>2</strong>: Fixed-price listing published  </li>
     * <li><strong>13</strong>: Negotiable-price listing published  </li>
     * <li><strong>4</strong>: Auction listing published  </li>
     * <li><strong>6</strong>: Priced push listing published  </li>
     * <li><strong>-1</strong>: Domain trading not published</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TradeType")
    public Integer tradeType;

    /**
     * <p>User IP address.</p>
     * 
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
        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>数智</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>废弃</p>
         */
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
