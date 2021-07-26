// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceResponseBody self = new UpdateResourceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
