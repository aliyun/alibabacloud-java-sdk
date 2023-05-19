// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class OpenDcdnServiceResponseBody extends TeaModel {
    /**
     * <p>The metering method of DCDN. Valid values:</p>
     * <br>
     * <p>*   **PayByTraffic**: pay-by-traffic</p>
     * <p>*   **PayByBandwidth**: pay-by-bandwidth</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenDcdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDcdnServiceResponseBody self = new OpenDcdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDcdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
