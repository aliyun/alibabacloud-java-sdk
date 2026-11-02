// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIProductionJobRequest extends TeaModel {
    /**
     * <p>The idempotency parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the intelligent job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static QueryIProductionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobRequest self = new QueryIProductionJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QueryIProductionJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
