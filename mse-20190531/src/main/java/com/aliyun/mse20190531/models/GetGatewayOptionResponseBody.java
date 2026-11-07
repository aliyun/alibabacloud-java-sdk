// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayOptionResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The gateway operation details.</p>
     * <ul>
     * <li><p><strong>TraceDetails</strong>: The XTrace sampling description. It includes TraceEnabled, which indicates whether XTrace is enabled, and Sample, which indicates the XTrace sampling rate.</p>
     * </li>
     * <li><p><strong>LogConfigDetails</strong>: The log delivery service description. It includes LogEnabled, which indicates whether log delivery to Simple Log Service (SLS) is enabled, ProjectName, which indicates the destination project for log delivery, and LogStoreName, which indicates the Logstore name.</p>
     * </li>
     * <li><p><strong>EnableHardwareAcceleration</strong>: Indicates whether hardware acceleration is enabled.</p>
     * </li>
     * <li><p><strong>DisableHttp2Alpn</strong>: Indicates whether HTTP/2 is disabled.</p>
     * </li>
     * <li><p><strong>EnableWaf</strong>: Indicates whether Web Application Firewall (WAF) is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;LogConfigDetails\&quot;: {\&quot;LogEnabled\&quot;: False}, \&quot;TraceDetails\&quot;: {\&quot;TraceEnabled\&quot;: False}}</p>
     */
    @NameInMap("Data")
    public GatewayOption data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, the cause of the failure is returned, such as TaskId not found.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C92F4A4D-A2FD-593E-839E-F3D4DFD2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
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
