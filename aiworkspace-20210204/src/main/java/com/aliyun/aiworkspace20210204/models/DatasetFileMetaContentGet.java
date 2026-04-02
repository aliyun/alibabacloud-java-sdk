// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaContentGet extends TeaModel {
    /**
     * <p>The file comment.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The MIME type of the file. It contains a Type and a SubType.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>image/png: PNG</li>
     * <li>image/jpeg: JPEG</li>
     * <li>image/tiff: TIFF</li>
     * <li>image/bmp: BMP</li>
     * <li>image/gif: GIF</li>
     * <li>image/x-icon: ICON</li>
     * <li>image/svg + xml: SVG</li>
     * <li>image/heic: HEIC</li>
     * <li>image/webp: WEBP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text/png</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The file size. Unit: byte.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The metadata ID of the dataset file.</p>
     * 
     * <strong>example:</strong>
     * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
     */
    @NameInMap("DatasetFileMetaId")
    public String datasetFileMetaId;

    /**
     * <p>The time when the file was created. Format: ISO8601.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The directory of the file that is stored in OSS, NAS, or Cloud Parallel File Storage (CPFS).</p>
     * 
     * <strong>example:</strong>
     * <p>icp_certificate_card/icp/1577179298694813/1716429710367</p>
     */
    @NameInMap("FileDir")
    public String fileDir;

    /**
     * <p>The fingerprint value of the file. Used to check the uniqueness of the file. This value changes after the file content is modified. OSS files use ETags, and NAS files use MD5.</p>
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
     * <p>The file type. The same as MIME type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>image</li>
     * <li>application</li>
     * <li>audio</li>
     * <li>video</li>
     * <li>text</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The time when the file was last modified. Format: ISO8601.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <p>The specific metadata of the file. You cannot retrieve the metadata. In JSON String format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Image&quot;:
     *     {
     *         &quot;Width&quot;: 1920,
     *         &quot;Height&quot;: 1080,
     *         &quot;Channel&quot;: 3
     *     }
     * }</p>
     */
    @NameInMap("MetaAttributes")
    public String metaAttributes;

    /**
     * <p>The ID of the semantic index-based job.</p>
     * 
     * <strong>example:</strong>
     * <p>dsjob-klfwtjtov*****scvt3</p>
     */
    @NameInMap("SemanticIndexJobId")
    public String semanticIndexJobId;

    /**
     * <p>The time when the semantic index-based job is created.</p>
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
     * <p>The time when the tag is last modified. The time follows the ISO 8601 standard.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("TagUpdateTime")
    public String tagUpdateTime;

    /**
     * <p>The tags for the metadata. The tags are divided into the following groups:</p>
     * <ul>
     * <li><p>Algorithm tag group:</p>
     * <ul>
     * <li>ai: a list of tags that are aggregated by all algorithm tagging tasks for a single piece of metadata.</li>
     * </ul>
     * </li>
     * <li><p>User-defined tag groups:</p>
     * <ul>
     * <li>user: a list of user-defined tags that are added to a single piece of metadata.</li>
     * <li>user-delete-ai-tags: a list of tags that you want to delete from an algorithm tag group.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ai&quot;:
     *     [
     *         &quot;Felis catus&quot;,
     *         &quot;Shorthair&quot;
     *     ],
     *     &quot;user&quot;:
     *     [
     *         &quot;cat&quot;,
     *         &quot;White&quot;
     *     ]
     * }</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The unique URI of the file. Used to record the unique path of the file. File paths in OSS and NAS are supported.</p>
     * <p><strong>OSS</strong></p>
     * <p>oss://${bucket}/${path}</p>
     * <p><strong>NAS</strong></p>
     * <p>nas://${fileSystemId}/${path}</p>
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
