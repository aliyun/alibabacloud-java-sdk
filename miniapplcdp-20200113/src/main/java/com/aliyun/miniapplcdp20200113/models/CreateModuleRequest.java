// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("MinimumPlatformVersion")
    public String minimumPlatformVersion;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("ModuleType")
    public String moduleType;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceModuleId")
    public String sourceModuleId;

    @NameInMap("TargetAppSource")
    public String targetAppSource;

    public static CreateModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleRequest self = new CreateModuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModuleRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateModuleRequest setMinimumPlatformVersion(String minimumPlatformVersion) {
        this.minimumPlatformVersion = minimumPlatformVersion;
        return this;
    }
    public String getMinimumPlatformVersion() {
        return this.minimumPlatformVersion;
    }

    public CreateModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateModuleRequest setModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public String getModuleType() {
        return this.moduleType;
    }

    public CreateModuleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateModuleRequest setSourceModuleId(String sourceModuleId) {
        this.sourceModuleId = sourceModuleId;
        return this;
    }
    public String getSourceModuleId() {
        return this.sourceModuleId;
    }

    public CreateModuleRequest setTargetAppSource(String targetAppSource) {
        this.targetAppSource = targetAppSource;
        return this;
    }
    public String getTargetAppSource() {
        return this.targetAppSource;
    }

}
