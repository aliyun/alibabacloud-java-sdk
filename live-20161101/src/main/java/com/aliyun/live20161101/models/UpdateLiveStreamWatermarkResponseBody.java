// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveStreamWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamWatermarkResponseBody self = new UpdateLiveStreamWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
