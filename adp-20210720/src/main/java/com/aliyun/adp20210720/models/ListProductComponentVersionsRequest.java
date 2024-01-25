// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductComponentVersionsRequest extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("releaseName")
    public String releaseName;

    @NameInMap("sortDirect")
    public String sortDirect;

    @NameInMap("sortKey")
    public String sortKey;

    public static ListProductComponentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductComponentVersionsRequest self = new ListProductComponentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductComponentVersionsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListProductComponentVersionsRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListProductComponentVersionsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProductComponentVersionsRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public ListProductComponentVersionsRequest setSortDirect(String sortDirect) {
        this.sortDirect = sortDirect;
        return this;
    }
    public String getSortDirect() {
        return this.sortDirect;
    }

    public ListProductComponentVersionsRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

}
