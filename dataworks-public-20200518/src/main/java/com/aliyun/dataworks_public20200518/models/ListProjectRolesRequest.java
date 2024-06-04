// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectRolesRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListProjectRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesRequest self = new ListProjectRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
