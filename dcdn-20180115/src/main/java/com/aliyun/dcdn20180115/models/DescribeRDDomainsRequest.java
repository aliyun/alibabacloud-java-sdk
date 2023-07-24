// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRDDomainsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: 1 to 100000.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 20. Valid values: an integer between 1 and 500. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeRDDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDDomainsRequest self = new DescribeRDDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRDDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRDDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
