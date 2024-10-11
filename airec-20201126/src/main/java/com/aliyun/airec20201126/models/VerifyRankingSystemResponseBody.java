// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class VerifyRankingSystemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("result")
    public String result;

    public static VerifyRankingSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyRankingSystemResponseBody self = new VerifyRankingSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyRankingSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyRankingSystemResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
