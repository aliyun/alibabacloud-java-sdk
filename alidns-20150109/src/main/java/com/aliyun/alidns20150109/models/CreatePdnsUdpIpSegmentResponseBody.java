// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreatePdnsUdpIpSegmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ValidMessage")
    public String validMessage;

    public static CreatePdnsUdpIpSegmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePdnsUdpIpSegmentResponseBody self = new CreatePdnsUdpIpSegmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePdnsUdpIpSegmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePdnsUdpIpSegmentResponseBody setValidMessage(String validMessage) {
        this.validMessage = validMessage;
        return this;
    }
    public String getValidMessage() {
        return this.validMessage;
    }

}
