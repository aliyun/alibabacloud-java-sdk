// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EncryptPhoneNumResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 加密后密文
    @NameInMap("Data")
    public String data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 接口调用是否成功
    @NameInMap("Success")
    public Boolean success;

    public static EncryptPhoneNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EncryptPhoneNumResponseBody self = new EncryptPhoneNumResponseBody();
        return TeaModel.build(map, self);
    }

    public EncryptPhoneNumResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EncryptPhoneNumResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EncryptPhoneNumResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EncryptPhoneNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EncryptPhoneNumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
