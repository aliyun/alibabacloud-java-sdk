// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UntagResourcesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>000e5836-xxxx-xxxx-xxxx-0d6ab2ac4877</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponseBody self = new UntagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UntagResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UntagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
