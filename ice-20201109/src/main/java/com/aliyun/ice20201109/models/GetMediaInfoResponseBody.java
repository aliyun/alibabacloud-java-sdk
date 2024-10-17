// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the media asset.</p>
     */
    @NameInMap("MediaInfo")
    public GetMediaInfoResponseBodyMediaInfo mediaInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FDE2411-DB8D-4A9A-875B-275798F14A5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoResponseBody self = new GetMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoResponseBody setMediaInfo(GetMediaInfoResponseBodyMediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
        return this;
    }
    public GetMediaInfoResponseBodyMediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public GetMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults extends TeaModel {
        /**
         * <p>The result data. The value is a JSON string. For information about the data structures of different data types&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/zh/ims/developer-reference/api-ice-2020-11-09-querysmarttagjob?spm=a2c4g.11186623.0.0.521d48b7KfapOL#api-detail-40">Description of the Results parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;autoChapters&quot;: [...]}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The tagging type. Valid values:</p>
         * <ul>
         * <li>NLP: natural language processing (NLP)-based tagging</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NLP</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults self = new GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob extends TeaModel {
        /**
         * <p>The ID of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>483915d4f2cd8ac20b48fb04</strong></strong></p>
         */
        @NameInMap("AiJobId")
        public String aiJobId;

        /**
         * <p>The URL of the tagging result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xx.oss-cn-shanghai.aliyuncs.com/result2.txt">http://xx.oss-cn-shanghai.aliyuncs.com/result2.txt</a></p>
         */
        @NameInMap("ResultUrl")
        public String resultUrl;

        /**
         * <p>The recognized tags.</p>
         */
        @NameInMap("Results")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults> results;

        /**
         * <p>The analysis status. Valid values:</p>
         * <ul>
         * <li>Analyzing</li>
         * <li>AnalyzeSuccess</li>
         * <li>AnalyzeFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Analyzing</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob self = new GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob setAiJobId(String aiJobId) {
            this.aiJobId = aiJobId;
            return this;
        }
        public String getAiJobId() {
            return this.aiJobId;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob setResults(java.util.List<GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJobResults> getResults() {
            return this.results;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoAiRoughData extends TeaModel {
        /**
         * <p>The AI category. Valid values:</p>
         * <ul>
         * <li>Life</li>
         * <li>Good-looking</li>
         * <li>Cute pets</li>
         * <li>News</li>
         * <li>Ads</li>
         * <li>Environmental resources</li>
         * <li>Automobile</li>
         * </ul>
         */
        @NameInMap("AiCategory")
        public String aiCategory;

        /**
         * <p>The ID of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>483915d4f2cd8ac20b48fb04</strong></strong></p>
         */
        @NameInMap("AiJobId")
        public String aiJobId;

        /**
         * <p>The analysis result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sample-bucket.cn-shanghai.aliyuncs.com/result.json">https://sample-bucket.cn-shanghai.aliyuncs.com/result.json</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The storage type. This parameter indicates the library in which the analysis data is stored. Valid values:</p>
         * <ul>
         * <li>TEXT: the text library.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("SaveType")
        public String saveType;

        /**
         * <p>The information about the tagging job.</p>
         */
        @NameInMap("StandardSmartTagJob")
        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob standardSmartTagJob;

        /**
         * <p>The analysis status. Valid values:</p>
         * <ul>
         * <li>Analyzing</li>
         * <li>AnalyzeSuccess</li>
         * <li>AnalyzeFailed</li>
         * <li>Saving</li>
         * <li>SaveSuccess</li>
         * <li>SaveFailed</li>
         * <li>Deleting</li>
         * <li>DeleteSuccess</li>
         * <li>DeleteFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Analyzing</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetMediaInfoResponseBodyMediaInfoAiRoughData build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoAiRoughData self = new GetMediaInfoResponseBodyMediaInfoAiRoughData();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughData setAiCategory(String aiCategory) {
            this.aiCategory = aiCategory;
            return this;
        }
        public String getAiCategory() {
            return this.aiCategory;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughData setAiJobId(String aiJobId) {
            this.aiJobId = aiJobId;
            return this;
        }
        public String getAiJobId() {
            return this.aiJobId;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughData setSaveType(String saveType) {
            this.saveType = saveType;
            return this;
        }
        public String getSaveType() {
            return this.saveType;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughData setStandardSmartTagJob(GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob standardSmartTagJob) {
            this.standardSmartTagJob = standardSmartTagJob;
            return this;
        }
        public GetMediaInfoResponseBodyMediaInfoAiRoughDataStandardSmartTagJob getStandardSmartTagJob() {
            return this.standardSmartTagJob;
        }

        public GetMediaInfoResponseBodyMediaInfoAiRoughData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>127.794</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The output layout of sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>stereo</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <p>The number of sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The full name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC (Advanced Audio Coding)</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>0x6134706d</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4a</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The time base of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>1/24000</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>16.200998</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The audio frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The sequence number of the audio track.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The codec profile.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The sampling format.</p>
         * 
         * <strong>example:</strong>
         * <p>fltp</p>
         */
        @NameInMap("SampleFmt")
        public String sampleFmt;

        /**
         * <p>The sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("SampleRate")
        public String sampleRate;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1132.68</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The time when the file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>216.206667</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>30611502</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The file status.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FileStatus")
        public String fileStatus;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>source_file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The OSS URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The container format.</p>
         * 
         * <strong>example:</strong>
         * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The time when the file was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The region in which the file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Width")
        public String width;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo self = new GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList extends TeaModel {
        /**
         * <p>The full name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>SubRip Text</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>srt</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>unicode</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>unicode</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The time base of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>29.97</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The sequence number of the subtitle track.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList extends TeaModel {
        /**
         * <p>The average video frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>24.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1001.594</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The full name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>0x0000</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>[0][0][0][0]</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The time base of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>1/48</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The display aspect ratio (DAR).</p>
         * 
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>216.206706</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The video frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>24.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>Indicates whether the video track contains bidirectional frames (B-frames).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video track.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The codec level.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>5184</p>
         */
        @NameInMap("Nb_frames")
        public String nbFrames;

        /**
         * <p>The number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>5184</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The pixel format.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The codec profile.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The rotation angle.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The sample aspect ratio (SAR).</p>
         * 
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.081706</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/12288</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Width")
        public String width;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNbFrames(String nbFrames) {
            this.nbFrames = nbFrames;
            return this;
        }
        public String getNbFrames() {
            return this.nbFrames;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoFileInfoList extends TeaModel {
        /**
         * <p>The information about the audio tracks. A media asset may have multiple audio tracks.</p>
         */
        @NameInMap("AudioStreamInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList;

        /**
         * <p>The basic information about the file, including the duration and size.</p>
         */
        @NameInMap("FileBasicInfo")
        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo;

        /**
         * <p>The information about the subtitle tracks. A media asset may have multiple subtitle tracks.</p>
         */
        @NameInMap("SubtitleStreamInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList;

        /**
         * <p>The information about the video tracks. A media asset may have multiple video tracks.</p>
         */
        @NameInMap("VideoStreamInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList;

        public static GetMediaInfoResponseBodyMediaInfoFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoFileInfoList self = new GetMediaInfoResponseBodyMediaInfoFileInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setAudioStreamInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setFileBasicInfo(GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public GetMediaInfoResponseBodyMediaInfoFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setSubtitleStreamInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList) {
            this.subtitleStreamInfoList = subtitleStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> getSubtitleStreamInfoList() {
            return this.subtitleStreamInfoList;
        }

        public GetMediaInfoResponseBodyMediaInfoFileInfoList setVideoStreamInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoListVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfoMediaBasicInfo extends TeaModel {
        /**
         * <p>The service to which the media asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ICE</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3048</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>cateName</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The category.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media asset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the media asset was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:15Z</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <p>The content description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The input URL of the media asset in another service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        @NameInMap("InputURL")
        public String inputURL;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <p>The type of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The time when the media asset was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The custom ID. The ID can be 6 to 64 characters in length and can contain only letters, digits, hyphens (-), and underscores (_). The ID is unique among users.</p>
         * 
         * <strong>example:</strong>
         * <p>123-1234</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        /**
         * <p>The snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     &quot;<a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/snapshot-00001.png?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/snapshot-00001.png?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken>&quot;,
         *     &quot;<a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/snapshot-00002.jpg?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/snapshot-00002.jpg?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken>&quot;,
         *     &quot;<a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/snapshot-00003.jpg?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/snapshot-00003.jpg?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken>&quot;
         * ]</p>
         */
        @NameInMap("Snapshots")
        public String snapshots;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The sprite.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;32&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>83ec44d58b2069def2e</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example/example-{Count}.jpg&quot;,&quot;spriteRegular&quot;:&quot;example/example-{TileCount}.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e438b14ff39293eaec25</strong></strong></strong>&quot;,&quot;tileCount&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("SpriteImages")
        public String spriteImages;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The upload source of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("UploadSource")
        public String uploadSource;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>userDataTest</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetMediaInfoResponseBodyMediaInfoMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfoMediaBasicInfo self = new GetMediaInfoResponseBodyMediaInfoMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setUploadSource(String uploadSource) {
            this.uploadSource = uploadSource;
            return this;
        }
        public String getUploadSource() {
            return this.uploadSource;
        }

        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class GetMediaInfoResponseBodyMediaInfo extends TeaModel {
        /**
         * <p>The original AI analysis data.</p>
         */
        @NameInMap("AiRoughData")
        public GetMediaInfoResponseBodyMediaInfoAiRoughData aiRoughData;

        /**
         * <p>The file information.</p>
         */
        @NameInMap("FileInfoList")
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoList> fileInfoList;

        /**
         * <p>The basic information about the media asset.</p>
         */
        @NameInMap("MediaBasicInfo")
        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static GetMediaInfoResponseBodyMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseBodyMediaInfo self = new GetMediaInfoResponseBodyMediaInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaInfoResponseBodyMediaInfo setAiRoughData(GetMediaInfoResponseBodyMediaInfoAiRoughData aiRoughData) {
            this.aiRoughData = aiRoughData;
            return this;
        }
        public GetMediaInfoResponseBodyMediaInfoAiRoughData getAiRoughData() {
            return this.aiRoughData;
        }

        public GetMediaInfoResponseBodyMediaInfo setFileInfoList(java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<GetMediaInfoResponseBodyMediaInfoFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public GetMediaInfoResponseBodyMediaInfo setMediaBasicInfo(GetMediaInfoResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public GetMediaInfoResponseBodyMediaInfoMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public GetMediaInfoResponseBodyMediaInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
