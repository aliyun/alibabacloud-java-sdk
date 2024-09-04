// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DetectFaceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DetectFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceResponseBody self = new DetectFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
