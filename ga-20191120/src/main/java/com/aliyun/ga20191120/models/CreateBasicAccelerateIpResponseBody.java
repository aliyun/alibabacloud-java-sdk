// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpResponseBody extends TeaModel {
    @NameInMap("AccelerateIpAddress")
    public String accelerateIpAddress;

    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("IpSetId")
    public String ipSetId;

    @NameInMap("RequestId")
    public String requestId;

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
