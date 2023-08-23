// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetManagedPrometheusStatusResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The status of the Prometheus instance.</p>
     * <br>
     * <p>*   Installing: The Prometheus instance is created and the Prometheus agent has no registration information.</p>
     * <p>*   Succeed: The Prometheus instance is created and the Prometheus agent is registered.</p>
     * <p>*   Failure: The Prometheus instance failed to be created or the Prometheus agent failed to be registered.</p>
     * <p>*   Unknown: No status of the Prometheus instance is available.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
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
