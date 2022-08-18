// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextToSignVideoTaskShrinkRequest extends TeaModel {
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

    public static SubmitTextToSignVideoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextToSignVideoTaskShrinkRequest self = new SubmitTextToSignVideoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextToSignVideoTaskShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public SubmitTextToSignVideoTaskShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitTextToSignVideoTaskShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitTextToSignVideoTaskShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextToSignVideoTaskShrinkRequest setVideoInfoShrink(String videoInfoShrink) {
        this.videoInfoShrink = videoInfoShrink;
        return this;
    }
    public String getVideoInfoShrink() {
        return this.videoInfoShrink;
    }

}
