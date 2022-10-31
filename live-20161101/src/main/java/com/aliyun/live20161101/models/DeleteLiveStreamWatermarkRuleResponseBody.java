// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveStreamWatermarkRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamWatermarkRuleResponseBody self = new DeleteLiveStreamWatermarkRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamWatermarkRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
