// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceTrafficPolicyResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;GatewayUniqueId\&quot;: \&quot;gw-2b8ebd75dc554c37a4279ba9917379f2\&quot;, \&quot;Id\&quot;: 417, \&quot;GatewayTrafficPolicy\&quot;: {\&quot;LoadBalancerSettings\&quot;: {\&quot;LoadbalancerType\&quot;: \&quot;ROUND_ROBIN\&quot;}, \&quot;TlsSetting\&quot;: {\&quot;TlsMode\&quot;: \&quot;DISABLE\&quot;}}}</p>
     */
    @NameInMap("Data")
    public GatewayService data;

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
     * 
     * <strong>example:</strong>
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>11A61389-F896-5231-A4FB-074D9E2E0055</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateGatewayServiceTrafficPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceTrafficPolicyResponseBody self = new UpdateGatewayServiceTrafficPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceTrafficPolicyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateGatewayServiceTrafficPolicyResponseBody setData(GatewayService data) {
        this.data = data;
        return this;
    }
    public GatewayService getData() {
        return this.data;
    }

    public UpdateGatewayServiceTrafficPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateGatewayServiceTrafficPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayServiceTrafficPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGatewayServiceTrafficPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
