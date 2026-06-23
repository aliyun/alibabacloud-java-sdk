// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntitiesShrinkRequest extends TeaModel {
    /**
     * <p>Conditions for filtering entities by entity attributes. The <code>AND</code> operator is used between different filters, and the <code>OR</code> operator is used for multiple values within a single filter.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AttributeFilters")
    public String attributeFiltersShrink;

    /**
     * <p>Filters entities by comment. This is a token-based match.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Conditions for filtering entities by custom attributes. The <code>AND</code> operator is used between different filters, and the <code>OR</code> operator is used for multiple values within a single filter. This parameter supports only <code>ENUM</code> custom attributes.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CustomAttributeFilters")
    public String customAttributeFiltersShrink;

    /**
     * <p>The type of the entity to list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The maximum number of results to return per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Filters entities by name. This is a containment match.</p>
     * 
     * <strong>example:</strong>
     * <p>xm_create_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that specifies the next page of results. To retrieve the first page, do not specify this parameter. To retrieve subsequent pages, set this parameter to the <code>NextToken</code> value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAaUpAxoCTD/+sbOf3f+uxvnYyILMeAjoTFQSX64R12GN</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values: <code>Asc</code> and <code>Desc</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field to use for sorting the results.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListMetaEntitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaEntitiesShrinkRequest self = new ListMetaEntitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaEntitiesShrinkRequest setAttributeFiltersShrink(String attributeFiltersShrink) {
        this.attributeFiltersShrink = attributeFiltersShrink;
        return this;
    }
    public String getAttributeFiltersShrink() {
        return this.attributeFiltersShrink;
    }

    public ListMetaEntitiesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListMetaEntitiesShrinkRequest setCustomAttributeFiltersShrink(String customAttributeFiltersShrink) {
        this.customAttributeFiltersShrink = customAttributeFiltersShrink;
        return this;
    }
    public String getCustomAttributeFiltersShrink() {
        return this.customAttributeFiltersShrink;
    }

    public ListMetaEntitiesShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListMetaEntitiesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMetaEntitiesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMetaEntitiesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMetaEntitiesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMetaEntitiesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
