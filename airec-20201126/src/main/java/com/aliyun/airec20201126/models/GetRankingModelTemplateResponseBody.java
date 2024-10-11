// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingModelTemplateResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RankingModelTemplate result;

    public static GetRankingModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRankingModelTemplateResponseBody self = new GetRankingModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRankingModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRankingModelTemplateResponseBody setResult(RankingModelTemplate result) {
        this.result = result;
        return this;
    }
    public RankingModelTemplate getResult() {
        return this.result;
    }

}
