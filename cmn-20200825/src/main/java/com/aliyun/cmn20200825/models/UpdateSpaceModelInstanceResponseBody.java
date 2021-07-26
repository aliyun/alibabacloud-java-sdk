// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSpaceModelInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceModelInstanceResponseBody self = new UpdateSpaceModelInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceModelInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
