// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleDependenciesRequest extends TeaModel {
    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Recursive")
    public Boolean recursive;

    @NameInMap("Source")
    public String source;

    public static ListModuleDependenciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModuleDependenciesRequest self = new ListModuleDependenciesRequest();
        return TeaModel.build(map, self);
    }

    public ListModuleDependenciesRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListModuleDependenciesRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public ListModuleDependenciesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
