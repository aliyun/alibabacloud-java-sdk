// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpResponseBody extends TeaModel {
    /**
     * <p>The accelerated IP address of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>116.132.XX.XX</p>
     */
    @NameInMap("AccelerateIpAddress")
    public String accelerateIpAddress;

    /**
     * <p>The ID of the accelerated IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>gaip-bp1****</p>
     */
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    /**
     * <p>The ID of the basic GA instance to which the queried accelerated IP address belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the acceleration region of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ips-bp11r5jb8ogp122xl****</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the accelerated IP address. Valid values:</p>
     * <ul>
     * <li><strong>active</strong>: The accelerated IP address is available.</li>
     * <li><strong>binding</strong>: The accelerated IP address is being associated.</li>
     * <li><strong>bound</strong>: The accelerated IP address is associated.</li>
     * <li><strong>unbinding</strong>: The accelerated IP address is being disassociated.</li>
     * <li><strong>deleting</strong>: The GA instance is being deleted.</li>
     * </ul>
     * <blockquote>
     * <p> If the accelerated IP address is being created, this parameter is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>active</p>
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
