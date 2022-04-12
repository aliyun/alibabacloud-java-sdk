// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteConfigTemplateResponseBody extends TeaModel {
    // 响应码
    @NameInMap("Code")
    public Integer code;

    // 响应码文本描述
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConfigTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigTemplateResponseBody self = new DeleteConfigTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteConfigTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteConfigTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
