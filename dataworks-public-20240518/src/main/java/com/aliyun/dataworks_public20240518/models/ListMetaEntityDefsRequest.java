// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntityDefsRequest extends TeaModel {
    /**
     * <p>The description. Matched by fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the type definition. Matched by plain text containment.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomReport</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The extension mode filter. Valid values:</p>
     * <ul>
     * <li>NONE: custom entity only.</li>
     * <li>TABLE: extension table entity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li>Asc: ascending order.</li>
     * <li>Desc: descending order.</li>
     * </ul>
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
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li>Name: sorted by name.</li>
     * <li>CreateTime: sorted by creation time.</li>
     * <li>ModifyTime: sorted by modification time.</li>
     * </ul>
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
