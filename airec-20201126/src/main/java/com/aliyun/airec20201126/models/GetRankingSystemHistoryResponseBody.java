// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingSystemHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RankingSystemHistory result;

    public static GetRankingSystemHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRankingSystemHistoryResponseBody self = new GetRankingSystemHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRankingSystemHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRankingSystemHistoryResponseBody setResult(RankingSystemHistory result) {
        this.result = result;
        return this;
    }
    public RankingSystemHistory getResult() {
        return this.result;
    }

}
