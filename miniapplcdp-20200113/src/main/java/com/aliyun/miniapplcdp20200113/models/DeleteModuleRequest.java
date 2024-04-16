// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteModuleRequest extends TeaModel {
    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Source")
    public String source;

    public static DeleteModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModuleRequest self = new DeleteModuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public DeleteModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
