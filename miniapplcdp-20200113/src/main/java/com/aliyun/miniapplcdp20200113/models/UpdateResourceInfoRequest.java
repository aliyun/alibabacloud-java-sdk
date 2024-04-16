// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateResourceInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("Source")
    public String source;

    public static UpdateResourceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInfoRequest self = new UpdateResourceInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateResourceInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateResourceInfoRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UpdateResourceInfoRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateResourceInfoRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public UpdateResourceInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
