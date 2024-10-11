// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateRankingModelTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RankingModelTemplate result;

    public static CreateRankingModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRankingModelTemplateResponseBody self = new CreateRankingModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRankingModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRankingModelTemplateResponseBody setResult(RankingModelTemplate result) {
        this.result = result;
        return this;
    }
    public RankingModelTemplate getResult() {
        return this.result;
    }

}
