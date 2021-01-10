// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnregisterCustomFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnregisterCustomFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnregisterCustomFaceResponseBody self = new UnregisterCustomFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnregisterCustomFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
