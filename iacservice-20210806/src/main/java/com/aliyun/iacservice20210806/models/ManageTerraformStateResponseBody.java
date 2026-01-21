// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ManageTerraformStateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>job-5fd38c9xxxxx</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0A80B4F1-4E8C-515A-B3C1-0E1A9B85B6A7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ManageTerraformStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManageTerraformStateResponseBody self = new ManageTerraformStateResponseBody();
        return TeaModel.build(map, self);
    }

    public ManageTerraformStateResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ManageTerraformStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
