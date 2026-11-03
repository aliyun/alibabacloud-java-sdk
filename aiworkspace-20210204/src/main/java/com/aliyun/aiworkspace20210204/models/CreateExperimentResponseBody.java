// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateExperimentResponseBody extends TeaModel {
    /**
     * <p>The Job ID returned if the creation API is implemented asynchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>ID of the experiment created by the API request</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>Id of the request</p>
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
