// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExecuteChangeRequestReleaseStageRequest extends TeaModel {
    @NameInMap("params")
    public java.util.Map<String, ?> params;

    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ExecuteChangeRequestReleaseStageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeRequestReleaseStageRequest self = new ExecuteChangeRequestReleaseStageRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteChangeRequestReleaseStageRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public ExecuteChangeRequestReleaseStageRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
