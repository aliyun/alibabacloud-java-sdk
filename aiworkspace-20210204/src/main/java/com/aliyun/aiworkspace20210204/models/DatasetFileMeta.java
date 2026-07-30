// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMeta extends TeaModel {
    /**
     * <p>The MIME type of the file. Contains Type and SubType.</p>
     * 
     * <strong>example:</strong>
     * <p>image/jpeg</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The file size, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>120000</p>
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
     * <p>The download URL of the file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&OSSAccessKeyId=LTAI************&Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D">https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&amp;OSSAccessKeyId=LTAI************&amp;Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The file creation time. UTC timestamp in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The file fingerprint value. Used to determine the uniqueness of the file content. This value changes when the file content is modified. OSS files use ETag, and NAS files use MD5 values.</p>
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
     * <p>cat.png</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file type. Same as MIME Type.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The last modification time of the file. UTC timestamp in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <p>The specific metadata of the file. For example, image width and height information, or bitrate and resolution information for video files. Search capability is not currently supported. JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;ImageHeight&quot;: 400,     &quot;ImageWidth&quot;: 800 }</p>
     */
    @NameInMap("MetaAttributes")
    public String metaAttributes;

    /**
     * <p>The similarity score.</p>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("Score")
    public Float score;

    /**
     * <p>The task ID of the last semantic index build.</p>
     * 
     * <strong>example:</strong>
     * <p>dsjob-klfwtjto****scvt3</p>
     */
    @NameInMap("SemanticIndexJobId")
    public String semanticIndexJobId;

    /**
     * <p>The last update time of the semantic index. UTC timestamp in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("SemanticIndexUpdateTime")
    public String semanticIndexUpdateTime;

    /**
     * <p>The current status of the metadata. Valid values:</p>
     * <ul>
     * <li>ACTIVE: currently available.</li>
     * <li>DELETED: deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag collection of the metadata in JSON string format. This includes:</p>
     * <ul>
     * <li>Algorithm tag group:<ul>
     * <li>ai: The list of tag names aggregated from all algorithm tagging tasks for a single metadata entry.</li>
     * </ul>
     * </li>
     * <li>User-defined tag group:<ul>
     * <li>user: The list of tag names manually added by the user for a single metadata entry.</li>
     * <li>user-delete-ai-tags: The list of tag names in the algorithm tag group that the user wants to delete for a single metadata entry.</li>
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
     * <p>The thumbnail URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&OSSAccessKeyId=LTAI************&Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D">https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&amp;OSSAccessKeyId=LTAI************&amp;Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D</a></p>
     */
    @NameInMap("ThumbnailUrl")
    public String thumbnailUrl;

    /**
     * <p>The unique URI of the file. Used to record the unique path of the file. Supports file paths in OSS and NAS.</p>
     * <details>
     * <summary>OSS</summary>
     * oss://${bucket}/${path}
     * </details>
     * <details>
     * <summary>NAS</summary>
     * nas://${fileSystemId}/${path}
     * </details>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/dataset/cat.png</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static DatasetFileMeta build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMeta self = new DatasetFileMeta();
        return TeaModel.build(map, self);
    }

    public DatasetFileMeta setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public DatasetFileMeta setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DatasetFileMeta setDatasetFileMetaId(String datasetFileMetaId) {
        this.datasetFileMetaId = datasetFileMetaId;
        return this;
    }
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    public DatasetFileMeta setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DatasetFileMeta setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public DatasetFileMeta setFileFingerPrint(String fileFingerPrint) {
        this.fileFingerPrint = fileFingerPrint;
        return this;
    }
    public String getFileFingerPrint() {
        return this.fileFingerPrint;
    }

    public DatasetFileMeta setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DatasetFileMeta setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DatasetFileMeta setFileUpdateTime(String fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
        return this;
    }
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    public DatasetFileMeta setMetaAttributes(String metaAttributes) {
        this.metaAttributes = metaAttributes;
        return this;
    }
    public String getMetaAttributes() {
        return this.metaAttributes;
    }

    public DatasetFileMeta setScore(Float score) {
        this.score = score;
        return this;
    }
    public Float getScore() {
        return this.score;
    }

    public DatasetFileMeta setSemanticIndexJobId(String semanticIndexJobId) {
        this.semanticIndexJobId = semanticIndexJobId;
        return this;
    }
    public String getSemanticIndexJobId() {
        return this.semanticIndexJobId;
    }

    public DatasetFileMeta setSemanticIndexUpdateTime(String semanticIndexUpdateTime) {
        this.semanticIndexUpdateTime = semanticIndexUpdateTime;
        return this;
    }
    public String getSemanticIndexUpdateTime() {
        return this.semanticIndexUpdateTime;
    }

    public DatasetFileMeta setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetFileMeta setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DatasetFileMeta setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public DatasetFileMeta setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
