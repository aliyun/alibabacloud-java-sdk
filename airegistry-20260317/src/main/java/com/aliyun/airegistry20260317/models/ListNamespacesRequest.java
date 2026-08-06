// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListNamespacesRequest extends TeaModel {
    /**
     * <p>Performs a fuzzy search by name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-namespace</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters by tags. Separate multiple tags with commas. Results are matched by intersection.</p>
     * 
     * <strong>example:</strong>
     * <p>production,customer-service</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static ListNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesRequest self = new ListNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespacesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNamespacesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListNamespacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNamespacesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
