// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class RpcNoDefaultErrorCodeApiResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    public static RpcNoDefaultErrorCodeApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RpcNoDefaultErrorCodeApiResponseBody self = new RpcNoDefaultErrorCodeApiResponseBody();
        return TeaModel.build(map, self);
    }

    public RpcNoDefaultErrorCodeApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RpcNoDefaultErrorCodeApiResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
