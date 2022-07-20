// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeTemplatesResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateContentList")
    public java.util.List<ListLiveTranscodeTemplatesResponseBodyTemplateContentList> templateContentList;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("Profile")
        public String profile;

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
        @NameInMap("AudioParams")
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfigAudioParams audioParams;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateConfig")
        public ListLiveTranscodeTemplatesResponseBodyTemplateContentListTemplateConfig templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

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
