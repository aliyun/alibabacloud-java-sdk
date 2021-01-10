// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistWSServerAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WsServer")
    public String wsServer;

    @NameInMap("OTP")
    public String OTP;

    public static DescribeAssistWSServerAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistWSServerAddressResponseBody self = new DescribeAssistWSServerAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssistWSServerAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssistWSServerAddressResponseBody setWsServer(String wsServer) {
        this.wsServer = wsServer;
        return this;
    }
    public String getWsServer() {
        return this.wsServer;
    }

    public DescribeAssistWSServerAddressResponseBody setOTP(String OTP) {
        this.OTP = OTP;
        return this;
    }
    public String getOTP() {
        return this.OTP;
    }

}
