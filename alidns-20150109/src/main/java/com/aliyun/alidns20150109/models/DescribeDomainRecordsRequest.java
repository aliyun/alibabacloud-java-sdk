// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the returned DNS records. Valid values: DESC and ASC. Default value: DESC.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain name group.</p>
     * <br>
     * <p>*   If you do not specify GroupId, all domain names are queried.</p>
     * <p>*   If you set GroupId to 0, no value is returned.</p>
     * <p>*   If you set GroupId to 1, the domain names in the default group are queried.</p>
     * <p>*   If you set GroupId to -2, all domain names are queried.</p>
     * <p>*   You can also specify GroupId based on the actual group ID.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The keyword.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The resolution line. Default value: **default**.</p>
     * <br>
     * <p>For more information, see</p>
     * <br>
     * <p>[DNS lines](https://www.alibabacloud.com/help/zh/doc-detail/29807.htm).</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The method that is used to sort the returned DNS records. By default, the DNS records are sorted in reverse chronological order based on the time when they were added.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **1 to 500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The hostname keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.</p>
     */
    @NameInMap("RRKeyWord")
    public String RRKeyWord;

    /**
     * <p>The search mode. Valid values: **LIKE, EXACT, and ADVANCED**.</p>
     * <br>
     * <p>*   If you set SearchMode to LIKE or EXACT, specify KeyWord. In this case, RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status are invalid.</p>
     * <br>
     * <p>*   If you set SearchMode to ADVANCED, specify RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status.</p>
     * <br>
     * <p>*   If you do not specify SearchMode, the system determines the search mode based on the following rules:</p>
     * <br>
     * <p>    *   If KeyWord is specified, the system uses the LIKE mode.</p>
     * <p>    *   If KeyWord is not specified, the system queries DNS records based on values of RRKeyWord and ValueKeyWord in fuzzy match mode, and based on the values of TypeKeyWord, Type, Line, and Status in exact match mode.</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The status of the DNS records to query. Valid values: **Enable and Disable**.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the DNS records to query. For more information, see</p>
     * <br>
     * <p>[DNS record types](https://www.alibabacloud.com/help/zh/doc-detail/29805.htm).</p>
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
