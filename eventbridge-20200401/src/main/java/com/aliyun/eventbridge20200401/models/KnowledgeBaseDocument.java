// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class KnowledgeBaseDocument extends TeaModel {
    /**
     * <p>The snapshot of the document-level chunking policy actually used for this document. This field is returned only if ChunkConfiguration was explicitly specified during upload (BeginUpload) or update (UpdateDocument). If not specified, the document is chunked based on the knowledge base-level default configurations, and this field is not returned. The knowledge base-level configuration is not echoed back to avoid misleading users about the actual chunking basis for this document when the knowledge base-level configuration is subsequently changed.</p>
     */
    @NameInMap("ChunkConfiguration")
    public KnowledgeBaseDocumentChunkConfiguration chunkConfiguration;

    /**
     * <p>The number of chunks generated after processing is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ChunkCount")
    public Integer chunkCount;

    /**
     * <p>The time when the document was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-24T10:00:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The unique identifier of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-bp1xxxxxxxxxxxx</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>The stable error code returned when processing fails.</p>
     * 
     * <strong>example:</strong>
     * <p>FILE_CORRUPTED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The desensitized error message returned when processing fails.</p>
     * 
     * <strong>example:</strong>
     * <p>parse pdf failed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The file name of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>manual.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file size of the document, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The document-level metadata key-value pairs, including constant field values and system variable values. This field is not returned if no metadata is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;:&quot;department&quot;,&quot;Value&quot;:&quot;R&amp;D&quot;}]</p>
     */
    @NameInMap("Metadata")
    public java.util.List<KnowledgeBaseDocumentMetadata> metadata;

    /**
     * <p>The last modification time in the upstream source system, in epoch milliseconds. This field is empty if no source information is available.</p>
     * 
     * <strong>example:</strong>
     * <p>1788000000000</p>
     */
    @NameInMap("SourceModifiedTime")
    public Long sourceModifiedTime;

    /**
     * <p>The delivery channel through which the document entered the knowledge base. This value is written by the system and cannot be specified by users. Valid values:</p>
     * <ul>
     * <li>UPLOAD: manually uploaded through the console or API.</li>
     * <li>OSS: imported through an OSS event stream.</li>
     * </ul>
     * <p>New values may be added when new channels are supported. The values are not restricted to a fixed enumeration.</p>
     * 
     * <strong>example:</strong>
     * <p>UPLOAD</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The original source address of the document, such as oss://bucket/path/file.md. This field may be empty for manually uploaded documents.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://my-bucket/docs/handbook.pdf</p>
     */
    @NameInMap("SourceUri")
    public String sourceUri;

    /**
     * <p>The processing status of the document. Valid values:</p>
     * <ul>
     * <li>UPLOADING: uploading in progress.</li>
     * <li>PENDING: upload complete and queued for processing. This is typically a transitional state that lasts for seconds.</li>
     * <li>PROCESSING: parsing and processing in progress.</li>
     * <li>COMPLETED: processing complete and searchable.</li>
     * <li>FAILED: processing failed.</li>
     * <li>DELETING: deletion in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the document was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-24T10:00:00Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static KnowledgeBaseDocument build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseDocument self = new KnowledgeBaseDocument();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseDocument setChunkConfiguration(KnowledgeBaseDocumentChunkConfiguration chunkConfiguration) {
        this.chunkConfiguration = chunkConfiguration;
        return this;
    }
    public KnowledgeBaseDocumentChunkConfiguration getChunkConfiguration() {
        return this.chunkConfiguration;
    }

    public KnowledgeBaseDocument setChunkCount(Integer chunkCount) {
        this.chunkCount = chunkCount;
        return this;
    }
    public Integer getChunkCount() {
        return this.chunkCount;
    }

    public KnowledgeBaseDocument setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public KnowledgeBaseDocument setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public KnowledgeBaseDocument setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public KnowledgeBaseDocument setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public KnowledgeBaseDocument setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public KnowledgeBaseDocument setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public KnowledgeBaseDocument setMetadata(java.util.List<KnowledgeBaseDocumentMetadata> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.List<KnowledgeBaseDocumentMetadata> getMetadata() {
        return this.metadata;
    }

    public KnowledgeBaseDocument setSourceModifiedTime(Long sourceModifiedTime) {
        this.sourceModifiedTime = sourceModifiedTime;
        return this;
    }
    public Long getSourceModifiedTime() {
        return this.sourceModifiedTime;
    }

    public KnowledgeBaseDocument setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public KnowledgeBaseDocument setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

    public KnowledgeBaseDocument setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public KnowledgeBaseDocument setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static class KnowledgeBaseDocumentChunkConfigurationPreprocessRules extends TeaModel {
        /**
         * <p>Specifies whether to remove URLs and email addresses during parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RemoveUrlsAndEmails")
        public Boolean removeUrlsAndEmails;

        /**
         * <p>Specifies whether to replace consecutive whitespace characters (spaces, line breaks, and tab characters) with a single space.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReplaceConsecutiveWhitespace")
        public Boolean replaceConsecutiveWhitespace;

        public static KnowledgeBaseDocumentChunkConfigurationPreprocessRules build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseDocumentChunkConfigurationPreprocessRules self = new KnowledgeBaseDocumentChunkConfigurationPreprocessRules();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseDocumentChunkConfigurationPreprocessRules setRemoveUrlsAndEmails(Boolean removeUrlsAndEmails) {
            this.removeUrlsAndEmails = removeUrlsAndEmails;
            return this;
        }
        public Boolean getRemoveUrlsAndEmails() {
            return this.removeUrlsAndEmails;
        }

        public KnowledgeBaseDocumentChunkConfigurationPreprocessRules setReplaceConsecutiveWhitespace(Boolean replaceConsecutiveWhitespace) {
            this.replaceConsecutiveWhitespace = replaceConsecutiveWhitespace;
            return this;
        }
        public Boolean getReplaceConsecutiveWhitespace() {
            return this.replaceConsecutiveWhitespace;
        }

    }

    public static class KnowledgeBaseDocumentChunkConfiguration extends TeaModel {
        /**
         * <p>The heading level (1 to 6) used for splitting in the BY_HEADING strategy. Headings at or above this level serve as split boundaries. Deeper-level headings are retained in the chunk body.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HeadingLevel")
        public Integer headingLevel;

        /**
         * <p>The maximum character length of a single chunk. Starting from revision 22, this value is character-based. Valid values: 1 to 6000.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxChunkSize")
        public Integer maxChunkSize;

        /**
         * <p>The overlap character length between adjacent chunks. This parameter takes effect only for the BY_LENGTH strategy. If the value is greater than 0, the beginning of the next chunk repeats the content from the end of the previous chunk within this window. The overlap does not cause a chunk to exceed MaxChunkSize. A value of 0 indicates no overlap.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("OverlapSize")
        public Integer overlapSize;

        /**
         * <p>The snapshot of preprocessing rules.</p>
         */
        @NameInMap("PreprocessRules")
        public KnowledgeBaseDocumentChunkConfigurationPreprocessRules preprocessRules;

        /**
         * <p>The separator used in the BY_SEPARATOR strategy. The separator is matched as a literal string (not a regular expression). The maximum length is 32 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>\\n\\n</p>
         */
        @NameInMap("Separator")
        public String separator;

        /**
         * <p>The chunking strategy. Valid values:</p>
         * <ul>
         * <li>AUTO: intelligent splitting (heading-aware + paragraph packing).</li>
         * <li>BY_LENGTH: sliding window splitting by length. You can specify OverlapSize.</li>
         * <li>BY_SEPARATOR: splitting by separator. You must specify Separator.</li>
         * <li>BY_HEADING: splitting by heading level. You must specify HeadingLevel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BY_SEPARATOR</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static KnowledgeBaseDocumentChunkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseDocumentChunkConfiguration self = new KnowledgeBaseDocumentChunkConfiguration();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseDocumentChunkConfiguration setHeadingLevel(Integer headingLevel) {
            this.headingLevel = headingLevel;
            return this;
        }
        public Integer getHeadingLevel() {
            return this.headingLevel;
        }

        public KnowledgeBaseDocumentChunkConfiguration setMaxChunkSize(Integer maxChunkSize) {
            this.maxChunkSize = maxChunkSize;
            return this;
        }
        public Integer getMaxChunkSize() {
            return this.maxChunkSize;
        }

        public KnowledgeBaseDocumentChunkConfiguration setOverlapSize(Integer overlapSize) {
            this.overlapSize = overlapSize;
            return this;
        }
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        public KnowledgeBaseDocumentChunkConfiguration setPreprocessRules(KnowledgeBaseDocumentChunkConfigurationPreprocessRules preprocessRules) {
            this.preprocessRules = preprocessRules;
            return this;
        }
        public KnowledgeBaseDocumentChunkConfigurationPreprocessRules getPreprocessRules() {
            return this.preprocessRules;
        }

        public KnowledgeBaseDocumentChunkConfiguration setSeparator(String separator) {
            this.separator = separator;
            return this;
        }
        public String getSeparator() {
            return this.separator;
        }

        public KnowledgeBaseDocumentChunkConfiguration setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class KnowledgeBaseDocumentMetadata extends TeaModel {
        /**
         * <p>The metadata field name.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The metadata field value.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D</p>
         */
        @NameInMap("Value")
        public String value;

        public static KnowledgeBaseDocumentMetadata build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseDocumentMetadata self = new KnowledgeBaseDocumentMetadata();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseDocumentMetadata setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public KnowledgeBaseDocumentMetadata setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
