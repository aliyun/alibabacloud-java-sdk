// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaContentCreate extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image/jpeg</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The size of the file in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The time when the file was created. The time is in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The fingerprint of the file. This value ensures the uniqueness of the file content and changes if the content is modified. For OSS files, this is the ETag. For NAS files, this is the MD5 value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D41D8CD98F*****E9800998ECF8</p>
     */
    @NameInMap("FileFingerPrint")
    public String fileFingerPrint;

    /**
     * <p>The name of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>00001.jpeg</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The type of the file. This is the same as the Multipurpose Internet Mail Extensions (MIME) type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The time when the file was last modified. The time is in ISO 8601 format.</p>
     * <p>This parameter is required.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <p>The specific metadata of the file. This metadata cannot be used for retrieval. The value must be a JSON string.</p>
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
     * <p>The tags that are manually added by users. The \<code>add\\</code> operation is used to add tags to a tag group. The value must be a JSON string.
     * The following tag group is available:</p>
     * <ul>
     * <li>user: A list of tag names added to a single piece of metadata.</li>
     * </ul>
     * <pre><code>{
     *     &quot;user&quot;:{
     *         &quot;add&quot;:[&quot;Lane line&quot;,&quot;Sunny day&quot;]
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
     * <p>The unique URI of the file. This URI records the unique path of the file. The path can be an OSS or NAS path.</p>
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
