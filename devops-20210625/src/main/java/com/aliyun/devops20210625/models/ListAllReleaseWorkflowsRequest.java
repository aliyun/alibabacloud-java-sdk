// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListAllReleaseWorkflowsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ListAllReleaseWorkflowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllReleaseWorkflowsRequest self = new ListAllReleaseWorkflowsRequest();
        return TeaModel.build(map, self);
    }

    public ListAllReleaseWorkflowsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
