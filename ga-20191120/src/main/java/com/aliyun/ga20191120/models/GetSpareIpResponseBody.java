// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetSpareIpResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the secondary IP address. Valid values:</p>
     * <br>
     * <p>*   **active:** The secondary IP address is available.</p>
     * <p>*   **inuse:** The secondary IP address is in use.</p>
     */
    @NameInMap("State")
    public String state;

    public static GetSpareIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpareIpResponseBody self = new GetSpareIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpareIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpareIpResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
