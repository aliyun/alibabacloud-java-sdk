// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameTrialSurplusDurationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public Float status;

    @NameInMap("SurplusDuration")
    @Validation(required = true)
    public Double surplusDuration;

    public static GetGameTrialSurplusDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameTrialSurplusDurationResponse self = new GetGameTrialSurplusDurationResponse();
        return TeaModel.build(map, self);
    }

    public GetGameTrialSurplusDurationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameTrialSurplusDurationResponse setStatus(Float status) {
        this.status = status;
        return this;
    }
    public Float getStatus() {
        return this.status;
    }

    public GetGameTrialSurplusDurationResponse setSurplusDuration(Double surplusDuration) {
        this.surplusDuration = surplusDuration;
        return this;
    }
    public Double getSurplusDuration() {
        return this.surplusDuration;
    }

}
