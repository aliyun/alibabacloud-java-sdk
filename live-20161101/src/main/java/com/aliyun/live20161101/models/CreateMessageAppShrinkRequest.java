// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageAppShrinkRequest extends TeaModel {
    @NameInMap("AppConfig")
    public String appConfigShrink;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Extension")
    public String extensionShrink;

    public static CreateMessageAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageAppShrinkRequest self = new CreateMessageAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageAppShrinkRequest setAppConfigShrink(String appConfigShrink) {
        this.appConfigShrink = appConfigShrink;
        return this;
    }
    public String getAppConfigShrink() {
        return this.appConfigShrink;
    }

    public CreateMessageAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateMessageAppShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

}
