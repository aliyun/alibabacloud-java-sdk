// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistRTMPServerAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RTMPServer")
    public String RTMPServer;

    @NameInMap("OTP")
    public String OTP;

    public static DescribeAssistRTMPServerAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistRTMPServerAddressResponseBody self = new DescribeAssistRTMPServerAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssistRTMPServerAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssistRTMPServerAddressResponseBody setRTMPServer(String RTMPServer) {
        this.RTMPServer = RTMPServer;
        return this;
    }
    public String getRTMPServer() {
        return this.RTMPServer;
    }

    public DescribeAssistRTMPServerAddressResponseBody setOTP(String OTP) {
        this.OTP = OTP;
        return this;
    }
    public String getOTP() {
        return this.OTP;
    }

}
