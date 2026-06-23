// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectMemberRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks Workspace. You can sign in to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks Console</a> and go to the Workspace Management page to obtain the Workspace ID.</p>
     * <p>This parameter is used to identify the DataWorks workspace that you want to access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>88757</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the user. To find the ID, sign in to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks Console</a>, go to the Management Center, select the target Workspace, and open the Tenant Members and Roles page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMemberRequest self = new GetProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectMemberRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetProjectMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
