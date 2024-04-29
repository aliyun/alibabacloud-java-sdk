// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryContentAdvanceRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("Content")
    public String content;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("HybridSearch")
    public String hybridSearch;

    @NameInMap("HybridSearchArgs")
    public java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs;

    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    @NameInMap("IncludeVector")
    public Boolean includeVector;

    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RecallWindow")
    public java.util.List<Integer> recallWindow;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RerankFactor")
    public Double rerankFactor;

    @NameInMap("TopK")
    public Integer topK;

    @NameInMap("UseFullTextRetrieval")
    public Boolean useFullTextRetrieval;

    public static QueryContentAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentAdvanceRequest self = new QueryContentAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentAdvanceRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public QueryContentAdvanceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryContentAdvanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryContentAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryContentAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public QueryContentAdvanceRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public QueryContentAdvanceRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public QueryContentAdvanceRequest setHybridSearchArgs(java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs) {
        this.hybridSearchArgs = hybridSearchArgs;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    public QueryContentAdvanceRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public QueryContentAdvanceRequest setIncludeVector(Boolean includeVector) {
        this.includeVector = includeVector;
        return this;
    }
    public Boolean getIncludeVector() {
        return this.includeVector;
    }

    public QueryContentAdvanceRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryContentAdvanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryContentAdvanceRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public QueryContentAdvanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryContentAdvanceRequest setRecallWindow(java.util.List<Integer> recallWindow) {
        this.recallWindow = recallWindow;
        return this;
    }
    public java.util.List<Integer> getRecallWindow() {
        return this.recallWindow;
    }

    public QueryContentAdvanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryContentAdvanceRequest setRerankFactor(Double rerankFactor) {
        this.rerankFactor = rerankFactor;
        return this;
    }
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    public QueryContentAdvanceRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public QueryContentAdvanceRequest setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
        this.useFullTextRetrieval = useFullTextRetrieval;
        return this;
    }
    public Boolean getUseFullTextRetrieval() {
        return this.useFullTextRetrieval;
    }

}
