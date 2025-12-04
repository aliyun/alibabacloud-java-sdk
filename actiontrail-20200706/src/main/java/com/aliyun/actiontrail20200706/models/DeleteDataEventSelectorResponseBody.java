// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteDataEventSelectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1D9DD159-DFFF-4882-ACEC-B4A727E9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataEventSelectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataEventSelectorResponseBody self = new DeleteDataEventSelectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataEventSelectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
