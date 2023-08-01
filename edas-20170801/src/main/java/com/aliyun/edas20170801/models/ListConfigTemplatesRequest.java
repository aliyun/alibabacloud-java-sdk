// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigTemplatesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from Page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The ID of the configuration template.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the configuration template.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListConfigTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTemplatesRequest self = new ListConfigTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigTemplatesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListConfigTemplatesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListConfigTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListConfigTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
