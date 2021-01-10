// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterRtcInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("AuthToken")
    public String authToken;

    public static DescribeCasterRtcInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterRtcInfoResponseBody self = new DescribeCasterRtcInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterRtcInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterRtcInfoResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterRtcInfoResponseBody setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
