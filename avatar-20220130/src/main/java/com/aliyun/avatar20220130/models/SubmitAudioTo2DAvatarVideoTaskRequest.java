// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAudioTo2DAvatarVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public SubmitAudioTo2DAvatarVideoTaskRequestApp app;

    @NameInMap("AvatarInfo")
    public SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo avatarInfo;

    @NameInMap("Callback")
    public Boolean callback;

    @NameInMap("CallbackParams")
    public String callbackParams;

    @NameInMap("ExtParams")
    public String extParams;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Url")
    public String url;

    @NameInMap("VideoInfo")
    public SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo videoInfo;

    public static SubmitAudioTo2DAvatarVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioTo2DAvatarVideoTaskRequest self = new SubmitAudioTo2DAvatarVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setApp(SubmitAudioTo2DAvatarVideoTaskRequestApp app) {
        this.app = app;
        return this;
    }
    public SubmitAudioTo2DAvatarVideoTaskRequestApp getApp() {
        return this.app;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setAvatarInfo(SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo avatarInfo) {
        this.avatarInfo = avatarInfo;
        return this;
    }
    public SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo getAvatarInfo() {
        return this.avatarInfo;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setCallback(Boolean callback) {
        this.callback = callback;
        return this;
    }
    public Boolean getCallback() {
        return this.callback;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitAudioTo2DAvatarVideoTaskRequest setVideoInfo(SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static class SubmitAudioTo2DAvatarVideoTaskRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static SubmitAudioTo2DAvatarVideoTaskRequestApp build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo2DAvatarVideoTaskRequestApp self = new SubmitAudioTo2DAvatarVideoTaskRequestApp();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo2DAvatarVideoTaskRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo extends TeaModel {
        @NameInMap("Code")
        public String code;

        public static SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo self = new SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo2DAvatarVideoTaskRequestAvatarInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo extends TeaModel {
        @NameInMap("AlphaFormat")
        public Integer alphaFormat;

        @NameInMap("BackgroundImageUrl")
        public String backgroundImageUrl;

        @NameInMap("IsAlpha")
        public Boolean isAlpha;

        @NameInMap("Resolution")
        public Integer resolution;

        public static SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo self = new SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo setAlphaFormat(Integer alphaFormat) {
            this.alphaFormat = alphaFormat;
            return this;
        }
        public Integer getAlphaFormat() {
            return this.alphaFormat;
        }

        public SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo setIsAlpha(Boolean isAlpha) {
            this.isAlpha = isAlpha;
            return this;
        }
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        public SubmitAudioTo2DAvatarVideoTaskRequestVideoInfo setResolution(Integer resolution) {
            this.resolution = resolution;
            return this;
        }
        public Integer getResolution() {
            return this.resolution;
        }

    }

}
