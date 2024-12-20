// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class ListDomainsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Search")
    public String search;

    @NameInMap("WithoutMeteringData")
    public Boolean withoutMeteringData;

    public static ListDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsRequest self = new ListDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDomainsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListDomainsRequest setWithoutMeteringData(Boolean withoutMeteringData) {
        this.withoutMeteringData = withoutMeteringData;
        return this;
    }
    public Boolean getWithoutMeteringData() {
        return this.withoutMeteringData;
    }

}
