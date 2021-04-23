// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeLogAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizedStatus")
    public String authorizedStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveRealtimeLogAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeLogAuthorizedResponseBody self = new DescribeLiveRealtimeLogAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeLogAuthorizedResponseBody setAuthorizedStatus(String authorizedStatus) {
        this.authorizedStatus = authorizedStatus;
        return this;
    }
    public String getAuthorizedStatus() {
        return this.authorizedStatus;
    }

    public DescribeLiveRealtimeLogAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
