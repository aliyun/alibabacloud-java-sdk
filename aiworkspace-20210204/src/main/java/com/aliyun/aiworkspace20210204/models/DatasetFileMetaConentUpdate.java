// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaConentUpdate extends TeaModel {
    /**
     * <p>The file comment.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The MIME type of the file. The value consists of a type and a subtype.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>image/png</li>
     * <li>image/svg+xml</li>
     * <li>image/jpeg</li>
     * <li>image/tiff</li>
     * <li>image/gif</li>
     * <li>image/bmp</li>
     * <li>image/x-icon</li>
     * <li>image/heic</li>
     * <li>image/webp</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image/jpeg</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
     */
    @NameInMap("DatasetFileMetaId")
    public String datasetFileMetaId;

    /**
     * <p>The time when the file is created. The time follows the ISO 8601 standard.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The fingerprint information of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>124FB71******7BE45608CDEA4DE54B3</p>
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
     * <p>The file type, which is the same as Multipurpose Internet Mail Extensions (MIME) type.</p>
     * <p>Valid values:</p>
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
     * <p>The time when the file is last modified. The time follows the ISO 8601 standard.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <p>The specific metadata of the file, such as the width and height of an image and the bitrate and resolution of a video file. You cannot retrieve the metadata. The value is a JSON string.</p>
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
     * <p>dsjob-klfwt*****l0escvt3</p>
     */
    @NameInMap("SemanticIndexJobId")
    public String semanticIndexJobId;

    /**
     * <p>The time when the semantic index is created.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("SemanticIndexUpdateTime")
    public String semanticIndexUpdateTime;

    /**
     * <p>The tags to be updated.</p>
     * <ul>
     * <li>Update an algorithm tag group (a valid TagJobId must be set):</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>{
     *    &quot;ai&quot;:[&quot;Lane line&quot;, &quot;Water horse&quot;, &quot;Sunny day&quot;]
     * }
     * </code></pre>
     * <ul>
     * <li><p>Update a user-defined tag group (add or remove indicates that tags are added or deleted): Tag groups that can be updated:</p>
     * <ul>
     * <li>user: a list of user-defined tags that can be added to or deleted from a single piece of metadata.</li>
     * <li>user-delete-ai-tags: a list of tags that you want to delete from an algorithm tag group.</li>
     * </ul>
     * </li>
     * </ul>
     * <!---->
     * 
     * <pre><code>{
     *     &quot;user&quot;:{
     *         &quot;add&quot;:[&quot;Lane line&quot;,&quot;Sunny day&quot;],
     *         &quot;remove&quot;:[&quot;Water horse&quot;]    },
     *     &quot;user-delete-ai-tags&quot;:{
     *         &quot;add&quot;: [&quot;Ground shadow&quot;],
     *         &quot;remove&quot;: []
     *     }
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ai&quot;:[&quot;cat&quot;], &quot;user&quot;:[&quot;black&quot;]}</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static DatasetFileMetaConentUpdate build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMetaConentUpdate self = new DatasetFileMetaConentUpdate();
        return TeaModel.build(map, self);
    }

    public DatasetFileMetaConentUpdate setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DatasetFileMetaConentUpdate setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public DatasetFileMetaConentUpdate setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DatasetFileMetaConentUpdate setDatasetFileMetaId(String datasetFileMetaId) {
        this.datasetFileMetaId = datasetFileMetaId;
        return this;
    }
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    public DatasetFileMetaConentUpdate setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public DatasetFileMetaConentUpdate setFileFingerPrint(String fileFingerPrint) {
        this.fileFingerPrint = fileFingerPrint;
        return this;
    }
    public String getFileFingerPrint() {
        return this.fileFingerPrint;
    }

    public DatasetFileMetaConentUpdate setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DatasetFileMetaConentUpdate setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DatasetFileMetaConentUpdate setFileUpdateTime(String fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
        return this;
    }
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    public DatasetFileMetaConentUpdate setMetaAttributes(String metaAttributes) {
        this.metaAttributes = metaAttributes;
        return this;
    }
    public String getMetaAttributes() {
        return this.metaAttributes;
    }

    public DatasetFileMetaConentUpdate setSemanticIndexJobId(String semanticIndexJobId) {
        this.semanticIndexJobId = semanticIndexJobId;
        return this;
    }
    public String getSemanticIndexJobId() {
        return this.semanticIndexJobId;
    }

    public DatasetFileMetaConentUpdate setSemanticIndexUpdateTime(String semanticIndexUpdateTime) {
        this.semanticIndexUpdateTime = semanticIndexUpdateTime;
        return this;
    }
    public String getSemanticIndexUpdateTime() {
        return this.semanticIndexUpdateTime;
    }

    public DatasetFileMetaConentUpdate setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
