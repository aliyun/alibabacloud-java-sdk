// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64-af62-20e91b******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveStreamWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamWatermarkResponseBody self = new DeleteLiveStreamWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
