// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosConfigResponseBody extends TeaModel {
    /**
     * <p>The list of IP addresses where the beta release of the configuration is performed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The description of the configuration.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The format of the configuration. Supported formats include TEXT, JSON, and XML.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Basic module configuration.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateNacosConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosConfigResponseBody self = new CreateNacosConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNacosConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNacosConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateNacosConfigResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public CreateNacosConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNacosConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNacosConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
