// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo3DAvatarVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public SubmitTextTo3DAvatarVideoTaskRequestApp app;

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

    public static class SubmitTextTo3DAvatarVideoTaskRequestVideoInfo extends TeaModel {
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
