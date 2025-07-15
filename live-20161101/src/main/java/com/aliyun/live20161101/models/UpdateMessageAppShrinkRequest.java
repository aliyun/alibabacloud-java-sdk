// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageAppShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of the application.</p>
     */
    @NameInMap("AppConfig")
    public String appConfigShrink;

    /**
     * <p>The ID of the interactive messaging application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the interactive messaging application.</p>
     * 
     * <strong>example:</strong>
     * <p>testApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The extended field.</p>
     */
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
