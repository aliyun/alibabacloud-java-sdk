// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkResponseBody extends TeaModel {
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
