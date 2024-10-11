// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingSystemResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RankingSystem result;

    public static DeleteRankingSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingSystemResponseBody self = new DeleteRankingSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRankingSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRankingSystemResponseBody setResult(RankingSystem result) {
        this.result = result;
        return this;
    }
    public RankingSystem getResult() {
        return this.result;
    }

}
