// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the media asset.</p>
     */
    @NameInMap("MediaBase")
    public GetPlayInfoResponseBodyMediaBase mediaBase;

    /**
     * <p>The information about the audio or video stream.</p>
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
         * <p>The category ID. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://ims.console.aliyun.com">Intelligent Media Services (IMS) console</a> and choose <strong>Media Asset Management</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
         * <li>View the value of the CateId parameter returned by the AddCategory operation that you called to create a category.</li>
         * <li>View the value of the CateId parameter returned by the GetCategories operation that you called to query a category.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4220</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***.oss-cn-shanghai.aliyuncs.com/cover/281c64d6-b5fb-4c57-97cd-84da56a8b151_large_cover_url.jpg</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media asset was created.</p>
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
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>2eea77a61c7b4ddd95bec34a6f65b***</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The tags.</p>
         * <ul>
         * <li>Up to 16 tags are supported.</li>
         * <li>Multiple tags are separated by commas (,).</li>
         * <li>Each tag can be up to 32 bytes in length.</li>
         * <li>The value is encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test,ccc</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <p>The type of the media asset. Valid values:</p>
         * <p>video audio</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The resource status. Valid values:</p>
         * <p>Init: the initial state, which indicates that the source file is not ready.</p>
         * <p>Preparing: The source file is being prepared. For example, the file is being uploaded or edited.</p>
         * <p>PrepareFail: The source file failed to be prepared. For example, the information of the source file failed to be obtained.</p>
         * <p>Normal: The source file is ready.</p>
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
         * <p>The color depth.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("BitDepth")
        public Integer bitDepth;

        /**
         * <p>The bitrate of the media stream. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The time when the media stream was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T02:28:49Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The quality of the media stream. Valid values:</p>
         * <ul>
         * <li><strong>FD</strong>: low definition</li>
         * <li><strong>LD</strong>: standard definition</li>
         * <li><strong>SD</strong>: high definition</li>
         * <li><strong>HD</strong>: ultra-high definition</li>
         * <li><strong>OD</strong>: original definition</li>
         * <li><strong>2K</strong></li>
         * <li><strong>4K</strong></li>
         * <li><strong>SQ</strong>: standard sound quality</li>
         * <li><strong>HQ</strong>: high sound quality</li>
         * <li><strong>AUTO</strong>: adaptive bitrate</li>
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
         * <li><strong>0</strong>: The media stream is not encrypted.</li>
         * <li><strong>1</strong>: The media stream is encrypted.</li>
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
         * <li><strong>AliyunVoDEncryption</strong>: Alibaba Cloud proprietary cryptography</li>
         * <li><strong>HLSEncryption</strong>: HTTP Live Streaming (HLS) encryption</li>
         * </ul>
         * <blockquote>
         * <p> If the encryption type is AliyunVoDEncryption, only ApsaraVideo Player SDK can be used to play videos.</p>
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
         * <li>If the media asset is a video file, the valid values are <strong>mp4</strong> and <strong>m3u8</strong>.</li>
         * <li>If the media asset is an audio-only file, the value is <strong>mp3</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the media stream. Unit: frames per second (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The high dynamic range (HDR) type of the media stream. Valid values:</p>
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
         * <p>The height of the media stream. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36c9d38e70bf43ed9f7f8f48d6356***</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The time when the media stream was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-13T11:39:41.714+08:00</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The type of Narrowband HD™ transcoding. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: standard transcoding</li>
         * <li><strong>1.0</strong>: Narrowband HD™ 1.0 transcoding</li>
         * <li><strong>2.0</strong>: Narrowband HD™ 2.0 transcoding</li>
         * </ul>
         * <p>This parameter is returned only when a definition that is available in the built-in Narrowband HD™ 1.0 transcoding template is specified. For more information, see the <a href="https://help.aliyun.com/document_detail/52839.html">Definition parameter in TranscodeTemplate</a> table.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NarrowBandType")
        public String narrowBandType;

        /**
         * <p>The playback URL of the media stream.</p>
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
         * <p>The status of the media stream. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Invisible</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the media stream, which are used to identify the transcoding type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;ims.audioServiceType\&quot;: \&quot;AudioEnhancement\&quot;}&quot;</p>
         */
        @NameInMap("StreamTags")
        public String streamTags;

        /**
         * <p>The type of the media stream. If the media stream is a video stream, the value is <strong>video</strong>. If the media stream is an audio-only stream, the value is <strong>audio</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The type of the transcoding template. Valid values:</p>
         * <ul>
         * <li>Normal: standard transcoding</li>
         * <li>AudioTranscode: audio transcoding</li>
         * <li>Remux: container format conversion</li>
         * <li>NarrowBandV1: Narrowband HD™ 1.0</li>
         * <li>NarrowBandV2: Narrowband HD™ 2.0</li>
         * <li>UHD: audio and video enhancement (ultra-high definition)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TransTemplateType")
        public String transTemplateType;

        /**
         * <p>The ID of the watermark that is associated with the media stream.</p>
         * 
         * <strong>example:</strong>
         * <p>5bed88672b1e2520ead228935ed51***</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        /**
         * <p>The width of the media stream. Unit: pixels.</p>
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
