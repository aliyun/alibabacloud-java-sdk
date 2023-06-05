// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteProjectMemberRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

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
