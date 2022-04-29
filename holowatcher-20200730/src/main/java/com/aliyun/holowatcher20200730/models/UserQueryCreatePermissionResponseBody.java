// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserQueryCreatePermissionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 对象实例。
    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static UserQueryCreatePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserQueryCreatePermissionResponseBody self = new UserQueryCreatePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public UserQueryCreatePermissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UserQueryCreatePermissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UserQueryCreatePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserQueryCreatePermissionResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
