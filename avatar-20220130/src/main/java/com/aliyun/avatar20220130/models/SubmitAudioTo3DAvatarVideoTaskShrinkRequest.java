// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAudioTo3DAvatarVideoTaskShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("AvatarInfo")
    public String avatarInfoShrink;

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
    public String videoInfoShrink;

    public static SubmitAudioTo3DAvatarVideoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioTo3DAvatarVideoTaskShrinkRequest self = new SubmitAudioTo3DAvatarVideoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setAvatarInfoShrink(String avatarInfoShrink) {
        this.avatarInfoShrink = avatarInfoShrink;
        return this;
    }
    public String getAvatarInfoShrink() {
        return this.avatarInfoShrink;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setCallback(Boolean callback) {
        this.callback = callback;
        return this;
    }
    public Boolean getCallback() {
        return this.callback;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitAudioTo3DAvatarVideoTaskShrinkRequest setVideoInfoShrink(String videoInfoShrink) {
        this.videoInfoShrink = videoInfoShrink;
        return this;
    }
    public String getVideoInfoShrink() {
        return this.videoInfoShrink;
    }

}
