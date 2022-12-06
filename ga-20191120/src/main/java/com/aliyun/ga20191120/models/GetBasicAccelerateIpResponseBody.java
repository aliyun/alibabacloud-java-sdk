// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpResponseBody extends TeaModel {
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
