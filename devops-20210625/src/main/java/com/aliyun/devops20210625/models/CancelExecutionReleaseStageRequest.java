// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CancelExecutionReleaseStageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c19****</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CancelExecutionReleaseStageRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelExecutionReleaseStageRequest self = new CancelExecutionReleaseStageRequest();
        return TeaModel.build(map, self);
    }

    public CancelExecutionReleaseStageRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
