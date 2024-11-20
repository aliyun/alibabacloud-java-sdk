// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPackageJobRequest extends TeaModel {
    /**
     * <p>The job ID. You can obtain the job ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/461964.html">SubmitPackageJob</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82dfa8e8</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetPackageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPackageJobRequest self = new GetPackageJobRequest();
        return TeaModel.build(map, self);
    }

    public GetPackageJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
