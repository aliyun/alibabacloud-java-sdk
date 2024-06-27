// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusResponseBody extends TeaModel {
    /**
     * <p>The connectivity of DTS servers to the destination database.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;connectDetail&quot;: [       {         &quot;testName&quot;: &quot;PolarDB_o JDBC Connect&quot;,         &quot;testSuccess&quot;: true       },       {         &quot;testName&quot;: &quot;Ping &quot;,         &quot;testSuccess&quot;: true       },       {         &quot;testName&quot;: &quot;Telnet &quot;,         &quot;testSuccess&quot;: true       }     ],     &quot;connectRes&quot;: true,     &quot;connectAdvice&quot;: &quot;&quot;   }</p>
     */
    @NameInMap("DestinationConnectionStatus")
    public java.util.Map<String, ?> destinationConnectionStatus;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A47C784-70EF-4111-8677-369CAA00****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The connectivity of DTS servers to the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;connectDetail&quot;: [       {         &quot;testName&quot;: &quot;Oracle JDBC Connect&quot;,         &quot;testSuccess&quot;: true       },       {         &quot;testName&quot;: &quot;Ping &quot;,         &quot;testSuccess&quot;: false       },       {         &quot;testName&quot;: &quot;Telnet &quot;,         &quot;testSuccess&quot;: true       }     ],     &quot;connectRes&quot;: true,     &quot;connectAdvice&quot;: &quot;&quot;   }</p>
     */
    @NameInMap("SourceConnectionStatus")
    public java.util.Map<String, ?> sourceConnectionStatus;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
