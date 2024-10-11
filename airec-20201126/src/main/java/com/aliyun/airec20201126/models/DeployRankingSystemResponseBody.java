// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeployRankingSystemResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p><strong>null</strong></p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static DeployRankingSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployRankingSystemResponseBody self = new DeployRankingSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployRankingSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployRankingSystemResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
