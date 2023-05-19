// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeletedDomainsRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the returned page, which is the same as the **PageNumber** parameter in request parameters.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDcdnDeletedDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeletedDomainsRequest self = new DescribeDcdnDeletedDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeletedDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnDeletedDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
