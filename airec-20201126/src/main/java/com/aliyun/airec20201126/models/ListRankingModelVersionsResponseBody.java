// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelVersionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<RankingModelVersion> result;

    public static ListRankingModelVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelVersionsResponseBody self = new ListRankingModelVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRankingModelVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRankingModelVersionsResponseBody setResult(java.util.List<RankingModelVersion> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RankingModelVersion> getResult() {
        return this.result;
    }

}
