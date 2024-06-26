// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSmartHandleJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetSmartHandleJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHandleJobRequest self = new GetSmartHandleJobRequest();
        return TeaModel.build(map, self);
    }

    public GetSmartHandleJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
