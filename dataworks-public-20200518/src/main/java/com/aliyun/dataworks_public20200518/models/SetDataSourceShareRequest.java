// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("DatasourceName")
    @Validation(required = true)
    public String datasourceName;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("ProjectPermissions")
    public String projectPermissions;

    @NameInMap("UserPermissions")
    public String userPermissions;

    public static SetDataSourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataSourceShareRequest self = new SetDataSourceShareRequest();
        return TeaModel.build(map, self);
    }

    public SetDataSourceShareRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SetDataSourceShareRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public SetDataSourceShareRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SetDataSourceShareRequest setProjectPermissions(String projectPermissions) {
        this.projectPermissions = projectPermissions;
        return this;
    }
    public String getProjectPermissions() {
        return this.projectPermissions;
    }

    public SetDataSourceShareRequest setUserPermissions(String userPermissions) {
        this.userPermissions = userPermissions;
        return this;
    }
    public String getUserPermissions() {
        return this.userPermissions;
    }

}
