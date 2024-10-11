// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingSystemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RankingSystem result;

    public static GetRankingSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRankingSystemResponseBody self = new GetRankingSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRankingSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRankingSystemResponseBody setResult(RankingSystem result) {
        this.result = result;
        return this;
    }
    public RankingSystem getResult() {
        return this.result;
    }

}
