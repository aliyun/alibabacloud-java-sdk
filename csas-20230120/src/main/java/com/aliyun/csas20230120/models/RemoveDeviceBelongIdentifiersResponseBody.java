// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveDeviceBelongIdentifiersResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used to locate the call.</p>
     * 
     * <strong>example:</strong>
     * <p>7A92B549-EC82-5F79-8301-63711AFC9DCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveDeviceBelongIdentifiersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDeviceBelongIdentifiersResponseBody self = new RemoveDeviceBelongIdentifiersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDeviceBelongIdentifiersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
