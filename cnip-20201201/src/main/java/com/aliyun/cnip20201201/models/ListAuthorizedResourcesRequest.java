// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAuthorizedResourcesRequest extends TeaModel {
    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("resourceIdentifier")
    public String resourceIdentifier;

    @NameInMap("pageNum")
    public Long pageNum;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("sortKey")
    public String sortKey;

    @NameInMap("sortDirect")
    public String sortDirect;

    @NameInMap("filterOptions")
    public java.util.Map<String, ?> filterOptions;

    public static ListAuthorizedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedResourcesRequest self = new ListAuthorizedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAuthorizedResourcesRequest setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public ListAuthorizedResourcesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAuthorizedResourcesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedResourcesRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public ListAuthorizedResourcesRequest setSortDirect(String sortDirect) {
        this.sortDirect = sortDirect;
        return this;
    }
    public String getSortDirect() {
        return this.sortDirect;
    }

    public ListAuthorizedResourcesRequest setFilterOptions(java.util.Map<String, ?> filterOptions) {
        this.filterOptions = filterOptions;
        return this;
    }
    public java.util.Map<String, ?> getFilterOptions() {
        return this.filterOptions;
    }

}
