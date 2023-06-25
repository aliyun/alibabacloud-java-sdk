// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo2DAvatarVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public SubmitTextTo2DAvatarVideoTaskRequestApp app;

    @NameInMap("AudioInfo")
    public SubmitTextTo2DAvatarVideoTaskRequestAudioInfo audioInfo;

    @NameInMap("AvatarInfo")
    public SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo avatarInfo;

    @NameInMap("Callback")
    public Boolean callback;

    @NameInMap("CallbackParams")
    public String callbackParams;

    @NameInMap("ExtParams")
    public String extParams;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Text")
    public String text;

    @NameInMap("Title")
    public String title;

    @NameInMap("VideoInfo")
    public SubmitTextTo2DAvatarVideoTaskRequestVideoInfo videoInfo;

    public static SubmitTextTo2DAvatarVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo2DAvatarVideoTaskRequest self = new SubmitTextTo2DAvatarVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setApp(SubmitTextTo2DAvatarVideoTaskRequestApp app) {
        this.app = app;
        return this;
    }
    public SubmitTextTo2DAvatarVideoTaskRequestApp getApp() {
        return this.app;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setAudioInfo(SubmitTextTo2DAvatarVideoTaskRequestAudioInfo audioInfo) {
        this.audioInfo = audioInfo;
        return this;
    }
    public SubmitTextTo2DAvatarVideoTaskRequestAudioInfo getAudioInfo() {
        return this.audioInfo;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setAvatarInfo(SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo avatarInfo) {
        this.avatarInfo = avatarInfo;
        return this;
    }
    public SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo getAvatarInfo() {
        return this.avatarInfo;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setCallback(Boolean callback) {
        this.callback = callback;
        return this;
    }
    public Boolean getCallback() {
        return this.callback;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextTo2DAvatarVideoTaskRequest setVideoInfo(SubmitTextTo2DAvatarVideoTaskRequestVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public SubmitTextTo2DAvatarVideoTaskRequestVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static class SubmitTextTo2DAvatarVideoTaskRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static SubmitTextTo2DAvatarVideoTaskRequestApp build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo2DAvatarVideoTaskRequestApp self = new SubmitTextTo2DAvatarVideoTaskRequestApp();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo2DAvatarVideoTaskRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class SubmitTextTo2DAvatarVideoTaskRequestAudioInfo extends TeaModel {
        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Voice")
        public String voice;

        @NameInMap("Volume")
        public Integer volume;

        public static SubmitTextTo2DAvatarVideoTaskRequestAudioInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo2DAvatarVideoTaskRequestAudioInfo self = new SubmitTextTo2DAvatarVideoTaskRequestAudioInfo();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo2DAvatarVideoTaskRequestAudioInfo setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public SubmitTextTo2DAvatarVideoTaskRequestAudioInfo setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public SubmitTextTo2DAvatarVideoTaskRequestAudioInfo setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public SubmitTextTo2DAvatarVideoTaskRequestAudioInfo setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo self = new SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo2DAvatarVideoTaskRequestAvatarInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class SubmitTextTo2DAvatarVideoTaskRequestVideoInfo extends TeaModel {
        @NameInMap("AlphaFormat")
        public Integer alphaFormat;

        @NameInMap("BackgroundImageUrl")
        public String backgroundImageUrl;

        @NameInMap("IsAlpha")
        public Boolean isAlpha;

        @NameInMap("IsSubtitles")
        public Boolean isSubtitles;

        @NameInMap("Resolution")
        public Integer resolution;

        public static SubmitTextTo2DAvatarVideoTaskRequestVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo2DAvatarVideoTaskRequestVideoInfo self = new SubmitTextTo2DAvatarVideoTaskRequestVideoInfo();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo2DAvatarVideoTaskRequestVideoInfo setAlphaFormat(Integer alphaFormat) {
            this.alphaFormat = alphaFormat;
            return this;
        }
        public Integer getAlphaFormat() {
            return this.alphaFormat;
        }

        public SubmitTextTo2DAvatarVideoTaskRequestVideoInfo setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public SubmitTextTo2DAvatarVideoTaskRequestVideoInfo setIsAlpha(Boolean isAlpha) {
            this.isAlpha = isAlpha;
            return this;
        }
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        public SubmitTextTo2DAvatarVideoTaskRequestVideoInfo setIsSubtitles(Boolean isSubtitles) {
            this.isSubtitles = isSubtitles;
            return this;
        }
        public Boolean getIsSubtitles() {
            return this.isSubtitles;
        }

        public SubmitTextTo2DAvatarVideoTaskRequestVideoInfo setResolution(Integer resolution) {
            this.resolution = resolution;
            return this;
        }
        public Integer getResolution() {
            return this.resolution;
        }

    }

}
