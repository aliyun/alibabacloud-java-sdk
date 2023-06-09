// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAudioTo3DAvatarVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public SubmitAudioTo3DAvatarVideoTaskRequestApp app;

    @NameInMap("AvatarInfo")
    public SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo avatarInfo;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Url")
    public String url;

    @NameInMap("VideoInfo")
    public SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo videoInfo;

    public static SubmitAudioTo3DAvatarVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioTo3DAvatarVideoTaskRequest self = new SubmitAudioTo3DAvatarVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAudioTo3DAvatarVideoTaskRequest setApp(SubmitAudioTo3DAvatarVideoTaskRequestApp app) {
        this.app = app;
        return this;
    }
    public SubmitAudioTo3DAvatarVideoTaskRequestApp getApp() {
        return this.app;
    }

    public SubmitAudioTo3DAvatarVideoTaskRequest setAvatarInfo(SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo avatarInfo) {
        this.avatarInfo = avatarInfo;
        return this;
    }
    public SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo getAvatarInfo() {
        return this.avatarInfo;
    }

    public SubmitAudioTo3DAvatarVideoTaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitAudioTo3DAvatarVideoTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAudioTo3DAvatarVideoTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitAudioTo3DAvatarVideoTaskRequest setVideoInfo(SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static class SubmitAudioTo3DAvatarVideoTaskRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static SubmitAudioTo3DAvatarVideoTaskRequestApp build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo3DAvatarVideoTaskRequestApp self = new SubmitAudioTo3DAvatarVideoTaskRequestApp();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo extends TeaModel {
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("Code")
        public String code;

        @NameInMap("Locate")
        public Integer locate;

        public static SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo self = new SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestAvatarInfo setLocate(Integer locate) {
            this.locate = locate;
            return this;
        }
        public Integer getLocate() {
            return this.locate;
        }

    }

    public static class SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo extends TeaModel {
        @NameInMap("AlphaFormat")
        public Integer alphaFormat;

        @NameInMap("BackgroundImageUrl")
        public String backgroundImageUrl;

        @NameInMap("IsAlpha")
        public Boolean isAlpha;

        @NameInMap("Resolution")
        public Integer resolution;

        public static SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo self = new SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo setAlphaFormat(Integer alphaFormat) {
            this.alphaFormat = alphaFormat;
            return this;
        }
        public Integer getAlphaFormat() {
            return this.alphaFormat;
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo setIsAlpha(Boolean isAlpha) {
            this.isAlpha = isAlpha;
            return this;
        }
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        public SubmitAudioTo3DAvatarVideoTaskRequestVideoInfo setResolution(Integer resolution) {
            this.resolution = resolution;
            return this;
        }
        public Integer getResolution() {
            return this.resolution;
        }

    }

}
