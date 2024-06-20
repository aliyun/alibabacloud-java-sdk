// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUdpReflectResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F97A8766-FB4D-411A-9CD5-2CFF701B592F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the source ports of the UDP traffic that are filtered out by the filtering policies for UDP reflection attacks.</p>
     */
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
