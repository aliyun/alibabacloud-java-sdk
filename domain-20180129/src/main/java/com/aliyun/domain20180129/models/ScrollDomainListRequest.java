// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ScrollDomainListRequest extends TeaModel {
    /**
     * <p>The ID of the domain name group. You can call the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation to obtain the ID of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: All.</li>
     * <li><strong>1</strong>: The domain name needs to be renewed.</li>
     * <li><strong>2</strong>: The domain name needs to be redeemed.</li>
     * <li><strong>3</strong>: The domain name is normal.</li>
     * <li><strong>4</strong>: The domain name is being transferred from Alibaba Cloud.</li>
     * <li><strong>5</strong>: The information about the domain name registrant is being modified.</li>
     * <li><strong>6</strong>: Real-name verification is not performed on the domain name.</li>
     * <li><strong>7</strong>: Real-name verification for the domain name fails. Real-name reverification is required.</li>
     * <li><strong>8</strong>: The domain name is being reviewed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DomainStatus")
    public Integer domainStatus;

    /**
     * <p>The end of the time range to query domain names based on expiration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1541520000000</p>
     */
    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    /**
     * <p>The end of domain name length to query.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EndLength")
    public Integer endLength;

    /**
     * <p>The end of the time range to query domain names based on registration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1541520000000</p>
     */
    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    /**
     * <p>The keyword that is used to exclude domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Excluded")
    public String excluded;

    /**
     * <p>Specifies whether to exclude the prefix keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExcludedPrefix")
    public Boolean excludedPrefix;

    /**
     * <p>Specifies whether to exclude the suffix keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExcludedSuffix")
    public Boolean excludedSuffix;

    /**
     * <p>The composition of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Form")
    public Integer form;

    /**
     * <p>The keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>Specifies whether the keyword is the prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("KeyWordPrefix")
    public Boolean keyWordPrefix;

    /**
     * <p>Specifies whether the keyword is the suffix.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeyWordSuffix")
    public Boolean keyWordSuffix;

    /**
     * <p>The language of the error message to return if the request fails. Valid values:</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>New gTLD</strong></li>
     * <li><strong>gTLD</strong></li>
     * <li><strong>ccTLD</strong></li>
     * <li><strong>other</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gTLD</p>
     */
    @NameInMap("ProductDomainType")
    public String productDomainType;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw6bpc6n7zai</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scroll ID. This parameter is a technical parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ScrollId")
    public String scrollId;

    /**
     * <p>The beginning of the time range to query domain names based on expiration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1541520000000</p>
     */
    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    /**
     * <p>The start of the domain name length to query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartLength")
    public Integer startLength;

    /**
     * <p>The beginning of the time range to query domain names based on registration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1541520000000</p>
     */
    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    /**
     * <p>The suffixes of domain names to be queried. Separate multiple suffixes with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>com</p>
     */
    @NameInMap("Suffixs")
    public String suffixs;

    /**
     * <p>The publishing status of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: The domain name is published at a fixed price.</li>
     * <li><strong>3</strong>: The domain name is published with the price negotiable.</li>
     * <li><strong>4</strong>: The domain name is published for bidding.</li>
     * <li><strong>6</strong>: The domain name is published with price push.</li>
     * <li><strong>-1</strong>: The domain name is not published.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TradeType")
    public Integer tradeType;

    /**
     * <p>The IP address of the client. Set the value to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ScrollDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        ScrollDomainListRequest self = new ScrollDomainListRequest();
        return TeaModel.build(map, self);
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

    public ScrollDomainListRequest setEndExpirationDate(Long endExpirationDate) {
        this.endExpirationDate = endExpirationDate;
        return this;
    }
    public Long getEndExpirationDate() {
        return this.endExpirationDate;
    }

    public ScrollDomainListRequest setEndLength(Integer endLength) {
        this.endLength = endLength;
        return this;
    }
    public Integer getEndLength() {
        return this.endLength;
    }

    public ScrollDomainListRequest setEndRegistrationDate(Long endRegistrationDate) {
        this.endRegistrationDate = endRegistrationDate;
        return this;
    }
    public Long getEndRegistrationDate() {
        return this.endRegistrationDate;
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

    public ScrollDomainListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ScrollDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ScrollDomainListRequest setProductDomainType(String productDomainType) {
        this.productDomainType = productDomainType;
        return this;
    }
    public String getProductDomainType() {
        return this.productDomainType;
    }

    public ScrollDomainListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ScrollDomainListRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public ScrollDomainListRequest setStartExpirationDate(Long startExpirationDate) {
        this.startExpirationDate = startExpirationDate;
        return this;
    }
    public Long getStartExpirationDate() {
        return this.startExpirationDate;
    }

    public ScrollDomainListRequest setStartLength(Integer startLength) {
        this.startLength = startLength;
        return this;
    }
    public Integer getStartLength() {
        return this.startLength;
    }

    public ScrollDomainListRequest setStartRegistrationDate(Long startRegistrationDate) {
        this.startRegistrationDate = startRegistrationDate;
        return this;
    }
    public Long getStartRegistrationDate() {
        return this.startRegistrationDate;
    }

    public ScrollDomainListRequest setSuffixs(String suffixs) {
        this.suffixs = suffixs;
        return this;
    }
    public String getSuffixs() {
        return this.suffixs;
    }

    public ScrollDomainListRequest setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public Integer getTradeType() {
        return this.tradeType;
    }

    public ScrollDomainListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
