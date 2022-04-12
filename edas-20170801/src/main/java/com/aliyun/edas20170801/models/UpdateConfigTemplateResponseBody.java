// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateConfigTemplateResponseBody extends TeaModel {
    // 响应码
    @NameInMap("Code")
    public Integer code;

    // 响应码文本描述
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigTemplateResponseBody self = new UpdateConfigTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateConfigTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConfigTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
