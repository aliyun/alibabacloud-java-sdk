// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCustomAttributesRequest extends TeaModel {
    /**
     * <p>The comment on the custom attribute. The service performs a fuzzy search based on this parameter\&quot;s value.</p>
     * 
     * <strong>example:</strong>
     * <p>owner</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The display name of the custom attribute. The service performs a partial match based on this parameter\&quot;s value.</p>
     * 
     * <strong>example:</strong>
     * <p>Owner</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The entity types to which the custom attribute applies. To specify multiple entity types, separate them with commas (,), for example, <code>*-table,*-column</code>. This parameter supports specific entity types, such as <code>hms-table</code> and <code>emr-table</code>, and wildcard types, such as <code>*-table</code> and <code>*-column</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table</p>
     */
    @NameInMap("EntityTypes")
    public String entityTypes;

    /**
     * <p>The sort order. Valid values: Asc and Desc.</p>
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
     * <p>The field to sort by. Valid values: CreateTime and ModifyTime.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListCustomAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAttributesRequest self = new ListCustomAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomAttributesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListCustomAttributesRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListCustomAttributesRequest setEntityTypes(String entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public String getEntityTypes() {
        return this.entityTypes;
    }

    public ListCustomAttributesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCustomAttributesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomAttributesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomAttributesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
