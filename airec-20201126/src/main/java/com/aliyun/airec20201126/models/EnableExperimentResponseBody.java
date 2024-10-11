// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class EnableExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E3D6FE3B-B7C2-43DA-9A13-5EA837ACED9B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static EnableExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableExperimentResponseBody self = new EnableExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableExperimentResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
