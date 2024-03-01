// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsCacheDomainsRequest extends TeaModel {
    /**
     * <p>The keyword for searches in "%KeyWord%" mode. The value is not case-sensitive.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **1 to 100**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeDnsCacheDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsCacheDomainsRequest self = new DescribeDnsCacheDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsCacheDomainsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDnsCacheDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsCacheDomainsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsCacheDomainsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
