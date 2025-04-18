// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeResultRequest extends TeaModel {
    /**
     * <p>Job ID, specifying which document\&quot;s parsing result to query. This is a return parameter from the \&quot;Submit Document Parsing Job\&quot; interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bfce2248-1546-4298-8bcf-70ac26e69646</p>
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
