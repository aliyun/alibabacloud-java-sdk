// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo3DAvatarVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public SubmitTextTo3DAvatarVideoTaskRequestApp app;

    @NameInMap("AvatarInfo")
    public SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo avatarInfo;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Text")
    public String text;

    @NameInMap("Title")
    public String title;

    @NameInMap("VideoInfo")
    public SubmitTextTo3DAvatarVideoTaskRequestVideoInfo videoInfo;

    public static SubmitTextTo3DAvatarVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo3DAvatarVideoTaskRequest self = new SubmitTextTo3DAvatarVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo3DAvatarVideoTaskRequest setApp(SubmitTextTo3DAvatarVideoTaskRequestApp app) {
        this.app = app;
        return this;
    }
    public SubmitTextTo3DAvatarVideoTaskRequestApp getApp() {
        return this.app;
    }

    public SubmitTextTo3DAvatarVideoTaskRequest setAvatarInfo(SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo avatarInfo) {
        this.avatarInfo = avatarInfo;
        return this;
    }
    public SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo getAvatarInfo() {
        return this.avatarInfo;
    }

    public SubmitTextTo3DAvatarVideoTaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitTextTo3DAvatarVideoTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitTextTo3DAvatarVideoTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextTo3DAvatarVideoTaskRequest setVideoInfo(SubmitTextTo3DAvatarVideoTaskRequestVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public SubmitTextTo3DAvatarVideoTaskRequestVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static class SubmitTextTo3DAvatarVideoTaskRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static SubmitTextTo3DAvatarVideoTaskRequestApp build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo3DAvatarVideoTaskRequestApp self = new SubmitTextTo3DAvatarVideoTaskRequestApp();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo3DAvatarVideoTaskRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo extends TeaModel {
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("Locate")
        public Integer locate;

        public static SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo self = new SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public SubmitTextTo3DAvatarVideoTaskRequestAvatarInfo setLocate(Integer locate) {
            this.locate = locate;
            return this;
        }
        public Integer getLocate() {
            return this.locate;
        }

    }

    public static class SubmitTextTo3DAvatarVideoTaskRequestVideoInfo extends TeaModel {
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

        public static SubmitTextTo3DAvatarVideoTaskRequestVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo3DAvatarVideoTaskRequestVideoInfo self = new SubmitTextTo3DAvatarVideoTaskRequestVideoInfo();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo3DAvatarVideoTaskRequestVideoInfo setAlphaFormat(Integer alphaFormat) {
            this.alphaFormat = alphaFormat;
            return this;
        }
        public Integer getAlphaFormat() {
            return this.alphaFormat;
        }

        public SubmitTextTo3DAvatarVideoTaskRequestVideoInfo setBackgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = backgroundImageUrl;
            return this;
        }
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public SubmitTextTo3DAvatarVideoTaskRequestVideoInfo setIsAlpha(Boolean isAlpha) {
            this.isAlpha = isAlpha;
            return this;
        }
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        public SubmitTextTo3DAvatarVideoTaskRequestVideoInfo setIsSubtitles(Boolean isSubtitles) {
            this.isSubtitles = isSubtitles;
            return this;
        }
        public Boolean getIsSubtitles() {
            return this.isSubtitles;
        }

        public SubmitTextTo3DAvatarVideoTaskRequestVideoInfo setResolution(Integer resolution) {
            this.resolution = resolution;
            return this;
        }
        public Integer getResolution() {
            return this.resolution;
        }

    }

}
