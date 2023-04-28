// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosServiceResponseBody extends TeaModel {
    /**
     * <p>Specifies whether the instance is marked as a temporary node. Valid values:</p>
     * <br>
     * <p>*   `true`: yes</p>
     * <p>*   `false`: no</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The protection threshold.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the namespace.</p>
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
     * <p>The name of the group.</p>
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

    public static CreateNacosServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosServiceResponseBody self = new CreateNacosServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNacosServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateNacosServiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateNacosServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateNacosServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNacosServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNacosServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
