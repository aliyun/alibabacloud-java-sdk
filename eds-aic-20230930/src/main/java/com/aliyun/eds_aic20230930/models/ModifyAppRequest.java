// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAppRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("AppId")
    public Integer appId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultAppName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>default description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The URL of the icon.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://defaultIcon.png">https://defaultIcon.png</a></p>
     */
    @NameInMap("IconUrl")
    public String iconUrl;

    public static ModifyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRequest self = new ModifyAppRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public ModifyAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAppRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

}
