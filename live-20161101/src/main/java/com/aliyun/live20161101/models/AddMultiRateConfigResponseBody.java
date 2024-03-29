// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddMultiRateConfigResponseBody extends TeaModel {
    @NameInMap("Body")
    public AddMultiRateConfigResponseBodyBody body;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddMultiRateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMultiRateConfigResponseBody self = new AddMultiRateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMultiRateConfigResponseBody setBody(AddMultiRateConfigResponseBodyBody body) {
        this.body = body;
        return this;
    }
    public AddMultiRateConfigResponseBodyBody getBody() {
        return this.body;
    }

    public AddMultiRateConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddMultiRateConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddMultiRateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddMultiRateConfigResponseBodyBodyFailedTemplates extends TeaModel {
        @NameInMap("AudioBitrate")
        public Integer audioBitrate;

        @NameInMap("AudioChannelNum")
        public Integer audioChannelNum;

        @NameInMap("AudioCodec")
        public String audioCodec;

        @NameInMap("AudioProfile")
        public String audioProfile;

        @NameInMap("AudioRate")
        public Integer audioRate;

        @NameInMap("BandWidth")
        public Integer bandWidth;

        @NameInMap("Fps")
        public Integer fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Profile")
        public Integer profile;

        @NameInMap("Template")
        public String template;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("VideoBitrate")
        public Integer videoBitrate;

        @NameInMap("Width")
        public Integer width;

        public static AddMultiRateConfigResponseBodyBodyFailedTemplates build(java.util.Map<String, ?> map) throws Exception {
            AddMultiRateConfigResponseBodyBodyFailedTemplates self = new AddMultiRateConfigResponseBodyBodyFailedTemplates();
            return TeaModel.build(map, self);
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setAudioBitrate(Integer audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public Integer getAudioBitrate() {
            return this.audioBitrate;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setAudioChannelNum(Integer audioChannelNum) {
            this.audioChannelNum = audioChannelNum;
            return this;
        }
        public Integer getAudioChannelNum() {
            return this.audioChannelNum;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setAudioProfile(String audioProfile) {
            this.audioProfile = audioProfile;
            return this;
        }
        public String getAudioProfile() {
            return this.audioProfile;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setAudioRate(Integer audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public Integer getAudioRate() {
            return this.audioRate;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setProfile(Integer profile) {
            this.profile = profile;
            return this;
        }
        public Integer getProfile() {
            return this.profile;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setVideoBitrate(Integer videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        public AddMultiRateConfigResponseBodyBodyFailedTemplates setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class AddMultiRateConfigResponseBodyBody extends TeaModel {
        @NameInMap("FailedTemplates")
        public java.util.List<AddMultiRateConfigResponseBodyBodyFailedTemplates> failedTemplates;

        public static AddMultiRateConfigResponseBodyBody build(java.util.Map<String, ?> map) throws Exception {
            AddMultiRateConfigResponseBodyBody self = new AddMultiRateConfigResponseBodyBody();
            return TeaModel.build(map, self);
        }

        public AddMultiRateConfigResponseBodyBody setFailedTemplates(java.util.List<AddMultiRateConfigResponseBodyBodyFailedTemplates> failedTemplates) {
            this.failedTemplates = failedTemplates;
            return this;
        }
        public java.util.List<AddMultiRateConfigResponseBodyBodyFailedTemplates> getFailedTemplates() {
            return this.failedTemplates;
        }

    }

}
