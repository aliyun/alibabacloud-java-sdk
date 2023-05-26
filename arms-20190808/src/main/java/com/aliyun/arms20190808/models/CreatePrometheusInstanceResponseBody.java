// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <br>
     * <p>*   `2XX`: The request is successful.</p>
     * <p>*   `3XX`: A redirection message is returned.</p>
     * <p>*   `4XX`: The request is invalid.</p>
     * <p>*   `5XX`: A server error occurs.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the created Prometheus instance.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusInstanceResponseBody self = new CreatePrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePrometheusInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreatePrometheusInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
