// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSmartJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>042d5e4db6866f6289d1</strong></strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DeleteSmartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartJobRequest self = new DeleteSmartJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmartJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
