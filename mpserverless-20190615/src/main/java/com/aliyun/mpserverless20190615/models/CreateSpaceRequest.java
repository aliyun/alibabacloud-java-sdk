// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSpaceRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceRequest self = new CreateSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpaceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateSpaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSpaceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
