// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateEmbodiedAIPlatformResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>19E994DC-A816-56DB-9F90-5F8E403DD19D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEmbodiedAIPlatformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEmbodiedAIPlatformResponseBody self = new CreateEmbodiedAIPlatformResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEmbodiedAIPlatformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
