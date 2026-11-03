// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectMemberRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace used to invoke this API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>88757</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the DataWorks account. You can log on to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks console - Administration</a>, select the workspace that you want to manage, go to the Administration page, and then go to the Tenant Members and Roles page to view the account ID.</p>
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
