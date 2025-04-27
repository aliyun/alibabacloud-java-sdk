// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexAddDocumentsJobShrinkRequest extends TeaModel {
    /**
     * <p>The list of primary key IDs of the category.</p>
     */
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    @NameInMap("ChunkMode")
    public String chunkMode;

    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>The list of the primary key IDs of the documents.</p>
     */
    @NameInMap("DocumentIds")
    public String documentIdsShrink;

    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("OverlapSize")
    public Integer overlapSize;

    @NameInMap("Separator")
    public String separator;

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

    public static SubmitIndexAddDocumentsJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIndexAddDocumentsJobShrinkRequest self = new SubmitIndexAddDocumentsJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setCategoryIdsShrink(String categoryIdsShrink) {
        this.categoryIdsShrink = categoryIdsShrink;
        return this;
    }
    public String getCategoryIdsShrink() {
        return this.categoryIdsShrink;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setChunkMode(String chunkMode) {
        this.chunkMode = chunkMode;
        return this;
    }
    public String getChunkMode() {
        return this.chunkMode;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setDocumentIdsShrink(String documentIdsShrink) {
        this.documentIdsShrink = documentIdsShrink;
        return this;
    }
    public String getDocumentIdsShrink() {
        return this.documentIdsShrink;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setOverlapSize(Integer overlapSize) {
        this.overlapSize = overlapSize;
        return this;
    }
    public Integer getOverlapSize() {
        return this.overlapSize;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setSeparator(String separator) {
        this.separator = separator;
        return this;
    }
    public String getSeparator() {
        return this.separator;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
