// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AllocateIpAddressResponseBody extends TeaModel {
    @NameInMap("EipAddress")
    public String eipAddress;

    @NameInMap("EipId")
    public String eipId;

    @NameInMap("RequestId")
    public String requestId;

    public static AllocateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpAddressResponseBody self = new AllocateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateIpAddressResponseBody setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public String getEipAddress() {
        return this.eipAddress;
    }

    public AllocateIpAddressResponseBody setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public AllocateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
