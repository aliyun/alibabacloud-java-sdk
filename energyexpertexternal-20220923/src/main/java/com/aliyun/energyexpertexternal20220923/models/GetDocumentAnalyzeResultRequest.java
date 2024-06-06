// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("jobId")
    public String jobId;

    public static GetDocumentAnalyzeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentAnalyzeResultRequest self = new GetDocumentAnalyzeResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentAnalyzeResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
