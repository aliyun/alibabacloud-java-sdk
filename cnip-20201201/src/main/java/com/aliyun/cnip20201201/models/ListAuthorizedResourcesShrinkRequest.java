// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAuthorizedResourcesShrinkRequest extends TeaModel {
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
    public String filterOptionsShrink;

    public static ListAuthorizedResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedResourcesShrinkRequest self = new ListAuthorizedResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAuthorizedResourcesShrinkRequest setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public ListAuthorizedResourcesShrinkRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAuthorizedResourcesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedResourcesShrinkRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public ListAuthorizedResourcesShrinkRequest setSortDirect(String sortDirect) {
        this.sortDirect = sortDirect;
        return this;
    }
    public String getSortDirect() {
        return this.sortDirect;
    }

    public ListAuthorizedResourcesShrinkRequest setFilterOptionsShrink(String filterOptionsShrink) {
        this.filterOptionsShrink = filterOptionsShrink;
        return this;
    }
    public String getFilterOptionsShrink() {
        return this.filterOptionsShrink;
    }

}
