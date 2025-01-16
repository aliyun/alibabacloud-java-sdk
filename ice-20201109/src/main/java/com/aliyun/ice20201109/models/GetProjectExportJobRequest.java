// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetProjectExportJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetProjectExportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectExportJobRequest self = new GetProjectExportJobRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectExportJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
