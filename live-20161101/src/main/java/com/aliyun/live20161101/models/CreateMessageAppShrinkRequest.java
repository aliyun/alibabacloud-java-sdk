// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageAppShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of the application.</p>
     */
    @NameInMap("AppConfig")
    public String appConfigShrink;

    /**
     * <p>The name of the interactive message application. The name must be 2 to 16 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The extended fields.</p>
     */
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
