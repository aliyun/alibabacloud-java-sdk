// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RefuseReleaseStagePipelineValidateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>226241***</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c19****</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static RefuseReleaseStagePipelineValidateRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseReleaseStagePipelineValidateRequest self = new RefuseReleaseStagePipelineValidateRequest();
        return TeaModel.build(map, self);
    }

    public RefuseReleaseStagePipelineValidateRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RefuseReleaseStagePipelineValidateRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
