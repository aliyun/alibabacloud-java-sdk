// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaContentCreate extends TeaModel {
    /**
     * <p>The file comment.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The MIME type of the file. It contains Type and SubType.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>image/png: PNG.</li>
     * <li>image/jpeg: JPEG.</li>
     * <li>image/tiff: TIFF.</li>
     * <li>image/bmp: BMP.</li>
     * <li>image/gif: GIF.</li>
     * <li>image/x-icon: ICON.</li>
     * <li>image/svg+xml: SVG.</li>
     * <li>image/webp: WEBP.</li>
     * <li>image/heic: HEIC</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image/jpeg</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The file size. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The time when the file was created. The time follows the ISO 8601 standard.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The file fingerprint. Used to check the uniqueness of the file. This value changes after the file content is modified. OSS files use ETags, and NAS files use MD5 values.</p>
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
     * <p>The file type. The same as MIME type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>image</li>
     * <li>application</li>
     * <li>audio</li>
     * <li>video</li>
     * <li>text</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The time when the file was last modified. The time follows the ISO 8601 standard.</p>
     * <p>This parameter is required.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <p>The specific metadata of the file. You cannot retrieve the metadata. The value is a JSON string.</p>
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
     * <p>The tags manually added. The value is a JSON string. Operable tag group:</p>
     * <ul>
     * <li>user: the list of tags to add to a metadata entry.</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>{
     *     &quot;user&quot;:{
     *         &quot;add&quot;:[&quot;lane line&quot;,&quot;sunny&quot;]
     *     }
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{&quot;user&quot;:[&quot;cat&quot;, &quot;White&quot;]}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The URI of the file. Used to record the unique path of the file. File paths in Object Storage Service (OSS) and File Storage NAS (NAS) are supported.</p>
     * <p><strong>OSS</strong></p>
     * <p>oss://${bucket}/${path}</p>
     * <p><strong>NAS</strong></p>
     * <p>nas://${fileSystemId}/${path}</p>
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
