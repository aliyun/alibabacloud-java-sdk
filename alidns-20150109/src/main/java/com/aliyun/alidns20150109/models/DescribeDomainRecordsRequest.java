// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsRequest extends TeaModel {
    /**
     * <p>The sorting direction. Valid values: DESC, ASC. Default value: DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name.&lt;props=&quot;china&quot;&gt; For more information, see <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomains</a>.
     * &lt;props=&quot;intl&quot;&gt;For more information, see <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain group.</p>
     * <ul>
     * <li><p>If you do not specify GroupId, the query is performed on all domain names.</p>
     * </li>
     * <li><p>If you set GroupId to 0, an empty result is returned.</p>
     * </li>
     * <li><p>If you set GroupId to -1, the query is performed on the default group. The default group includes domain names that are not assigned to a group.</p>
     * </li>
     * <li><p>If you set GroupId to -2, the query is performed on all domain names.</p>
     * </li>
     * <li><p>If you specify another value for GroupId, the query is performed on the specified group.
     * &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomaingroups?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomainGroups</a>.
     * &lt;props=&quot;intl&quot;&gt;For more information, see <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomaingroups?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainGroups</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2****</p>
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
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The DNS resolution line. Default value: <strong>default</strong>.</p>
     * <p>For more information, see:
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/29807.html">Enumeration of DNS resolution lines</a>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">Enumeration of DNS resolution lines</a></p>
     * 
     * <strong>example:</strong>
     * <p>cn_mobile_anhui</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The sorting method. Records are sorted in descending order based on the time they were added.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. Maximum value: <strong>500</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The keyword for the host record. The search uses a fuzzy match pattern and is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("RRKeyWord")
    public String RRKeyWord;

    /**
     * <p>The search mode. Valid values: LIKE, EXACT, ADVANCED, and <strong>COMBINATION</strong>.</p>
     * <ul>
     * <li><p>If you set this parameter to LIKE or EXACT, use the KeyWord parameter. The RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status parameters are invalid.</p>
     * </li>
     * <li><p>If you set this parameter to ADVANCED, use the RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status parameters. The RRKeyWord and ValueKeyWord parameters support fuzzy matching.</p>
     * </li>
     * <li><p>If you set this parameter to COMBINATION, use the RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status parameters. All these parameters support only exact matching.</p>
     * </li>
     * <li><p>If you do not specify this parameter:</p>
     * <ul>
     * <li><p>If you specify the keyWord parameter, the search mode is set to LIKE.</p>
     * </li>
     * <li><p>If you do not specify the keyWord parameter, RRKeyWord and ValueKeyWord support fuzzy matching, and TypeKeyWord, Type, Line, and Status support exact matching.</p>
     * </li>
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
     * <p>The status of the DNS record. Valid values:</p>
     * <p>Enable: The DNS record is enabled.</p>
     * <p>Disable: The DNS record is paused.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the DNS record. For more information, see:</p>
     * <p>&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/29805.html">DNS record types</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/doc-detail/29805.htm">DNS record types</a></p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The keyword for the record type. The search uses an exact match and is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>MX</p>
     */
    @NameInMap("TypeKeyWord")
    public String typeKeyWord;

    /**
     * <p>The keyword for the record value. The search uses a fuzzy match pattern and is not case-sensitive.</p>
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
