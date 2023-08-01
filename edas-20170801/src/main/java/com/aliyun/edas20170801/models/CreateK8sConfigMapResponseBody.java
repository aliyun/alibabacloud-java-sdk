// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sConfigMapResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateK8sConfigMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sConfigMapResponseBody self = new CreateK8sConfigMapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateK8sConfigMapResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateK8sConfigMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateK8sConfigMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
