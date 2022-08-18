// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextToSignVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public SubmitTextToSignVideoTaskRequestApp app;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Text")
    public String text;

    @NameInMap("Title")
    public String title;

    @NameInMap("VideoInfo")
    public SubmitTextToSignVideoTaskRequestVideoInfo videoInfo;

    public static SubmitTextToSignVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextToSignVideoTaskRequest self = new SubmitTextToSignVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextToSignVideoTaskRequest setApp(SubmitTextToSignVideoTaskRequestApp app) {
        this.app = app;
        return this;
    }
    public SubmitTextToSignVideoTaskRequestApp getApp() {
        return this.app;
    }

    public SubmitTextToSignVideoTaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitTextToSignVideoTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitTextToSignVideoTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextToSignVideoTaskRequest setVideoInfo(SubmitTextToSignVideoTaskRequestVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public SubmitTextToSignVideoTaskRequestVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static class SubmitTextToSignVideoTaskRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static SubmitTextToSignVideoTaskRequestApp build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextToSignVideoTaskRequestApp self = new SubmitTextToSignVideoTaskRequestApp();
            return TeaModel.build(map, self);
        }

        public SubmitTextToSignVideoTaskRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class SubmitTextToSignVideoTaskRequestVideoInfo extends TeaModel {
        @NameInMap("IsAlpha")
        public Boolean isAlpha;

        @NameInMap("IsSubtitles")
        public Boolean isSubtitles;

        @NameInMap("Resolution")
        public Integer resolution;

        public static SubmitTextToSignVideoTaskRequestVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextToSignVideoTaskRequestVideoInfo self = new SubmitTextToSignVideoTaskRequestVideoInfo();
            return TeaModel.build(map, self);
        }

        public SubmitTextToSignVideoTaskRequestVideoInfo setIsAlpha(Boolean isAlpha) {
            this.isAlpha = isAlpha;
            return this;
        }
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        public SubmitTextToSignVideoTaskRequestVideoInfo setIsSubtitles(Boolean isSubtitles) {
            this.isSubtitles = isSubtitles;
            return this;
        }
        public Boolean getIsSubtitles() {
            return this.isSubtitles;
        }

        public SubmitTextToSignVideoTaskRequestVideoInfo setResolution(Integer resolution) {
            this.resolution = resolution;
            return this;
        }
        public Integer getResolution() {
            return this.resolution;
        }

    }

}
