// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingModelVersionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RankingModelVersion result;

    public static GetRankingModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRankingModelVersionResponseBody self = new GetRankingModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRankingModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRankingModelVersionResponseBody setResult(RankingModelVersion result) {
        this.result = result;
        return this;
    }
    public RankingModelVersion getResult() {
        return this.result;
    }

}
