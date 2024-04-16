// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModulePublishRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("PublishVersion")
    public String publishVersion;

    @NameInMap("Source")
    public String source;

    public static CreateModulePublishRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModulePublishRequest self = new CreateModulePublishRequest();
        return TeaModel.build(map, self);
    }

    public CreateModulePublishRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModulePublishRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModulePublishRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateModulePublishRequest setPublishVersion(String publishVersion) {
        this.publishVersion = publishVersion;
        return this;
    }
    public String getPublishVersion() {
        return this.publishVersion;
    }

    public CreateModulePublishRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
