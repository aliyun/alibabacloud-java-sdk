// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaContentCreate extends TeaModel {
    /**
     * <p>The file comment.</p>
     * 
     * <strong>example:</strong>
     * <p>The first image file in the dataset.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The MIME type of the file. Contains Type and SubType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image/jpeg</p>
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
     * <p>The file creation time in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The file fingerprint value. Used to determine the uniqueness of file content. This value changes when the file content is modified. OSS files use ETag, and NAS files use MD5 values.</p>
     * <p>This parameter is required.</p>
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
     * <p>The file type. Same as MIME Type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The last modification time of the file in ISO 8601 format.</p>
     * <p>This parameter is required.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <p>The specific metadata of the file, not searchable. In JSON string format.</p>
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
     * <p>User manual tagging: (add indicates adding tags to the tag group). In JSON string format.
     * The operable tag groups are:</p>
     * <ul>
     * <li>user: The list of tag names manually added by the user for a single metadata entry.</li>
     * </ul>
     * <pre><code>{
     *     &quot;user&quot;:{
     *         &quot;add&quot;:[&quot;lane_line&quot;,&quot;sunny&quot;]
     *     }
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;user&quot;:{
     *         &quot;add&quot;:[&quot;Lane line&quot;,&quot;Sunny day&quot;]
     *     }
     * }</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The unique URI of the file. Used to record the unique file path. Supports file paths in OSS and NAS.</p>
     * <details>
     * <summary>OSS</summary>
     * oss://${bucket}/${path}
     * </details>
     * <details>
     * <summary>NAS</summary>
     * nas://${fileSystemId}/${path}
     * </details>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://*****-test/dataset/1653421.jpg
     * nas://0e25d***dff/dataset/1653421.jpg</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static DatasetFileMetaContentCreate build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMetaContentCreate self = new DatasetFileMetaContentCreate();
        return TeaModel.build(map, self);
    }

    public DatasetFileMetaContentCreate setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DatasetFileMetaContentCreate setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public DatasetFileMetaContentCreate setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DatasetFileMetaContentCreate setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public DatasetFileMetaContentCreate setFileFingerPrint(String fileFingerPrint) {
        this.fileFingerPrint = fileFingerPrint;
        return this;
    }
    public String getFileFingerPrint() {
        return this.fileFingerPrint;
    }

    public DatasetFileMetaContentCreate setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DatasetFileMetaContentCreate setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DatasetFileMetaContentCreate setFileUpdateTime(String fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
        return this;
    }
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    public DatasetFileMetaContentCreate setMetaAttributes(String metaAttributes) {
        this.metaAttributes = metaAttributes;
        return this;
    }
    public String getMetaAttributes() {
        return this.metaAttributes;
    }

    public DatasetFileMetaContentCreate setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DatasetFileMetaContentCreate setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
