// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteAdvancedQueryHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>04857D99-8B0C-53EB-85F1-E64198E7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAdvancedQueryHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdvancedQueryHistoryResponseBody self = new DeleteAdvancedQueryHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAdvancedQueryHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
