// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntitiesRequest extends TeaModel {
    /**
     * <p>Conditions for filtering entities by entity attributes. The <code>AND</code> operator is used between different filters, and the <code>OR</code> operator is used for multiple values within a single filter.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AttributeFilters")
    public java.util.List<ListMetaEntitiesRequestAttributeFilters> attributeFilters;

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
    public java.util.List<ListMetaEntitiesRequestCustomAttributeFilters> customAttributeFilters;

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

    public static ListMetaEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaEntitiesRequest self = new ListMetaEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaEntitiesRequest setAttributeFilters(java.util.List<ListMetaEntitiesRequestAttributeFilters> attributeFilters) {
        this.attributeFilters = attributeFilters;
        return this;
    }
    public java.util.List<ListMetaEntitiesRequestAttributeFilters> getAttributeFilters() {
        return this.attributeFilters;
    }

    public ListMetaEntitiesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListMetaEntitiesRequest setCustomAttributeFilters(java.util.List<ListMetaEntitiesRequestCustomAttributeFilters> customAttributeFilters) {
        this.customAttributeFilters = customAttributeFilters;
        return this;
    }
    public java.util.List<ListMetaEntitiesRequestCustomAttributeFilters> getCustomAttributeFilters() {
        return this.customAttributeFilters;
    }

    public ListMetaEntitiesRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListMetaEntitiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMetaEntitiesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMetaEntitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMetaEntitiesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMetaEntitiesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public static class ListMetaEntitiesRequestAttributeFilters extends TeaModel {
        /**
         * <p>The key of the entity attribute to filter by.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A list of values for the specified entity attribute.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListMetaEntitiesRequestAttributeFilters build(java.util.Map<String, ?> map) throws Exception {
            ListMetaEntitiesRequestAttributeFilters self = new ListMetaEntitiesRequestAttributeFilters();
            return TeaModel.build(map, self);
        }

        public ListMetaEntitiesRequestAttributeFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMetaEntitiesRequestAttributeFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListMetaEntitiesRequestCustomAttributeFilters extends TeaModel {
        /**
         * <p>The key of the custom attribute to filter by.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_attr_1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A list of values for the specified custom attribute.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListMetaEntitiesRequestCustomAttributeFilters build(java.util.Map<String, ?> map) throws Exception {
            ListMetaEntitiesRequestCustomAttributeFilters self = new ListMetaEntitiesRequestCustomAttributeFilters();
            return TeaModel.build(map, self);
        }

        public ListMetaEntitiesRequestCustomAttributeFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMetaEntitiesRequestCustomAttributeFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
