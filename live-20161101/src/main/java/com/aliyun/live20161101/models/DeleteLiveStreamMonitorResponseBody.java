// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamMonitorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b9676b3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveStreamMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamMonitorResponseBody self = new DeleteLiveStreamMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
