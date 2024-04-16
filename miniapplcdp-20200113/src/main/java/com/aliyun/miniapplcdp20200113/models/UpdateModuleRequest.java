// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateModuleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("Source")
    public String source;

    public static UpdateModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleRequest self = new UpdateModuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UpdateModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public UpdateModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
