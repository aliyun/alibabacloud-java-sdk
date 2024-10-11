// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingSystemHistoriesResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response body.</p>
     */
    @NameInMap("result")
    public java.util.List<RankingSystemHistory> result;

    public static ListRankingSystemHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRankingSystemHistoriesResponseBody self = new ListRankingSystemHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRankingSystemHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRankingSystemHistoriesResponseBody setResult(java.util.List<RankingSystemHistory> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RankingSystemHistory> getResult() {
        return this.result;
    }

}
