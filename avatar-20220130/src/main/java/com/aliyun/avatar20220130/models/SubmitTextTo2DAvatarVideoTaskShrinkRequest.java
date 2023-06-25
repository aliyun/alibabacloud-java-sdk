// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo2DAvatarVideoTaskShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("AudioInfo")
    public String audioInfoShrink;

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

    @NameInMap("Text")
    public String text;

    @NameInMap("Title")
    public String title;

    @NameInMap("VideoInfo")
    public String videoInfoShrink;

    public static SubmitTextTo2DAvatarVideoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo2DAvatarVideoTaskShrinkRequest self = new SubmitTextTo2DAvatarVideoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setAudioInfoShrink(String audioInfoShrink) {
        this.audioInfoShrink = audioInfoShrink;
        return this;
    }
    public String getAudioInfoShrink() {
        return this.audioInfoShrink;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setAvatarInfoShrink(String avatarInfoShrink) {
        this.avatarInfoShrink = avatarInfoShrink;
        return this;
    }
    public String getAvatarInfoShrink() {
        return this.avatarInfoShrink;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setCallback(Boolean callback) {
        this.callback = callback;
        return this;
    }
    public Boolean getCallback() {
        return this.callback;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextTo2DAvatarVideoTaskShrinkRequest setVideoInfoShrink(String videoInfoShrink) {
        this.videoInfoShrink = videoInfoShrink;
        return this;
    }
    public String getVideoInfoShrink() {
        return this.videoInfoShrink;
    }

}
