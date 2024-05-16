// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareRequest extends TeaModel {
    /**
     * <p>The name of the data source to be shared.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The environment to which the data source belongs. Valid values:</p>
     * <br>
     * <p>*   0: development environment</p>
     * <p>*   1: production environment</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The ID of the DataWorks workspace to which the data source belongs. You can call the [ListProjects](https://help.aliyun.com/document_detail/178393.html) operation to query the ID of the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The DataWorks workspace to which the data source is to be shared. If you set this parameter, all members of the specified DataWorks workspace can view and use the data source. The value must be a JSON array. Example: {"projectId":1000,"permission":"WRITE","sharedName":"PX_DATAHUB1.shared_name"}.</p>
     * <br>
     * <p>Field description:</p>
     * <br>
     * <p>*   projectId: the ID of the DataWorks workspace to which the data source is to be shared.</p>
     * <p>*   permission: the mode in which the data source is shared. Valid values: READ and WRITE. The value READ indicates that all members of the specified workspace can read data from the data source, but cannot modify the data. The value WRITE indicates that all members of the specified workspace can modify the data in the data source.</p>
     * <p>*   sharedName: the name of the data source to be shared.</p>
     */
    @NameInMap("ProjectPermissions")
    public String projectPermissions;

    /**
     * <p>The user to whom the data source is to be shared. If you set this parameter, the specified user can view or use the data source. The value must be a JSON array. Example: {"projectId":10000,"users":[{"userId":"276184575345452131","permission":"WRITE"},"sharedName":"PX_DATAHUB1.shared_name"}].</p>
     * <br>
     * <p>Field description:</p>
     * <br>
     * <p>*   projectId: the ID of the DataWorks workspace. If you set the UserPermissions parameter, the specified user can view or use the data source only in this specified DataWorks workspace.</p>
     * <p>*   userId: the ID of the user to whom the data source is to be shared.</p>
     * <p>*   permission: the mode in which the data source is shared. Valid values: READ and WRITE. The value READ indicates that the specified user can read data from the data source, but cannot modify the data. The value WRITE indicates that the specified user can modify the data in the data source.</p>
     * <p>*   sharedName: the name of the data source to be shared.</p>
     * <br>
     * <p>If the ProjectPermissions and UserPermissions parameters are both left empty, the specified data source is not shared to any DataWorks workspace or user. If neither of the parameters is left empty, both parameters take effect.</p>
     */
    @NameInMap("UserPermissions")
    public String userPermissions;

    public static SetDataSourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataSourceShareRequest self = new SetDataSourceShareRequest();
        return TeaModel.build(map, self);
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

    public SetDataSourceShareRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
