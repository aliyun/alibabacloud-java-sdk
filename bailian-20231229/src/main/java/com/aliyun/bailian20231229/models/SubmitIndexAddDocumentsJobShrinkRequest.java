// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexAddDocumentsJobShrinkRequest extends TeaModel {
    /**
     * <p>A list of category IDs.</p>
     */
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The custom chunking mode. This setting applies only to the documents added in the current job. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>. Valid values (you can specify only one value):</p>
     * <ul>
     * <li><p><strong>length</strong>: Splits the text by a fixed length. The chunking strictly follows the specified <code>ChunkSize</code> and <code>OverlapSize</code>. If you do not specify these parameters, the system uses the default values: a <code>ChunkSize</code> of 500 and an <code>OverlapSize</code> of 100. This mode ignores the <code>Separator</code> parameter.</p>
     * </li>
     * <li><p><strong>page</strong>: Splits the text by page. If <code>ChunkSize</code> is specified, its value is also applied during chunking. If <code>ChunkSize</code> is not set, a default value of 500 is used. This mode ignores the <code>OverlapSize</code> and <code>Separator</code> parameters.</p>
     * </li>
     * <li><p><strong>h1</strong>: Splits the text by level-1 headings. If <code>ChunkSize</code> is specified, its value is also applied during chunking. If <code>ChunkSize</code> is not set, a default value of 500 is used. This mode ignores the <code>OverlapSize</code> and <code>Separator</code> parameters.</p>
     * </li>
     * <li><p><strong>h2</strong>: Splits the text by level-2 headings. If <code>ChunkSize</code> is specified, its value is also applied during chunking. If <code>ChunkSize</code> is not set, a default value of 500 is used. This mode ignores the <code>OverlapSize</code> and <code>Separator</code> parameters.</p>
     * </li>
     * <li><p><strong>regex</strong>: Splits the text by using a regular expression. The <code>Separator</code> parameter is required for this mode. If <code>ChunkSize</code> is specified, its value is also applied during chunking. If <code>ChunkSize</code> is not set, a default value of 500 is used. This mode ignores the <code>OverlapSize</code> parameter.</p>
     * </li>
     * </ul>
     * <p>If this parameter is not set, intelligent chunking is used by default.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>length</p>
     */
    @NameInMap("ChunkMode")
    public String chunkMode;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The chunk size. Specifies the maximum number of characters for each text chunk. This setting applies only to the documents added in the current job. If a text segment exceeds this size, the behavior depends on the chunking mode:</p>
     * <ul>
     * <li><p><strong>Intelligent chunking</strong> (if <code>ChunkMode</code> is not set): The text may be truncated.</p>
     * </li>
     * <li><p><strong>Custom chunking</strong> (if <code>ChunkMode</code> is set): The text is forcibly split.</p>
     * </li>
     * </ul>
     * <p>The value must be in the range of [1, 6000]. Defaults to 500 if not specified.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>.</p>
     * <blockquote>
     * <p>If you specify a <code>ChunkSize</code> less than 100, you must also specify the <code>OverlapSize</code> parameter. You can also omit both parameters to use the system defaults.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>A list of file IDs.</p>
     */
    @NameInMap("DocumentIds")
    public String documentIdsShrink;

    /**
     * <p>Specifies whether to include Excel file headers. If set to <code>true</code>, the knowledge base treats the first row of all .xlsx and .xls files as the header and automatically prepends it to each text chunk (data row). This prevents the large language model (LLM) from misinterpreting the header as a regular data row.</p>
     * <blockquote>
     * <p>Enable this parameter only if all imported documents are Excel files that contain a header.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableHeaders")
    public Boolean enableHeaders;

    @NameInMap("Extra")
    public String extraShrink;

    /**
     * <p>The knowledge base ID. This is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Specifies the number of overlapping characters between adjacent text chunks. This setting applies only to the documents added in the current job. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>. The value must be in the range of [0, 1024].</p>
     * <p>Defaults to 100 if not specified.</p>
     * <blockquote>
     * <p>The value of <code>OverlapSize</code> must be less than the value of <code>ChunkSize</code>. Otherwise, the chunking process may fail.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The separator for chunking. This parameter is used only when <code>ChunkMode</code> is set to <strong>regex</strong>. You can specify a single regular expression (multiple expressions are not supported) to split the file into smaller text chunks. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>.</p>
     * <p>When you use intelligent chunking (when <code>ChunkMode</code> is not specified), leave this parameter empty.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>(?&lt;=。)</p>
     */
    @NameInMap("Separator")
    public String separator;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p>DATA_CENTER_CATEGORY: Imports all documents from specified categories in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">application data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">application data</a>. You can import documents from multiple categories.</p>
     * </li>
     * <li><p>DATA_CENTER_FILE: Imports specified files from &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">application data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">application data</a>. You can import multiple files.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <code>DATA_CENTER_CATEGORY</code>, you must specify the <code>CategoryIds</code> parameter. If you set this parameter to <code>DATA_CENTER_FILE</code>, you must specify the <code>DocumentIds</code> parameter.</p>
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

    public SubmitIndexAddDocumentsJobShrinkRequest setEnableHeaders(Boolean enableHeaders) {
        this.enableHeaders = enableHeaders;
        return this;
    }
    public Boolean getEnableHeaders() {
        return this.enableHeaders;
    }

    public SubmitIndexAddDocumentsJobShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
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
