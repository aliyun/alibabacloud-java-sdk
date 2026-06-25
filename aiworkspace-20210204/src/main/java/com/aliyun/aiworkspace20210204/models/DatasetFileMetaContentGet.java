// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaContentGet extends TeaModel {
    /**
     * <p>The comment on the file.</p>
     * 
     * <strong>example:</strong>
     * <p>The first image file in the dataset.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The MIME type of the file. It includes a type and a subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>image/png</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The file size in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The ID of the dataset file metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
     */
    @NameInMap("DatasetFileMetaId")
    public String datasetFileMetaId;

    /**
     * <p>The time when the file was created. The time is in the ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The path of the folder where the OSS, NAS, or CPFS file is located.</p>
     * 
     * <strong>example:</strong>
     * <p>icp_certificate_card/icp/1577179298694813/1716429710367</p>
     */
    @NameInMap("FileDir")
    public String fileDir;

    /**
     * <p>The fingerprint of the file. This value ensures the uniqueness of the file content. The value changes if the file content is modified. For OSS files, the ETag is used. For NAS files, the MD5 hash is used.</p>
     * 
     * <strong>example:</strong>
     * <p>D41D8CD98F*****E9800998ECF8</p>
     */
    @NameInMap("FileFingerPrint")
    public String fileFingerPrint;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>00001.jpeg</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file type. This is the same as the Multipurpose Internet Mail Extensions (MIME) type.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The time when the file was last modified. The time is in the ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <p>The specific metadata of the file. This metadata cannot be used for retrieval. The format is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ImageHeight&quot;: 1080,
     *     &quot;ImageWidth&quot;: 1920
     * }</p>
     */
    @NameInMap("MetaAttributes")
    public String metaAttributes;

    /**
     * <p>The ID of the job that builds the semantic index.</p>
     * 
     * <strong>example:</strong>
     * <p>dsjob-klfwtjtov*****scvt3</p>
     */
    @NameInMap("SemanticIndexJobId")
    public String semanticIndexJobId;

    /**
     * <p>The time when the semantic index was built.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("SemanticIndexUpdateTime")
    public String semanticIndexUpdateTime;

    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the tag was last modified. The time is in the ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("TagUpdateTime")
    public String tagUpdateTime;

    /**
     * <p>A collection of tags for the metadata. It includes the following groups:</p>
     * <ul>
     * <li><p>Algorithm tag group:</p>
     * <ul>
     * <li>ai: A list of tag names aggregated from all algorithmic tagging tasks for a single metadata record.</li>
     * </ul>
     * </li>
     * <li><p>User-defined tag group:</p>
     * <ul>
     * <li><p>user: A list of tag names that a user adds to a single metadata record.</p>
     * </li>
     * <li><p>user-delete-ai-tags: A list of tag names from the algorithm tag group that the user wants to delete from a single metadata record.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ai&quot;:
     *     [
     *         &quot;Lane line&quot;,
     *         &quot;Water horse&quot;,
     *         &quot;Sunny day&quot;
     *     ],
     *     &quot;user&quot;:
     *     [
     *         &quot;Everett&quot;,
     *         &quot;Intelligent driving Dataset 1&quot;,
     *         &quot;Cloudy day&quot;
     *     ],
     *     &quot;user-delete-ai-tags&quot;:
     *     [
     *         &quot;Sunny day&quot;
     *     ]
     * }</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The unique URI of the file. This URI records the unique path of the file. Paths for files in OSS and NAS are supported.</p>
     * <details>
     * 
     * <summary>
     * 
     * <p>OSS</p>
     * </summary>
     * 
     * <p>oss\://${bucket}/${path}</p>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>NAS</p>
     * </summary>
     * 
     * <p>nas\://${fileSystemId}/${path}</p>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>oss://*****-test/dataset/1653421.jpg
     * nas://0e25d***dff/dataset/1653421.jpg</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static DatasetFileMetaContentGet build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMetaContentGet self = new DatasetFileMetaContentGet();
        return TeaModel.build(map, self);
    }

    public DatasetFileMetaContentGet setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DatasetFileMetaContentGet setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public DatasetFileMetaContentGet setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DatasetFileMetaContentGet setDatasetFileMetaId(String datasetFileMetaId) {
        this.datasetFileMetaId = datasetFileMetaId;
        return this;
    }
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    public DatasetFileMetaContentGet setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public DatasetFileMetaContentGet setFileDir(String fileDir) {
        this.fileDir = fileDir;
        return this;
    }
    public String getFileDir() {
        return this.fileDir;
    }

    public DatasetFileMetaContentGet setFileFingerPrint(String fileFingerPrint) {
        this.fileFingerPrint = fileFingerPrint;
        return this;
    }
    public String getFileFingerPrint() {
        return this.fileFingerPrint;
    }

    public DatasetFileMetaContentGet setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DatasetFileMetaContentGet setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DatasetFileMetaContentGet setFileUpdateTime(String fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
        return this;
    }
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    public DatasetFileMetaContentGet setMetaAttributes(String metaAttributes) {
        this.metaAttributes = metaAttributes;
        return this;
    }
    public String getMetaAttributes() {
        return this.metaAttributes;
    }

    public DatasetFileMetaContentGet setSemanticIndexJobId(String semanticIndexJobId) {
        this.semanticIndexJobId = semanticIndexJobId;
        return this;
    }
    public String getSemanticIndexJobId() {
        return this.semanticIndexJobId;
    }

    public DatasetFileMetaContentGet setSemanticIndexUpdateTime(String semanticIndexUpdateTime) {
        this.semanticIndexUpdateTime = semanticIndexUpdateTime;
        return this;
    }
    public String getSemanticIndexUpdateTime() {
        return this.semanticIndexUpdateTime;
    }

    public DatasetFileMetaContentGet setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetFileMetaContentGet setTagUpdateTime(String tagUpdateTime) {
        this.tagUpdateTime = tagUpdateTime;
        return this;
    }
    public String getTagUpdateTime() {
        return this.tagUpdateTime;
    }

    public DatasetFileMetaContentGet setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DatasetFileMetaContentGet setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
