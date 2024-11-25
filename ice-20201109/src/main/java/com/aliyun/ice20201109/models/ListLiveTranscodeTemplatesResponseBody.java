// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of transcoding templates.</p>
     */
    @NameInMap("TemplateContentList")
    public java.util.List<ListLiveTranscodeTemplatesResponseBodyTemplateContentList> templateContentList;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLiveTranscodeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTranscodeTemplatesResponseBody self = new ListLiveTranscodeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveTranscodeTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveTranscodeTemplatesResponseBody setTemplateContentList(java.util.List<ListLiveTranscodeTemplatesResponseBodyTemplateContentList> templateContentList) {
        this.templateContentList = templateContentList;
        return this;
    }
    public java.util.List<ListLiveTranscodeTemplatesResponseBodyTemplateContentList> getTemplateContentList() {
        return this.templateContentList;
    }

    public ListLiveTranscodeTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams extends TeaModel {
        /**
         * <p>The audio bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The encoding profile.</p>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The audio sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        public static ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams self = new ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams extends TeaModel {
        /**
         * <p>The video bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>2500</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The video frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The group of pictures (GOP) of the output video. Unit: frame.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The vertical resolution of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The encoding profile.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The horizontal resolution of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams self = new ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig extends TeaModel {
        /**
         * <p>The audio parameters.</p>
         */
        @NameInMap("AudioParams")
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams audioParams;

        /**
         * <p>The video parameters.</p>
         */
        @NameInMap("VideoParams")
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams videoParams;

        public static ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig self = new ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig setAudioParams(ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams audioParams) {
            this.audioParams = audioParams;
            return this;
        }
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams getAudioParams() {
            return this.audioParams;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig setVideoParams(ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams videoParams) {
            this.videoParams = videoParams;
            return this;
        }
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigVideoParams getVideoParams() {
            return this.videoParams;
        }

    }

    public static class ListLiveTranscodeTemplatesResponseBodyTemplateContentList extends TeaModel {
        /**
         * <p>The category of the template. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T03:26:36Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configuration of the template.</p>
         */
        @NameInMap("TemplateConfig")
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig templateConfig;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9b1571b513cb44f7a1ba6ae561ff46f7</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The type of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListLiveTranscodeTemplatesResponseBodyTemplateContentList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeTemplatesResponseBodyTemplateContentList self = new ListLiveTranscodeTemplatesResponseBodyTemplateContentList();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentList setTemplateConfig(ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig getTemplateConfig() {
            return this.templateConfig;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListLiveTranscodeTemplatesResponseBodyTemplateContentList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
