// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameTrialSurplusDurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Float status;

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
