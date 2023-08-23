// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallManagedPrometheusResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response content. The status of the Prometheus instance is returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if the Prometheus instance fails to be created.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the Prometheus instance was created.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InstallManagedPrometheusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallManagedPrometheusResponseBody self = new InstallManagedPrometheusResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallManagedPrometheusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InstallManagedPrometheusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InstallManagedPrometheusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallManagedPrometheusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallManagedPrometheusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
