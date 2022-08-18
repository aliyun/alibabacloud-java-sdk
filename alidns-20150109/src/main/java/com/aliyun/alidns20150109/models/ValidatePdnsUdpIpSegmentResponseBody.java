// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidatePdnsUdpIpSegmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ValidatePdnsUdpIpSegmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidatePdnsUdpIpSegmentResponseBody self = new ValidatePdnsUdpIpSegmentResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidatePdnsUdpIpSegmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
