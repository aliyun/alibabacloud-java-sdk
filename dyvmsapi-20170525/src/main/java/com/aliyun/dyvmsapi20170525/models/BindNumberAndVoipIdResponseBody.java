// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BindNumberAndVoipIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static BindNumberAndVoipIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindNumberAndVoipIdResponseBody self = new BindNumberAndVoipIdResponseBody();
        return TeaModel.build(map, self);
    }

    public BindNumberAndVoipIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindNumberAndVoipIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindNumberAndVoipIdResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public BindNumberAndVoipIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
