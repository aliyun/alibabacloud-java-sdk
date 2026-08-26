// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSaseUserTagsRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The name of the user label. The name must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>boss</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page. Settings: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The collection of user label IDs.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static ListSaseUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSaseUserTagsRequest self = new ListSaseUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListSaseUserTagsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSaseUserTagsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSaseUserTagsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSaseUserTagsRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}
