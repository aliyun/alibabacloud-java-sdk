// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnHttpsDomainListRequest extends TeaModel {
    /**
     * <p>The keyword that is used to search for certificates.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of returned pages. Valid values: **1 to 100000**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: **1 to 500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDcdnHttpsDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnHttpsDomainListRequest self = new DescribeDcdnHttpsDomainListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnHttpsDomainListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDcdnHttpsDomainListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnHttpsDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
