// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntityDefsRequest extends TeaModel {
    /**
     * <p>A keyword to search for in the description. The system performs a fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the type definition. This parameter supports partial matching.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomReport</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Filters the results by extension mode. Valid values: <code>NONE</code> and <code>TABLE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The sort order. Valid values: <code>Asc</code> and <code>Desc</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort field. Valid values: <code>Name</code>, <code>CreateTime</code>, and <code>ModifyTime</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListMetaEntityDefsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaEntityDefsRequest self = new ListMetaEntityDefsRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaEntityDefsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListMetaEntityDefsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListMetaEntityDefsRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public ListMetaEntityDefsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMetaEntityDefsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetaEntityDefsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaEntityDefsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
