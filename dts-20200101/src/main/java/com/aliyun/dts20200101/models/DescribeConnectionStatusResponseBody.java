// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusResponseBody extends TeaModel {
    @NameInMap("DestinationConnectionStatus")
    public java.util.Map<String, ?> destinationConnectionStatus;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceConnectionStatus")
    public java.util.Map<String, ?> sourceConnectionStatus;

    @NameInMap("Success")
    public String success;

    public static DescribeConnectionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectionStatusResponseBody self = new DescribeConnectionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConnectionStatusResponseBody setDestinationConnectionStatus(java.util.Map<String, ?> destinationConnectionStatus) {
        this.destinationConnectionStatus = destinationConnectionStatus;
        return this;
    }
    public java.util.Map<String, ?> getDestinationConnectionStatus() {
        return this.destinationConnectionStatus;
    }

    public DescribeConnectionStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeConnectionStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeConnectionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConnectionStatusResponseBody setSourceConnectionStatus(java.util.Map<String, ?> sourceConnectionStatus) {
        this.sourceConnectionStatus = sourceConnectionStatus;
        return this;
    }
    public java.util.Map<String, ?> getSourceConnectionStatus() {
        return this.sourceConnectionStatus;
    }

    public DescribeConnectionStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
