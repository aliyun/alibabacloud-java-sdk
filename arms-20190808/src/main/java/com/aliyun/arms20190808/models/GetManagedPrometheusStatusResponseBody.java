// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetManagedPrometheusStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The installation status of the Prometheus agent.</p>
     * <ul>
     * <li>Installing: The Prometheus agent is installed and no registration information is available.</li>
     * <li>Succeed: The Prometheus agent is installed and registered.</li>
     * <li>Failure: The Prometheus agent failed to be installed or registered.</li>
     * <li>Unknown: The installation status of the Prometheus agent is unknown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Installing</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7781D4A-2818-41E7-B7BB-79D809E9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetManagedPrometheusStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedPrometheusStatusResponseBody self = new GetManagedPrometheusStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedPrometheusStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetManagedPrometheusStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetManagedPrometheusStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetManagedPrometheusStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetManagedPrometheusStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
