// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingSystemsResponseBody extends TeaModel {
    /**
     * <p>The schema of the response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("result")
    public java.util.List<RankingSystem> result;

    public static ListRankingSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRankingSystemsResponseBody self = new ListRankingSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRankingSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRankingSystemsResponseBody setResult(java.util.List<RankingSystem> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RankingSystem> getResult() {
        return this.result;
    }

}
