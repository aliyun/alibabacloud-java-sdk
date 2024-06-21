// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayOptionResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The value 200 indicates that the request is successfully processed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The detailed configurations of the gateway.</p>
     * <ul>
     * <li><strong>TraceDetails</strong>: the sampling description of Managed Service for OpenTelemetry. Content: TraceEnabled indicates whether Managed Service for OpenTelemetry is activated. Sample indicates the sampling rate of Managed Service for OpenTelemetry.</li>
     * <li><strong>LogConfigDetails</strong>: the description of Simple Log Service. Content: LogEnabled indicates whether Simple Log Service is activated. ProjectName indicates the Simple Log Service project to which logs are delivered. LogStoreName indicates the name of the Logstore.</li>
     * <li><strong>EnableHardwareAcceleration</strong>: indicates whether hardware acceleration is enabled.</li>
     * <li><strong>DisableHttp2Alpn</strong>: indicates whether the HTTP/2 protocol is disabled.</li>
     * <li><strong>EnableWaf</strong>: indicates whether Web Application Firewall (WAF) is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;LogConfigDetails\&quot;: {\&quot;LogEnabled\&quot;: False}, \&quot;TraceDetails\&quot;: {\&quot;TraceEnabled\&quot;: False}}</p>
     */
    @NameInMap("Data")
    public GatewayOption data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, an error message is returned, such as the &quot;TaskId not found&quot; message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C92F4A4D-A2FD-593E-839E-F3D4DFD2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
