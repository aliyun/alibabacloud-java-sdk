// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexAddDocumentsJobRequest extends TeaModel {
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_CENTER_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static SubmitIndexAddDocumentsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIndexAddDocumentsJobRequest self = new SubmitIndexAddDocumentsJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIndexAddDocumentsJobRequest setCategoryIds(java.util.List<String> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public java.util.List<String> getCategoryIds() {
        return this.categoryIds;
    }

    public SubmitIndexAddDocumentsJobRequest setDocumentIds(java.util.List<String> documentIds) {
        this.documentIds = documentIds;
        return this;
    }
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    public SubmitIndexAddDocumentsJobRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public SubmitIndexAddDocumentsJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
