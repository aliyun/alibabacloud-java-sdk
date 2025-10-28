// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckUrlResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The health check URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:8080/_ehc.html">http://127.0.0.1:8080/_ehc.html</a></p>
     */
    @NameInMap("HealthCheckURL")
    public String healthCheckURL;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D16979DC-4D42-*****************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHealthCheckUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckUrlResponseBody self = new UpdateHealthCheckUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateHealthCheckUrlResponseBody setHealthCheckURL(String healthCheckURL) {
        this.healthCheckURL = healthCheckURL;
        return this;
    }
    public String getHealthCheckURL() {
        return this.healthCheckURL;
    }

    public UpdateHealthCheckUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateHealthCheckUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
