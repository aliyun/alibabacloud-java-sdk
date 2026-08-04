// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexAddDocumentsJobRequest extends TeaModel {
    /**
     * <p>The list of category IDs.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * Enables custom chunking (applies only to files appended in this request). For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values (only one value can be specified at a time):</p>
     * <ul>
     * <li><strong>length</strong>: chunk by length. Strictly chunks according to the specified <code>ChunkSize</code> and <code>OverlapSize</code>. If these two parameters are not specified, the system uses default values (<code>ChunkSize</code> of 500 and <code>OverlapSize</code> of 100). Chunking by length does not support <code>Separator</code> (even if specified, it does not take effect).</li>
     * <li><strong>page</strong>: chunk by page. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not specified, the default value of 500 is used). Chunking by page does not support <code>OverlapSize</code> or <code>Separator</code> (even if specified, they do not take effect).</li>
     * <li><strong>h1</strong>~<strong>h5</strong>: chunk by headings at the corresponding level (<code>h1</code> is the first-level heading, and so on, with support up to <code>h5</code> fifth-level heading). If <code>ChunkSize</code> is specified, it is also considered during chunking (if not specified, the default value of 500 is used). Chunking by heading does not support <code>OverlapSize</code> or <code>Separator</code> (even if specified, they do not take effect).</li>
     * <li><strong>regex</strong>: chunk by regular expression. The <code>Separator</code> parameter must be specified. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not specified, the default value of 500 is used). Chunking by regex does not support <code>OverlapSize</code> (even if specified, it does not take effect).</li>
     * </ul>
     * <p>Default value: empty, which uses intelligent chunking.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>length</p>
     */
    @NameInMap("ChunkMode")
    public String chunkMode;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * The chunk length, which is the maximum number of characters per text chunk (applies only to files appended in this request). When this length is exceeded:</p>
     * <ul>
     * <li><strong>Intelligent chunking</strong> (without specifying <code>chunkMode</code>): the text is likely to be truncated.</li>
     * <li><strong>Custom chunking</strong> (with <code>chunkMode</code> specified): the text is forcibly split.</li>
     * </ul>
     * <p>Valid values: 1 to 6000. If this parameter is not specified, the default value of 500 is used.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     * <blockquote>
     * <p>If you specify <code>ChunkSize</code> with a value less than 100, you must also specify <code>OverlapSize</code>. You can also leave both parameters unspecified (the system uses default values).</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>The list of file IDs.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>Specifies whether to enable header assembly for Excel files. When enabled, the knowledge base treats the first row of all xlsx and xls files as headers and automatically appends them to each text chunk (data row), preventing the large language model from treating headers as regular data rows.</p>
     * <blockquote>
     * <p>Enable this feature only when all imported files are in xlsx or xls format and contain headers. Otherwise, leave it disabled.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableHeaders")
    public Boolean enableHeaders;

    @NameInMap("Extra")
    public SubmitIndexAddDocumentsJobRequestExtra extra;

    /**
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * The chunk overlap length (applies only to files appended in this request). It indicates the number of overlapping characters between the current text chunk and the previous text chunk. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values: 0 to 1024.</p>
     * <p>If this parameter is not specified, the default value of 100 is used.</p>
     * <blockquote>
     * <p>The value of <code>OverlapSize</code> must be less than the value of <code>ChunkSize</code>. Otherwise, chunking exceptions may occur.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * The sentence separator, which takes effect only when <code>chunkMode</code> is set to <strong>regex</strong> (otherwise, it does not take effect even if specified). You can specify a regular expression (only one is supported) to split the file into small text chunks. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     * <p>When using intelligent chunking (without specifying <code>chunkMode</code>), keep the default empty value.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>(?&lt;=。)</p>
     */
    @NameInMap("Separator")
    public String separator;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li>DATA_CENTER_CATEGORY: category type. Imports all documents under specified categories in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. Multiple categories are supported.</li>
     * <li>DATA_CENTER_FILE: document type. Imports specified files from &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. Multiple files are supported.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to DATA_CENTER_CATEGORY, you must specify the <code>CategoryIds</code> parameter. If this parameter is set to DATA_CENTER_FILE, you must specify the <code>DocumentIds</code> parameter.</p>
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

    public SubmitIndexAddDocumentsJobRequest setChunkMode(String chunkMode) {
        this.chunkMode = chunkMode;
        return this;
    }
    public String getChunkMode() {
        return this.chunkMode;
    }

    public SubmitIndexAddDocumentsJobRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public SubmitIndexAddDocumentsJobRequest setDocumentIds(java.util.List<String> documentIds) {
        this.documentIds = documentIds;
        return this;
    }
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    public SubmitIndexAddDocumentsJobRequest setEnableHeaders(Boolean enableHeaders) {
        this.enableHeaders = enableHeaders;
        return this;
    }
    public Boolean getEnableHeaders() {
        return this.enableHeaders;
    }

    public SubmitIndexAddDocumentsJobRequest setExtra(SubmitIndexAddDocumentsJobRequestExtra extra) {
        this.extra = extra;
        return this;
    }
    public SubmitIndexAddDocumentsJobRequestExtra getExtra() {
        return this.extra;
    }

    public SubmitIndexAddDocumentsJobRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public SubmitIndexAddDocumentsJobRequest setOverlapSize(Integer overlapSize) {
        this.overlapSize = overlapSize;
        return this;
    }
    public Integer getOverlapSize() {
        return this.overlapSize;
    }

    public SubmitIndexAddDocumentsJobRequest setSeparator(String separator) {
        this.separator = separator;
        return this;
    }
    public String getSeparator() {
        return this.separator;
    }

    public SubmitIndexAddDocumentsJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class SubmitIndexAddDocumentsJobRequestExtra extends TeaModel {
        @NameInMap("uniqueId")
        public String uniqueId;

        public static SubmitIndexAddDocumentsJobRequestExtra build(java.util.Map<String, ?> map) throws Exception {
            SubmitIndexAddDocumentsJobRequestExtra self = new SubmitIndexAddDocumentsJobRequestExtra();
            return TeaModel.build(map, self);
        }

        public SubmitIndexAddDocumentsJobRequestExtra setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

}
