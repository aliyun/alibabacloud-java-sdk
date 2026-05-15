// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteProjectRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>base_role_xxx</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteProjectRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRoleRequest self = new DeleteProjectRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRoleRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteProjectRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
