// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntitiesRequest extends TeaModel {
    /**
     * <p>The entity attribute filter conditions. Multiple filter conditions have an AND relationship. Multiple values within the same filter condition have an OR relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AttributeFilters")
    public java.util.List<ListMetaEntitiesRequestAttributeFilters> attributeFilters;

    /**
     * <p>The comment filter. Performs token matching.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The custom attribute filter conditions. Multiple filter conditions have an AND relationship. Multiple values within the same filter condition have an OR relationship. Only ENUM custom attributes are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CustomAttributeFilters")
    public java.util.List<ListMetaEntitiesRequestCustomAttributeFilters> customAttributeFilters;

    /**
     * <p>The entity type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The maximum number of results per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The entity name filter. Performs keyword-contains matching.</p>
     * 
     * <strong>example:</strong>
     * <p>xm_create_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token. Do not specify this parameter for the first request. For subsequent requests, use the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAaUpAxoCTD/+sbOf3f+uxvnYyILMeAjoTFQSX64R12GN</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort direction.</p>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sort field.</p>
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
         * <p>The filter attribute key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of filter attribute values.</p>
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
         * <p>The filter attribute key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_attr_1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of filter attribute values.</p>
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
