// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListAppReleaseStageExecutionIntegratedMetadataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ListAppReleaseStageExecutionIntegratedMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppReleaseStageExecutionIntegratedMetadataRequest self = new ListAppReleaseStageExecutionIntegratedMetadataRequest();
        return TeaModel.build(map, self);
    }

    public ListAppReleaseStageExecutionIntegratedMetadataRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
