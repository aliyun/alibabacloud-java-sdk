// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosServiceResponseBody extends TeaModel {
    /**
     * <p>The protection threshold.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The name of the group.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateNacosServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosServiceResponseBody self = new UpdateNacosServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNacosServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateNacosServiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateNacosServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateNacosServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNacosServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNacosServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
