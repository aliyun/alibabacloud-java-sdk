// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMultiRateConfigResponseBody extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("IsLazy")
    public String isLazy;

    @NameInMap("IsTimeAlign")
    public String isTimeAlign;

    @NameInMap("Stream")
    public String stream;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("AvFormat")
    public String avFormat;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("TemplatesInfo")
    public GetMultiRateConfigResponseBodyTemplatesInfo templatesInfo;

    @NameInMap("GroupId")
    public String groupId;

    public static GetMultiRateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiRateConfigResponseBody self = new GetMultiRateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiRateConfigResponseBody setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public GetMultiRateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiRateConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMultiRateConfigResponseBody setIsLazy(String isLazy) {
        this.isLazy = isLazy;
        return this;
    }
    public String getIsLazy() {
        return this.isLazy;
    }

    public GetMultiRateConfigResponseBody setIsTimeAlign(String isTimeAlign) {
        this.isTimeAlign = isTimeAlign;
        return this;
    }
    public String getIsTimeAlign() {
        return this.isTimeAlign;
    }

    public GetMultiRateConfigResponseBody setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public GetMultiRateConfigResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetMultiRateConfigResponseBody setAvFormat(String avFormat) {
        this.avFormat = avFormat;
        return this;
    }
    public String getAvFormat() {
        return this.avFormat;
    }

    public GetMultiRateConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetMultiRateConfigResponseBody setTemplatesInfo(GetMultiRateConfigResponseBodyTemplatesInfo templatesInfo) {
        this.templatesInfo = templatesInfo;
        return this;
    }
    public GetMultiRateConfigResponseBodyTemplatesInfo getTemplatesInfo() {
        return this.templatesInfo;
    }

    public GetMultiRateConfigResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public static class GetMultiRateConfigResponseBodyTemplatesInfoDetail extends TeaModel {
        @NameInMap("AudioBitrate")
        public Integer audioBitrate;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Template")
        public String template;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("BandWidth")
        public Integer bandWidth;

        @NameInMap("Profile")
        public Integer profile;

        @NameInMap("AudioRate")
        public Integer audioRate;

        @NameInMap("AudioCodec")
        public String audioCodec;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("VideoBitrate")
        public Integer videoBitrate;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("AudioChannelNum")
        public Integer audioChannelNum;

        @NameInMap("Fps")
        public Integer fps;

        @NameInMap("AudioProfile")
        public String audioProfile;

        public static GetMultiRateConfigResponseBodyTemplatesInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMultiRateConfigResponseBodyTemplatesInfoDetail self = new GetMultiRateConfigResponseBodyTemplatesInfoDetail();
            return TeaModel.build(map, self);
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setAudioBitrate(Integer audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public Integer getAudioBitrate() {
            return this.audioBitrate;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setProfile(Integer profile) {
            this.profile = profile;
            return this;
        }
        public Integer getProfile() {
            return this.profile;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setAudioRate(Integer audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public Integer getAudioRate() {
            return this.audioRate;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setVideoBitrate(Integer videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setAudioChannelNum(Integer audioChannelNum) {
            this.audioChannelNum = audioChannelNum;
            return this;
        }
        public Integer getAudioChannelNum() {
            return this.audioChannelNum;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public GetMultiRateConfigResponseBodyTemplatesInfoDetail setAudioProfile(String audioProfile) {
            this.audioProfile = audioProfile;
            return this;
        }
        public String getAudioProfile() {
            return this.audioProfile;
        }

    }

    public static class GetMultiRateConfigResponseBodyTemplatesInfo extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<GetMultiRateConfigResponseBodyTemplatesInfoDetail> detail;

        public static GetMultiRateConfigResponseBodyTemplatesInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMultiRateConfigResponseBodyTemplatesInfo self = new GetMultiRateConfigResponseBodyTemplatesInfo();
            return TeaModel.build(map, self);
        }

        public GetMultiRateConfigResponseBodyTemplatesInfo setDetail(java.util.List<GetMultiRateConfigResponseBodyTemplatesInfoDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetMultiRateConfigResponseBodyTemplatesInfoDetail> getDetail() {
            return this.detail;
        }

    }

}
