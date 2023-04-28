// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosClusterResponseBody extends TeaModel {
    /**
     * <p>The port used for health checks.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The type of the health check.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether to use the port of the instance for a health check.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateNacosClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosClusterResponseBody self = new UpdateNacosClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNacosClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateNacosClusterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateNacosClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateNacosClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNacosClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNacosClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
