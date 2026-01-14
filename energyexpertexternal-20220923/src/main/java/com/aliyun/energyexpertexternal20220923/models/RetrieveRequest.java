// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class RetrieveRequest extends TeaModel {
    @NameInMap("documentIds")
    public java.util.List<Long> documentIds;

    @NameInMap("folderIds")
    public java.util.List<String> folderIds;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("preRetrieveTopK")
    public Integer preRetrieveTopK;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;What\&quot;s the meaning of the file?&quot;</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("rerankerThreshold")
    public Float rerankerThreshold;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("topK")
    public Integer topK;

    @NameInMap("useReranker")
    public Boolean useReranker;

    public static RetrieveRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveRequest self = new RetrieveRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveRequest setDocumentIds(java.util.List<Long> documentIds) {
        this.documentIds = documentIds;
        return this;
    }
    public java.util.List<Long> getDocumentIds() {
        return this.documentIds;
    }

    public RetrieveRequest setFolderIds(java.util.List<String> folderIds) {
        this.folderIds = folderIds;
        return this;
    }
    public java.util.List<String> getFolderIds() {
        return this.folderIds;
    }

    public RetrieveRequest setPreRetrieveTopK(Integer preRetrieveTopK) {
        this.preRetrieveTopK = preRetrieveTopK;
        return this;
    }
    public Integer getPreRetrieveTopK() {
        return this.preRetrieveTopK;
    }

    public RetrieveRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RetrieveRequest setRerankerThreshold(Float rerankerThreshold) {
        this.rerankerThreshold = rerankerThreshold;
        return this;
    }
    public Float getRerankerThreshold() {
        return this.rerankerThreshold;
    }

    public RetrieveRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public RetrieveRequest setUseReranker(Boolean useReranker) {
        this.useReranker = useReranker;
        return this;
    }
    public Boolean getUseReranker() {
        return this.useReranker;
    }

}
