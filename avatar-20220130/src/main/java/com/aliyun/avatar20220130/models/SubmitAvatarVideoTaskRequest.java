// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoTaskRequest extends TeaModel {
    @NameInMap("App")
    public SubmitAvatarVideoTaskRequestApp app;

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

    @NameInMap("VideoParams")
    public String videoParams;

    public static SubmitAvatarVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoTaskRequest self = new SubmitAvatarVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoTaskRequest setApp(SubmitAvatarVideoTaskRequestApp app) {
        this.app = app;
        return this;
    }
    public SubmitAvatarVideoTaskRequestApp getApp() {
        return this.app;
    }

    public SubmitAvatarVideoTaskRequest setCallback(Boolean callback) {
        this.callback = callback;
        return this;
    }
    public Boolean getCallback() {
        return this.callback;
    }

    public SubmitAvatarVideoTaskRequest setCallbackParams(String callbackParams) {
        this.callbackParams = callbackParams;
        return this;
    }
    public String getCallbackParams() {
        return this.callbackParams;
    }

    public SubmitAvatarVideoTaskRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public SubmitAvatarVideoTaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SubmitAvatarVideoTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAvatarVideoTaskRequest setVideoParams(String videoParams) {
        this.videoParams = videoParams;
        return this;
    }
    public String getVideoParams() {
        return this.videoParams;
    }

    public static class SubmitAvatarVideoTaskRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static SubmitAvatarVideoTaskRequestApp build(java.util.Map<String, ?> map) throws Exception {
            SubmitAvatarVideoTaskRequestApp self = new SubmitAvatarVideoTaskRequestApp();
            return TeaModel.build(map, self);
        }

        public SubmitAvatarVideoTaskRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
