// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusResponseBody extends TeaModel {
    /**
     * <p>The connectivity of DTS servers to the destination database.</p>
     */
    @NameInMap("DestinationConnectionStatus")
    public java.util.Map<String, ?> destinationConnectionStatus;

    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The connectivity of DTS servers to the source database.</p>
     */
    @NameInMap("SourceConnectionStatus")
    public java.util.Map<String, ?> sourceConnectionStatus;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
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
