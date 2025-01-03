// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class PassReleaseStagePipelineValidateRequest extends TeaModel {
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
     * <p>66c0c9fffeb86b450c199***</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static PassReleaseStagePipelineValidateRequest build(java.util.Map<String, ?> map) throws Exception {
        PassReleaseStagePipelineValidateRequest self = new PassReleaseStagePipelineValidateRequest();
        return TeaModel.build(map, self);
    }

    public PassReleaseStagePipelineValidateRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public PassReleaseStagePipelineValidateRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
