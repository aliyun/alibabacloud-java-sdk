// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsRequest extends TeaModel {
    /**
     * <p>The order in which the returned DNS records are sorted. Valid values: DESC and ASC. Default value: DESC.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name for which you want to query DNS records.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain name group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The keyword based on which the system queries DNS records.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The language of the domain name.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The line based on which the system queries DNS records. Default value: **default**.</p>
     * <br>
     * <p>For more information, see the following topic:</p>
     * <br>
     * <p>[DNS lines](https://www.alibabacloud.com/help/zh/doc-detail/29807.htm)</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The method that is used to sort the returned DNS records. By default, the DNS records are sorted in reverse chronological order based on the time when they were added.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The resource record (RR) keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.</p>
     */
    @NameInMap("RRKeyWord")
    public String RRKeyWord;

    /**
     * <p>The search mode. Valid values: **LIKE, EXACT, and ADVANCED**.</p>
     * <br>
     * <p>*   If you set this parameter to LIKE or EXACT, specify the KeyWord parameter.In this case, the RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status parameters are ignored.</p>
     * <br>
     * <p>*   If you set this parameter to ADVANCED, specify the RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status parameters.</p>
     * <br>
     * <p>*   If you do not specify this parameter, the system determines the search mode based on the following rules:</p>
     * <br>
     * <p>    *   If the KeyWord parameter is specified, the system uses the LIKE mode.</p>
     * <p>    *   If the KeyWord parameter is not specified, the system queries DNS records based on values of the RRKeyWord and ValueKeyWord parameters in fuzzy match mode, and based on the values of the TypeKeyWord, Type, Line, and Status parameters in exact match mode.</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The status of the DNS records to query. Valid values: **Enable and Disable**.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the DNS records to query. For more information, see the following topic:</p>
     * <br>
     * <p>[DNS record types](https://www.alibabacloud.com/help/zh/doc-detail/29805.htm)</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The type keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in exact match mode. The value is not case-sensitive.</p>
     */
    @NameInMap("TypeKeyWord")
    public String typeKeyWord;

    /**
     * <p>The record value keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.</p>
     */
    @NameInMap("ValueKeyWord")
    public String valueKeyWord;

    public static DescribeDomainRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordsRequest self = new DescribeDomainRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeDomainRecordsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRecordsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeDomainRecordsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeDomainRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainRecordsRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeDomainRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeDomainRecordsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainRecordsRequest setRRKeyWord(String RRKeyWord) {
        this.RRKeyWord = RRKeyWord;
        return this;
    }
    public String getRRKeyWord() {
        return this.RRKeyWord;
    }

    public DescribeDomainRecordsRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeDomainRecordsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDomainRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDomainRecordsRequest setTypeKeyWord(String typeKeyWord) {
        this.typeKeyWord = typeKeyWord;
        return this;
    }
    public String getTypeKeyWord() {
        return this.typeKeyWord;
    }

    public DescribeDomainRecordsRequest setValueKeyWord(String valueKeyWord) {
        this.valueKeyWord = valueKeyWord;
        return this;
    }
    public String getValueKeyWord() {
        return this.valueKeyWord;
    }

}
