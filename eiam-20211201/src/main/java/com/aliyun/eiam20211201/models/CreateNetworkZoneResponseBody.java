// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkZoneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>network_m6a57vre4g3h7m725yrq6pxxxx</p>
     */
    @NameInMap("NetworkZoneId")
    public String networkZoneId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkZoneResponseBody self = new CreateNetworkZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkZoneResponseBody setNetworkZoneId(String networkZoneId) {
        this.networkZoneId = networkZoneId;
        return this;
    }
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

    public CreateNetworkZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
