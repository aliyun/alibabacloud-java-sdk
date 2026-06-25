// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateExperimentResponseBody extends TeaModel {
    /**
     * <p>If the call is asynchronous, the API returns a JobId.</p>
     * 
     * <strong>example:</strong>
     * <p>ExperimentId-example-id-****</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Request ID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentResponseBody self = new CreateExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
