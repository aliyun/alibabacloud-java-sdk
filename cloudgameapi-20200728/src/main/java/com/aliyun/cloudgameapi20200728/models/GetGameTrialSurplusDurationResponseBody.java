// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameTrialSurplusDurationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 状态
    @NameInMap("Status")
    public Float status;

    // 剩余试玩时长
    @NameInMap("SurplusDuration")
    public Double surplusDuration;

    public static GetGameTrialSurplusDurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameTrialSurplusDurationResponseBody self = new GetGameTrialSurplusDurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameTrialSurplusDurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameTrialSurplusDurationResponseBody setStatus(Float status) {
        this.status = status;
        return this;
    }
    public Float getStatus() {
        return this.status;
    }

    public GetGameTrialSurplusDurationResponseBody setSurplusDuration(Double surplusDuration) {
        this.surplusDuration = surplusDuration;
        return this;
    }
    public Double getSurplusDuration() {
        return this.surplusDuration;
    }

}
