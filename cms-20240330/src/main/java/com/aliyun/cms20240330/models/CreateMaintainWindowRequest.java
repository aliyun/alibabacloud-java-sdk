// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMaintainWindowRequest extends TeaModel {
    @NameInMap("body")
    public MaintainWindowForModify body;

    @NameInMap("workspace")
    public String workspace;

    public static CreateMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaintainWindowRequest self = new CreateMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaintainWindowRequest setBody(MaintainWindowForModify body) {
        this.body = body;
        return this;
    }
    public MaintainWindowForModify getBody() {
        return this.body;
    }

    public CreateMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
