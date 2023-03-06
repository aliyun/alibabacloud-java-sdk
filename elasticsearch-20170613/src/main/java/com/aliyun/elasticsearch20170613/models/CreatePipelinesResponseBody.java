// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreatePipelinesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the pipeline is created. Valor:</p>
     * <br>
     * <p>*   true: The task is created.</p>
     * <p>*   false: The instance failed to be created.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CreatePipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinesResponseBody self = new CreatePipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelinesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
