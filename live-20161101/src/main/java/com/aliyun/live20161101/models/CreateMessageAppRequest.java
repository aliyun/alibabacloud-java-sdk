// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageAppRequest extends TeaModel {
    /**
     * <p>The configurations of the application.</p>
     */
    @NameInMap("AppConfig")
    public java.util.Map<String, String> appConfig;

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
    public java.util.Map<String, String> extension;

    public static CreateMessageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageAppRequest self = new CreateMessageAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageAppRequest setAppConfig(java.util.Map<String, String> appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public java.util.Map<String, String> getAppConfig() {
        return this.appConfig;
    }

    public CreateMessageAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateMessageAppRequest setExtension(java.util.Map<String, String> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

}
