// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class File extends TeaModel {
    /**
     * <p>The allowed origins for cross-origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
     */
    @NameInMap("AccessControlAllowOrigin")
    public String accessControlAllowOrigin;

    /**
     * <p>The allowed methods for the cross-origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>PUT</p>
     */
    @NameInMap("AccessControlRequestMethod")
    public String accessControlRequestMethod;

    /**
     * <p>The address information.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    /**
     * <p>The album.</p>
     * 
     * <strong>example:</strong>
     * <p>FirstAlbum</p>
     */
    @NameInMap("Album")
    public String album;

    /**
     * <p>The album artist.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("AlbumArtist")
    public String albumArtist;

    /**
     * <p>The artist.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("Artist")
    public String artist;

    /**
     * <p>The cover images for the audio.</p>
     */
    @NameInMap("AudioCovers")
    public java.util.List<Image> audioCovers;

    /**
     * <p>A list of audio streams.</p>
     */
    @NameInMap("AudioStreams")
    public java.util.List<AudioStream> audioStreams;

    /**
     * <p>The bitrate, in bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>13091201</p>
     */
    @NameInMap("Bitrate")
    public Long bitrate;

    /**
     * <p>The web cache behavior that the browser should use when the object is downloaded.</p>
     * <p>This parameter is returned only if the Cache-Control HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>no-cache</p>
     */
    @NameInMap("CacheControl")
    public String cacheControl;

    /**
     * <p>The composer.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("Composer")
    public String composer;

    /**
     * <p>The name of the object when it is downloaded.</p>
     * <p>This parameter is returned only if the Content-Disposition HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>attachment; filename =test.jpg</p>
     */
    @NameInMap("ContentDisposition")
    public String contentDisposition;

    /**
     * <p>The content encoding format of the object when it is downloaded.</p>
     * <p>This parameter is returned only if the Content-Encoding HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF-8</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The language of the object content.</p>
     * <p>This parameter is returned only if the Content-Language HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ContentLanguage")
    public String contentLanguage;

    /**
     * <p>The MD5 hash of the object content.</p>
     * 
     * <strong>example:</strong>
     * <p>HZwoCnxPZ/fvhz4oRJ2+Fw==</p>
     */
    @NameInMap("ContentMd5")
    public String contentMd5;

    /**
     * <p>The content type of the file (MIME type).</p>
     * 
     * <strong>example:</strong>
     * <p>image/jpeg</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The time when the metadata was created. The time is in the RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The cropping suggestions for the image.</p>
     * <blockquote>
     * <p>This feature is not supported.</p>
     * </blockquote>
     */
    @NameInMap("CroppingSuggestions")
    public java.util.List<CroppingSuggestion> croppingSuggestions;

    /**
     * <p>The custom ID of the file, which you can use to associate the file with an ID in your business system. When the file is indexed into a dataset, this ID is stored as a metadata attribute. We recommend using a globally unique value.</p>
     * 
     * <strong>example:</strong>
     * <p>member-image-id-0001</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>Custom key-value labels for the file. This parameter is optional and can be used to store business-specific data and to filter queries.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;MemberName&quot;: &quot;Tim&quot;,
     *       &quot;Enabled&quot;: &quot;True&quot;,
     *       &quot;ItemCount&quot;: &quot;10&quot;
     * }</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The dataset name. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The total duration of the video, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15.263000</p>
     */
    @NameInMap("Duration")
    public Double duration;

    /**
     * <p>An ETag is generated when an object is created. The ETag identifies the content of an object.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;1D9C280A7C4F67F7EF873E28449****&quot;</p>
     */
    @NameInMap("ETag")
    public String ETag;

    /**
     * <p>The original EXIF information of the image, stored as a serialized JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/44975.html">Obtain image information</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Compression&quot;:{&quot;value&quot;:&quot;6&quot;},&quot;DateTime&quot;:{&quot;value&quot;:&quot;2020:08:19 17:11:11&quot;}}</p>
     */
    @NameInMap("EXIF")
    public String EXIF;

    /**
     * <p>A list of document fragments that match the current search content when you use the SemanticQuery API to perform a semantic search.</p>
     */
    @NameInMap("Elements")
    public java.util.List<Element> elements;

    /**
     * <p>The number of figures.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FigureCount")
    public Long figureCount;

    /**
     * <p>A list of figures detected by the AI model.</p>
     */
    @NameInMap("Figures")
    public java.util.List<Figure> figures;

    /**
     * <p>The time when the file was last accessed. The time is in the RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("FileAccessTime")
    public String fileAccessTime;

    /**
     * <p>The time when the file was created. The time is in the RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    /**
     * <p>The hash of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>1d9c280a7c4f67f7ef873e28449dbe17</p>
     */
    @NameInMap("FileHash")
    public String fileHash;

    /**
     * <p>The time when the file was last modified. The time is in the RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("FileModifiedTime")
    public String fileModifiedTime;

    /**
     * <p>The name of the file. For an OSS object, this parameter is the ObjectKey.</p>
     * 
     * <strong>example:</strong>
     * <p>sampleobject.jpg</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>The full name of the media format.</p>
     * 
     * <strong>example:</strong>
     * <p>QuickTime / MOV</p>
     */
    @NameInMap("FormatLongName")
    public String formatLongName;

    /**
     * <p>The name of the media format.</p>
     * 
     * <strong>example:</strong>
     * <p>mov</p>
     */
    @NameInMap("FormatName")
    public String formatName;

    /**
     * <p>The height of the image, in pixels (px).</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ImageHeight")
    public Long imageHeight;

    /**
     * <p>The image score information, detected by an AI model.</p>
     */
    @NameInMap("ImageScore")
    public ImageScore imageScore;

    /**
     * <p>The width of the image, in pixels (px).</p>
     * 
     * <strong>example:</strong>
     * <p>270</p>
     */
    @NameInMap("ImageWidth")
    public Long imageWidth;

    /**
     * <p>Summary and description of the file.</p>
     * <blockquote>
     * <p>Currently not supported</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Insights")
    public Insights insights;

    /**
     * <p>A list of AI-detected labels for the file.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The language in BCP 47 format.</p>
     * 
     * <strong>example:</strong>
     * <p>eng</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The GPS latitude and longitude.</p>
     * 
     * <strong>example:</strong>
     * <p>30.134390,120.074997</p>
     */
    @NameInMap("LatLong")
    public String latLong;

    /**
     * <p>The media type of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The OCR results.</p>
     * <blockquote>
     * <p>This feature is not supported.</p>
     * </blockquote>
     */
    @NameInMap("OCRContents")
    public java.util.List<OCRContents> OCRContents;

    /**
     * <p>The text detected in the image.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云IMM</p>
     */
    @NameInMap("OCRTexts")
    public String OCRTexts;

    /**
     * <p>The CRC-64 value of the object.</p>
     * 
     * <strong>example:</strong>
     * <p>559890638950338001</p>
     */
    @NameInMap("OSSCRC64")
    public String OSSCRC64;

    /**
     * <p>The OSS delete marker.</p>
     * 
     * <strong>example:</strong>
     * <p>CAEQMhiBgIDXiaaB0BYiIGQzYmRkZGUxMTM1ZDRjOTZhNjk4YjRjMTAyZjhl****</p>
     */
    @NameInMap("OSSDeleteMarker")
    public String OSSDeleteMarker;

    /**
     * <p>The expiration time of the OSS object.</p>
     * <p>This parameter is returned only if the Expires HTTP header is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2120-01-01T12:00:00.000Z</p>
     */
    @NameInMap("OSSExpiration")
    public String OSSExpiration;

    /**
     * <p>The type of the OSS object. A common value is <code>Normal</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("OSSObjectType")
    public String OSSObjectType;

    /**
     * <p>The storage class of the OSS object.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("OSSStorageClass")
    public String OSSStorageClass;

    /**
     * <p>The tags of the OSS object.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/106678.html">Object tagging</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;val&quot;}</p>
     */
    @NameInMap("OSSTagging")
    public java.util.Map<String, ?> OSSTagging;

    /**
     * <p>The number of tags on the OSS object.</p>
     * <p>This parameter is returned only if tags are set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/106678.html">Object tagging</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OSSTaggingCount")
    public Long OSSTaggingCount;

    /**
     * <p>The URI of the OSS file. This parameter is returned only if the URI is a PDS address.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/sampleobject.jpg</p>
     */
    @NameInMap("OSSURI")
    public String OSSURI;

    /**
     * <p>The user-defined metadata of the OSS object.</p>
     * <p>This parameter is returned only if user-defined metadata is set for the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;val&quot;}</p>
     */
    @NameInMap("OSSUserMeta")
    public java.util.Map<String, ?> OSSUserMeta;

    /**
     * <p>The version ID of the OSS object.</p>
     * <p>This parameter is returned only if versioning is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/109695.html">Overview of versioning</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CAEQNhiBgMDJgZCA0BYiIDc4MGZjZGI2OTBjOTRmNTE5NmU5NmFhZjhjYmY0****</p>
     */
    @NameInMap("OSSVersionId")
    public String OSSVersionId;

    /**
     * <p>The access control list (ACL) of the OSS object.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ObjectACL")
    public String objectACL;

    /**
     * <p>The unique ID of the object.</p>
     * 
     * <strong>example:</strong>
     * <p>75d5de2c50754e3dadd5c35dbca5f9949369e37eb342a73821f690c94c36c7f7</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>File index status.</p>
     * 
     * <strong>example:</strong>
     * <p>Indexed</p>
     */
    @NameInMap("ObjectStatus")
    public String objectStatus;

    /**
     * <p>The type of the object. The value is always <strong>file</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The rotation value of the image, read from its EXIF data.</p>
     * <p>This parameter is returned only if this value is available in the EXIF data.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Orientation")
    public Long orientation;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>102321002467****</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of pages.</p>
     * <blockquote>
     * <p>This feature is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <p>The performer.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("Performer")
    public String performer;

    /**
     * <p>The time when the photo was taken.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("ProduceTime")
    public String produceTime;

    /**
     * <p>The number of programs in the media container.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProgramCount")
    public Long programCount;

    /**
     * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The reason the file failed to be indexed.</p>
     * 
     * <strong>example:</strong>
     * <p>[InternalError] The request has been failed due to some unknown error. status: 500, requestId: CC5ACFBD-BB7A-496D-A9D6-****</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>A list of scene elements extracted from the video by the AI model during analysis.</p>
     */
    @NameInMap("SceneElements")
    public java.util.List<SceneElement> sceneElements;

    /**
     * <p>Indicates why this file was returned when you use the SemanticQuery API to perform a semantic search.</p>
     */
    @NameInMap("SemanticTypes")
    public java.util.List<String> semanticTypes;

    /**
     * <p>The encryption algorithm of the object.</p>
     * <p>This parameter is returned only if server-side encryption is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31871.html">Server-side encryption</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SM4</p>
     */
    @NameInMap("ServerSideDataEncryption")
    public String serverSideDataEncryption;

    /**
     * <p>The server-side encryption method.</p>
     * <p>This parameter is returned only if server-side encryption is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31871.html">Server-side encryption</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>AES256</p>
     */
    @NameInMap("ServerSideEncryption")
    public String serverSideEncryption;

    /**
     * <p>The encryption algorithm used for server-side encryption with customer-provided keys.</p>
     * 
     * <strong>example:</strong>
     * <p>SM4</p>
     */
    @NameInMap("ServerSideEncryptionCustomerAlgorithm")
    public String serverSideEncryptionCustomerAlgorithm;

    /**
     * <p>The ID of the customer master key (CMK) that is managed by KMS.</p>
     * <p>This parameter is returned only if server-side encryption is enabled for the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31871.html">Server-side encryption</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>9468da86-3509-4f8d-a61e-6eab1eac****</p>
     */
    @NameInMap("ServerSideEncryptionKeyId")
    public String serverSideEncryptionKeyId;

    /**
     * <p>The size of the file, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The start time of the first frame, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0.000000</p>
     */
    @NameInMap("StartTime")
    public Double startTime;

    /**
     * <p>The number of media streams in the media container.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StreamCount")
    public Long streamCount;

    /**
     * <p>A list of subtitle streams.</p>
     */
    @NameInMap("Subtitles")
    public java.util.List<SubtitleStream> subtitles;

    /**
     * <p>The timezone.</p>
     * <blockquote>
     * <p>This feature is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>The title of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>A reserved parameter.</p>
     * <blockquote>
     * <p>This feature is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("TravelClusterId")
    public String travelClusterId;

    /**
     * <p>The address of the file.</p>
     * <p>An OSS URI must be in the <code>oss://${Bucket}/${Object}</code> format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the full path to the object, including the file extension.</p>
     * <p>A PDS URI must be in the <code>pds://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision}</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.jpg</p>
     */
    @NameInMap("URI")
    public String URI;

    /**
     * <p>The time when the metadata was last updated. The time is in the RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The height of the video, in pixels (px).</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("VideoHeight")
    public Long videoHeight;

    /**
     * <p>A list of video streams.</p>
     */
    @NameInMap("VideoStreams")
    public java.util.List<VideoStream> videoStreams;

    /**
     * <p>The width of the video, in pixels (px).</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("VideoWidth")
    public Long videoWidth;

    public static File build(java.util.Map<String, ?> map) throws Exception {
        File self = new File();
        return TeaModel.build(map, self);
    }

    public File setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }
    public String getAccessControlAllowOrigin() {
        return this.accessControlAllowOrigin;
    }

    public File setAccessControlRequestMethod(String accessControlRequestMethod) {
        this.accessControlRequestMethod = accessControlRequestMethod;
        return this;
    }
    public String getAccessControlRequestMethod() {
        return this.accessControlRequestMethod;
    }

    public File setAddresses(java.util.List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    public File setAlbum(String album) {
        this.album = album;
        return this;
    }
    public String getAlbum() {
        return this.album;
    }

    public File setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
        return this;
    }
    public String getAlbumArtist() {
        return this.albumArtist;
    }

    public File setArtist(String artist) {
        this.artist = artist;
        return this;
    }
    public String getArtist() {
        return this.artist;
    }

    public File setAudioCovers(java.util.List<Image> audioCovers) {
        this.audioCovers = audioCovers;
        return this;
    }
    public java.util.List<Image> getAudioCovers() {
        return this.audioCovers;
    }

    public File setAudioStreams(java.util.List<AudioStream> audioStreams) {
        this.audioStreams = audioStreams;
        return this;
    }
    public java.util.List<AudioStream> getAudioStreams() {
        return this.audioStreams;
    }

    public File setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public File setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }
    public String getCacheControl() {
        return this.cacheControl;
    }

    public File setComposer(String composer) {
        this.composer = composer;
        return this;
    }
    public String getComposer() {
        return this.composer;
    }

    public File setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    public File setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public File setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    public File setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public File setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public File setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public File setCroppingSuggestions(java.util.List<CroppingSuggestion> croppingSuggestions) {
        this.croppingSuggestions = croppingSuggestions;
        return this;
    }
    public java.util.List<CroppingSuggestion> getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    public File setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public File setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public File setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public File setDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    public Double getDuration() {
        return this.duration;
    }

    public File setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public File setEXIF(String EXIF) {
        this.EXIF = EXIF;
        return this;
    }
    public String getEXIF() {
        return this.EXIF;
    }

    public File setElements(java.util.List<Element> elements) {
        this.elements = elements;
        return this;
    }
    public java.util.List<Element> getElements() {
        return this.elements;
    }

    public File setFigureCount(Long figureCount) {
        this.figureCount = figureCount;
        return this;
    }
    public Long getFigureCount() {
        return this.figureCount;
    }

    public File setFigures(java.util.List<Figure> figures) {
        this.figures = figures;
        return this;
    }
    public java.util.List<Figure> getFigures() {
        return this.figures;
    }

    public File setFileAccessTime(String fileAccessTime) {
        this.fileAccessTime = fileAccessTime;
        return this;
    }
    public String getFileAccessTime() {
        return this.fileAccessTime;
    }

    public File setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public File setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public File setFileModifiedTime(String fileModifiedTime) {
        this.fileModifiedTime = fileModifiedTime;
        return this;
    }
    public String getFileModifiedTime() {
        return this.fileModifiedTime;
    }

    public File setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public File setFormatLongName(String formatLongName) {
        this.formatLongName = formatLongName;
        return this;
    }
    public String getFormatLongName() {
        return this.formatLongName;
    }

    public File setFormatName(String formatName) {
        this.formatName = formatName;
        return this;
    }
    public String getFormatName() {
        return this.formatName;
    }

    public File setImageHeight(Long imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Long getImageHeight() {
        return this.imageHeight;
    }

    public File setImageScore(ImageScore imageScore) {
        this.imageScore = imageScore;
        return this;
    }
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    public File setImageWidth(Long imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Long getImageWidth() {
        return this.imageWidth;
    }

    public File setInsights(Insights insights) {
        this.insights = insights;
        return this;
    }
    public Insights getInsights() {
        return this.insights;
    }

    public File setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public File setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public File setLatLong(String latLong) {
        this.latLong = latLong;
        return this;
    }
    public String getLatLong() {
        return this.latLong;
    }

    public File setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public File setOCRContents(java.util.List<OCRContents> OCRContents) {
        this.OCRContents = OCRContents;
        return this;
    }
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

    public File setOCRTexts(String OCRTexts) {
        this.OCRTexts = OCRTexts;
        return this;
    }
    public String getOCRTexts() {
        return this.OCRTexts;
    }

    public File setOSSCRC64(String OSSCRC64) {
        this.OSSCRC64 = OSSCRC64;
        return this;
    }
    public String getOSSCRC64() {
        return this.OSSCRC64;
    }

    public File setOSSDeleteMarker(String OSSDeleteMarker) {
        this.OSSDeleteMarker = OSSDeleteMarker;
        return this;
    }
    public String getOSSDeleteMarker() {
        return this.OSSDeleteMarker;
    }

    public File setOSSExpiration(String OSSExpiration) {
        this.OSSExpiration = OSSExpiration;
        return this;
    }
    public String getOSSExpiration() {
        return this.OSSExpiration;
    }

    public File setOSSObjectType(String OSSObjectType) {
        this.OSSObjectType = OSSObjectType;
        return this;
    }
    public String getOSSObjectType() {
        return this.OSSObjectType;
    }

    public File setOSSStorageClass(String OSSStorageClass) {
        this.OSSStorageClass = OSSStorageClass;
        return this;
    }
    public String getOSSStorageClass() {
        return this.OSSStorageClass;
    }

    public File setOSSTagging(java.util.Map<String, ?> OSSTagging) {
        this.OSSTagging = OSSTagging;
        return this;
    }
    public java.util.Map<String, ?> getOSSTagging() {
        return this.OSSTagging;
    }

    public File setOSSTaggingCount(Long OSSTaggingCount) {
        this.OSSTaggingCount = OSSTaggingCount;
        return this;
    }
    public Long getOSSTaggingCount() {
        return this.OSSTaggingCount;
    }

    public File setOSSURI(String OSSURI) {
        this.OSSURI = OSSURI;
        return this;
    }
    public String getOSSURI() {
        return this.OSSURI;
    }

    public File setOSSUserMeta(java.util.Map<String, ?> OSSUserMeta) {
        this.OSSUserMeta = OSSUserMeta;
        return this;
    }
    public java.util.Map<String, ?> getOSSUserMeta() {
        return this.OSSUserMeta;
    }

    public File setOSSVersionId(String OSSVersionId) {
        this.OSSVersionId = OSSVersionId;
        return this;
    }
    public String getOSSVersionId() {
        return this.OSSVersionId;
    }

    public File setObjectACL(String objectACL) {
        this.objectACL = objectACL;
        return this;
    }
    public String getObjectACL() {
        return this.objectACL;
    }

    public File setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public File setObjectStatus(String objectStatus) {
        this.objectStatus = objectStatus;
        return this;
    }
    public String getObjectStatus() {
        return this.objectStatus;
    }

    public File setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public File setOrientation(Long orientation) {
        this.orientation = orientation;
        return this;
    }
    public Long getOrientation() {
        return this.orientation;
    }

    public File setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public File setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public File setPerformer(String performer) {
        this.performer = performer;
        return this;
    }
    public String getPerformer() {
        return this.performer;
    }

    public File setProduceTime(String produceTime) {
        this.produceTime = produceTime;
        return this;
    }
    public String getProduceTime() {
        return this.produceTime;
    }

    public File setProgramCount(Long programCount) {
        this.programCount = programCount;
        return this;
    }
    public Long getProgramCount() {
        return this.programCount;
    }

    public File setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public File setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public File setSceneElements(java.util.List<SceneElement> sceneElements) {
        this.sceneElements = sceneElements;
        return this;
    }
    public java.util.List<SceneElement> getSceneElements() {
        return this.sceneElements;
    }

    public File setSemanticTypes(java.util.List<String> semanticTypes) {
        this.semanticTypes = semanticTypes;
        return this;
    }
    public java.util.List<String> getSemanticTypes() {
        return this.semanticTypes;
    }

    public File setServerSideDataEncryption(String serverSideDataEncryption) {
        this.serverSideDataEncryption = serverSideDataEncryption;
        return this;
    }
    public String getServerSideDataEncryption() {
        return this.serverSideDataEncryption;
    }

    public File setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public File setServerSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
        this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
        return this;
    }
    public String getServerSideEncryptionCustomerAlgorithm() {
        return this.serverSideEncryptionCustomerAlgorithm;
    }

    public File setServerSideEncryptionKeyId(String serverSideEncryptionKeyId) {
        this.serverSideEncryptionKeyId = serverSideEncryptionKeyId;
        return this;
    }
    public String getServerSideEncryptionKeyId() {
        return this.serverSideEncryptionKeyId;
    }

    public File setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public File setStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getStartTime() {
        return this.startTime;
    }

    public File setStreamCount(Long streamCount) {
        this.streamCount = streamCount;
        return this;
    }
    public Long getStreamCount() {
        return this.streamCount;
    }

    public File setSubtitles(java.util.List<SubtitleStream> subtitles) {
        this.subtitles = subtitles;
        return this;
    }
    public java.util.List<SubtitleStream> getSubtitles() {
        return this.subtitles;
    }

    public File setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public File setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public File setTravelClusterId(String travelClusterId) {
        this.travelClusterId = travelClusterId;
        return this;
    }
    public String getTravelClusterId() {
        return this.travelClusterId;
    }

    public File setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public File setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public File setVideoHeight(Long videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }
    public Long getVideoHeight() {
        return this.videoHeight;
    }

    public File setVideoStreams(java.util.List<VideoStream> videoStreams) {
        this.videoStreams = videoStreams;
        return this;
    }
    public java.util.List<VideoStream> getVideoStreams() {
        return this.videoStreams;
    }

    public File setVideoWidth(Long videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }
    public Long getVideoWidth() {
        return this.videoWidth;
    }

}
