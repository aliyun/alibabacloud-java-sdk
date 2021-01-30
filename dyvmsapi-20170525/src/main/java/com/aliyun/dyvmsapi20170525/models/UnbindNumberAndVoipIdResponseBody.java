// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindNumberAndVoipIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Module")
    public String module;

    @NameInMap("Code")
    public String code;

    public static UnbindNumberAndVoipIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindNumberAndVoipIdResponseBody self = new UnbindNumberAndVoipIdResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindNumberAndVoipIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindNumberAndVoipIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindNumberAndVoipIdResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public UnbindNumberAndVoipIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
