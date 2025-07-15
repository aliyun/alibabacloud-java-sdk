// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateEventSubResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The subscription ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ad53276431c****</p>
     */
    @NameInMap("SubscribeId")
    public String subscribeId;

    public static CreateEventSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSubResponseBody self = new CreateEventSubResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventSubResponseBody setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public String getSubscribeId() {
        return this.subscribeId;
    }

}
