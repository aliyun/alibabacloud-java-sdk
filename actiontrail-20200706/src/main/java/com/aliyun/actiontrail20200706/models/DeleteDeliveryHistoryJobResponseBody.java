// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteDeliveryHistoryJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeliveryHistoryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryHistoryJobResponseBody self = new DeleteDeliveryHistoryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryHistoryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
