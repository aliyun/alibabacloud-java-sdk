// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterRtcInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("AuthToken")
    @Validation(required = true)
    public String authToken;

    public static DescribeCasterRtcInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterRtcInfoResponse self = new DescribeCasterRtcInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterRtcInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterRtcInfoResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterRtcInfoResponse setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
