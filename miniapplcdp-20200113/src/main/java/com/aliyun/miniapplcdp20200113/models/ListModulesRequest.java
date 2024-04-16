// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("HasOwnerApp")
    public Boolean hasOwnerApp;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Source")
    public String source;

    public static ListModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModulesRequest self = new ListModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListModulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListModulesRequest setHasOwnerApp(Boolean hasOwnerApp) {
        this.hasOwnerApp = hasOwnerApp;
        return this;
    }
    public Boolean getHasOwnerApp() {
        return this.hasOwnerApp;
    }

    public ListModulesRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListModulesRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListModulesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListModulesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
