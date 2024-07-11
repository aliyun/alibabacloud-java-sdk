// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateBindingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09768C14-E51C-4F4A-8077-30810032C***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingResponseBody self = new CreateBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
