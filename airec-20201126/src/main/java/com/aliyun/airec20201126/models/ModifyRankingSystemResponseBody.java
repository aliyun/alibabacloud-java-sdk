// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingSystemResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ranking service that was modified.</p>
     */
    @NameInMap("result")
    public RankingSystem result;

    public static ModifyRankingSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingSystemResponseBody self = new ModifyRankingSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRankingSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRankingSystemResponseBody setResult(RankingSystem result) {
        this.result = result;
        return this;
    }
    public RankingSystem getResult() {
        return this.result;
    }

}
