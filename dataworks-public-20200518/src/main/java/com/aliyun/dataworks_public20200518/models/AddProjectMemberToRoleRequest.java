// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleRequest extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of your Alibaba Cloud account. To view the ID, log on to [the DataWorks console](https://workbench.data.aliyun.com/console) and move the pointer over the profile picture in the upper-right corner.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The client token. It is a field with the idempotence property. We recommend that you use a universally unique identifier (UUID). This parameter is used to uniquely identify the API operation call.</p>
     */
    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The region of the workspace. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddProjectMemberToRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberToRoleRequest self = new AddProjectMemberToRoleRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberToRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddProjectMemberToRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AddProjectMemberToRoleRequest setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public AddProjectMemberToRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
