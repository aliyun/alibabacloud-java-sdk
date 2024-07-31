// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupGetOdpsRoleGroupsRequest extends TeaModel {
    /**
     * <p>The name of the MaxCompute project. You can call the <a href="https://help.aliyun.com/document_detail/2786303.html">DsgPlatformQueryProjectsAndSchemaFromMeta</a> operation to query a list of MaxCompute projects.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static DsgUserGroupGetOdpsRoleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupGetOdpsRoleGroupsRequest self = new DsgUserGroupGetOdpsRoleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupGetOdpsRoleGroupsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
