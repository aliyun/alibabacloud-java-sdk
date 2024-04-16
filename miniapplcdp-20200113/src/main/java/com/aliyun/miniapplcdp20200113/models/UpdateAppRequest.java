// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("Source")
    public String source;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public UpdateAppRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
