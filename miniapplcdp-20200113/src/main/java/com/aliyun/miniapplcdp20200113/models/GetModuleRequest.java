// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModuleRequest extends TeaModel {
    @NameInMap("ModuleId")
    public String moduleId;

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

}
