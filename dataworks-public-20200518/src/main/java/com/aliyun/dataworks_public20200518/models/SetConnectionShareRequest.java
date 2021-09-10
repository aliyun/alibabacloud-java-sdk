// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetConnectionShareRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("DatasourceName")
    public String datasourceName;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("ProjectPermissions")
    public String projectPermissions;

    @NameInMap("UserPermissions")
    public String userPermissions;

    public static SetConnectionShareRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConnectionShareRequest self = new SetConnectionShareRequest();
        return TeaModel.build(map, self);
    }

    public SetConnectionShareRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SetConnectionShareRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public SetConnectionShareRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SetConnectionShareRequest setProjectPermissions(String projectPermissions) {
        this.projectPermissions = projectPermissions;
        return this;
    }
    public String getProjectPermissions() {
        return this.projectPermissions;
    }

    public SetConnectionShareRequest setUserPermissions(String userPermissions) {
        this.userPermissions = userPermissions;
        return this;
    }
    public String getUserPermissions() {
        return this.userPermissions;
    }

}
