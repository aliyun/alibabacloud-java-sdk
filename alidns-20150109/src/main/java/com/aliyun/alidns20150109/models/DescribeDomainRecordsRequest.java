// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the returned DNS records. Valid values: DESC and ASC. Default value: DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation to obtain the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain name group.</p>
     * <ul>
     * <li>If you do not specify GroupId, all domain names are queried.</li>
     * <li>If you set GroupId to 0, no value is returned.</li>
     * <li>If you set GroupId to 1, the domain names in the default group are queried.</li>
     * <li>If you set GroupId to -2, all domain names are queried.</li>
     * <li>You can also specify GroupId based on the actual group ID.</li>
     * </ul>
     * <p>You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomaingroups?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainGroups </a>operation to obtain the ID of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>2223</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The resolution line. Default value: <strong>default</strong>.</p>
     * <p>For more information, see</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">DNS lines</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn_mobile_anhui</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The method that is used to sort the returned DNS records. By default, the DNS records are sorted in reverse chronological order based on the time when they were added.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 500</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The hostname keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("RRKeyWord")
    public String RRKeyWord;

    /**
     * <p>The search mode. Valid values: <strong>LIKE, EXACT, and ADVANCED</strong>.</p>
     * <ul>
     * <li><p>If you set SearchMode to LIKE or EXACT, specify KeyWord. In this case, RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status are invalid.</p>
     * </li>
     * <li><p>If you set SearchMode to ADVANCED, specify RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status.</p>
     * </li>
     * <li><p>If you do not specify SearchMode, the system determines the search mode based on the following rules:</p>
     * <ul>
     * <li>If KeyWord is specified, the system uses the LIKE mode.</li>
     * <li>If KeyWord is not specified, the system queries DNS records based on values of RRKeyWord and ValueKeyWord in fuzzy match mode, and based on the values of TypeKeyWord, Type, Line, and Status in exact match mode.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LIKE</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The status of the DNS records to query. Valid values: <strong>Enable and Disable</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the DNS records to query. For more information, see</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29805.htm">DNS record types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The type keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in exact match mode. The value is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>MX</p>
     */
    @NameInMap("TypeKeyWord")
    public String typeKeyWord;

    /**
     * <p>The record value keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>com</p>
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
