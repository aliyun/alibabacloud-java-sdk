// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateResourceContentRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Content")
    public String content;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Source")
    public String source;

    public static UpdateResourceContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceContentRequest self = new UpdateResourceContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceContentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateResourceContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateResourceContentRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UpdateResourceContentRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateResourceContentRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
