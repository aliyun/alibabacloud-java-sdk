// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectIdsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the DataWorks workspaces.</p>
     * <br>
     * <p>The IDs of the workspaces on which the specific Alibaba Cloud account has permissions were returned. In this example, a single workspace ID is used.</p>
     */
    @NameInMap("ProjectIds")
    public java.util.List<Long> projectIds;

    /**
     * <p>The ID of the request. You can troubleshoot errors based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectIdsResponseBody self = new ListProjectIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectIdsResponseBody setProjectIds(java.util.List<Long> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    public ListProjectIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
