// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingModelTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the ranking model.</p>
     */
    @NameInMap("result")
    public RankingModelTemplate result;

    public static ModifyRankingModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingModelTemplateResponseBody self = new ModifyRankingModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRankingModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRankingModelTemplateResponseBody setResult(RankingModelTemplate result) {
        this.result = result;
        return this;
    }
    public RankingModelTemplate getResult() {
        return this.result;
    }

}
