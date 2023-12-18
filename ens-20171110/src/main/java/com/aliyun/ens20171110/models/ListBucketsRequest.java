// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListBucketsRequest extends TeaModel {
    /**
     * <p>The number of the page. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of returned buckets. If this parameter is not specified, the default value is 10. The value cannot be greater than 100.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Specifies the prefix that returned bucket names must contain. If this parameter is not specified, prefix information will not be used as a filter.</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    public static ListBucketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBucketsRequest self = new ListBucketsRequest();
        return TeaModel.build(map, self);
    }

    public ListBucketsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListBucketsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListBucketsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
