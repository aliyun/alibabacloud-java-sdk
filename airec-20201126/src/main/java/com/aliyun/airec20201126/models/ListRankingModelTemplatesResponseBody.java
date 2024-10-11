// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelTemplatesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<RankingModelTemplate> result;

    public static ListRankingModelTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelTemplatesResponseBody self = new ListRankingModelTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRankingModelTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRankingModelTemplatesResponseBody setResult(java.util.List<RankingModelTemplate> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RankingModelTemplate> getResult() {
        return this.result;
    }

}
