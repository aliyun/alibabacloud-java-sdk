// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingModelVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRankingModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingModelVersionResponseBody self = new DeleteRankingModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRankingModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
