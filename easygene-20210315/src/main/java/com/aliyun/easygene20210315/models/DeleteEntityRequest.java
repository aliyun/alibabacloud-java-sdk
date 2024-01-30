// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteEntityRequest extends TeaModel {
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityRequest self = new DeleteEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DeleteEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
