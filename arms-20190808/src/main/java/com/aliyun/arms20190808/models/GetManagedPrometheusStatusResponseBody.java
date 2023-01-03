// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetManagedPrometheusStatusResponseBody extends TeaModel {
    // The HTTP status code returned.
    @NameInMap("Code")
    public Integer code;

    // The status of the Prometheus instance. Installing: The Prometheus agent is installed and no registration information is available. Success: The Prometheus agent is installed and registered. Failure: The Prometheus agent failed to be installed or registered. Unknow: The status of the Prometheus agent is unknown.
    @NameInMap("Data")
    public String data;

    // The returned message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the query was successful.
    // 
    // *   `true`
    // *   `false`
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
