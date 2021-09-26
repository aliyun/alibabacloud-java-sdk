// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class UntagResourcesSystemTagsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 请求是否成功被处理
    @NameInMap("Success")
    public Boolean success;

    // 响应码
    @NameInMap("Code")
    public String code;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 响应消息
    @NameInMap("Message")
    public String message;

    public static UntagResourcesSystemTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesSystemTagsResponseBody self = new UntagResourcesSystemTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesSystemTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UntagResourcesSystemTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UntagResourcesSystemTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UntagResourcesSystemTagsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UntagResourcesSystemTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
