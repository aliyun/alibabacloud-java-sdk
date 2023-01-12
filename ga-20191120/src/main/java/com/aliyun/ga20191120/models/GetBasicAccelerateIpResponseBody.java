// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpResponseBody extends TeaModel {
    /**
     * <p>The accelerated IP address.</p>
     */
    @NameInMap("AccelerateIpAddress")
    public String accelerateIpAddress;

    /**
     * <p>The ID of the accelerated IP address.</p>
     */
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    /**
     * <p>The ID of the basic GA instance to which the queried accelerated IP address belongs.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the acceleration region of the basic GA instance.</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the accelerated IP address. Valid values:</p>
     * <br>
     * <p>*   **active**: The accelerated IP address is available.</p>
     * <p>*   **binding**: The accelerated IP address is being associated.</p>
     * <p>*   **bound**: The accelerated IP address is associated.</p>
     * <p>*   **unbinding**: The basic GA instance is being disassociated.</p>
     * <p>*   **deleting**: The accelerated IP address is being deleted.</p>
     * <br>
     * <p>>  This parameter is not returned when the queried accelerated IP address is being created.</p>
     */
    @NameInMap("State")
    public String state;

    public static GetBasicAccelerateIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpResponseBody self = new GetBasicAccelerateIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpResponseBody setAccelerateIpAddress(String accelerateIpAddress) {
        this.accelerateIpAddress = accelerateIpAddress;
        return this;
    }
    public String getAccelerateIpAddress() {
        return this.accelerateIpAddress;
    }

    public GetBasicAccelerateIpResponseBody setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public GetBasicAccelerateIpResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAccelerateIpResponseBody setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public GetBasicAccelerateIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicAccelerateIpResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
