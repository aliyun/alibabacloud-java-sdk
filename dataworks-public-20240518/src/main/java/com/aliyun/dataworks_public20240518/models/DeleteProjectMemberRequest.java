// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteProjectMemberRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>534752</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the DataWorks account. You can log on to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks console - Management Center</a>, select the workspace from which you want to remove the member, go to the <strong>Tenant Members and Roles</strong> page, and view the account ID of the member to be removed from the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectMemberRequest self = new DeleteProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectMemberRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteProjectMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
