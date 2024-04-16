// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModuleRequest extends TeaModel {
    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ModuleType")
    public String moduleType;

    @NameInMap("Source")
    public String source;

    public static GetModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModuleRequest self = new GetModuleRequest();
        return TeaModel.build(map, self);
    }

    public GetModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public GetModuleRequest setModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public String getModuleType() {
        return this.moduleType;
    }

    public GetModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
