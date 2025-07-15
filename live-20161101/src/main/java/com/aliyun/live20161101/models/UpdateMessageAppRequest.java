// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageAppRequest extends TeaModel {
    /**
     * <p>The configurations of the application.</p>
     */
    @NameInMap("AppConfig")
    public java.util.Map<String, String> appConfig;

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
    public java.util.Map<String, String> extension;

    public static UpdateMessageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageAppRequest self = new UpdateMessageAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageAppRequest setAppConfig(java.util.Map<String, String> appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public java.util.Map<String, String> getAppConfig() {
        return this.appConfig;
    }

    public UpdateMessageAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMessageAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMessageAppRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

}
