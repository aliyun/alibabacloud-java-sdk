// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("TargetAppSource")
    public String targetAppSource;

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

    public ListModulesRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListModulesRequest setTargetAppSource(String targetAppSource) {
        this.targetAppSource = targetAppSource;
        return this;
    }
    public String getTargetAppSource() {
        return this.targetAppSource;
    }

}
