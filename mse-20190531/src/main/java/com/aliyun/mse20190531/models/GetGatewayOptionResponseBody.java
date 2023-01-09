// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayOptionResponseBody extends TeaModel {
    // The status code returned. The value 200 indicates that the request is successfully processed.
    @NameInMap("Code")
    public Integer code;

    // The detailed configurations of the gateway.
    // 
    // *   **TraceDetails**: the sampling description of Tracing Analysis. Content: TraceEnabled indicates whether Tracing Analysis is activated. Sample indicates the sampling rate of Tracing Analysis.
    // *   **LogConfigDetails**: the description of Log Service. Content: LogEnabled indicates whether Log Service is activated. ProjectName indicates the Log Service project to which logs are delivered. LogStoreName indicates the name of the Logstore.
    // *   **EnableHardwareAcceleration**: indicates whether hardware acceleration is enabled.
    // *   **DisableHttp2Alpn**: indicates whether the HTTP/2 protocol is disabled.
    // *   **EnableWaf**: indicates whether Web Application Firewall (WAF) is enabled.
    @NameInMap("Data")
    public GatewayOption data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    // 
    // *   If the request is successful, a success message is returned.
    // *   If the request fails, an error message is returned, such as the "TaskId not found" message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayOptionResponseBody self = new GetGatewayOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayOptionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayOptionResponseBody setData(GatewayOption data) {
        this.data = data;
        return this;
    }
    public GatewayOption getData() {
        return this.data;
    }

    public GetGatewayOptionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayOptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayOptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
