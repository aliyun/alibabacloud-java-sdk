// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAITrafficAnalysisStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateAITrafficAnalysisStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAITrafficAnalysisStatusRequest self = new UpdateAITrafficAnalysisStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAITrafficAnalysisStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
