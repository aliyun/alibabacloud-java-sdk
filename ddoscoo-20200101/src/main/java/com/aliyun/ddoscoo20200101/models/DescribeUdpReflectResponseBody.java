// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUdpReflectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UdpSports")
    public java.util.List<String> udpSports;

    public static DescribeUdpReflectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUdpReflectResponseBody self = new DescribeUdpReflectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUdpReflectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUdpReflectResponseBody setUdpSports(java.util.List<String> udpSports) {
        this.udpSports = udpSports;
        return this;
    }
    public java.util.List<String> getUdpSports() {
        return this.udpSports;
    }

}
