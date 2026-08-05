// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponseBody extends TeaModel {
    /**
     * <p>The media asset information.</p>
     */
    @NameInMap("MediaBase")
    public GetPlayInfoResponseBodyMediaBase mediaBase;

    /**
     * <p>The audio or video playback information (stream information).</p>
     */
    @NameInMap("PlayInfoList")
    public java.util.List<GetPlayInfoResponseBodyPlayInfoList> playInfoList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoResponseBody self = new GetPlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoResponseBody setMediaBase(GetPlayInfoResponseBodyMediaBase mediaBase) {
        this.mediaBase = mediaBase;
        return this;
    }
    public GetPlayInfoResponseBodyMediaBase getMediaBase() {
        return this.mediaBase;
    }

    public GetPlayInfoResponseBody setPlayInfoList(java.util.List<GetPlayInfoResponseBodyPlayInfoList> playInfoList) {
        this.playInfoList = playInfoList;
        return this;
    }
    public java.util.List<GetPlayInfoResponseBodyPlayInfoList> getPlayInfoList() {
        return this.playInfoList;
    }

    public GetPlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPlayInfoResponseBodyMediaBase extends TeaModel {
        /**
         * <p>The category ID. You can obtain the category ID by using the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://ims.console.aliyun.com">IMS console</a> and choose <strong>Media Asset Management</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
         * <li>When you create a category by calling the create category operation, the category ID is the value of CateId in the response.</li>
         * <li>When you query a category by calling the get category operation, the category ID is the value of CateId in the response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4220</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The cover URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***.oss-cn-shanghai.aliyuncs.com/cover/281c64d6-b5fb-4c57-97cd-84da56a8b151_large_cover_url.jpg</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-22T10:07:31+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The content description.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2eea77a61c7b4ddd95bec34a6f65b***</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The tags.</p>
         * <ul>
         * <li><p>A maximum of 16 tags are supported.</p>
         * </li>
         * <li><p>Separate multiple tags with commas (,).</p>
         * </li>
         * <li><p>Each tag can be up to 32 bytes in length.</p>
         * </li>
         * <li><p>UTF-8 encoding is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test,ccc</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <p>The media file type. Valid values:</p>
         * <p>video: video.
         * audio: audio only.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The resource status. Valid values:</p>
         * <ul>
         * <li><p>Init: The source file is not ready.</p>
         * </li>
         * <li><p>Preparing: The source file is being prepared, for example, being uploaded or composed.</p>
         * </li>
         * <li><p>PrepareFail: The source file failed to be prepared, for example, failed to obtain source file information.</p>
         * </li>
         * <li><p>Normal: The source file is ready.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>testTitle</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetPlayInfoResponseBodyMediaBase build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseBodyMediaBase self = new GetPlayInfoResponseBodyMediaBase();
            return TeaModel.build(map, self);
        }

        public GetPlayInfoResponseBodyMediaBase setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetPlayInfoResponseBodyMediaBase setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetPlayInfoResponseBodyMediaBase setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetPlayInfoResponseBodyMediaBase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPlayInfoResponseBodyMediaBase setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetPlayInfoResponseBodyMediaBase setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetPlayInfoResponseBodyMediaBase setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetPlayInfoResponseBodyMediaBase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPlayInfoResponseBodyMediaBase setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetPlayInfoResponseBodyPlayInfoList extends TeaModel {
        /**
         * <p>The color bit depth.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("BitDepth")
        public Integer bitDepth;

        /**
         * <p>The bitrate of the media stream. Unit: Kbps.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The creation time. The time follows the format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T02:28:49Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The definition of the video stream. Valid values:</p>
         * <ul>
         * <li><strong>FD</strong>: low definition.</li>
         * <li><strong>LD</strong>: standard definition.</li>
         * <li><strong>SD</strong>: high definition.</li>
         * <li><strong>HD</strong>: ultra-high definition.</li>
         * <li><strong>OD</strong>: original quality.</li>
         * <li><strong>2K</strong>: 2K.</li>
         * <li><strong>4K</strong>: 4K.</li>
         * <li><strong>SQ</strong>: standard sound quality.</li>
         * <li><strong>HQ</strong>: high sound quality.</li>
         * <li><strong>AUTO</strong>: adaptive bitrate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HD</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The duration of the media stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9.0464</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Indicates whether the media stream is encrypted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not encrypted.</li>
         * <li><strong>1</strong>: encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Encrypt")
        public Long encrypt;

        /**
         * <p>The encryption type of the media stream. Valid values:</p>
         * <ul>
         * <li><strong>AliyunVoDEncryption</strong>: Alibaba Cloud video encryption.</li>
         * <li><strong>HLSEncryption</strong>: HLS standard encryption.</li>
         * </ul>
         * <blockquote>
         * <p>If the encryption type is <strong>AliyunVoDEncryption</strong>, only the Alibaba Cloud Player SDK can be used for playback.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AliyunVoDEncryption</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>The OSS URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/sv/43a68ee9-181809b6aba/43a68ee9-181809b6aba.mpeg">http://outin-***.oss-cn-shanghai.aliyuncs.com/sv/43a68ee9-181809b6aba/43a68ee9-181809b6aba.mpeg</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The format of the media stream.</p>
         * <ul>
         * <li>If the media file is a video, valid values are <strong>mp4</strong> and <strong>m3u8</strong>.</li>
         * <li>If the media file is audio only, the value is <strong>mp3</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the media stream. Unit: frames per second.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The HDR type of the media stream. Valid values:</p>
         * <ul>
         * <li>HDR</li>
         * <li>HDR10</li>
         * <li>HLG</li>
         * <li>DolbyVision</li>
         * <li>HDRVivid</li>
         * <li>SDR+</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HDR</p>
         */
        @NameInMap("HDRType")
        public String HDRType;

        /**
         * <p>The height of the media stream. Unit: px.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36c9d38e70bf43ed9f7f8f48d6356***</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The modification time. The time follows the format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-13T11:39:41.714+08:00</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The Narrowband HD type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: normal.</li>
         * <li><strong>1.0</strong>: Narrowband HD 1.0.</li>
         * <li><strong>2.0</strong>: Narrowband HD 2.0.</li>
         * </ul>
         * <p>This parameter takes effect only when the definition of a Narrowband HD 1.0 built-in transcoding template is configured. For more information, see <a href="https://help.aliyun.com/document_detail/52839.html">Transcoding template configuration - Definition</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NarrowBandType")
        public String narrowBandType;

        /**
         * <p>The playback URL of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***.aliyuncdn.com/sv/756bee1-17f980f0945/756bee1-17f980f0945.mp4</p>
         */
        @NameInMap("PlayURL")
        public String playURL;

        /**
         * <p>The size of the media stream. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>418112</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The media stream status. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal.</li>
         * <li><strong>Invisible</strong>: invisible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The stream tag that identifies the transcoding processing type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;ims.audioServiceType\&quot;: \&quot;AudioEnhancement\&quot;}&quot;</p>
         */
        @NameInMap("StreamTags")
        public String streamTags;

        /**
         * <p>The media stream type. If the media stream is a video, the value is <strong>video</strong>. If the media stream is audio only, the value is <strong>audio</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The transcoding templatetype. Valid values:</p>
         * <ul>
         * <li>Normal: normal template.</li>
         * <li>AudioTranscode: audio transcoding.</li>
         * <li>Remux: encapsulation conversion.</li>
         * <li>NarrowBandV1: Narrowband HD 1.0.</li>
         * <li>NarrowBandV2: Narrowband HD 2.0.</li>
         * <li>UHD: audio and video enhancement (ultra-high definition).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TransTemplateType")
        public String transTemplateType;

        /**
         * <p>The watermark ID associated with the current media stream.</p>
         * 
         * <strong>example:</strong>
         * <p>5bed88672b1e2520ead228935ed51***</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        /**
         * <p>The width of the media stream. Unit: px.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Width")
        public Long width;

        public static GetPlayInfoResponseBodyPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseBodyPlayInfoList self = new GetPlayInfoResponseBodyPlayInfoList();
            return TeaModel.build(map, self);
        }

        public GetPlayInfoResponseBodyPlayInfoList setBitDepth(Integer bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }
        public Integer getBitDepth() {
            return this.bitDepth;
        }

        public GetPlayInfoResponseBodyPlayInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetPlayInfoResponseBodyPlayInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetPlayInfoResponseBodyPlayInfoList setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetPlayInfoResponseBodyPlayInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPlayInfoResponseBodyPlayInfoList setEncrypt(Long encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Long getEncrypt() {
            return this.encrypt;
        }

        public GetPlayInfoResponseBodyPlayInfoList setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetPlayInfoResponseBodyPlayInfoList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetPlayInfoResponseBodyPlayInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetPlayInfoResponseBodyPlayInfoList setHDRType(String HDRType) {
            this.HDRType = HDRType;
            return this;
        }
        public String getHDRType() {
            return this.HDRType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public GetPlayInfoResponseBodyPlayInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPlayInfoResponseBodyPlayInfoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetPlayInfoResponseBodyPlayInfoList setNarrowBandType(String narrowBandType) {
            this.narrowBandType = narrowBandType;
            return this;
        }
        public String getNarrowBandType() {
            return this.narrowBandType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setPlayURL(String playURL) {
            this.playURL = playURL;
            return this;
        }
        public String getPlayURL() {
            return this.playURL;
        }

        public GetPlayInfoResponseBodyPlayInfoList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetPlayInfoResponseBodyPlayInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPlayInfoResponseBodyPlayInfoList setStreamTags(String streamTags) {
            this.streamTags = streamTags;
            return this;
        }
        public String getStreamTags() {
            return this.streamTags;
        }

        public GetPlayInfoResponseBodyPlayInfoList setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setTransTemplateType(String transTemplateType) {
            this.transTemplateType = transTemplateType;
            return this;
        }
        public String getTransTemplateType() {
            return this.transTemplateType;
        }

        public GetPlayInfoResponseBodyPlayInfoList setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public GetPlayInfoResponseBodyPlayInfoList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
