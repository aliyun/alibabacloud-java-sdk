// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo3DAvatarVideoTaskShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Text")
    public String text;

    @NameInMap("Title")
    public String title;

    @NameInMap("VideoInfo")
    public String videoInfoShrink;

    public static SubmitTextTo3DAvatarVideoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo3DAvatarVideoTaskShrinkRequest self = new SubmitTextTo3DAvatarVideoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo3DAvatarVideoTaskShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public SubmitTextTo3DAvatarVideoTaskShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitTextTo3DAvatarVideoTaskShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitTextTo3DAvatarVideoTaskShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextTo3DAvatarVideoTaskShrinkRequest setVideoInfoShrink(String videoInfoShrink) {
        this.videoInfoShrink = videoInfoShrink;
        return this;
    }
    public String getVideoInfoShrink() {
        return this.videoInfoShrink;
    }

}
