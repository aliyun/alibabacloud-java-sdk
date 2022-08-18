// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Line")
    public String line;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RRKeyWord")
    public String RRKeyWord;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    @NameInMap("TypeKeyWord")
    public String typeKeyWord;

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
