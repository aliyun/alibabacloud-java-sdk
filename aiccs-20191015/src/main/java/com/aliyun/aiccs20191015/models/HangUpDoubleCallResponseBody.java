// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangUpDoubleCallResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否调用成功
    @NameInMap("Success")
    public Boolean success;

    public static HangUpDoubleCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HangUpDoubleCallResponseBody self = new HangUpDoubleCallResponseBody();
        return TeaModel.build(map, self);
    }

    public HangUpDoubleCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HangUpDoubleCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HangUpDoubleCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HangUpDoubleCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
