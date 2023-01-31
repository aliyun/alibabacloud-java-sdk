// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class RpcNoDefaultErrorCodeApiRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public String success;

    public static RpcNoDefaultErrorCodeApiRequest build(java.util.Map<String, ?> map) throws Exception {
        RpcNoDefaultErrorCodeApiRequest self = new RpcNoDefaultErrorCodeApiRequest();
        return TeaModel.build(map, self);
    }

    public RpcNoDefaultErrorCodeApiRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RpcNoDefaultErrorCodeApiRequest setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RpcNoDefaultErrorCodeApiRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RpcNoDefaultErrorCodeApiRequest setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
