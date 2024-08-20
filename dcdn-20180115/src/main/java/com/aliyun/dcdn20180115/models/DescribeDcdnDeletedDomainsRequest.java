// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeletedDomainsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of domain names to return on each page. Valid values: an integer from <strong>1</strong> to <strong>500</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
