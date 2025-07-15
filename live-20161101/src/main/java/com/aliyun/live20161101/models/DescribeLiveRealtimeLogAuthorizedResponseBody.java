// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeLogAuthorizedResponseBody extends TeaModel {
    /**
     * <p>The authorization status. <strong>true</strong>: authorized <strong>false</strong>: not authorized</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthorizedStatus")
    public String authorizedStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64- af62-20e91b******</p>
     */
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
