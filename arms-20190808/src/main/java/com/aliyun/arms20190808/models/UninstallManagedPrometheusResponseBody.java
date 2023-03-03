// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallManagedPrometheusResponseBody extends TeaModel {
    /**
     * <p>The status code returned. 200 indicates that the Prometheus agent was uninstalled. Otherwise, the Prometheus agent fails to be uninstalled.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The content of the response. The installation status of the Prometheus agent was returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if the Prometheus agent fails to be uninstalled.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the Prometheus agent was uninstalled.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UninstallManagedPrometheusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallManagedPrometheusResponseBody self = new UninstallManagedPrometheusResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallManagedPrometheusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UninstallManagedPrometheusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UninstallManagedPrometheusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UninstallManagedPrometheusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallManagedPrometheusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
