// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleAttributeRequest extends TeaModel {
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

    public static UpdateModuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleAttributeRequest self = new UpdateModuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModuleAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModuleAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModuleAttributeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateModuleAttributeRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public UpdateModuleAttributeRequest setStatePath(String statePath) {
        this.statePath = statePath;
        return this;
    }
    public String getStatePath() {
        return this.statePath;
    }

    public UpdateModuleAttributeRequest setVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
        return this;
    }
    public String getVersionStrategy() {
        return this.versionStrategy;
    }

}
