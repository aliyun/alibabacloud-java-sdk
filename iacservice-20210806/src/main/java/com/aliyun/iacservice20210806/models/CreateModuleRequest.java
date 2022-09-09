// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("source")
    public String source;

    @NameInMap("sourcePath")
    public String sourcePath;

    @NameInMap("statePath")
    public String statePath;

    @NameInMap("versionStrategy")
    public String versionStrategy;

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

    public CreateModuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateModuleRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public CreateModuleRequest setStatePath(String statePath) {
        this.statePath = statePath;
        return this;
    }
    public String getStatePath() {
        return this.statePath;
    }

    public CreateModuleRequest setVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
        return this;
    }
    public String getVersionStrategy() {
        return this.versionStrategy;
    }

}
