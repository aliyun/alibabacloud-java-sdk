// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexAddDocumentsJobRequest extends TeaModel {
    /**
     * <p>The list of primary key IDs of the category.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>The list of the primary key IDs of the documents.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The data type of <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a>. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>DATA_CENTER_CATEGORY: The category type. Import all documents from one or more categories in Data Center.</li>
     * <li>DATA_CENTER_FILE: The document type. Import one or more documents from Data Center.</li>
     * </ul>
     * <blockquote>
     * <p> If this parameter is set to DATA_CENTER_CATEGORY, you must specify the <code>CategoryIds</code> parameter. If this parameter is set to DATA_CENTER_FILE, you must specify the <code>DocumentIds</code> parameter.</p>
     * </blockquote>
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
