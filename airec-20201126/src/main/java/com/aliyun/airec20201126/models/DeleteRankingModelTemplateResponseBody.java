// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingModelTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RankingModelTemplate result;

    public static DeleteRankingModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingModelTemplateResponseBody self = new DeleteRankingModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRankingModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRankingModelTemplateResponseBody setResult(RankingModelTemplate result) {
        this.result = result;
        return this;
    }
    public RankingModelTemplate getResult() {
        return this.result;
    }

}
