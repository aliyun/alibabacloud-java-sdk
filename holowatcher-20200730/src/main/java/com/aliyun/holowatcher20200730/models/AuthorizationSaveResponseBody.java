// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AuthorizationSaveResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ReqeustId")
    public String reqeustId;

    // 对象实例。
    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static AuthorizationSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationSaveResponseBody self = new AuthorizationSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizationSaveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthorizationSaveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthorizationSaveResponseBody setReqeustId(String reqeustId) {
        this.reqeustId = reqeustId;
        return this;
    }
    public String getReqeustId() {
        return this.reqeustId;
    }

    public AuthorizationSaveResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
