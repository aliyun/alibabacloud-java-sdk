// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSpaceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceModelResponseBody self = new UpdateSpaceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
