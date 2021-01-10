// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateSpaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceResponseBody self = new UpdateSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
