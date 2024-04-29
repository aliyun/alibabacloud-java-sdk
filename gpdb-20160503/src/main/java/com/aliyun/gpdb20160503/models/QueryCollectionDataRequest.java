// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryCollectionDataRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("Content")
    public String content;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("HybridSearch")
    public String hybridSearch;

    @NameInMap("HybridSearchArgs")
    public java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs;

    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    @NameInMap("IncludeValues")
    public Boolean includeValues;

    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TopK")
    public Long topK;

    @NameInMap("Vector")
    public java.util.List<Double> vector;

    public static QueryCollectionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectionDataRequest self = new QueryCollectionDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryCollectionDataRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public QueryCollectionDataRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryCollectionDataRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryCollectionDataRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public QueryCollectionDataRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public QueryCollectionDataRequest setHybridSearchArgs(java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs) {
        this.hybridSearchArgs = hybridSearchArgs;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    public QueryCollectionDataRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public QueryCollectionDataRequest setIncludeValues(Boolean includeValues) {
        this.includeValues = includeValues;
        return this;
    }
    public Boolean getIncludeValues() {
        return this.includeValues;
    }

    public QueryCollectionDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryCollectionDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryCollectionDataRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public QueryCollectionDataRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public QueryCollectionDataRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryCollectionDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCollectionDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryCollectionDataRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public QueryCollectionDataRequest setVector(java.util.List<Double> vector) {
        this.vector = vector;
        return this;
    }
    public java.util.List<Double> getVector() {
        return this.vector;
    }

}
