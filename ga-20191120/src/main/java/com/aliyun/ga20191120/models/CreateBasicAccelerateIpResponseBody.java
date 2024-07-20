// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpResponseBody extends TeaModel {
    /**
     * <p>The accelerated IP address.</p>
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
     * <p>The ID of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the acceleration region.</p>
     * 
     * <strong>example:</strong>
     * <p>ips-bp11r5jb8ogp122xl****</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the accelerated IP address.</p>
     * <blockquote>
     * <p> This parameter returns an empty string because the parameter is not in use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("State")
    public String state;

    public static CreateBasicAccelerateIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAccelerateIpResponseBody self = new CreateBasicAccelerateIpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBasicAccelerateIpResponseBody setAccelerateIpAddress(String accelerateIpAddress) {
        this.accelerateIpAddress = accelerateIpAddress;
        return this;
    }
    public String getAccelerateIpAddress() {
        return this.accelerateIpAddress;
    }

    public CreateBasicAccelerateIpResponseBody setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public CreateBasicAccelerateIpResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicAccelerateIpResponseBody setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public CreateBasicAccelerateIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBasicAccelerateIpResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
