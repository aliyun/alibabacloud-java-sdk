// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageAppShrinkRequest extends TeaModel {
    @NameInMap("AppConfig")
    public String appConfigShrink;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Extension")
    public String extensionShrink;

    public static UpdateMessageAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageAppShrinkRequest self = new UpdateMessageAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageAppShrinkRequest setAppConfigShrink(String appConfigShrink) {
        this.appConfigShrink = appConfigShrink;
        return this;
    }
    public String getAppConfigShrink() {
        return this.appConfigShrink;
    }

    public UpdateMessageAppShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMessageAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMessageAppShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

}
