// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareRequest extends TeaModel {
    /**
     * <p>The name of the data source that you want to share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_name</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The environment in which the data source is used. Valid values:</p>
     * <ul>
     * <li>0: development environment</li>
     * <li>1: production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The ID of the DataWorks workspace to which the data source belongs. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The DataWorks workspace to which you want to share the data source. If you configure this parameter, all members of the specified DataWorks workspace can view and use the data source. The value of this parameter is a JSON array. Example: [{&quot;projectId&quot;:1000,&quot;permission&quot;:&quot;WRITE&quot;,&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}], Parameter description:</p>
     * <ul>
     * <li>projectId: the ID of the DataWorks workspace to which you want to share the data source.</li>
     * <li>permission: the mode in which the data source is shared. Valid values: READ and WRITE. The value READ indicates that all members of the specified workspace can read data from the data source, but cannot modify the data. The value WRITE indicates that all members of the specified workspace can modify the data in the data source.</li>
     * <li>sharedName: the name of the data source that you want to share.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;projectId&quot;:1000,&quot;permission&quot;:&quot;WRITE&quot;,&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}]</p>
     */
    @NameInMap("ProjectPermissions")
    public String projectPermissions;

    /**
     * <p>The user to whom you want to share the data source. If you configure this parameter, the specified user can view or use the data source. The value of this parameter is a JSON array. Example: [{&quot;projectId&quot;:10000,&quot;users&quot;:[{&quot;userId&quot;:&quot;276184575345452131&quot;,&quot;permission&quot;:&quot;WRITE&quot;}],&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}], Parameter description:</p>
     * <ul>
     * <li>projectId: the ID of the DataWorks workspace. If you configure the UserPermissions parameter, the specified user can view or use the data source only in the specified DataWorks workspace.</li>
     * <li>userId: the ID of the user to whom you want to share the data source.</li>
     * <li>permission: the mode in which the data source is shared. Valid values: READ and WRITE. The value READ indicates that the specified user can read data from the data source, but cannot modify the data. The value WRITE indicates that the specified user can modify the data in the data source.</li>
     * <li>sharedName: the name of the data source that you want to share.</li>
     * </ul>
     * <p>If the ProjectPermissions and UserPermissions parameters are both left empty, the specified data source is not shared to any DataWorks workspace or user. If neither of the parameters is left empty, both parameters take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;projectId&quot;:10000,&quot;users&quot;:[{&quot;userId&quot;:&quot;276184575345452131&quot;,&quot;permission&quot;:&quot;WRITE&quot;}],&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}]</p>
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
