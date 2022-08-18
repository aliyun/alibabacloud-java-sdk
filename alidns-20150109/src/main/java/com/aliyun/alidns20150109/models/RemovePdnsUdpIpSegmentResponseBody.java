// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemovePdnsUdpIpSegmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemovePdnsUdpIpSegmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemovePdnsUdpIpSegmentResponseBody self = new RemovePdnsUdpIpSegmentResponseBody();
        return TeaModel.build(map, self);
    }

    public RemovePdnsUdpIpSegmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
