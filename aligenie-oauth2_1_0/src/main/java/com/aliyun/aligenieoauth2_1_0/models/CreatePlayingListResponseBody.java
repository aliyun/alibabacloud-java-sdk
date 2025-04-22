// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10002398812</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePlayingListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListResponseBody self = new CreatePlayingListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
