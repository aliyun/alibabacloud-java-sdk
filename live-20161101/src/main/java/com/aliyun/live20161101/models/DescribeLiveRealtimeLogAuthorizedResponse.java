// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeLogAuthorizedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AuthorizedStatus")
    @Validation(required = true)
    public String authorizedStatus;

    public static DescribeLiveRealtimeLogAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeLogAuthorizedResponse self = new DescribeLiveRealtimeLogAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeLogAuthorizedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRealtimeLogAuthorizedResponse setAuthorizedStatus(String authorizedStatus) {
        this.authorizedStatus = authorizedStatus;
        return this;
    }
    public String getAuthorizedStatus() {
        return this.authorizedStatus;
    }

}
